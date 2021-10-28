const IsAPalindrome = number => {
  let s = 0, e = number.length - 1, isAPalindrome = true;

  while(isAPalindrome && s < e){
    isAPalindrome &= number.charAt(s) === number.charAt(e);

    s++;
    e--;
  }

  return isAPalindrome;
}

let s = 999, largestPalindrome = 0;

while(s > 0){
  e = s;
  do{
    product = s * e;
    if(IsAPalindrome(product.toString()) && product > largestPalindrome)
      largestPalindrome = product;

    e--;
  }while(e > 0)

  s--;
}

console.log(`The largest palindrome is: ${largestPalindrome.toString()}`);

