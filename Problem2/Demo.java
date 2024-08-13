@SuppressWarnings("MismatchedReadAndWriteOfArray")
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

        System.out.println();
        System.out.println("Before Scaling:");
        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println();
        }

        Scalable[] scalable = new Scalable[shapes.length];
        for (int i = 0; i < shapes.length; i++){
            scalable[i] = (Scalable) shapes[i];
        }

        scaleAll(scalable, 1.2);

        System.out.println("After Scaling:");
        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println();
        }
    }

    public static void scaleAll(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
