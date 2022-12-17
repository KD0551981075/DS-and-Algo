package array;

public class RotateArray {

  public static void main(String args[]) {


    int[] internalCache1 = {1, 2, 3, 4, 5};
    int internalCache1Lenght = internalCache1.length;
    int valuesToShift = 3;
    int[] scenario1 = rotateToLeft_scenario_1(internalCache1, valuesToShift, internalCache1Lenght);
    int[] scenario2 = rotateToLeft_scenario_2(internalCache1, valuesToShift, internalCache1Lenght);
    printDataFromTheArray(scenario2, internalCache1Lenght);


  }

  /**
   * scenario 2
   * rotate all the elements one-by-one shift value time
   * time complexity = O(length*valuesToshift)
   * space complexity = O(1)
   */
  private static int[] rotateToLeft_scenario_2(int[] internalCache1, int valuesToShift, int length) {

    int currentShift = 1;
    while (currentShift <= valuesToShift) {
      int temp = internalCache1[0];
      for (int i = 0; i < length - 1; i++) {
        internalCache1[i] = internalCache1[i + 1];
      }
      //adding data to last index
      internalCache1[length - 1] = temp;
      currentShift++;
    }
    return internalCache1;

  }


    /**scenario 1
    *dividing the array into two to colning it into one
     *
     * time complexity = O(lenght) // second half+ first half
     * space complexity = ???
    */
  private static int[] rotateToLeft_scenario_1(int[] internalCache1, int valuesToShift, int internalCache1Lenght) {
    /**
     * 1>dividing the second half to the required array
     * 2>add 1st half after the second half
     */

    int[] tempLocal = new int[internalCache1Lenght];
    int initialValue = 0;

    //1>dividing the second half to the required array
    for (int i = valuesToShift; i < internalCache1Lenght; i++) {
      tempLocal[initialValue] = internalCache1[i];
      initialValue++;
    }

    //2>add 1st half after the second half
    for (int i = 0; i < valuesToShift; i++) {
      tempLocal[initialValue] = internalCache1[i];
      initialValue++;
    }

    return tempLocal;
  }


  private static void printDataFromTheArray(int[] tempLocal, int lenght) {
    for (int i = 0; i < lenght; i++) {
      System.out.println(tempLocal[i]);
    }
  }
}
