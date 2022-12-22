//package Interview;
//
//
//import com.github.tomakehurst.wiremock.matching.MatchesJsonPathPattern;
//
//import java.util.Map;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class UtilsRejex {
//
//  private static boolean found;
//
//  public static void main(String args[]) {
//    //Regex class
//    boolean isMatch = Pattern.matches("[kad]", "a");
//    System.out.println(isMatch);
//    //.dot operator
//    System.out.println(Pattern.matches(".a", "ba"));
//
//    //Regex quantifiers
//    System.out.println(Pattern.matches("amn", "amn"));
//    System.out.println(Pattern.matches("[amn]?", "aaaa"));
//    System.out.println(Pattern.matches("[amn]?", "aam"));
//    System.out.println(Pattern.matches("[amn]+", "amn"));
//    System.out.println(Pattern.matches("[amn]+", "aammnn"));
//    System.out.println(Pattern.matches("[amn]+", "a"));
//    System.out.println(Pattern.matches("[amn]+", "amns"));
//
//    System.out.println(Pattern.matches("[a-z]+", "amns"));
//
//    // ? once or non
//    // + once or many
//    // * many or non
//
//    System.out.println(Pattern.matches("[amn]*", "ammmn"));
//
//    //Meta charater
//    // \\d \\D
//    // \\w \\W
//    // \\s  \\S
//    // \\b  \\B
//    // \\d - abc,1,4443,312abc
//    // \\D - abc,1,4443,345abc,m
//    String MetaRegex1 = "\\s";
//    String MetaRegex2 = "\\S";
//
//    metaCharacters(MetaRegex1, "abc");
//    metaCharacters(MetaRegex1, "1");
//    metaCharacters(MetaRegex1, "4443");
//    metaCharacters(MetaRegex1, "312abc");
//
//    metaCharacters(MetaRegex2, "abc");
//    metaCharacters(MetaRegex2, "1");
//    metaCharacters(MetaRegex2, "4443");
//    metaCharacters(MetaRegex2, "312abc");
//    metaCharacters(MetaRegex2, "(");
//
//    String MetaRegex11 = "\\w{6}";
//    String MetaRegex21 = "arun32";
//
//    metaCharacters(MetaRegex11, MetaRegex21);
//
//    //phone number with length 10, starting with 7or8or9
//    String pattern1 = "[789][0-9]{9}";
//    String pattern2 = "[789]{1}[0-9]{9}";
//    String pattern3 = "[789]{1}\\d{9}";
//
//    String phoneNumber = "99530389499";
//    validatePhoneNumber(pattern3, phoneNumber);
//
//
//    patternFinder();
//  }
//
//  public static void patternFinder() {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the pattern :");
//    Pattern primaryPattern = Pattern.compile(scanner.nextLine());
//    System.out.println("Enter the String that you want to match with");
//    Matcher matcher = primaryPattern.matcher(scanner.nextLine());
//
//
//    while (matcher.find()) {
//      System.out.println("found the matching : " + matcher.group() + "at the starting index -" + matcher.start() + "and the ending index -" + matcher.end());
//
//      found = true;
//    }
//
//    if (!found)
//      System.out.println("match not found for the given pattern");
//
//  }
//
//  public static void metaCharacters(String regex, String string) {
//    //Meta characters
//    // .  any character
//    // \d  any digit
//    // \w any word
//    // \s any whitespace character
//    // \b  word boundary
//
//
//    // \\d - abc,1,4443,312abc
//    // \\D - abc,1,4443,345abc,m
//
//    System.out.println(Pattern.matches(regex, string));
//
//  }
//
//  public static void validatePhoneNumber(String pattern, String phoneNumber) {
//    System.out.println(Pattern.matches(pattern, phoneNumber));
//  }
//}
