package Array;
public class ArrayOperation {

    
    public static void processArray(int[] arr) {
        int evenSum = 0;  
        int oddXOR = 0;   
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i]; 
            } else {
                oddXOR ^= arr[i];  
            }
        }
        System.out.println("Sum of elements at even indices: " + evenSum);
        System.out.println("XOR of elements at odd indices: " + oddXOR);
    }

    public static void main(String[] args) {
    
        int[] array = {3, 5, 2, 9, 4, 7, 8};
        processArray(array);
    }
}
