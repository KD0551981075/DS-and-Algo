package array;

public class MultiDimensionalArray {

  public static void main(String args[]) {
    int[][] multiDimData = {{9, 9, 4}, {0, 0, 9}, {2, 7, 6}};

    System.out.println(multiDimData.length);
    //print values
    for (int i = 0; i <multiDimData.length; i++)
    {
      for (int j=0;j<3;j++)
        System.out.println("outer "+i+"inner "+j+"value -" +multiDimData[i][j]);
    }
  }
}
