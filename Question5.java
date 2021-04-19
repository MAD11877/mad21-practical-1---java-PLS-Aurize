import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of integers you want to enter. ");
    int mode = 0;
    int highest_count = 0;
    int number = in.nextInt();
    int[] numbers = new int[number];
    for (int i = 0; i < number; i++){
      numbers[i] = in.nextInt();
    }
    for (int i : numbers){
      int current_count = 0;
      for (int current_number : numbers){
        if (current_number == i){
          current_count++;
        }
      }
      if (current_count > highest_count){
        highest_count = current_count;
        mode = i;
      }
    }
    System.out.println("Mode: " + mode);
  }
}
