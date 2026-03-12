To Fir aaaj Starte karte hai Day 8

DAY 8: ARRAYS – DEEP DIVE (PART 1)
🎯 Aaj ka Goal

Arrays pe thinking improve karna

“Count / frequency / range” type problems

Interview-friendly patterns

🧠 Concept 1: Frequency Count (Most Important)
❓ Frequency ka matlab

Koi element array me kitni baar aaya

Example:

arr = {1, 2, 2, 3, 3, 3}

Output:

1 → 1
2 → 2
3 → 3
🔑 Basic Frequency Logic (Simple Version)

Agar numbers small range me hain (jaise 0–100):

1️⃣ Ek extra array banao
2️⃣ Index = number
3️⃣ Value = count

✅ Example Code
int[] arr = {1, 2, 2, 3, 3, 3};
int[] freq = new int[10];

for(int i = 0; i < arr.length; i++){
    freq[arr[i]]++;
}

for(int i = 0; i < freq.length; i++){
    if(freq[i] > 0){
        System.out.println(i + " -> " + freq[i]);
    }
}
🧠 Why this matters

Majority element

Count pairs

Duplicates

Mode of array

👉 Ye concept bohot baar aata hai.

🟢 DAY 8 – QUESTION 1 (Practice)
🔹 Q1. Count Frequency of Elements

Input:

int[] arr = {2, 3, 2, 5, 3, 3};

Expected Output:

2 -> 2
3 -> 3
5 -> 1


class Main{
    public static void main(String [] args){
        int []arr = {2,3,2,5,3,3};
        int[] freq = new int[10];
        for(int i = 0 ; i < arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i = 0 ;i <freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + "  -> " + freq[i]);
            }
        }
    }
}


Question

Array me kaunsa element sabse zyada baar aaya hai?

Example:

arr = {2, 3, 2, 5, 3, 3}

Output:

3

(kyunki 3 → 3 times)

🟢 DAY 8 – QUESTION 2
🔹 Q2. Find the Element with Maximum Frequency

Input:

int[] arr = {1, 2, 2, 3, 3, 3, 4};

Expected Output:

3
🧠 Hint

Pehle frequency count

Phir ek loop me:

maxFreq track karo

element store karo


class Main {
    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int[] freq = new int[10];

        // frequency count
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        int maxFreq = 0;
        int element = -1;

        // find element with max frequency
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                element = i;
            }
        }

        System.out.println(element);
    }
}


Q3: Find Duplicate Elements
❓ Problem Statement

Array me jo elements 1 se zyada baar aaye hain, unhe print karo.

Input
int[] arr = {1, 2, 3, 2, 4, 3, 5, 3};
Expected Output
2
3

(kyunki 2 aur 3 repeat hue)

🧠 Sochne ka tareeka (IMPORTANT)

Tum already ye jaante ho:

Frequency array kaise banta hai

freq[x]++ ka matlab

👉 Bas ek naya rule add karo:

Agar freq[i] > 1 → duplicate element

🧩 Logic Steps

1️⃣ Frequency array banao
2️⃣ Original array traverse karo → freq bharo
3️⃣ Frequency array traverse karo
4️⃣ Jahan freq[i] > 1 → print i

💡 Hint (poora solution nahi)
if(freq[i] > 1){
    System.out.println(i);
}

class main{
    public static void main(String []  args){
        int [] arr = {1, 2, 3, 2, 4, 3, 5, 3};
        int[] freq = new int[10];
        for(int i = 0 ; i <arr.length; i++){
            freq[arr[i]]++;
            
        }
        for(int i = 0 ;i  <freq.length; i++){
            if(freq[i] > 1){
                System.out.println(i);
            }
        }
    }
}


PREFIX SUM — ZERO LEVEL EXPLANATION
❓ Simple question pehle

Array:

int[] arr = {3, 1, 4, 2};

Agar main puchhu:

index 0 tak ka sum? → 3

index 1 tak ka sum? → 3 + 1 = 4

index 2 tak ka sum? → 3 + 1 + 4 = 8

index 3 tak ka sum? → 3 + 1 + 4 + 2 = 10

👉 Yehi values prefix sum hoti hain.

🔑 PREFIX SUM ka matlab (ONE LINE)

Prefix sum[i] = 0 se i tak ka total sum

🧩 Step-by-step socho (computer ki tarah)
Step 1: Original array
arr = {3, 1, 4, 2}
Step 2: Naya array banao (same size)
int[] pref = new int[arr.length];
Step 3: Pehla element
pref[0] = arr[0];   // 3
Step 4: Baaki elements

Har naya element =
pichhla prefix + current element

pref[1] = pref[0] + arr[1]  // 3 + 1 = 4
pref[2] = pref[1] + arr[2]  // 4 + 4 = 8
pref[3] = pref[2] + arr[3]  // 8 + 2 = 10
✅ FINAL SIMPLE CODE (COPY–UNDERSTAND)
class Main {
    public static void main(String[] args){

        int[] arr = {3, 1, 4, 2};
        int[] pref = new int[arr.length];

        // first element
        pref[0] = arr[0];

        // build prefix sum
        for(int i = 1; i < arr.length; i++){
            pref[i] = pref[i - 1] + arr[i];
        }

        // print prefix array
        for(int i = 0; i < pref.length; i++){
            System.out.print(pref[i] + " ");
        }
    }
}
✅ Output
3 4 8 10


Q5: Range Sum Query (Prefix Sum Use)
❓ Problem (Simple Language)

Tumhe ek array diya hai aur do indices L aur R.
Tumhe index L se R (inclusive) ka sum nikalna hai.

🔹 Input
int[] arr = {2, 4, 1, 3, 5};
int L = 1;
int R = 3;
🔹 Output
8
🔹 Explanation

Indices 1 se 3:

4 + 1 + 3 = 8
🧠 Prefix Sum Logic (ONE FORMULA 🔒)

Pehle prefix array banao:

arr   = 2  4  1  3  5
pref  = 2  6  7  10 15
🔑 Range Sum Formula:

Agar L == 0

sum = pref[R]

Agar L > 0

sum = pref[R] - pref[L - 1]

👉 Is question me:

sum = pref[3] - pref[0] = 10 - 2 = 8


class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        int L = 1;
        int R = 3;

        // Step 1: Build prefix sum array
        int[] pref = new int[arr.length];
        pref[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            pref[i] = pref[i - 1] + arr[i];
        }

        // Step 2: Range sum calculation
        int sum;
        if(L == 0){
            sum = pref[R];
        } else {
            sum = pref[R] - pref[L - 1];
        }

        // Step 3: Print result
        System.out.println(sum);
    }
}

The Output is  : 8

LeetCode 1480 — Running Sum of 1D Array
❓ Problem ko simple bhasha me

Tumhe ek array diya hai.
Tumhe naya array banana hai jisme:

har index par
0 se us index tak ka sum store ho.

Yehi prefix sum / running sum hai.

🔹 Example
nums = [1, 2, 3, 4]

Soch:

index 0 → 1

index 1 → 1 + 2 = 3

index 2 → 1 + 2 + 3 = 6

index 3 → 1 + 2 + 3 + 4 = 10

Output:

[1, 3, 6, 10]
🧠 SOCHNE KA FORMULA (LOCK THIS 🔒)

result[i] = result[i - 1] + nums[i]

Bas itna hi logic hai.

✅ FULL LEETCODE SOLUTION (EXAM-READY)
class Solution {
    public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        // first element
        result[0] = nums[0];

        // build running sum
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}


SO Officialy The day 8 is completed
