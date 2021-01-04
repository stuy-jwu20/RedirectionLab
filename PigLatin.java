import java.io.*;
import java.util.*;

public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("aaron"));
    //
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("hats"));
  }

  public static String pigLatinSimple(string s) {
    String vowels = "aeiou";
    if (s.length() >= 1) {
      if (vowels.indexOf(s.charAt(0)) != -1) {
        String newWord = s + "hay";
        newWord = newWord.toLowerCase();
        return newWord;
      } else {
        String newWord = s.substring(1,s.length()) + s.substring(0,1) + "ay";
        newWord = newWord.toLowerCase();
        return newWord;
      }
    }
  }

  public static String pigLatin(String s) {
    if (s.length() >= 1) {
      String[] digraph = ["bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"];
      if (digraph.indexOf(s.substring(0,2)) != -1) {
        String newWord = s.substring(2,s.length()) + s.substring(0,2) + "ay";
        return newWord;
      }
      else if (vowels.indexOf(s.charAt(0)) != -1) {
        String vowels = "aeiou";
        String newWord = s + "hay";
        newWord = newWord.toLowerCase();
        return newWord;
      } else {
        String newWord = s.substring(1,s.length()) + s.substring(0,1) + "ay";
        newWord = newWord.toLowerCase();
        return newWord;
      }
    }
  }

  public static String pigLatinBest(String s) {

  }
}
