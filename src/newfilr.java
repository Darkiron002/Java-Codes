import java.util.Scanner;


public class newfilr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //substring() is a method used to extract a protion of a string 
        String email = "chayanmistry14@gamil.com";
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(14,23);
        System.out.println("The two substrings are "+username +" "+domain);


        sc.close();
    }
}
