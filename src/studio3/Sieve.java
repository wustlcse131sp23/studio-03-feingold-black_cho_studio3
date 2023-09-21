package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
		
		boolean[] numbers = new boolean[n];
		//initialize i to 2 because 0 and 1 are not prime
		for (int i=2;i<numbers.length;i++) {
			numbers[i]=true;
		}
		for(int factor = 2; factor< Math.pow(n,.5); factor++) {
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
