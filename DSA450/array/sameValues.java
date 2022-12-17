package array;
import java.util.Arrays;
public class sameValues {
  public static void main(String args[]) {
    int arr1[] = {1, 5, 10, 20, 40, 80};
    int arr2[] = {6, 7, 20, 80, 100};
    int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
    int arr4[] = {10, 20};
    System.out.println(common(arr1, arr2));
  }

  public static int[] common(int[] a, int[] b) {
    int[] common = new int[a.length];
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j])
          common[index] = (a[i]);
        index++;
      }
    }
    return common;
  }}
