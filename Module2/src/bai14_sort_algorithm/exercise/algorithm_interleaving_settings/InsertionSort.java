package bai14_sort_algorithm.exercise.algorithm_interleaving_settings;

import java.util.Arrays;

public class InsertionSort {
    int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] array){
        int pos;
        int x;
        for(int i = 1; i < array.length; i++){ // đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
