package SmallProjects;
import java.util.Scanner;

public class Quizgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Java Quiz game 

        //Question array
    String[]question = {
                        "What is the name of the PM of India?",
                        "What is the biggest River in the world ?",
                        "What is the faster animal on land?"};
        //Option array
        String[][] options ={{"1. Rahul Gandhi","2. Narendra Modi","3. Shilpa Shetti","4. Prem"},
                            {"1. Nile","2. Amazon","3. Ganges","4. Brahmaputra"},
                            {"1. Cheeta","2. Hippopotemus","3. Lion","4. Tiger"}};

        //Answer array 
        int[] answers = {2,2,1};

        // Declearation of variables 
        int option;
        int correct =0;
        int wrong = 0;
        int guess; 
        int i =0;       

        //welcome message
        System.out.println("Welcome to the Quiz game !!");
        System.out.println("There are three questions in total ");
        
        //Question (Loop)
        do {
            System.out.println("******************************************");
            System.out.println("This is the quiz game");
            System.out.println("type 1 for Questions ");
            System.out.println("Type 2 for showing result ");
            System.out.println("type 3 for the ansers of the questions .");
            System.out.println("Type 4 for getting out of this game ");
            System.out.println("******************************************");
            System.out.print("What's your responce ? ");
            option =sc.nextInt();
            System.out.println("******************************************");
            switch (option) {
                case 1:
                    System.out.println(question[i]); // showing the option 
                    for (String opt : options[i]) {
                         System.out.println(opt);
                        }
                    System.out.print("Enter your answer : "); // getting the guess of the user 
                    guess = sc.nextInt();
                    if (guess == answers[i]) { // checking if the guess is right or wrong 
                        correct++;
                    }else{
                        wrong++;
                    }
                    break;
                case 2:
                    System.out.printf("You have %d right and %d wrong\n",correct,wrong);
                    break;
                case 3:
                    System.out.println("The answers of the question are - ");
                    System.out.println("1. Narendra Modi ");
                    System.out.println("2. Amazon");
                    System.out.println("3. Cheeta ");
                    break;
                default:
                    break;
            }
            i++;
        } while (option!= 4);
        
        sc.close();
    }
    
}
