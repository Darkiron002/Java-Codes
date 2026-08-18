package SmallProjects;
import java.util.Scanner;
import java.util.Random;

public class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n;
        int attempt = 0 ;
        int RandomN = random.nextInt(1,11);

        do {
            System.out.print("Enter your choice : ");
            n = sc.nextInt();
          
            

            if (n < RandomN) {
                System.out.println("Your guess is low ");
                attempt++;
            }else if(n>RandomN){
                System.out.println("your guess is high ");
                attempt++;
            }else {
                System.out.println("Your guess is correct");
                System.out.println("you have attempted "+attempt+" Times");
                System.out.println("You won!!!!!");
                
            }
            
        } while (n != RandomN);

       
        sc.close();
    }
}
