//To fir AAj se DSA start karte hai  ek dum basic se advanced level tak

//Loops = Same kaam baar baar karna

/*Q1 (Easy) – Print 1 to N

Input: n = 10
Output:

1 2 3 4 5 6 7 8 9 10 */

/*class main{
    public static void main(String [] args){
        int n = 10;
        for(int i = 0; i <= n ; i++){
            System.out.println(i + "  ");
        }
    }
}*/

Idea:

Start → 1

End → n

Increase → +1


Q2 (Medium) – Sum of 1 to N

Input: n = 10
Output: 55

class main{
    public static void main(String [] args){
        int n = 10;
        int sum = 0;
         for(int i  = 0; i <= n; i++){
             sum = sum + i;
             
         }
         System.out.println(sum);
    }
}

Idea:

sum variable bana

har i ko sum me add kar


Q3 (LeetCode-Style) – FizzBuzz

( Very important logic question)

Rules:

3 ka multiple → Fizz

5 ka multiple → Buzz

3 & 5 dono ka → FizzBuzz

warna number print

public class Main {
    public static void main(String[] args) {

        int n = 15;

        for(int i = 1; i <= n; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}

Print 10 to 1
10 9 8 7 6 5 4 3 2 1

class main{
    public static void main(String [] args){
        int n = 10;
        for(int i = n - 1; i >= 1; i--){
            System.out.println(i + "  ");
        }
    }
}

Print table of 7

class main{
    public static void main(String [] args){
        int n = 10;
        for(int i = 1; i <= n; i++){
            System.out.println(i * 7 + "  ");
        }
    }
}

Print a even number 1 to 50 
class main{
    public static void main(String [] args){
        int n = 50;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}

