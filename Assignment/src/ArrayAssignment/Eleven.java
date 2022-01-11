package ArrayAssignment;

import java.util.TreeSet;

public class Eleven {
	public static void main(String[] args) {
	    int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
	    int[] arr2 = new int[] { 5, 6, 7, 8 };
	    TreeSet<Integer> set = new TreeSet<>();
	    for (int i:arr1) {
	        set.add(i);
	    }
	    for (int i:arr2) {
	        set.add(i);
	    }
	    System.out.println(set);
	}
}
