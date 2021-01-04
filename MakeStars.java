import java.io.*;
import java.util.*;

public class MakeStars {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);
    while (myScanner.hasNextLine()) {
      String lineData = (myScanner.nextLine());
      Scanner newScanner = new Scanner (lineData);
      while (newScanner.hasNext()){
        String wordData = newScanner.next();
        for (int i = 0; i < wordData.length(); i++) {
          System.out.print("*");
        }
        if (newScanner.hasNext()) System.out.print(" ");
      }
      if (myScanner.hasNextLine()) System.out.println();
    }
  }
}
