import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

class SortingAndReversing{
	public static void main(String[] args){
		ArrayList c = new ArrayList();
		c.add("Smith");
		c.add("Jones");
		c.add("Smith");
		c.add("Brown");
		c.add("Able");
		
		Collections.sort(c);
		
		System.out.println(c);
		Collections.reverse(c);
		System.out.println(c);
		
	}
}