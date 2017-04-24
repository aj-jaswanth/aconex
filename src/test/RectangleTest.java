import org.junit.Assert;
import org.junit.Test;

/**
 * Created by skumar on 24/04/17.
 */
public class RectangleTest {

    @Test
    public void shouldBeAbleToGiveTheArea() {
        Rectangle rectangle = new Rectangle(3,5);
        Assert.assertEquals(15, rectangle.area(),0);
    }

}
