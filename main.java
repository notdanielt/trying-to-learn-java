import java.io.*;
import java.lang.Thread;
public class Main {
  public static void main(String[] args)
  {
    int variable_because_yes = 0;
    while (true) {
      try {
        variable_because_yes += 1;
        System.out.println(variable_because_yes);
        Thread.sleep(50/3);
      }
      catch (Exception e) {
          System.out.println(e);
      }
    }
  }
}
