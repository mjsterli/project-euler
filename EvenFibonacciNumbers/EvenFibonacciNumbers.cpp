#include <iostream>
using namespace std;

const int LIMIT = 4000000;

int main()
{
  int sum = 0, Fn_1 = 0, Fn_2 = 1, fibonacci = Fn_1 + Fn_2;

  while( fibonacci <= LIMIT )
  {
    if( fibonacci % 2 == 0 )
      sum += fibonacci;

    Fn_2 = Fn_1;
    Fn_1 = fibonacci;
    fibonacci = Fn_1 + Fn_2;
  }

  cout<<"The sum is: "<<sum<<"\n";
}
