package list;

import java.util.Arrays;
import java.util.List;

public class Equals {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3);
		List<Integer> b=Arrays.asList(1,3,1);
		
		System.out.println(a.equals(b));
	}

	
}
