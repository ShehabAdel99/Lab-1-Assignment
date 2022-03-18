import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

public class WatermelonTest {
    Watermelon x = new Watermelon();
    @Test
    public void test1(){
        String data="1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.Devide(), false);
    }
    @Test
    public void test2(){
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.Devide(), false);
    }
    @Test
    public void test3(){
        String data="100";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.Devide(), true);
    }
    @Test
    public void test4(){
        String data="40";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.Devide(), true);
    }
    @Test
    public void test5(){
        String data="57";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(x.Devide(), false);
    }
}