//Find the factorial of a by multiplying all the numbers from 1 to a together,
//and then return the total product. For example, when given a as 4, return 24.

static int doStuff(int a){
  int product = 1;
  for(int i=1; i<=a; i=i+1){
    product = product * i;
  }
  return product;
}