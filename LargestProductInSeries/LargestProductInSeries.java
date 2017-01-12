import java.io.*;

public class LargestProductInSeries
{
  public static void main( String[] args )
  {
    int size = 13, bestProduct = 0, index = 0;
    String number = "", s;
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );

    try
    {
      while( (s = input.readLine()) != null )
        number += s;
    }

    catch( Exception e )
    {}

    for( int i = 0; i < number.length() - size; i++ )
    {
      int product = ProductOfDigits( number.substring( i, i+size ).toCharArray() );
      if( product > bestProduct )
      {
        bestProduct = product;
        index = i;
      }
    }

    System.out.println( "The best product is: " + bestProduct );
    System.out.println( "The digits are: " + number.substring( index, index+size ) );
  }

  static int ProductOfDigits( char[] digits )
  {
    int product = 1;

    for( int i = 0; i < digits.length; i++ )
      product *= Character.getNumericValue( digits[i] );

    return product;
  }

}
