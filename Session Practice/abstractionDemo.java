//every class and method is not abstract class
abstract class shape {
    String name;

    // constructor of shape class
    public shape(String name) {
        this.name = name;
    }

    // Abstract methods
    abstract double calculateArea();

    abstract double calculateVolume();

    // Concreate method
    void displayName() {
        System.out.println("Name: " + name);
    }
}

class circle2 extends shape {
    double radius;

    circle2(double radius) {
        super("circle");
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }
}

class square extends shape {
    double side;

    square(double side) {
        super("square");
        this.side = side;
    }

    double calculateArea() {
        return (side * side);
    }

    double calculateVolume() {
        return (side * side * side);
    }
}

class triangle extends shape {
    double base, height;

    triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;

    }

    double calculateArea() {
        return 0.5 * (base * height);
    }

    double calculateVolume() {
        return 0.3 * (base * height);
    }
}

public class abstractionDemo {
    public static void main(String[] args) {

        // You can not create a instance of abstract class i.e. for shape we can not
        // create object.
        circle2 c1 = new circle2(3.2);
        c1.displayName();
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Volume: " + c1.calculateVolume());

        square s1 = new square(5);
        s1.displayName();
        System.out.println("Area: " + s1.calculateArea());
        System.out.println("Volume: " + s1.calculateVolume());

        triangle t1 = new triangle(6, 4);
        t1.displayName();
        System.out.println("Area: " + t1.calculateArea());
        System.out.println("Volume: " + t1.calculateVolume());
    }
}
