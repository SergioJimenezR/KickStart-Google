package sergiojimenezr.ks2022.round_a.speed_typing;

import java.util.Scanner;

// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb33e/00000000009e7021

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short testCases = sc.nextShort();
		sc.nextLine(); // Buffer

		for (int t = 0; t < testCases; t++) {
			String strI = sc.nextLine();
			String strP = sc.nextLine();

			int i = 0;
			for (int p = 0; i < strI.length() && p < strP.length(); p++)
				for (; p < strP.length(); p++)
					if (strP.charAt(p) == strI.charAt(i)) {
						i++;
						break;
					}

			System.out.println(
					"Case #" + (t + 1) + ": " + (strI.length() == i ? strP.length() - strI.length() : "IMPOSSIBLE"));
		}

		sc.close();
	}

}
