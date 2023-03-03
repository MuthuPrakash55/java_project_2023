package day16;
import java.util.HashMap;
import java.util.Map.Entry;
public class program02 {

	public static void main(String[] args) {
		HashMap<String,Integer> x=new HashMap<>();
		x.put("aa",101);
		x.put("bb", 201);
		x.put("cc", 301);
		x.put("dd", 401);
		x.put("ee", 501);
		System.out.println(x);
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.entrySet());
		System.out.println(x.containsKey("cc"));
		System.out.println(x.containsValue(400));
		System.out.println(x.get("cc"));
		System.out.println(x.size());
		System.out.println(x.isEmpty());
		for(String key:x.keySet()) {
			System.out.println(key);
		}
		for(Integer value:x.values()) {
			System.out.println(value);
		}
		for(Entry<String,Integer> set:x.entrySet()) {
			System.out.println(set.getKey()+"="+set.getValue());
		}
        x.clear();
        System.out.println(x);
	}

}
