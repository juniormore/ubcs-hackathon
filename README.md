# ubcs-hackathon psuedocode for FizzBuzz. Enjoy!!
FizzBuzz(n)
Create String array called answers
digit = 0
for i=0 to n-1
  digit = i + 1
  if digit%3==0
    answers[i] = "Fizz"
  else if digit%5==0
    answers[i] = "Buzz"
  else
    answers[i] = i
return answers
