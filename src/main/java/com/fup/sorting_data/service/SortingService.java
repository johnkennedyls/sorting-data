package com.fup.sorting_data.service;

import com.fup.sorting_data.model.SortingResult;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SortingService {

    private final Random random = new Random();

    public SortingResult generateAndSort(int size) {
        List<Integer> originalData = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            originalData.add(random.nextInt(1000));
        }

        List<Integer> sortedData = new ArrayList<>(originalData);
        int[] arrayToSort = sortedData.stream().mapToInt(Integer::intValue).toArray();

        quickSort(arrayToSort, 0, arrayToSort.length - 1);

        List<Integer> finalSortedList = new ArrayList<>();
        for (int num : arrayToSort) {
            finalSortedList.add(num);
        }

        SortingResult result = new SortingResult();
        result.setOriginalData(originalData);
        result.setSortedData(finalSortedList);
        result.setDataSize(size);

        return result;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivotIndex = low + (high - low) / 2;
        int pivotValue = arr[pivotIndex];

        swap(arr, pivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivotValue) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}