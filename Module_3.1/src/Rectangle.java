public class Rectangle extends Shape {
    private double Width;
    private double Height;


    public Rectangle(double Width, double Height, String color){
        super(color);
        this.Width = Width;
        this.Height = Height;

    }
    public double calculateArea(){
        double area = (Width * Height);
        return area;
    }

}
