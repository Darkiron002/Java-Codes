/**
 * Exceptoin =  an event thatinterrupts the normal flow of a program for faults , surround any dangerous code with a try{} block , debrife catch{}, and finally{}
 */
import java.util.Scanner;


public class exceptoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("This is a standered Divisior");
            System.out.println("Enter your two numbers - ");
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("you can't devide by 0 you dumb bitch!!!");
        }
        catch(Exception e){ // for all exception
            System.out.println("Something went wrong ");
        }

        sc.close();


    }
}