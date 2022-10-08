/*
* Code for the UB CS Hackathon 2022 */
public class UBCSHackathon{
    public static void main(String[] args){
        String[] arr = FizzBuzz(50);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static String[] FizzBuzz(int N){
        String[] answers = new String[N];
        int digit = 0;
        for(int i = 0; i < N; i++){
            digit = i + 1;
            if(digit % 3 == 0){
                answers[i] = "Fizz";
            }
            else if(digit % 5 == 0){
                answers[i] = "Buzz";
            }
            else{
                answers[i] = Integer.toString(digit);
            }
            if(digit % 3 == 0 && digit % 5 == 0){
                answers[i] = "FizzBuzz";
            }
        }
        return answers;
    }

}