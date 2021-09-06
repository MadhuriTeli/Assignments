package com.app.dao;

import java.util.List;

import com.app.pojo.Menu;

public interface MenuDao {
	String addMenu(Menu m) throws Exception;
	String deleteMenu(int id)throws Exception;
	String updateMenu(int id,double p) throws Exception;
	List<Menu> allMenu() throws Exception;
	Menu getMenu(int id) throws Exception;
}
