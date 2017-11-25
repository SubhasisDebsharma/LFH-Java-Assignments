import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class MapExample{
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ram");
		hm.put(2, "Roshan");
		hm.put(3, "Rahim");
		hm.put(4, "Albert");
		Collection<Integer> c = hm.keySet();
		
		for(int key:c){
			System.out.println("key: "+key+" :value: "+hm.get(key));
		}
	}
}