package utils;

import static utils.ValidationUtil.validatePlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pojo.Player;;
public class CollectionUtil {
	
	public static Map<String,List<Player>> populateData() throws Exception {
		Map<String,List<Player>> teams = new HashMap<String,List<Player>>();
		teams.putIfAbsent("Mumbai Indians", mumbaiPlayers());
		teams.putIfAbsent("Chennai", chennaiPlayers());
		return teams;
	}
	
	public static List<Player> chennaiPlayers() throws Exception {
		List<Player> l1 = new ArrayList<>();
		l1.add(validatePlayer("rohit", 1, 54.21,l1));
		l1.add(validatePlayer("varun", 5, 65.23,l1));
		l1.add(validatePlayer("varun", 5, 72.54,l1));
		l1.add(validatePlayer("chriss", 4, 84.75,l1));
		l1.add(validatePlayer("sharma", 2, 91.56,l1));
		return l1;
	}
	
	public static List<Player> mumbaiPlayers() throws Exception {
		List<Player> l1 = new ArrayList<>();
		l1.add(validatePlayer("rohit", 1, 54.21,l1));
		l1.add(validatePlayer("varun", 5, 65.23,l1));
		l1.add(validatePlayer("sachin", 3, 72.54,l1));
		l1.add(validatePlayer("chriss", 4, 84.75,l1));
		l1.add(validatePlayer("sharma", 2, 91.56,l1));
		return l1;
	}
}
