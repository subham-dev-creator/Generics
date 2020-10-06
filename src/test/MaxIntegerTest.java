package test;

import main.generics.Generics;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaxIntegerTest {

    Generics max;

    @Before
    public void initialize() {
        max = new Generics();
    }
    // Integer Test
    @Test
    public void MaxAt1stPositionInt() {
        Assert.assertEquals(new Integer(3), max.findMaxGeneric(new Integer[] {3,2,1}));

    }
    @Test
    public void MaxAt2stPositionInt() {
        Assert.assertEquals(new Integer(4), max.findMaxGeneric(new Integer[] {3,4,1}));

    }
    @Test
    public void MaxAt3stPositionInt() {
        Assert.assertEquals(new Integer(5), max.findMaxGeneric(new Integer[] {3,4,5}));

    }

    // Float Test
    @Test
    public void MaxAt1stPositionFloat() {
        Assert.assertEquals(new Float(3f), max.findMaxGeneric(new Float[] {3f,2f,1f}));
    }
    @Test
    public void MaxAt2stPositionFloat() {
        Assert.assertEquals(new Float(4f), max.findMaxGeneric(new Float[] {3f,4f,1f}));
    }
    @Test
    public void MaxAt3stPositionFloat() {
        Assert.assertEquals(new Float(5f), max.findMaxGeneric(new Float[] {3f,4f,5f}));
    }

    // String test
    @Test
    public void givenMaxString_At1stPosition_ReturnString() {
        Assert.assertEquals(new String("Mango"), max.findMaxGeneric(new String[] {"Mango","Banana","Apple"}));
    }
    @Test
    public void givenMaxString_At2ndPosition_ReturnString() {
        Assert.assertEquals(new String("Grapefruit"), max.findMaxGeneric(new String[] {"Cherries","Grapefruit","Apple"}));
    }
    @Test
    public void givenMaxString_At3rdPosition_ReturnString() {
        Assert.assertEquals(new String("Kiwi"), max.findMaxGeneric(new String[] {"Cherries","Banana","Kiwi"}));
    }
}