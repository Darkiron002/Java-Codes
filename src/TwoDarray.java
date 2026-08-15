/**
 * 2Darray
 */
public class TwoDarray {

    public static void main(String[] args){

        // 2D array implementaiton 
        char[][] numpad={{'7','8','9'},
        {'4','5','6'},
        {'1','2','3'},
        {'#','0','*'}};
        for(char[] numa:numpad){
            for(char num:numa ){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}