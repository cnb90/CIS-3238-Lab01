package cis3238_lab01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
    MyDate d1 = new MyDate(2016, 1, 1);
    MyDate d2 = new MyDate(2015, 1, 1);
    MyDate d3 = new MyDate(2016, 2, 1);
    MyDate d4 = new MyDate(2015, 12, 1);
    MyDate d5 = new MyDate(2015, 4, 30);
    
    @Test
    public void Test1(){
        assertEquals(365, d1.daysTo(d2));
    }
    
    @Test
    public void Test2(){
        assertEquals(30, d1.daysTo(d3));
    }    
    
    @Test
    public void Test3(){
        assertEquals(331, d2.daysTo(d4));
    }    
    
    @Test
    public void Test4(){
        assertEquals(210, d4.daysTo(d5));
    }
}
