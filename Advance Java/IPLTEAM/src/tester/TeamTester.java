package tester;

import static utils.CollectionUtil.populateData;
import static custIO.saveToFile.saveObject;
import static utils.ValidationUtil.validatePlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import pojo.Player;

public class TeamTester {

	public static void main(String[] args) throws Exception {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String,List<Player>> players = populateData();
			boolean menu = true;
			int choice;
			while (menu) {
				try {
					System.out.println(" ");
					System.out.println("1. Add Players To Team | 2. Display Player | 3. Save and Exit ");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						List<Player> player = new ArrayList<>();
						System.out.println("Enter Team Name");
						String team = sc.next();
						
						for(int i=0;i<5;i++) {
							System.out.println("Enter Player Details name,ranking,points");
							player.add(validatePlayer(sc.next(),sc.nextInt(),sc.nextDouble(),player));
						}
						
						int i = 1;
						while (i == 1) {
							System.out.println("Want to Add More Player Press 1 or else 0");
							i = sc.nextInt();
							if(i==1) {
								System.out.println("Enter Player Details name,ranking points");
								player.add(validatePlayer(sc.next(),sc.nextInt(),sc.nextDouble(),player));
							}
						}
						players.putIfAbsent(team, player);					
						System.out.println("Players Added Successfully");
						break;
					case 2:
						System.out.println(players);
						break;
					case 3:
						String status = saveObject(players);
						if(status.contains("success")){
								menu = false;
								System.out.println("Data Saved to File");
						}
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
