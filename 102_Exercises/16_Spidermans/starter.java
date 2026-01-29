/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		a.fight();
		a.printArt();
		Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
		b.fight();
		b.printArt();
		Spiderman c = new Spiderman("Tom Holland", 27, "The Vulture");
		c.fight();
		c.printArt();
		Spiderman d = new Spiderman("Shameik Moore", 30, "The Kingpin");
		d.fight();
		d.printArt();

		
	}
}
