package utils;

import java.util.List;
import custExc.PlayerCustomException;
import pojo.Player;

public class ValidationUtil {
	
	public ValidationUtil() {
		System.out.println("In Validation Constr");
	}
	
	public static Player validatePlayer(String playerName, int ranking, double points,List<Player> list) throws PlayerCustomException {						
		Player player = new Player(playerName,ranking,points);
		checkDuplicate(list,player);
		checkRanking(player);
		checkMaxMin(list);
		return player;
	}
	
	public static void checkDuplicate(List<Player> list,Player s) throws PlayerCustomException{
		if(list.contains(s))
			throw new PlayerCustomException("Player Already Exist");
		
	}
	
	public static void checkRanking(Player s) throws PlayerCustomException{
		if(s.getRanking()>5)
			throw new PlayerCustomException("Ranking should be between 1-5");
	}
	
	public static void checkMaxMin(List<Player> list) throws PlayerCustomException{
		if(list.size()<5 && list.size()>7)
			throw new PlayerCustomException("Min 5 and Max 7 Players in team");
	}
}
