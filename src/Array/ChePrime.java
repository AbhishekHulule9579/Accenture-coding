package Array;

import java.util.Scanner;

public class ChePrime {
	public static boolean CheckPrime(int n) {
		if (n<=1) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scanner.nextInt();
		if(CheckPrime(n)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		scanner.close();
	}

}
//check prime number and give output of 1 if it is prime otherwise 0
/*
 * */
 