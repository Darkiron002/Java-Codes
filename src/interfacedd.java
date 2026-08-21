/**
 * interface
 */

interface hunter{
    void hunt();// thsi method is not defiend but have to be defined in other children
}
interface pray{
    void flee();
}

class rabbit implements pray{
    @Override
    public void flee() { // defining the abstract method 
        System.out.println("The rabit is fleeing ");
    }
}
class hawk implements hunter{
    @Override
    public void hunt(){
        System.out.println("the hawk is hunting ");
    }
}






public class interfacedd {

     public static void main(String[] args) {
        
     }
}