package pl.sda.games.main;

import pl.sda.games.core.Game;
import pl.sda.games.core.Playable;
import pl.sda.games.core.ProperPrinter;
import pl.sda.games.games.GuessNumber;

public class GameProject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*Game arena = new Game();
		arena.register("GuessNumber"); // 1
		arena.register("GuessWord"); // 2
		arena.start();*/
		/*String className= "GuessWord";
		Playable p = (Playable) Class.forName("pl.sda.games.games." + className).newInstance();
		p.run();*/
		
		/*ProperPrinter p = new ProperPrinter();
		p.delim();
		p.spacer();
		p.spacer();
		p.spacer();
		p.delim();
		p.print("tekst który chcia³bym, aby siê wyœwietla³ w kilku asd asd");
		p.print("txts");*/
		GuessNumber gn = new GuessNumber();
		gn.addOrUpdateKey("pawel", "walnicki");
		gn.removeKey("pawel");
		gn.addOrUpdateKey("pawel", "test");
		gn.addOrUpdateKey("pawel", "testowy");
		gn.setConfig();
	}
}
