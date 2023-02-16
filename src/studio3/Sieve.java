package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
		
		boolean[] numbers = new boolean[n+1];
		
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=true;
		}
		for(int factor = 2; factor< numbers.length /2; factor++) {
			for (int multiple=factor*2; multiple<numbers.length; multiple+=factor) {
				numbers[multiple]=false;
			}
		}
		for(int k = 0; k< numbers.length; k++ ) {
			if (numbers[k]) {
				System.out.println(k);
			}
		}
		
}
}
