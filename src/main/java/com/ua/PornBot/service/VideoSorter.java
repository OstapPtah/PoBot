package com.ua.PornBot.service;

import java.util.List;

public class VideoSorter {

   List<Video> result;

    public List<Video> sortByRatings(List<Video> unsorted) {
        // check for empty or null array
        if (unsorted == null || unsorted.isEmpty()) {
            return unsorted;
        }
        this.result = unsorted;
        quicksort(0, unsorted.size() - 1);

        return unsorted;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = result.get(high/2).getRatings();

        // Divide into two lists
        while (i <= j) {

            while (result.get(i).getRatings() < pivot) {
                i++;
            }

            while (result.get(i).getRatings() >  pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        Video temp = result.get(i);
        result.set(i,result.get(j));
        result.set(j, temp);
    }

}
