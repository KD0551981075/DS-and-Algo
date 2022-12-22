package StringDS.StreamsAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class filterNames {

  public static void main(String args[]) {
    String name = "Kota Narasimha Datta";
    char[] charArray = name.toCharArray();

    int  index = 0;
    System.out.println(charArray[0]);
    boolean flag = true;

    for(int i=1;i<charArray.length;i++){
      //capital value

      char currentValue = charArray[i];

      if(Character.isUpperCase(currentValue)){
        //K,N,D
        System.out.println(currentValue);
        System.out.println(name.substring(index,i));
        index = i;
      }

    }

  }

}
