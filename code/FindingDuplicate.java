import java.util.HashSet;
import java.util.Set;

class FindingDuplicate{
	public static void main(String[] args){
		String[] name = {"sang", "Shine", "Boston", "Shine"};
		Set s = new HashSet();
		for(String n: name){
			if(!s.add(n)){
				System.out.println("Duplicate Detected: "+n);
			}
		}
		System.out.println(s.size()+" Distinct words detectd: "+s);
	}
}