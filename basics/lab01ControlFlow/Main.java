import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String[] args) {
    System.out.println("Pluralize");
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    System.out.println("-------------------------------------------------------------");

    System.out.println("FlipNHeads");
    flipNHeads(3);

    System.out.println("-------------------------------------------------------------");

    clock();
  }

  public static String pluralize(String animal, int n) {
    return (n == 1) ? animal : animal +"s";
  }

  public static void flipNHeads(int n) {
    String head = n > 1 ? "heads" : "head";
    int headCount = 0;
    int flipCount = 0;
    while(headCount < n){
      String msg = Math.random() > 0.5 ? "heads" : "tails";
      if(msg == "heads") {
        System.out.println("heads");
        headCount++;
        flipCount++;
      }else {
        System.out.println("tails");
        headCount = 0;
        flipCount++;
      }
    }
    System.out.println("It took " + flipCount + " flip to flip " + headCount + " " + head + " in a row.");
  }

  public static void clock () {
    int past = 0;
    while(true){
      LocalDateTime now = LocalDateTime.now();
      int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if(past != second){
        System.out.println(time);
        past = second;
      }
    }
  }
}