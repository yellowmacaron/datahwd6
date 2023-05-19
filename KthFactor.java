package datad4;

import java.util.ArrayList;

public class KthFactor {

	public static void main(String[] args) {
		int n = 12;
		int k = 6;
		System.out.println("The " + k + " factor is " + kthFactor(n, k));
	}

	public static int kthFactor(int n, int k) {
		ArrayList<Integer> factors = new ArrayList<>();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				factors.add(i);

			}
			if (count == k) {
				return i;
			}
		}

		return -1;
	}
}
