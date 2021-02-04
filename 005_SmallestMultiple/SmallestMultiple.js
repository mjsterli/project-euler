let upper = 20, allFactors = [], answer = 1;

function factors( number ){
  let f = [], i = 2;
  while(number > 1 && i <= number){
    if(number % i == 0 || i == number){
      f[i] = i in f ? f[i] + 1 : 1;
      number /= i;
    }
    else
      i++;
  }

  return f;
}


function smallestMultiple(upperNumber){
  for(let x = upperNumber; x > 1; x--)
    factors(x).forEach((val, index) =>{
      if(index in allFactors)
        allFactors[index] = val > allFactors[index] ? val : allFactors[index];
      else
        allFactors[index] = val;
    });
}

smallestMultiple(20);

allFactors.forEach((val, index) => answer *= Math.pow(index, val));
console.log(answer);