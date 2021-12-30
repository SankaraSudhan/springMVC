import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollect {
	public static void main(String[] args) {
		
//		List list = new ArrayList();
//		
//		String s1 = "wwfduh";
//		String s2 = new String ("sudhan");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("dhiva");
		list.add("berin");
		list.add("mango");
		
		String a = list.set(2, list.get(0));
		
		System.out.println(a);
		Collections.swap(list, 0, 1);
		Collections.swap(list, 0, 0);
		System.out.println(list);
		
		
		}

}
