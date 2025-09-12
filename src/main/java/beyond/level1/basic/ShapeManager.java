package beyond.level1.basic;

import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];

    private int index;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if(index==10){
            shapes = Arrays.copyOf(shapes,20);
            shapes[index]  = shape;
            index++;
        }
        else{
            shapes[index] = shape;
            index++;
        }

    }

    public void removeShape(Shape shape) {
        int count = 0;
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].equals(shape)) {
                count = i;
                shapes[i] = null;
                break;
            }

            if (count == shapes.length - 1) {
                shapes[count] = null;
            }
        }
        for (int i = count; i < shapes.length - 1; i++) {
            shapes[i] = shapes[i + 1];
        }

    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println(shape);
            }
        }
    }

    public double getTotalArea() {
        double sumArea = 0;
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        for (Shape shape : shapes) {
            if (shape != null) {
                sumArea += shape.calculateArea();
            }
        }
        return sumArea;
    }

    public double getTotalPerimeter() {
        double sumPerimeter = 0;
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        for (Shape shape : shapes) {
            if (shape != null) {
                sumPerimeter += shape.calculatePerimeter();
            }
        }
        return sumPerimeter;
    }

}
