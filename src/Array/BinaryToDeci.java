package Array;

import java.util.Scanner;

public class BinaryToDeci {
	public static int binarytodecimal(int binary) {
		int decimal=0;
		int power=0;
		
		while(binary!=0) {
			int lastdigit=binary%10;
			decimal +=lastdigit * (int)Math.pow(2,power);
			binary /=10;
			power++;
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary no:");
		int binary=sc.nextInt();
		//int decimal=binarytodecimal(binary);
		System.out.println("Binary is:"+binary);
		System.out.println("Decimal is:"+binarytodecimal(binary));
	}

}
/*public staic void binarytodeci(int binary){
 * int decimal=0;
 * int power=0;
 * while(binary!=0){
 * int lastdigit=binary%10;
 * decimal +=lastdigit;
 * binary /=10;
 * power++;
 * }return decimal;
 * */
