package Array;

import java.util.ArrayList;

public class Decitobina {
	
	public static void binary(int n) {
		
		int sum = 0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(n>0) {
			list.add(n%2);
			n=n/2;
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
		
		for(int i=0; i<list.size(); i++) {
			sum = sum+list.get(i);
		}
		System.out.println();
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		binary(13);
		
	}

}