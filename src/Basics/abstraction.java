
abstract class shape{
    //The abstract class that we have to define in other child classes
    abstract double area();
    //The concret class 
    void display(){
        System.out.println("This is a shape ");
    }

}
class circle extends shape{
    double radius;
    circle(double a){
        this.radius = a;
    }

    @Override
    double area(){
        return Math.PI*radius *radius;
    }
}

class triangle extends shape{
    double height;
    double base;

    triangle(double a,double b){
        this.height = a;
        this.base = b;
    }
    @Override
    double area(){
        return 0.5*height*base;
    }
}


public class abstraction {
    
    public static void main(String[] args) {
        circle cr = new circle(7.0);
        cr.display();
        System.out.printf("%.1f",cr.area()); 
    }
}
