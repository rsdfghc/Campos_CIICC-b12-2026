package chapter1;

public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setprice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Teddy Bear";
        toy1.brand = "ToyBrand";
        toy1.price = 2000;
        toy1.quantity = 10;
        toy1.setprice(toy1.price*0.5);
        System.out.println(toy1.price);
    }
}

class Fruit{
    public static void main(String[] args) {
        System.out.println("I am a fruit.");

    }
}