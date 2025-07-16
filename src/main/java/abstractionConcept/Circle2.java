package abstractionConcept;

public class Circle2 implements Shape1 {

    private double radius;

    Circle2(double radius){
        this.radius = radius;
    }

    @Override
    public void area() {
        double circleArea2 = Math.PI * radius * radius;
        System.out.println("circle area 2 = " + circleArea2);
    }
}
