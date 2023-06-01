import java.util.Arrays;

public class Calculator {

    public static void main (String[] args){
      double sum =  Arrays.stream(args[0].split(" ")).mapToDouble(Double::valueOf).sum();
      System.out.println("The sum of those expenses: " + sum);
    }
}