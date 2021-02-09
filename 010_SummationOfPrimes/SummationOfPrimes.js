let upperLimit = 2000000, primeNumbers = [2, 3], potentialPrime = 5, summation = 0;


while(potentialPrime < upperLimit){
  let i = 3, isPrime = true;

  while(isPrime && i < potentialPrime){
    isPrime &= (potentialPrime % i != 0);
    i++;
  }

  if(isPrime){
    primeNumbers.push(potentialPrime);
    console.log(`Prime Number is: ${potentialPrime}`);
  }
  potentialPrime += 2;
}

primeNumbers.forEach(p => summation += p);

console.log(`The Summation of Primes below ${upperLimit} is: ${summation}.`)