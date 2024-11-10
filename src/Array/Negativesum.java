package Array;

public class Negativesum {
	
	public static void sumofnegativenumber(int a,int b,int c,int d){
		int number[]= {a,b,c,d};
		int negativesum=0;
		
		for(int i=0; i<number.length; i++) {
			if(number[i] <0) {
				negativesum = negativesum+number[i];
			}
		}
		System.out.println(negativesum);
	}

	public static void main(String[] args) {
		int a=-3,b=4,c=5,d=-5;
		sumofnegativenumber(a,b,c,d);
	}

}
//writ program that take 4 int as input the sum of negative int
//if no negative output should 0

