/**
 * Inheritence
 */
// Parent class
class Animal{
    boolean isAlive;

    Animal(){
        isAlive = true;
    }
    void speak(){
        System.out.println("The animal is telling something ");
    }
}

// Child Class
class Dog extends Animal{
    void speak(){
        System.out.println("The dog is barking ");
    }
}

// Child of Child 
class Pug extends Dog{
    String size = "Small";
    String name;
    int level;
    Pug(String name,int level){
        this.name= name;
        this.level = level;
    }
    void speak(){
        System.out.println("The pug is barking like mad ");
    }

}


public class Inheritence {

    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Pug pug = new Pug("Tommy", 5);
        pug.speak();
        dog.speak();

    }
}