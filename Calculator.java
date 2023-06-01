import java.util.Arrays;

public class Calculator {

    // using Java 11 
    // execute this file: java Calculator.java "7.0 9.0 20.0" 
    // should say "The sum of those expenses: 36.0"

    public static void main (String[] args){
      double sum =  Arrays.stream(args[0].split(" ")).mapToDouble(Double::valueOf).sum();
      System.out.println("The sum of those expenses: " + sum);
    }
}