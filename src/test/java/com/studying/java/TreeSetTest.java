package com.studying.java;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TreeSetTest {

    @Test
    public void treeSetMethodsTest() {
        final TreeSet<Integer> treeSet = new TreeSet<>() {{
            add(555);
            add(-555);
            add(-5);
            add(7);
            add(8);
            // is it TreeSet class instance?
        }};

        // TODO check if set has a value 555
        boolean has555 = false; // <--
        assertTrue(has555);

        // TODO add some values that will appear at the end of treeSet

        assertTrue(treeSet.toString().startsWith("[-555, -5, 7, 8, 555, "));

        // TODO find first positive element with one TreeSet (NavigableSet) class method
        int firstPositiveElement = 0; // <--
        assertEquals(firstPositiveElement, 7);

        // TODO create a set from negative elements of treeSet
        Set<Integer> negativeElements = null; // <--
        assertEquals("[-555, -5]", negativeElements.toString());

        treeSet.add(-100);
        treeSet.add(100);

        // TODO create a set of elements > -100 and < 100 from treeSet (not inclusive)
        Set<Integer> middleSet = null; // <--
        assertEquals("[-5, 7, 8]", middleSet.toString());

    }
}
