package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vowel {
	
	public static void fact (String s) {
		

		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(facts(count));
		

	}
	public static int facts(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter string");
		
		Scanner sc = new Scanner(System.in);
		//String s="swapnil sakhare";
		String s=sc.nextLine();
		fact(s);

	}

}