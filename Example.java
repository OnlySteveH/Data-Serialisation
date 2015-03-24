import java.util.Arrays;
import java.util.Date;

import uk.co.bigdogconsultants.Treet;
import uk.co.bigdogconsultants.Treets;

public class Example {
  public static void main(String[] args) {
    /** Treet treet = new Treet(
	"OnlySteveH",
	"This is the contents of the Tweet. It is not particularly interesting!",
	new Date(1421328826000L)
    );
    Treet secondTreet = new Treet(
		"journeytocode",
		"@Treehouse makes learning Java so fun, #Treet",
		new Date(1421329856000L));


    // System.out.printf("This is a new Treet: %s %n", treet);
    // System.out.println("The words are: ");

    for (String word: treet.getWords()) {
	System.out.println(word);
    }
    Treet[] treets = {treet, secondTreet};
    Arrays.sort(treets);
	for (Treet exampleTreet : treets) {
	    System.out.println(exampleTreet);
	}
    Treets.save(treets); **/ 
    Treet[] reloadedTreets = Treets.load();
    for (Treet reloaded : reloadedTreets) {
        System.out.println(reloaded);
    }

  } // close main()
} // close class