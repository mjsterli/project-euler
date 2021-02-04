#include <iostream>
#include <cmath>
#include <vector>
#include <string>

using namespace std;

string ConvertIntegerToString( int number )
{
  string convertedNumber = "";
  int denominator, i, numOfDigits = log10(number) + 1;

  for( i = 0; i < numOfDigits; i++ )
  {
    if( numOfDigits == ( i + (int)log10(number) + 1) )
    {
      denominator = pow(10, (int)log10(number));
      convertedNumber += '0' + ( number / denominator );
      number %= denominator;
    }
    else
      convertedNumber += '0';
  }

  return convertedNumber;
}

bool IsAPalindrome( int possiblePalindrome )
{
  bool isAPalindrome = true;
  string s = ConvertIntegerToString( possiblePalindrome );
  vector<char> palindrome( s.c_str(), s.c_str() + s.size() );

  int i = 0;
  while( isAPalindrome && i < palindrome.size() / 2 )
  {
    isAPalindrome &= ( palindrome[(palindrome.size() - 1) - i] == palindrome[i] );
    i++;
  }

  return isAPalindrome;
}

int main()
{
  int possiblePalindrome = 0, largestPalindrome = 0;

  for( int i = 999; i > 99; i-- )
    for( int j = i; j > 99; j-- )
    {
      if( i % 11 == 0 || j % 11 == 0 )
      {
        possiblePalindrome = ( i * j );
        if( IsAPalindrome( possiblePalindrome ) && possiblePalindrome > largestPalindrome )
        {
          cout<<"Larger Palindrome: "<<possiblePalindrome<<endl;
          cout<<"i= "<<i<<", j= "<<j<<endl;
          largestPalindrome = possiblePalindrome;
        }
      }
    }

    cout<<"The largest palindrome is: "<<largestPalindrome<<endl;
}
