package com.github.andavid.ds.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {

  @Test
  public void testBubbleSort() {
    BubbleSort bubbleSort = new BubbleSort();
    int[] data = {9,8,7,6,5,4,3,2,1};
    System.out.println("before bubble sort: " + Arrays.toString(data));
    bubbleSort.sort(data);
    System.out.println("after bubble sort: " + Arrays.toString(data));
  }
}