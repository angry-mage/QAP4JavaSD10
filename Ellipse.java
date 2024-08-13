public class Ellipse extends Shape{

    protected double axisA;
    protected double axisB;

    private String name;

    public Ellipse(double axisA, double axisB, String name){
        this.axisA = axisA;
        this.axisB = axisB;
        this.name = name;
    }

    public Ellipse(){
        this.axisA = 4.0;
        this.axisB = 2.0;
        this.name = "Ellipse";
    }

    public double getAxisA(){
        return this.axisA;
    }

    public double getAxisB(){
        return this.axisB;
    }

    public String getName(){
        return this.name;
    }

    public void setAxisA(double axisA){
        this.axisA = axisA;
    }

    public void setAxisB(double axisB){
        this.axisB = axisB;
    }

    public double getArea(){
        return Math.PI * axisA * axisB;
    }

    public double getPerimeter(){
        return Math.PI * (Math.sqrt(2 * (axisA * 2) + (axisB * 2) - ((axisA - axisB) * 2)/2));
    }

    public String toString(){
        return getName() + " " + "[Perimeter = " + getPerimeter() + " Area = " + getArea() + "]";
    }
}
