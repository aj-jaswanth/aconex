import org.junit.Assert;
import org.junit.Test;

/**
 * Created by skumar on 24/04/17.
 */
public class RectangleTest {

    @Test
    public void shouldBeAbleToGiveTheArea() {
        Assert.assertEquals(15, rectangle(3, 5).area(),0);
    }

    private Rectangle rectangle(int length, int width) {
        return new Rectangle(length, width);
    }

    @Test
    public void shouldBeAbleToGivePerimeter(){
        Assert.assertEquals(16, rectangle(3, 5).perimeter(),0);
    }

}
