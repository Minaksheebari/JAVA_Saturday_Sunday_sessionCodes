//Acheiving abstraction using interface instead of abstraction
//This is not a class. So it should be implemented not extended.
//interface only have method defination. 

import java.util.jar.Attributes.Name;

interface shape {
    double calculateArea();

    double calculateVolume();

    String getName();

    void display();
}

class circle2 implements shape {
    double radius;
    private String name = "circle";

    circle2(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }
}

class square implements shape {
    double side;
    private String name = "square";

    square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return (side * side);
    }

    public double calculateVolume() {
        return (side * side * side);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name: " + name);
    }
}

class triangle implements shape {
    double base, height;
    private String name = "Triangle";

    triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }

    public double calculateArea() {
        return 0.5 * (base * height);
    }

    public double calculateVolume() {
        return 0.3 * (base * height);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name: " + name);
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        circle2 c1 = new circle2(3.2);
        c1.display();
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Volume: " + c1.calculateVolume());

        square s1 = new square(5);
        s1.display();
        System.out.println("Area: " + s1.calculateArea());
        System.out.println("Volume: " + s1.calculateVolume());

        triangle t1 = new triangle(6, 4);
        t1.display();
        System.out.println("Area: " + t1.calculateArea());
        System.out.println("Volume: " + t1.calculateVolume());
    }
}
