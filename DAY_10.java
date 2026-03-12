To fir aaj hum Day 10 start karte hai

Two pointer ko arrays pe master karna

In-place operations (extra space ❌)

Clean logic + boundary handling

🧠 Concept 1: Two Pointer (Array Basics)
Kab use hota hai?

Jab array me:

left–right comparison

in-place modification

pairs / partition

🟢 DAY 10 – QUESTION 1
🔹 Q1. Two Sum (Sorted Array)

Problem:
Tumhe ek sorted array aur ek target diya hai.
Check karo ki kya koi pair hai jinka sum target ke barabar ho.

Input:

int[] arr = {1, 2, 3, 4, 6};
int target = 6;

Output:

true

(Pair: 2 + 4)

🧠 Logic Hint

left = 0, right = n - 1

Agar arr[left] + arr[right]:

== target → done

< target → left++

target → right--

Q1: Two Sum (Sorted Array)
❓ Problem yaad karo

Array sorted hai

Check karna hai:
👉 kya koi 2 elements ka sum = target hai ya nahi

Output: true / false

🧠 Sochne ka tareeka

Array:

[1, 2, 3, 4, 6]
target = 6
Two pointer:

left → start

right → end

Rules:

Agar sum == target → ✅ mil gaya

Agar sum < target → chhota hai → left++

Agar sum > target → bada hai → right--

✅ FULL WORKING CODE (Two Pointer)
class Main {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                found = true;
                break;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(found);
    }
}
🖨️ Output
true
🔑 MOST IMPORTANT THING (LOCK THIS 🔒)

Two pointer tabhi kaam karta hai jab array sorted ho

🧠 Dry Run (1 line)
1+6=7 >6 → right--
1+4=5 <6 → left++
2+4=6 → true
🎯 Tumne kya seekha

✔ Two pointer ka basic pattern
✔ Sorted array ka fayda
✔ O(n) solution (better than nested loops)


Q2: Remove Duplicates from Sorted Array (Two Pointer)

Ye interview + LeetCode classic hai (LeetCode 26)
Aur Two Pointer ko properly lock kar deta hai.

🧠 Problem (Simple Language)

Tumhe sorted array diya hai.
Tumhe duplicates remove karne hain IN-PLACE (extra array ❌).

👉 Output:

Unique elements front me hone chahiye

Unki count (length) return/print karni hai

🔹 Input
int[] arr = {1, 1, 2, 2, 3};
🔹 After removal (conceptually)
[1, 2, 3, _, _]
🔹 Output (length)
3
🧠 Two Pointer Idea (VERY IMPORTANT)

i → last unique element ka index

j → scan karne ke liye aage badhta pointer

Rule:

Jab arr[j] != arr[i]
→ naya unique element mila

🔑 Core Logic (LOCK THIS 🔒)
if(arr[j] != arr[i]){
    i++;
    arr[i] = arr[j];
}
✅ FULL WORKING CODE (EXAM-READY)
class Main {
    public static void main(String[] args){

        int[] arr = {1, 1, 2, 2, 3};

        int i = 0; // last unique index

        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        int newLength = i + 1;
        System.out.println(newLength);

        // optional: print unique elements
        for(int k = 0; k < newLength; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
🖨️ Output
3
1 2 3
🧠 Dry Run (1 minute)
arr = [1,1,2,2,3]
i=0

j=1 → same → skip
j=2 → different → i=1, arr[1]=2
j=3 → same → skip
j=4 → different → i=2, arr[2]=3
❌ Common Mistakes (Avoid)

❌ Extra array banana

❌ Sorted condition ignore karna

❌ Return length bhool jaana

🎯 Tumne kya master kiya

✔ Two pointer (array)
✔ In-place modification
✔ Sorted array exploitation


Q3 START 🔥
Move Zeros to End (Two Pointer) — simple, powerful, interview-favorite.

🧠 Problem (Simple Language)

Tumhe ek array diya hai.
Tumhe saare 0 ko end me bhejna hai, non-zero elements ka order same rehna chahiye.
In-place karna hai (extra array ❌).

🔹 Input
int[] arr = {0, 1, 0, 3, 12};
🔹 Output (array after operation)
[1, 3, 12, 0, 0]
🧠 Two Pointer Idea (LOCK THIS 🔒)

i → next position jahan non-zero rakhna hai

j → poora array scan karega

Rule:

Jab arr[j] != 0 ho →
arr[i] = arr[j], i++

Loop ke baad:

i se end tak 0 fill karo

✅ FULL WORKING CODE (Clean & Exam-Ready)
class Main {
    public static void main(String[] args){

        int[] arr = {0, 1, 0, 3, 12};

        int i = 0; // next non-zero position

        // move non-zeros to front
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        }

        // fill remaining with zeros
        while(i < arr.length){
            arr[i] = 0;
            i++;
        }

        // print result
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
🖨️ Output
1 3 12 0 0
🧠 Why this works

Non-zero elements stable order me aage aa gaye

Zeros naturally end me fill ho gaye

Time: O(n), Space: O(1)

❌ Common Mistakes (Avoid)

❌ Swap-based logic jo order tod de

❌ Extra array banana

❌ Zero fill bhool jaana


LeetCode 283 – Move Zeroes
❓ Problem (Short & Clear)

Tumhe ek integer array diya hai.
Tumhe saare 0 ko array ke end me move karna hai,
non-zero elements ka order same rehna chahiye.

In-place modify karna hai

Extra array ❌

🔹 Example
Input:  nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
🧠 Two Pointer Logic (LOCK THIS 🔒)

i → next index jahan non-zero rakhna hai

j → array scan karega

Rule:

Jab nums[j] != 0 ho →
nums[i] = nums[j], i++

End me:

i se end tak 0 bhar do

✅ LeetCode ACCEPTED SOLUTION (Java)
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0; // next non-zero position

        // move non-zero elements to front
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        // fill remaining positions with 0
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
🧠 Dry Run (1 minute)
nums = [0,1,0,3,12]

j=1 → nums[i]=1 → i=1
j=3 → nums[i]=3 → i=2
j=4 → nums[i]=12 → i=3

fill 0 from index 3 → [1,3,12,0,0]
⏱️ Complexity

Time: O(n)

Space: O(1)

To fir Hamara day 10 khatam hua 
