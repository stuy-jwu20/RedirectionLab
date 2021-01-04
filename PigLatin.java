import java.io.*;
import java.util.*;

public class PigLatin {
  public static void main(String[] args) {

  }

  public static String pigLatinSimple(string s) {
    String vowels = "aeiou";
    if (vowels.indexOf(s.charAt(0)) != -1) {
      String newWord = s + "hay";
      newWord = newWord.toLowerCase();
      return newWord;
    } else {
      String newWord = s.substring(1,s.length()) + s.substring(0,1) + "ay";
      return newWord;
    }
  }

  public static String pigLatin(String s) {

  }

  public static String pigLatinBest(String s) {

  }
}
