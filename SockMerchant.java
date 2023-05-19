package datad4;

import java.util.HashMap;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 2, 1, 3, 2, 3 };
		int n = 7;
		System.out.println("There are " + sockMerchant(n, arr) + " pair(s)");
		int[] arr1 = { 1, 2, 3,4 };
		int n1=4;
		System.out.println("There are " + sockMerchant(n1, arr1) + " pair(s)");
	}

	public static int sockMerchant(int n, int[] arr) {
		HashMap<Integer, Integer> socksmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (socksmap.containsKey(arr[i])) {
				int num = socksmap.get(arr[i]);
				socksmap.put(arr[i], ++num);
			} else {
				socksmap.put(arr[i], 1);
			}
		}

		int pairs = 0;
		for (int i : socksmap.values()) {
			pairs = pairs + (i / 2);
		}

		return pairs;
	}
}
