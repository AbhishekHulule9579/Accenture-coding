package Array;

import java.util.Scanner;

public class Practice {
	
	public static void prime(int n) {
		
		int sum = 0;
		
		int digit = n%10;
		sum = sum + digit;
		n = n/10;
		
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				System.out.println("false");
			}
		}
		System.out.println("true");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int n = sc.nextInt();
		prime(n);
	}

}