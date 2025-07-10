


public class Quicksort{

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

  public selectionSort(int[] items) {
    printArray("Input:", items);
  }

  public static void main(String argv[]) {
    System.out.println("Hello world !");
    int[] arr = {5, 0, 23, 3, 8, 55, 30, 99, 70, 2};
    bubbleSort(arr);
  }
}
