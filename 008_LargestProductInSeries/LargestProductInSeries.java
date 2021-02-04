import java.io.*;

public class LargestProductInSeries
{
  public static void main( String[] args )
  {
    int size = 13, index = 0;
    long bestProduct = 0;
    String number = "", s;
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );

    try
    {
      while( (s = input.readLine()) != null )
        number += s;
    }

    catch( Exception e )
    {}

    long startTime = System.nanoTime();
    for( int i = 0; i < number.length() - size; i++ )
    {
      long product = ProductOfDigits( number.substring( i, i+size ).toCharArray() );
      if( product == 0 )
        i += SearchForZero( number.substring( i, i+size ).toCharArray() ) + 1;
      else if( product > bestProduct )
      {
        bestProduct = product;
        index = i;
      }
    }
    long totalTime = System.nanoTime() - startTime;

    System.out.println( "The best product is: " + bestProduct );
    System.out.println( "The digits are: " + number.substring( index, index+size ) );
    System.out.println( "The total time: " + totalTime );
  }

  static long ProductOfDigits( char[] digits )
  {
    long product = 1;

    for( int i = 0; i < digits.length; i++ )
      product *= (long)Character.getNumericValue( digits[i] );

    return product;
  }

  static int SearchForZero( char[] digits )
  {
    int i = 0;
    boolean found = false;

    while( !found && i < digits.length )
    {
      found = ( digits[i] == '0' );
      if( !found )
        i++;
    }

    return i;
  }
}
