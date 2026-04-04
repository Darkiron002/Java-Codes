
import java.util.*;

public class newfilr {
    public static int avg(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("The first number - ");
        int a = sc.nextInt();
        System.out.print("The Sceond number - ");
        int b = sc.nextInt();
        System.out.print("The Third number - ");
        int c = sc.nextInt();
        System.out.print("the average of the three numbers is - "+ avg(a,b,c));
        sc.close();
    }
}