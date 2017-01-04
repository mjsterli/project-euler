import java.util.concurrent.TimeUnit;

public class SumSquareDifference
{
  public static void main( String[] args )
  {
    int difference, limit = 100;

    long startTime = System.nanoTime();
    difference = SquareOfSum( limit ) - SumOfSquares( limit );
    long totalTime = System.nanoTime() - startTime;

    System.out.println( "Difference: " + Integer.toString( difference ) );
    System.out.println( "TotalTime: " + Long.toString( totalTime ) );
  }

  static int SumOfSquares( int limit )
  {
    return ( limit * ( ( 2 * limit ) + 1 ) * ( limit + 1 ) ) / 6;
  }

  static int SquareOfSum( int limit )
  {
    int sum = limit * ( limit + 1 ) / 2;
    return sum * sum;
  }
}
