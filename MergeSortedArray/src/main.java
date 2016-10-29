import java.util.HashSet;

import Solution.Solution;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a= {4,5,6};
		Integer[] b={4,5,6};
		HashSet<Integer[]> hashSet = new HashSet();
		hashSet.add(a);
		hashSet.add(b);
		System.out.println(hashSet.size());
	}
}
