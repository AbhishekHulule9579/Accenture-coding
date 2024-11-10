package Array;

public class Fiboseries {
	public static void fib(int n)
	{
		int i=0,j=1,sum;
		System.out.print(i+","+j);
		while(n>2) {
			sum=i+j;
			System.out.print(","+sum);
			i=j;
			j=sum;
			n--;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(9);
	}

}
/*
 *p s v fib(int n){
 *int i=0;j=1;sum;
 *syso(i+","+j);
 *while(n>2){
 *sum=i+j;
 *syso(","+sum);
 *i=j;
 *j=sum;
 *n--;
 * */
 