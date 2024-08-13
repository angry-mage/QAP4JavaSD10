public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[7];
        shapes[0] = new Circle(2.5, "Circle");
        shapes[1] = new Ellipse(5.0, 2.5, "Ellipse");
        shapes[2] = new Triangle(3.0, 2.0, 2.0, "Triangle");
        shapes[3] = new EquilateralTriangle(5.0, "Equilateral Triangle");
        shapes[4] = new Ellipse(7.1, 4.7, "Ellipse 2");
        shapes[5] = new Triangle(4.1, 3.8, 2.7, "Triangle 2");
        shapes[6] = new Triangle(3.0, 5.0, 2.0, "Triangle 3");

        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println();
        }
    }
}
