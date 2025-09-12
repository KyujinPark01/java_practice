package beyond.level1.basic;

public class Circle extends Shape implements Resizable {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void resize(double factor) {
        this.radius = (int) (radius * factor);
    }

    @Override
    public String toString() {
        return "Shape : Circle"+"\n"+
        "Area : " + calculateArea()+"\n"+
        "Perimeter : " + calculatePerimeter();
    }

}
