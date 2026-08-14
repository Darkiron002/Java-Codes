import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = {4,6,3,2,5,13,2,9};
        int target = 55;
        boolean isFound = false;

        // seraching the target in an array
        for(int i =0;i<numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("You found the number at "+i);
                isFound=true;
                break;
            }else{
                System.out.println("its not target ");

            }
        }
        if(!isFound){
            System.out.println("the entire array doesn't contain the number ");
        }


        sc.close();
    }
}
