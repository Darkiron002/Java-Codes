/**
 * MaxMin
 */

import java.util.Scanner;


public class MaxMin {

    public static void main(String[] args) {
        //declearing scanner 
        Scanner sc = new Scanner(System.in);

        //declearing all the max and min 
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        int len;
        System.out.print("Enter the number of array you want to make: ");
        len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<len;i++){
            if(arr[i]>MAX){
                MAX = arr[i];
            }else if(arr[i]<MIN){
                MIN = arr[i];
            }
        }
        System.out.println("The maximum is "+MAX);
        System.out.println("The minimum is "+MIN);








        sc.close();
    }
}