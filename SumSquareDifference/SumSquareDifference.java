import java.util.concurrent.TimeUnit;

public class SumSquareDifference
{
  public static void main( String[] args )
  {
    int SumOfSquares = 0, SquareOfSum = 0;

    long startTime = System.nanoTime();
    for( int i = 1; i <= 100; i++ )
    {
      SumOfSquares += ( i * i );
      SquareOfSum += i;
    }
    SquareOfSum *= SquareOfSum;
    long totalTime = System.nanoTime() - startTime;

    System.out.println( "Difference: " + Integer.toString( SquareOfSum - SumOfSquares ) );
    System.out.println( "TotalTime: " + Long.toString( totalTime ) );
  }
}
