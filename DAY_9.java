To Fir aab Day 9 start karte hai

Sliding Window kya hota hai? (Simple)

Jab hume continuous subarray / substring ka
sum / count / max / min nikalna hota hai,
tab Sliding Window use hota hai.

🪟 Window ka matlab

Socho ek fixed size ka frame (window) jo array par slide karta hai.

🔹 Example

Array:

[2, 1, 5, 1, 3, 2]

Window size = k = 3

Windows:

[2, 1, 5] → sum = 8
[1, 5, 1] → sum = 7
[5, 1, 3] → sum = 9
[1, 3, 2] → sum = 6

👉 Maximum sum = 9

🔑 Fixed Window – Core Logic

1️⃣ Pehli window ka sum banao
2️⃣ Phir window ko slide karo:

ek element add

ek element remove

🧠 Magic Line (LOCK THIS 🔒)
windowSum = windowSum + arr[i] - arr[i - k];
🟢 DAY 9 – QUESTION 1
🔹 Q1. Maximum Sum Subarray of Size K

Input:

int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;

Output:

9
🧩 Hint (Small)

First k elements ka sum

Loop from k to end

Update max


class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // Step 1: first window sum
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}

Output
9
🧠 Line-by-Line Easy Explanation
First window:
[2, 1, 5] → sum = 8
Slide:

Add arr[3] = 1

Remove arr[0] = 2

windowSum = 8 + 1 - 2 = 7

Next slide:

windowSum = 7 + 3 - 1 = 9

Next:

windowSum = 9 + 2 - 5 = 6

👉 Max = 9

🔑 ONE LINE TO REMEMBER (LOCK THIS 🔒)

Add next element, remove element that went out of window


Q2. Smallest Subarray with Sum ≥ S

Input:

int[] arr = {2, 1, 5, 2, 3, 2};
int S = 7;

Output:

2

(Explanation: [5,2])

🧠 Hint (Soft)

Two pointers

Expand window (right++)

Shrink window (left++) jab sum ≥ S


class Main {
    public static void main(String[] args){

        int[] arr = {2, 1, 5, 2, 3, 2};
        int S = 7;

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++){

            windowSum += arr[right];   // expand window

            while(windowSum >= S){
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= arr[left]; // shrink window
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE){
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}

3. Maximum Average Subarray of Size K
❓ Problem

Tumhe ek integer array aur ek number k diya hai.
Tumhe size k ke subarray ka maximum average nikalna hai.

🔸 Input
int[] arr = {1, 12, -5, -6, 50, 3};
int k = 4;
🔸 Output
12.75
🔸 Explanation

Possible subarrays of size 4:

[1, 12, -5, -6] → sum = 2 → avg = 0.5

[12, -5, -6, 50] → sum = 51 → avg = 12.75 ✅

[-5, -6, 50, 3] → sum = 42 → avg = 10.5

👉 Maximum average = 12.75

🧠 Concept Reminder

Ye fixed-size sliding window hai

Pehle k elements ka sum

Phir slide:

windowSum = windowSum + arr[i] - arr[i - k];


class Main {
    public static void main(String[] args){

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int windowSum = 0;

        // first window
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // slide window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        // calculate average
        double maxAverage = (double) maxSum / k;
        System.out.println(maxAverage);
    }
}

The Output is  :  12.5


import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){

            // jab tak duplicate hai, left se remove karo
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            // unique character add karo
            set.add(s.charAt(right));

            // max length update
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

To aaj ka Day 9 Khatam Hota hai