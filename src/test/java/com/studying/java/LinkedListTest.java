package com.studying.java;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void linkedListMethodsTest()
    {
        Collection<Integer> collection = null; // init as LinkedList

        // TODO add values 5, 6, 7, 8

        assertEquals("[5, 6, 7, 8]", collection.toString());

        // TODO add values 1, 2, 3, 4 at the head with addFirst method

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", collection.toString());

        collection.add(5);
        // TODO delete all number 5s with different methods

        assertEquals("[1, 2, 3, 4, 6, 7, 8]", collection.toString());

        // TODO delete first 4 elements with 4 different methods

        assertEquals("[6, 7, 8]", collection.toString());

        // TODO initialize linkedList with type casting from above mentioned collection
        LinkedList<Integer> linkedList = null;
        // TODO get backwardIterator from linkedList.
        Iterator<Integer> backwardIterator = null; // <--
        // TODO get i as last element from linkedList with special LinkedList method
        int i = 0;
        while (backwardIterator.hasNext()) {
            assertTrue(backwardIterator.next().equals(i));
            i--;
        }

        // TODO change second element value to 0

        assertEquals("[6, 0, 8]", collection.toString());

    }
}
