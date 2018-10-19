import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest extends Rectangle {
    @Test
    public void firstTryDisplay(){
        double width = 4;
        double height = 40;

        String displayExpected = "Rectangle{width=4.0, height=40.0}";

        Rectangle rectangle = new Rectangle(4,40);
        String display = rectangle.display();

        double area = rectangle.getArea();

        double perimeter = rectangle.getPerimeter();

        assertEquals(displayExpected, display);
    }

    @Test
    public void firstTryArea(){
        double width = 4;
        double height = 40;
        double areaExpected = 160;
        Rectangle rectangle = new Rectangle(4,40);
        double area = rectangle.getArea();

        assertEquals(areaExpected, area);
    }

    @Test
    public void firstTryPerimeter(){
        double width = 4;
        double height = 40;
        double perimeterExpected = 88;

        Rectangle rectangle = new Rectangle(4, 40);
        double perimeter = rectangle.getPerimeter();

        assertEquals(perimeterExpected, perimeter);
    }

    @Test
    public void secondTryDisplay(){
        double width = 3.5;
        double height = 35.9;

        String displayExpected = "Rectangle{width=3.5, height=35.9}";
        Rectangle rectangle = new Rectangle(width, height);

        String display = rectangle.display();

        assertEquals(displayExpected, display);
    }

    @Test
    public void secondTryArea(){
        double width = 3.5;
        double height = 35.9;

        double areaExpected = 125.64999999999999;

        Rectangle rectangle = new Rectangle(width, height);
        double area = rectangle.getArea();

        assertEquals(areaExpected, area);
    }

    @Test
    public void secondTryPerimeter(){
        double width = 3.5;
        double height = 35.9;

        double perimeterExpected = 78.8;

        Rectangle rectangle = new Rectangle(width, height);

        double perimeter = rectangle.getPerimeter();

        assertEquals(perimeterExpected, perimeter);
    }
}