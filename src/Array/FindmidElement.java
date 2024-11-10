package Array;

import java.util.ArrayList;
import java.util.List;

public class FindmidElement {
	
	public static void Midelement(int arr[] ) {
		List<Integer>filterarr=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				filterarr.add(arr[i]);
			}
		}
		int n =filterarr.size();
		int midIndex=(n-1)/2;
		System.out.println(filterarr.get(midIndex));
	}

	public static void main(String[] args) {
		int arr[]= {7,-3,8,2,-5,10,12};
		Midelement(arr);
	}

}
/* write program in which take arr input of input n and filter out negative number and
 *  then filter out midindex of remaining array */



/*p s v midele(int[] arr){
List<Integer>filterarr=new ArrayList<>();
for(int i=0;i<arr.length;i++){
if(arr[i]>=0){
filter.add(arr[i]);
}
}
int n=filterarr.size();
int midindex=(n-1)/2;
syso(filterarr.get(midindex));*/