package com.fup.sorting_data.model;

import java.util.List;

public class SortingResult {
    private List<Integer> originalData;
    private List<Integer> sortedData;
    private int dataSize;

    public List<Integer> getOriginalData() {
        return originalData;
    }

    public void setOriginalData(List<Integer> originalData) {
        this.originalData = originalData;
    }

    public List<Integer> getSortedData() {
        return sortedData;
    }

    public void setSortedData(List<Integer> sortedData) {
        this.sortedData = sortedData;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }
}