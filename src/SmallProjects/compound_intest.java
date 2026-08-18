package SmallProjects;
import java.util.Scanner;


public class compound_intest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give the ammount to get : \n");
        double p = sc.nextDouble();

        System.out.print("Decode the amount of time for the interest : \n");
        int t = sc.nextInt();
        
        System.out.println("What is the interest ratio : ");
        double r = sc.nextDouble();
        double rate = r/100;

        double intrest_amount =p* Math.pow((1+rate),t);
        System.out.printf("Your return amount after %d years is %.2f",t ,intrest_amount);



        sc.close();
    }
}
