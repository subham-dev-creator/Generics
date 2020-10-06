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

    @Test
    public void MaxAt1stPosition() {
        Assert.assertEquals(new Integer(3), max.findMax(new Integer[] {3,2,1}));

    }
    @Test
    public void MaxAt2stPosition() {
        Assert.assertEquals(new Integer(4), max.findMax(new Integer[] {3,4,1}));

    }
    @Test
    public void MaxAt3stPosition() {
        Assert.assertEquals(new Integer(5), max.findMax(new Integer[] {3,4,5}));

    }

}