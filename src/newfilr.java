import java.util.Scanner;


public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double squre;
        squre = Math.pow(2,4);

        System.out.println("The round of 3.14 is: "+Math.round(3.14)); // rounds upto the cosest integer 
        System.out.println("The absolute value of *5 is : "+Math.abs(-5));// gives the absolute value of the number given below
        System.out.println("The squre root fo 9 is: "+Math.sqrt(9)); // gives the squre root of the number
        System.out.println("The bigger round up of 3.14 is: "+Math.ceil(3.14)); // rounds up to the biggest number 
        System.out.println("The bigger number is: "+Math.max(10,20)); //gives the  maximum number between two
        System.out.println("The smaller number is: "+Math.min(10, 10)); // gives the minimum number between two
        System.out.println(squre);

        // creating a program to find the area of a circle

        double r ;
        System.out.print("Enter the radius of the circle : ");
        r= sc.nextDouble();
        System.out.println("The area is : "+Math.PI*Math.pow(r,2)+"cm²");

        // creating a program to find 

        sc.close();
    }
}
