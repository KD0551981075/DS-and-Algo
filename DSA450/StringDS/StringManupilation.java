package StringDS;
public class StringManupilation {


  public static void main(String args[]) {


    String intString = "25";

    byteArrayConvertToString("in".getBytes());


  }

  public void stringConvertToInt(String inputString) {
    try {
      Integer outPut = Integer.parseInt(inputString);
      outPut = Integer.valueOf(inputString);
      System.out.println(outPut);

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void byteArrayConvertToString(byte[] bytes) {

    System.out.println(bytes);

    String outputString = new String(bytes);
    System.out.println(outputString);

  }
}
