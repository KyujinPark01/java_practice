package beyond.level1.basic;

public class Triangle extends Shape implements Resizable{
    int base;
    int height;
    int side1;
    int side2;
    int side3;

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return (double) (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1+side2+side3;
    }

    @Override
    public void resize(double factor) {
        this.base *= (int) factor;
        this.height *= (int) factor;
        this.side1 *= (int) factor;
        this.side2 *= (int) factor;
        this.side3 *= (int) factor;
    }
    @Override
    public String toString() {
        return "Shape : Triangle"+"\n"+
                "Area : " + calculateArea()+"\n"+
                "Perimeter : " + calculatePerimeter();
    }
}
