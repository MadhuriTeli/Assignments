package custIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

import custExc.PlayerCustomException;
import pojo.Player;

public class saveToFile {
	public static String saveObject(Map<String,List<Player>> teams) throws Exception{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("iplteams.list"))) {
			out.writeObject(teams);
		}catch(Exception e) {
			throw new PlayerCustomException("Please Try Again");
		}
		return "success";
	}
}
