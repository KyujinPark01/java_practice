package beyond.level1.basic;

public class Rectangle extends Shape implements Resizable{
    int width;
    int height;

    @Override
    double calculateArea() {
        return width * height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width + height);
    }

    @Override
    public void resize(double factor) {
        this.width *= (int) factor;
        this.height *= (int) factor;
    }
    @Override
    public String toString() {
        return "Shape : Rectangle"+"\n"+
                "Area : " + calculateArea()+"\n"+
                "Perimeter : " + calculatePerimeter();
    }
}
