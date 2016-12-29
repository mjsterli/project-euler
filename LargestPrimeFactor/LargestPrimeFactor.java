import java.util.concurrent.TimeUnit;

public class LargestPrimeFactor
{
  public static void main( String[] args )
  {
    long startTime = System.nanoTime();
    long num = 600851475143L, nextFactor;
    boolean isPrime = false;

    while( num % 2 == 0 && num != 2 ) //Since 2 is a prime number, remove all even numbers
      num = num / 2;

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
    long i = 3;
    boolean nextFactorIsFound = false;

    while( i <= Math.sqrt( factor ) && !nextFactorIsFound ) // The factor cannot be larger than the square root.
    {
      nextFactorIsFound = ( factor % i == 0 );
      i = ( nextFactorIsFound ? i : i + 2 ); //Since we removed all even numbers, increment by 2
    }

    return ( nextFactorIsFound ? (long)factor / (long)i : factor );
  }
}
