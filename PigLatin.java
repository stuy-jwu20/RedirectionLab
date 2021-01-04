import java.io.*;
import java.util.*;

public class PigLatin {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);
    while (myScanner.hasNextLine()) {
      String lineData = (myScanner.nextLine());
      Scanner newScanner = new Scanner (lineData);
      while (newScanner.hasNext()){
        String wordData = newScanner.next();
        System.out.print(pigLatinBest(wordData));
        System.out.print(" ");
      }
      System.out.print("\n");
    }
    //
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("aaron"));
    //
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("science"));
    //
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("science"));
  }

  public static String pigLatinSimple(String s) {
    String lowerS = s.toLowerCase();
    String vowels = "aeiou";
    if (lowerS.length() >= 1) {
      if (vowels.indexOf(lowerS.charAt(0)) != -1) {
        String newWord = lowerS + "hay";
        newWord = newWord.toLowerCase();
        return newWord;
      } else {
        String newWord = lowerS.substring(1,lowerS.length()) + lowerS.substring(0,1) + "ay";
        newWord = newWord.toLowerCase();
        return newWord;
      }
    }
    return s;
  }

  public static String pigLatin(String s) {
    String lowerS = s.toLowerCase();
    if (lowerS.length() >= 1) {
      String[] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
      String vowels = "aeiou";
      if ((lowerS.length() > 1) && (Arrays.asList(digraph).indexOf(lowerS.substring(0,2)) != -1)) {
        String newWord = lowerS.substring(2,lowerS.length()) + lowerS.substring(0,2) + "ay";
        newWord.toLowerCase();
        return newWord;
      } else {
        return pigLatinSimple(lowerS);
      }
    }
    return s;
  }

  public static String pigLatinBest(String s) {
    String lowerS = s.toLowerCase();
    if (lowerS.length() >= 1) {
      String theNumbers = "123456789";
      String nonSymbols = "abcdefghijklmnopqrstuvwxyz123456789";
      if (theNumbers.indexOf(lowerS.substring(0,1)) != -1) {
        return lowerS.toLowerCase();
      }
      else if (nonSymbols.indexOf(lowerS.substring(lowerS.length()-1, lowerS.length())) == -1) {
        String[] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        String vowels = "aeiou";
        if (Arrays.asList(digraph).indexOf(lowerS.substring(0,2)) != -1) {
          String newWord = lowerS.substring(2,lowerS.length()-1) + lowerS.substring(0,2) + "ay" + lowerS.substring(lowerS.length()-1, lowerS.length());
          newWord = newWord.toLowerCase();
          return newWord;
        }
        else if (vowels.indexOf(lowerS.charAt(0)) != -1) {
          String newWord = lowerS.substring(0,lowerS.length()-1) + "hay" + lowerS.substring(lowerS.length()-1, lowerS.length());
          newWord = newWord.toLowerCase();
          return newWord;
        } else {
          String newWord = lowerS.substring(1,lowerS.length()-1) + lowerS.substring(0,1) + "ay" + lowerS.substring(lowerS.length()-1, lowerS.length());
          newWord = newWord.toLowerCase();
          return newWord;
        }
      } else {
        return pigLatin(s);
      }
    }
    return s;
  }
}
