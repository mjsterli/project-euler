public class EvenFibonacciNumbers
{
  static final int LIMIT = 4000000;

  public static void main( String[] args )
  {
    //Calculate the sum of all Even Fibonacci Numbers where the terms in the sequence do not exceed four million
    //Summation of n = 2, sum of Fn-1 + Fn-2 where < 4,000,000

    int sum = 0, Fn_1 = 1, Fn_2 = 0, fibonacci = Fn_1 + Fn_2;
    while( fibonacci <= LIMIT )
    {
      if( fibonacci % 2 == 0 )
        sum += fibonacci;

      Fn_2 = Fn_1;
      Fn_1 = fibonacci;
      fibonacci = Fn_1 + Fn_2;
    }

    System.out.println("The sum is: " + Integer.toString(sum));
  }
}
