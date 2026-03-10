// To Fir aaj startkarte hai Day 5

Aaj ka Goal

Two Pointer kya hota hai

Kab aur kyun use hota hai

String & Array examples

Palindrome ko aur efficient banana

1️⃣ Two Pointer kya hota hai? (Simple words)

Do pointers (indexes) use karke problem solve karna

Usually:

Ek start se

Ek end se

2️⃣ Two Pointer kab use hota hai?

Palindrome check

Reverse array/string

Pair problems

Sorted arrays

3️⃣ Two Pointer – Basic Idea
int left = 0;
int right = n - 1;

while(left < right){
    // compare
    left++;
    right--;
}
4️⃣ Example 1: Palindrome (Two Pointer Logic)

String:

"madam"

Logic:

left → 'm'

right → 'm'

move inside

repeat

🔥 Two Pointer Palindrome Code (Efficient)
class Main {
    public static void main(String[] args) {

        String s = "madam";

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}

Output:

true
🧠 Difference samjho (VERY IMPORTANT)
Method	Extra Space
Reverse + compare	Yes
Two Pointer	No (better)

👉 Interviews me Two Pointer prefer hota hai

🧠 Mental Model (Yaad rakhna)

Mirror se dono side se dekhna = Two Pointer

🔥 DAY 5 – FIRST PRACTICE
🟢 Q1. Check if string is palindrome using Two Pointer
String s = "naman";

Expected Output:

true

class Main{
    public static void main(String [] args){
        String s = "naman";
        int left = 0; 
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}

3. Valid Palindrome (Two Pointer – Optimized)

(LeetCode #125 – better approach)

Problem:

Special characters ignore

Case ignore

Extra string banaye bina solve karo

Hint (logic only):

left start se

right end se

Agar non-alphanumeric → skip

Compare lowercase chars

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // skip non-alphanumeric from right
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // compare valid characters
            else {
                char l = Character.toLowerCase(s.charAt(left));
                char r = Character.toLowerCase(s.charAt(right));

                if (l != r) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

LeetCode #1 – Two Sum (DAY 5 VERSION)

🟢 Difficulty: Easy
📚 Topic: Array + Two Pointer (idea)

🧩 Problem Statement (Simple Language)

Tumhe diya hai:

ek array nums

ek number target

Tumhe do alag indices nikalni hain jinka sum = target

🔹 Example
nums = [2, 7, 11, 15]
target = 9

👉 Output:

[0, 1]

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

