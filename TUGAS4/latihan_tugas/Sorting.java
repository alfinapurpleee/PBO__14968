package latihan_tugas;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka yang akan diurutkan (pisahkan dengan spasi):");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        
        System.out.println("\nBubble Sort:");
        bubbleSort(Arrays.copyOf(array, array.length));
        
        System.out.println("\nQuick Sort:");
        quickSortDriver(Arrays.copyOf(array, array.length));
        
        System.out.println("\nInsertion Sort:");
        insertionSort(Arrays.copyOf(array, array.length));
        
        System.out.println("\nSelection Sort:");
        selectionSort(Arrays.copyOf(array, array.length));
        
        System.out.println("\nMerge Sort:");
        mergeSortDriver(Arrays.copyOf(array, array.length));
    }
    
    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    printArray(arr);
                }
            }
        }
    }
    
    // Quick Sort Driver
    static void quickSortDriver(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    
    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            printArray(arr);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    // Partition function for Quick Sort
    //Pivot Kunci utama dalam Quick Sort
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot element
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            printArray(arr);
        }
    }
    
    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }
    
    // Merge Sort Driver
    static void mergeSortDriver(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
    
    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
            printArray(arr);
        }
    }
    
    // Merging function for Merge Sort
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; i++)
            rightArr[i] = arr[mid + 1 + i];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    // Function to print array state
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
