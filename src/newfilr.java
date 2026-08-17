import java.util.Scanner;
import java.util.Random;

class car{
    String name;
    String model;
    int yearOfMake;
    //Static variable = a variable which is static in all the objects 
    static int numofcar =0; // this doesn't need this keyword for referancing just type numofcar

    car(String a, String b,int c){
        this.name = a;
        this.model = b;
        this.yearOfMake= c;
        numofcar++;
    }
}


public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        car car1 = new car("BMW","M240",2026);
        System.out.println("The name is - "+car1.name);
        System.out.println("The model name is - "+ car1.model);
        System.out.println("the year of make is - "+car1.yearOfMake);



        
        sc.close();
    }
    
}
