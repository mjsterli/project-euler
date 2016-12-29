public class LargestPrimeFactor
{
  public static void main( String[] args )
  {
    long num = 600851475143L, nextFactor;
    boolean isPrime = false;

    do
    {
      nextFactor = NextFactor( num );
      isPrime    = ( num == nextFactor );
      num        = ( !isPrime ? nextFactor : num );
    }while( !isPrime );

    System.out.println( "The Larges Prime Factor is: " + Long.toString( num ) );
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
