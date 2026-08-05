import java.util.Scanner;
import java.util.Random;

public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1,7);
        switch (num) {
            case 1:
                System.out.println("you got a 1 in dice");
                break;
            case 2:
                System.out.println("you got a 2 in dice");
                break;
            case 3:
                System.out.println("you got a 3 in dice");
                break;
        
            default:
                System.out.println("nothing");
                break;
        }

        boolean isHead = random.nextBoolean();
        if(isHead){
            System.out.println("you got heads ");
        }else{
            System.out.println("you got tails");
        }








        System.out.print("Enter your number : ");
        int num2 = sc.nextInt();
        System.out.print("The squre root of the number is - "+StrictMath.sqrt(num2));
        sc.close();
    }
}
