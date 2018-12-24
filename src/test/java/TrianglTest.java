import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrianglTest {

    @Test
    public void area() {
        Point point = new Point(4,1);
        Point point1 = new Point(0,4);
        Point point2 = new Point(9,1);

        Triangl triangl = new Triangl(point, point1, point2 );

        if (Triangl.area(triangl) < 0 ){
            Assert.fail();
            Assert.assertNotEquals(point, point1 );
            Assert.assertSame(point2, point1);
        }
    }
}