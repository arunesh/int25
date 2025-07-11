


public class SortingAlgos{

  public static void printArray(String title, int[] r) {
    System.out.println(title);
    for (int i = 0; i < r.length; i ++) {
      System.out.println("Item[" + i + "] = " + r[i]);
    }
  }

  /*
   * In-place quick sort.
   */
  public static void bubbleSort(int[] items) {
    printArray("Input:", items);
    for (int i = 0; i < items.length - 1; i ++) {
      for (int j = i+1; j < items.length; j ++) {
        if (items[i] > items[j]) {
          int x = items[j];
          items[j] = items[i];
          items[i] = x;
        }
      }
    }
    printArray("Sorted:", items);
  }

  public static void selectionSort(int[] items) {
    printArray("Input:", items);
    for (int i = 0; i < items.length - 1; i ++) {
      int minIndex = i;
      for (int j = i + 1; j < items.length; j ++) {
        if (items[minIndex] > items[j]) {
          minIndex = j;
        }
      }
      int x = items[i];
      items[i] = items[minIndex];
      items[minIndex] = x;
    }
    printArray("Sorted:", items);
  }

  // Idea here is to "insert" the key element into the sorted array
  // by moving all elements greater than the key one space up.
  public static void insertionSort(int[] items) {
    printArray("Input:", items);
    for (int i = 1; i < items.length; i ++) {
      int key = items[i];

      j = i - 1;
      while (items[j] > key) {
        if (items[j] > key) {
          items[j+1] = items[j]
        }
        j --;
      }
      items[j+1] = key;
    }
    printArray("Sorted:", items);
  }

  // Merges arrays [left, mid] [mid +1, right]
  public static void mergeArrays(int[] arr, int left, int mid, int right) {

    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] arr1 = new int[n1];
    int[] arr2 = new int[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; i ++) {
      arr1[i] = arr[left + i];
    }
    for (int j = 0; j < n2; j ++) {
      arr2[j] = arr[mid + 1 + j];
    }

    int index = left;

    int i = 0; int j = 0; // Indices of the temp arrays.
    while (i < n1 && j < n2) {
      // merge ascending.
      if (arr1[i] < arr2[j]) {
        arr[index] = arr1[i];
        index ++;
        i ++;
      } else {
        arr[index] = arr2[j];
        index ++;
        j ++;
      }
    }

    while (i < n1) {
      // copy remaining.
      arr[index] = arr1[i];
      index ++;
      i ++;
    }

    while (j < n2) {
      // copy remaining
      arr[index] = arr2[j];
      index ++;
      j ++;
    }
  }

  // sorts from [start .. end]
  public static void mergeSortRecursive(int[] items, int start, int end) {
    printArray("Input:", items);

    int len = end - start;
    int mid = start + (end-start)/2;

    mergeSortRecursive(items, start, mid);
    mergeSortRecursive(items, mid + 1, end);

    mergeArrays(items, start, mid, end);
    printArray("Sorted:", items);
  }

  public static boolean isSorted(int[] items) {
    boolean sorted = true;
    int i = 0;
    while (sorted && i < (items.length - 1)) {
      if (items[i] > items[i+1]) {
        sorted = false;
      }
      i++;
    }
    return sorted;
  }

  public static void main(String argv[]) {
    System.out.println("Hello world !");
    int[] arr = {5, 0, 23, 3, 8, 55, 30, 99, 70, 2};
    // bubbleSort(arr);
    insertionSort(arr);
  }
}
