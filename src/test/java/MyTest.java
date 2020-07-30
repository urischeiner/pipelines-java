import com.microsoft.demo.Demo;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo c = new Demo();
        c.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }
    
   // @Test
   // public void test_method_3() {
    //    assertEquals("a", "b");
    //}
}
