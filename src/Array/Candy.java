package Array;

public class Candy {
	
	public static int count(int arr[], int n, int m) {
		
		int count =0;
		for(int i=0; i<n; i++) {
			if(arr[i]%5 == 0) {
				count  ++;
				
			}else if(arr[i]<=m) {
				count ++;
				m = m-arr[i];
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		int arr[] = {5,6,7,10,12,15};
		int n = arr.length;
		int m= 20;
		System.out.println(count(arr, n, m));
  }
}