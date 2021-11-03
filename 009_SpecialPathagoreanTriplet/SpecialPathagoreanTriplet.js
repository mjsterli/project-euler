const IsATriplet = (a, b, c) => Math.pow(a, 2) + Math.pow(b, 2) === Math.pow(c, 2);

let c = 1000, found = false, b, a, product;

while(!found && c > 0){
  b = c - 1;
  while(!found && b > 0){
    a = b - 1;
    while(!found && a > 0){
      if(a + b + c === 1000)
        found = IsATriplet(a, b, c);

      if(found){
        product = a * b * c;
        console.log(`a: ${a}, b: ${b}, c: ${c}`);
      }

      a--;
    }

    b--;
  }

  c--;
}

console.log(`The product is: ${product}`);