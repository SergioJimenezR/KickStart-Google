package sergiojimenezr.ks2022.round_a.challenge_nine;

import java.util.Scanner;

// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb33e/00000000009e7997

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short testCases = sc.nextShort();
		sc.nextLine(); // Buffer

		for (short t = 0; t < testCases; t++) {
			long b = sc.nextLong();
			String strB = Long.toString(b);

			long minimum = Long.parseLong(9 + "" + strB);
			for (int pos = 0; pos <= strB.length(); pos++)
				for (int i = 0; i <= 9; i++) {
					long b2 = Long.parseLong(strB.substring(0, pos) + "" + i + "" + strB.substring(pos));
					if (b2 % 9 == 0 && b2 < minimum)
						minimum = b2;
				}
			System.out.println("Case #" + (t + 1) + ": " + minimum);
		}

		sc.close();
	}
}
