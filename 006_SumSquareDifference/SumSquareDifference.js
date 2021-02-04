let sumOfSquares = 0, squareOfSum = 0;

for(let i = 1; i <= 100; i++){
  sumOfSquares += Math.pow(i, 2);
  squareOfSum += i;
}

squareOfSum = Math.pow(squareOfSum, 2);
console.log(`${squareOfSum - sumOfSquares}`);