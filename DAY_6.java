 //To fir aaj Day 6 start karte hai 

 QUESTION 1 (Warm-up)
🔹 Reverse Words in a String (Easy version)

Input:

String s = "hello world";

Output:

olleh dlrow
🧠 Logic Hint:

String ko loop karo

Space (' ') aaye to:

ab tak ka word reverse print karo

phir space print karo

Last word ko bhi reverse karna mat bhoolna

 Concepts used:
String, loop, reverse logic


QUESTION 1 (Warm-up)
🔹 Reverse Words in a String (Easy version)

Input:

String s = "hello world";

Output:

olleh dlrow
🧠 Logic Hint:

String ko loop karo

Space (' ') aaye to:

ab tak ka word reverse print karo

phir space print karo

Last word ko bhi reverse karna mat bhoolna

👉 Concepts used:
String, loop, reverse logic


class Main {
    public static void main(String[] args) {

        String s = "hello world";
        String word = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // agar space mila
            if(ch == ' '){
                // reverse current word
                for(int j = word.length() - 1; j >= 0; j--){
                    System.out.print(word.charAt(j));
                }
                // space print karo
                System.out.print(" ");
                // word reset
                word = "";
            } 
            else {
                // character add karo
                word = word + ch;
            }
        }

        // last word ko reverse print karo
        for(int j = word.length() - 1; j >= 0; j--){
            System.out.print(word.charAt(j));
        }
    }
}

Another method is 

// Q1. Reverse the string (word wise)
class Main {
    public static void main(String[] args) {

        String s = "HEELO WRORLD";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {   
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) { 
                System.out.print(word.charAt(j));          
            }
            System.out.print(" ");
        }
    }
}  



String s = "I love programming in Java";

Output:

11   // "programming"

👉 Hint:

split(" ")

Loop

Max length logic (array jaisa)




class Main {
    public static void main(String[] args) {

        String s = "I love programming in Java";
        String[] words = s.split(" ");

        int maxLen = 0;

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > maxLen){
                maxLen = words[i].length();
            }
        }

        System.out.println(maxLen);
    }
}
✅ Output:
11



Q3. Count Palindrome Words in a String
🧩 Problem Statement (Simple Language)

Tumhe ek sentence diya hai.
Tumhe batana hai kitne words palindrome hain.

🔹 Input
String s = "madam level apple radar";
🔹 Output
3

🧠 LOGIC (STEP-BY-STEP, NO CODE YET)

1️⃣ String ko words me split karo
2️⃣ Har word ke liye:

Check karo palindrome hai ya nahi
3️⃣ Agar palindrome ho:

count++
4️⃣ End me count print karo

💡 Hint (Palindome check ke liye)

Tum:

Ya to reverse + compare use kar sakte ho

Ya two pointer (jo DAY 5 me padha)

👉 Dono valid hain. Tum jo comfortable ho, use karo


class Main {

    // helper function to check palindrome
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){

        String s = "madam level apple radar";
        String[] words = s.split(" ");

        int count = 0;

        for(int i = 0; i < words.length; i++){
            if(isPalindrome(words[i])){
                count++;
            }
        }

        System.out.println(count);
    }
}



Q4. Check if Array is Sorted (Ascending Order)
🧩 Problem Statement (Simple)

Tumhe ek integer array diya hai.
Check karo ki array ascending order me sorted hai ya nahi.

🔹 Example 1
int[] arr = {1, 2, 3, 4, 5};

Output:

true


class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}

Output is true

 So the Day 6 is officially  completed 

 