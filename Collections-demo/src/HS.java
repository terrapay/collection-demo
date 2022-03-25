import java.util.HashSet;
import java.util.Iterator;

public class HS {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		// Store some String elements
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		System.out.println(hs.add("America"));
		;
		// view the HashSet
		System.out.println("HashSet = " + hs);
		usingIterator(hs);
		usingForLoop();
	}

	private static void usingForLoop() {
		
	}

	private static void usingIterator(HashSet<String> hs) {
		Iterator<String> it = hs.iterator();
		// display element by element using Iterator
		System.out.println("Elements Using Iterator: ");
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
