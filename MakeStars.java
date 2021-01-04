import java.io.*;
import java.util.*;

public class MakeStars {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    while (myScanner.hasNextLine()) {
      Scanner wordScanner = new Scanner (myScanner.nextLine());
      System.out.println(wordScanner.nextLine().length());
    }
  }
}
