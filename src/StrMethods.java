import java.util.Scanner;


public class StrMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String name = sc.nextLine();

        //String methods 
        int length;
        char ch;
        int index;
        int lastIndex;
        int lastIndexOf;




        length = name.length();  // gives the length og the string 

        ch = name.charAt(3);  // gives the char at the specific position 

        index= name.indexOf("n"); // gives the position of the char given 
        lastIndex = name.lastIndexOf("n");  // gievs the last index of the char

        name = name.toUpperCase();
        System.out.println("my name is - "+name);
        name = name.toLowerCase();
        System.out.println("name in lower case "+name);
        boolean tr = name.isEmpty(); // this shows false if name typed otherwise true
        
        
        if(tr){
            System.out.println("Your name is typed ");
        }else{
            System.out.println("your name is - "+name);
        }

        // returns true if contains the specific character 
        if(name.contains("a")){
            System.out.println("your name contains a");
        }else{
            System.out.println("your name doesn't have a");
        }
        // equals method that returns true if the string inside is the same to the input
        if(name.equals("Chayan")){
            System.out.println("Your cant write this name ");
        }else{
            System.out.println("your name is "+ name);
        }



        sc.close();
    }
}
