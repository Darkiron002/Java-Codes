/**
 * matrix
 */
import java.util.Scanner;
public class matrix {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        // int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] mat1 = new int[row][col];
        System.out.println("Now enter the elements !!!!");
        //For user input
        for( int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("Enter the element on "+i+" and "+j);
                mat1[i][j] = sc.nextInt();
            }System.out.println();
        }

        for( int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(mat1[i][j] +" ");
            }System.out.println();
        } 
        System.out.println();
        // int[][] mat2 = {{0,9,8},{7,6,5},{4,3,2}};
        // int[][] mat3 = new int[3][3];

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         mat3[i][j]= mat1[i][j]+mat2[i][j];
        //     }
        // }
        // for( int i = 0;i<3;i++){
        //     for(int j = 0;j<3;j++){
        //         System.out.print(mat3[i][j] +" ");
        //     }System.out.println();
        // }

        sc.close();

    }
}