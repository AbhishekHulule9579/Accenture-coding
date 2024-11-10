package Array;

import java.util.Arrays;

public class CheckGreater {

	public static void main(String[] args) {
		int arr[]= {4,5,2,25,50,2,1};
		int n=arr.length;
		int arr1[]=new int[n];
		
		for(int i=0;i<n;i++) {
			boolean flag=false; 
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					arr1[i]=arr[j];
					flag=true;
					break;
				}
			}
			if(!flag) {
				arr1[i]=-1;
			}
		}
		
		System.out.println(Arrays.toString(arr1));

	}

}
/*int arr[]={4,5,6,1,2,3};
 * int n=arr.length;
 * int arr1[]=new int[n];
 * 
for(int i=0;i<n;i++){
boolean flag=false;
for(int j=i+1;j<n;j++){
if(arr[i]<arr[j]){
arr[i]=arr[j];
flag=true;
break;
}
}
if(!flag){
arr1[i]=-1;
 * }
 * */
 