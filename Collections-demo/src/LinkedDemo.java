import java.util.Iterator;
import java.util.LinkedList;

class LinkedDemo {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();//Generics list
		ll.add("Asia");
//		ll.add(true);
		ll.add("North America");
		ll.add("South America");
		ll.add("Africa");
		ll.addFirst("Europe");
		ll.add(1, "Australia");
		ll.add(2, "Antarctica");
		ll.add(2, "Antarctica");
		System.out.println("Elements in Linked List is : " + ll);
		System.out.println("Size of the Linked List is : " + ll.size());
		
		usingIterator(ll);
	}

	private static void usingIterator(LinkedList<String> ll) {
		Iterator iterator = ll.iterator();
		while (iterator.hasNext()) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
	}
}