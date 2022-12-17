package dataStructures.Regex;

public class Regex implements Cloneable
{
  public static void main(String args[]) {

    //char->string
    String name = "N a r a s i m h a";
    String regex = "\\s";

    String nameWithOutSpaces = name.replaceAll(regex, "");
    System.out.println(nameWithOutSpaces.length());
  }

}
