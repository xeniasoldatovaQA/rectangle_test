import org.junit.jupiter.api.Test;
import ru.netology.Rtriangle;
import ru.netology.RtriangleProvider;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RtriangleTest {

    @Test
    public void isTriangleRight(){
        Rtriangle triangle = RtriangleProvider.getRtriangle();
        int x1 = triangle.getApexX1();
        int y1 = triangle.getApexY1();
        int x2 = triangle.getApexX2();
        int y2 = triangle.getApexY2();
        int x3 = triangle.getApexX3();
        int y3 = triangle.getApexY3();

        double side1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double side2 = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
        double side3 = Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2);

        boolean isRight = (side1 + side2 == side3) || (side1 + side3 == side2) || (side2 + side3 == side1);

        assertTrue(isRight, "Треугольник не является прямоугольным");
    }
}
