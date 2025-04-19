package map;

import java.util.LinkedHashMap;

public class demo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		
		lh.put(1, null);
		lh.put(23, "jk");
		lh.put(567, "kk");
		lh.put(0, "ok");
		
		System.out.println(lh);
	}

}
