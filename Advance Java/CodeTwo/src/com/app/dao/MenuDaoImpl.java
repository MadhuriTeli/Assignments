package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static com.app.db.DatabaseUtil.fetchConnection;
import com.app.pojo.Menu;

public class MenuDaoImpl implements MenuDao {

	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4,pst5;

	public MenuDaoImpl() throws Exception {
		cn = fetchConnection();
		pst1 = cn.prepareStatement("insert into menu1 VALUES(default,?,?,?)");
		pst2 = cn.prepareStatement("delete from menu1 where id=?");
		pst3 = cn.prepareStatement("update menu1 set price=? where id=?");
		pst4 = cn.prepareStatement("select * from menu1");
		pst5 = cn.prepareStatement("select * from menu1 where id=?");

		System.out.println("In Menu DAO::");
	}

	public void cleanUp() throws Exception{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		if(pst3!=null)
			pst3.close();
		if(pst4!=null)
			pst4.close();
		if(cn!=null)
			cn.close();
	}
	@Override
	public String addMenu(Menu m) throws Exception {
		pst1.setString(1, m.getMenu());
		pst1.setString(2, m.getTime());
		pst1.setDouble(3, m.getPrice());
		
		int pstStatus = pst1.executeUpdate();
		if(pstStatus == 1)	
			return "Menu Added Succesfully";
		return "Not Added UnSuccesfully";
	}

	@Override
	public String deleteMenu(int id) throws Exception {
		pst2.setInt(1, id);
		
		int pst1Status = pst2.executeUpdate();
		if(pst1Status == 1)		//Use !=0 in case more update specifically
			return "Delete Succesfully";
		return "Delete UnSuccesfully";
	}

	@Override
	public String updateMenu(int id, double price) throws Exception {
		pst3.setInt(1, id);
		pst3.setDouble(2, price);
		
		int pst2Status = pst3.executeUpdate();
		if(pst2Status == 1)
			return "Updated Succesfully";
		return "Updated UnSuccesfully";
	}

	@Override
	public List<Menu> allMenu() throws Exception {
		List<Menu> menu = new ArrayList<>();
		
		try(ResultSet rst = pst4.executeQuery()) {
			while(rst.next())
				menu.add(new Menu(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getDouble(4)));
		}
		return menu;
	}

	@Override
	public Menu getMenu(int id) throws Exception {
		pst5.setInt(1, id);
		try(ResultSet rst = pst5.executeQuery()) {
			while(rst.next())
				return new Menu(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getDouble(4));
		}
		return null;
	}

}
