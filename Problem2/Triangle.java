public class Triangle extends Shape{

    protected double sideA;
    protected double sideB;
    protected double sideC;

    private String name;

    public Triangle(double sideA, double sideB, double sideC, String name){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
    }

    public Triangle(){
        this.sideA = 3.0;
        this.sideB = 2.0;
        this.sideC = 2.0;
        this.name = "Triangle";
    }

    public double getSideA(){
        return this.sideA;
    }

    public double getSideB(){
        return this.sideB;
    }

    public double getSideC(){
        return this.sideC;
    }

    public String getName(){
        return this.name;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public void setSideB(double sideB){
        this.sideB = sideB;
    }

    public void setSideC(double sideC){
        this.sideC = sideC;
    }

    public void scale(double factor){
        this.sideA *= factor;
        this.sideB *= factor;
        this.sideB *= factor;
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double getS(){
        return (sideA + sideB + sideC) / 2;
    }

    public boolean isValid(){
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    public double getArea(){
        if (!isValid()){
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        double s = getS();
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public String toString(){
        return getName() + " " + "[Perimeter = " + getPerimeter() + " Area = " + (isValid() ? getArea() : "Invalid") + "]";
    }

}
