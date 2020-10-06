import java.util.Scanner;
/**
 *Counts to inputted number on a single line with commas inbetween
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the interger
    System.out.println("Please enter a positive integer");
    int num = input.nextInt();

    //create for loop
    for(int count = 1; count < num; count++){

      System.out.print(count + ", ");
    }
    System.out.print(num);
  }
}
