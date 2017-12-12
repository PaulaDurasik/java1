package pl.sda.games.core;

import java.util.Scanner;

import pl.sda.games.games.GuessNumber;
import pl.sda.games.games.GuessWord;
import java.util.*;

public class Game {
	private int choice = -1;
	private LinkedHashSet<String> games = new LinkedHashSet<String>();

	public Game() { }

	public void start() {

		while(this.choice != 0) {
			System.out.println("Games");
			try {
				this.buildGameMenu();
			} catch(Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}

			System.out.println("Your choice: ");
			this.choice = getChoice();
			try {
				this.makeChoice();
			}catch(Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
	
	public void register(String game) {
		this.games.add(game);
	}
	
	private void buildGameMenu() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		List<String> ls = new ArrayList<String>(this.games);
		for(int i = 0; i < ls.size(); i++) {
			Playable p = (Playable) Class.forName("pl.sda.games.games." + ls.get(i)).newInstance();
			System.out.println("\t" + (i + 1) + ". " + p.getName());
		}
		System.out.println();
		System.out.println("\t0. Exit");
	}
	
	private int getChoice() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(!sc.hasNextInt()) {
			System.out.println("Podaj inta: ");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}
	
	private void makeChoice() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//this.choice
		String className = "";
		
		if(this.choice == 0) {
			System.out.println("*** END ***");
			System.exit(0);
		} else if(this.games.size() >= this.choice) {
			List<String> ls = new ArrayList<String>(this.games);
			className = ls.get(this.choice - 1);
		}
		Playable p = (Playable) Class.forName("pl.sda.games.games." + className).newInstance();
		p.run();
		
		
		/*switch() {
			case 1:
				GuessWord gw = new GuessWord();
				gw.run();
				break;
			case 2:
				GuessNumber gn = new GuessNumber();
				gn.run();
				break;
			case 0:
				System.out.println("Are you sure? [y / n]");
				Scanner s = new Scanner(System.in);
				String c = s.nextLine();
				if (c.equalsIgnoreCase("yes") || c.equalsIgnoreCase("y")) {
					System.out.println("*** END ***");
					System.exit(0);
				}
				this.choice = -1;
				break;
			default:
				System.out.println("Uknown choice.");
		}*/
	}
}
