public class ShapeCalculator {
     private Shape[] shapes =  new Shape[3];

     public ShapeCalculator(){
         shapes[0] = new Circle(5, "pink");
         shapes[1]= new Rectangle(5,6, "purple");
         shapes[2] = new Triangle(3,4, "yellow");
     }

     void displayAreas(){
         for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculateArea());
             System.out.println(shapes[i].getColor());


         }
     }


}
