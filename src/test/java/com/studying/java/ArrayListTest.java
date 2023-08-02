package com.studying.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void arrayListMethodsTest() {
        List<Integer> customList = new ArrayList<>();
        // TODO add values 5, 6, 7, 8
      

        assertEquals("[5, 6, 7, 8]", customList.toString());
        // TODO add values 1, 2, 3, 4 at the head

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", customList.toString());

        // TODO find first and last index of number 5
        customList.add(5);
        int number5Index = 0;
        int number5LastIndex = 0;
        assertEquals(4, number5Index);
        assertEquals(8, number5LastIndex);

        // TODO copy customList to new copy instance in single command
        List<Integer> copy = null;
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 5]", copy.toString());

        // TODO delete all number 5s from customList

        assertEquals("[1, 2, 3, 4, 6, 7, 8]", customList.toString());
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 5]", copy.toString());

        // TODO init fiveElementsList as last 5 elements of customList
        List<Integer> fiveElementsList = null;
        assertEquals("[3, 4, 6, 7, 8]", fiveElementsList.toString());
    }
}
