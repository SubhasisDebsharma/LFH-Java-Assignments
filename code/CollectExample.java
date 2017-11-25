import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

class CollectExample{
	public static void main(String[] args){
		Collection c = new HashSet();
		c.add(1);
		c.add(2);
		c.add(20);
		c.add(10);
		c.add(3);
		Iterator itr = c.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(c);
	}
}