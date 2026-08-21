class Car{
    private String model;
    private String color ;
    private int price;
    Car(String a, String b, int c){
        this.model = a;
        this.color = b;
        this.price = c;
    }
    //getter methods 
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }
    //setter methods
    void setColor(String a){
        this.color = a;
    }
    void setPrice (int a){
        this.price = a;
    }

}


public class getset {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Blue", 1000000);
        //System.out.println(car.model); this is not visibale but 
        System.out.println(car.getModel());
        //now the first price 
        System.out.println(car.getPrice());
        System.out.println("changing the price ");
        car.setPrice(200000);
        System.out.println("the new price is  - "+car.getPrice());
    }
}
