package abstractionConcept.interfaceDemo;

public class Circle implements Shape {

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void area() {
        double circleArea2 = Math.PI * radius * radius;
        System.out.println("circle area  = " + circleArea2);
    }
}
