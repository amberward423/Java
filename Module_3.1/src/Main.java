//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5,"pink");
        System.out.println(myCircle.calculateArea());

        Rectangle myRectangle = new Rectangle(5, 6, "purple");
        System.out.println(myRectangle.calculateArea());

        Triangle myTriangle = new Triangle(5, 6, "yellow");
        System.out.println(myTriangle.calculateArea());

        ShapeCalculator myShapeCalculator = new ShapeCalculator();
        myShapeCalculator.displayAreas();

    }
}