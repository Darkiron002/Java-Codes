import java.util.Scanner;
import java.util.Random;

public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        
        //function over loead solution 
        System.out.println(add(1,2,3,6,4));
        sc.close();
    }

    static int add(int... number){
        int sum =0; 
        for(int num : number){
            sum +=num;
        }
        return sum;
    }
}
