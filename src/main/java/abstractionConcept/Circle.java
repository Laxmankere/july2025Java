package abstractionConcept;

public class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}
