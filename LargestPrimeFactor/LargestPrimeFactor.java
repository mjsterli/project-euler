import java.util.concurrent.TimeUnit;

public class LargestPrimeFactor
{
  public static void main( String[] args )
  {
    long startTime = System.nanoTime();
    long num = 600851475143L, nextFactor;
    boolean isPrime = false;

    do
    {
      nextFactor = NextFactor( num );
      isPrime    = ( num == nextFactor );
      num        = ( !isPrime ? nextFactor : num );
    }while( !isPrime );

    long totalTime = System.nanoTime() - startTime;
    System.out.println( "The Larges Prime Factor is: " + Long.toString( num ) );
    System.out.println( "Total Time: " + Long.toString( totalTime ) + " nanoseconds." );
  }

  static long NextFactor( long factor )
  {
    long i = 2;
    boolean nextFactorIsFound = false;

    while( i < factor && !nextFactorIsFound )
    {
      nextFactorIsFound = ( factor % i == 0 );
      i = ( nextFactorIsFound ? i : i + 1 );
    }

    return ( nextFactorIsFound ? (long)factor / (long)i : factor );
  }
}
