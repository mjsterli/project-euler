public class TenThousandFirstPrimeNumber
{
  public static void main(String[] args )
  {
    int i, j, size = 10001;
    long num;
    long[] primes = new long[size];
    primes[0] = 2L;
    primes[1] = 3L;
    primes[2] = 5L;
    primes[3] = 7L;
    primes[4] = 11L;
    primes[5] = 13L;

    i = 6;
    num = 15L;
    while( i < size )
    {
      boolean prime = true;
      j = 1;
      while( prime && j < i )
      {
        prime = ( num % primes[j] != 0 );
        j++;
      }

      if( prime )
      {
        primes[i] = num;
        i++;
      }

      num += 2L;
    }

    System.out.println( "The last prime is: " + Long.toString( primes[i-1] ) );
  }

}
