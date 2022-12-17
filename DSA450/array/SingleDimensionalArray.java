package array;

public class SingleDimensionalArray {

  public static void main(String args[])
  {
    Students[] localCache = new Students[]{
      new Students("Datta"),
      new Students("Akhil"),
      new Students("Manoj")
    };

    for(int i=0; i<localCache.length;i++)
    {
      System.out.println(localCache[i].toString());
    }
  }
}

class Students {
  String name;

  Students(String name)
  {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
}}
