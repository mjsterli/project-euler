#include <iostream>
#include <cmath>
#include <vector>
#include <string>

using namespace std;

bool IsAPalindrome( int possiblePalindrome )
{
  bool isAPalindrome = true;
  stringstream ss;
  ss << possiblePalindrome;
  string s = ss.str();
  vector<char> palindrome( s.c_str(), s.c_str() + s.size() );

  int i = 0;
  while( isAPalindrome && i < palindrome.size() / 2 )
    isAPalindrome &= ( palindrome[(palindrome.size() - 1) - i] == palindrome[i] );

  return isAPalindrome;
}

int main()
{
  int possiblePalindrome = 0, largestPalindrome = 0;

  for( int i = 100; i < 1000; i++ )
    for( int j = 100; j < 1000; j++ )
    {
      possiblePalindrome = ( i * j );
      if( IsAPalindrome( possiblePalindrome ) && possiblePalindrome > largestPalindrome )
        largestPalindrome = possiblePalindrome;
    }

    cout<<"The largest palindrome is: "<<largestPalindrome<<endl;
}
