import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Array declearation in java 
        String[] fruits = {"Apple","Coconut", "Banana"};
        String[] foods = new String[3];// creating a empty array 
        foods[0] = "Biriany";
        foods[1]="Chicken Kasha";
        foods[2]="Mutton";
        String[] animal = new String[2];
        //making an array with custom array lenth and inpit 
        String[] name;
        int size ;
        System.out.println("What should be the number of elements of the arrauy name ?: ");
        size = sc.nextInt(); // here as next int doesn't contain a \n character we have to free the buffer so that the nexr nextLine() methods get to work
        name = new String[size];
        sc.nextLine();

        // method to find lenght of the array
        int numOfArray = fruits.length;
        int noAni = animal.length;
        //Built in sort method 
        Arrays.sort(fruits);
        // Fill in method in arrays ,
        // Arrays.fill(foods,"Polao");



        //printing the array 
        for(int i = 0; i<numOfArray;i++){
            System.out.println(fruits[i]);
        }
        System.out.println("************************");
        // Enhanced For loop
        for(String fruit: fruits){ // For every element in fruits do the below line 
            System.out.println(fruit);
        }
        System.out.println("************************");

        for(String food:foods){
            System.out.println(food);
        }

        System.out.println("************************");
        //Taking input for an empty array
        for(int i =0; i<noAni;i++){
            System.out.print("Enter your animal name: ");
            animal[i]= sc.nextLine();
        }
        System.out.println("************************");
        for(int i =0; i<noAni;i++){
            System.out.println(animal[i]);
            
        }




        sc.close();
    }
}
