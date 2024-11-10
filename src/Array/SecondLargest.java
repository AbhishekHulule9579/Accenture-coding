package Array;

public class SecondLargest {
	public static int seclarge(int arr[],int n) {
		if(n<2) {
			return -1;
		}
		int large=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>large) {
				secondlarge=large;
				large=num;
			}
			else if(num>secondlarge && num!=large) {
				secondlarge=num;
			}
		}
		if(secondlarge==Integer.MIN_VALUE) {
			return -1;
		}
		return secondlarge;
	}

	public static void main(String[] args) {
		int[] arr= {1,4,2,5,8,9,7};
		int n=arr.length;
		int sL=seclarge(arr,n);
		System.out.println("Smallest is"+sL);
	}

}
/*if(n<2){
 * return -1;
 * }
 * 
 */
/*int largeest=Integer.Minvalue;
  int secondlarge=Integer.mivalue;
  for(int num:arr){
  if(num>large){
  secondlarge=large;
  large=num;
  }
  else if(num>secondlarge && num!=large){
  return -1;
  }
*/