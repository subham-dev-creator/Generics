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
        Assert.assertEquals(new Integer(3), max.findMax(new Integer[] {3,2,1}));

    }
    @Test
    public void MaxAt2stPositionInt() {
        Assert.assertEquals(new Integer(4), max.findMax(new Integer[] {3,4,1}));

    }
    @Test
    public void MaxAt3stPositionInt() {
        Assert.assertEquals(new Integer(5), max.findMax(new Integer[] {3,4,5}));

    }

    // Float Test
    @Test
    public void MaxAt1stPositionFloat() {
        Assert.assertEquals(new Float(3f), max.findMaximumFloat(new Float[] {3f,2f,1f}));
    }
    @Test
    public void MaxAt2stPositionFloat() {
        Assert.assertEquals(new Float(4f), max.findMaximumFloat(new Float[] {3f,4f,1f}));
    }
    @Test
    public void MaxAt3stPositionFloat() {
        Assert.assertEquals(new Float(5f), max.findMaximumFloat(new Float[] {3f,4f,5f}));
    }
}