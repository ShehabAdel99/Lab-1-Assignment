import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

public class PhysicsTest {
    Physics x =new Physics();
    @Test
    public void test1() {
        String data="1\n"+"0 0 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.equilibrium(), true);
    }
    @Test
    public void test2() {
        String data="3\n"+"2 15 9\n"+"4 6 11\n"+"-5 -7 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.equilibrium(), false);
    }
    @Test
    public void test3() {
        String data="2\n"+"1 2 3\n"+"-1 -2 -3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.equilibrium(), true);
    }
    @Test
    public void test4() {
        String data="4\n"+"11 2 44\n"+"100 22 34\n"+"5 6 4\n"+"-900 -600 -1000\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.equilibrium(), false);
    }
}
