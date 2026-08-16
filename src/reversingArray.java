/**
 * reversingArray
 */
import java.util.Scanner;

public class reversingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,6,63,7,21,8};
        for(int j: arr){
            System.out.print(j+" ");
        }

        System.out.println();
        //setting two pointers for the array 
        int start  = 0;
        int end = arr.length-1;
        int i;
        
        while(start <end){
            i = arr[start];
            arr[start]= arr[end];
            arr[end]=i; 

            start++;
            end--;

        }

        //after reversing the array
        for(int j: arr){
            System.out.print(j+" ");
        }





        sc.close();
    }
}