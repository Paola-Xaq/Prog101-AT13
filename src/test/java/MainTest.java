import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void divide_FourAndTwo_Two() {
        Main main = new Main();
        int expected = 2;
        int actual = main.divide(4,2);
        Assert.assertEquals(expected,actual);
    }
}