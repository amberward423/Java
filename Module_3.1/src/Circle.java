public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius= radius;

    }
    public double calculateArea(){
         double area = (Math.PI*(radius*radius));
         return area;
    }

}
