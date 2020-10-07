package test;

import main.generics.Generics;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MaxIntegerTest {

    Generics max;

    @Test
    public void MaxInt() {
        max = new Generics<Integer>(1,2,3,4,5);
        assertEquals(5, max.findMaxGeneric());
    }
}