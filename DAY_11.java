To Fir aaj hum start karne wale hai Day 11

Q1. Subarray Sum Equals K (BASIC VERSION)
❓ Problem

Tumhe ek array aur ek number k diya hai.
Check karo ki kya koi continuous subarray hai jiska sum = k ho.

🔹 Input
int[] arr = {1, 4, 20, 3, 10, 5};
int k = 33;
🔹 Output
true

(Explanation: [20, 3, 10])

🧠 Sochne ka tareeka (VERY IMPORTANT)

Array me sirf positive numbers hain 👉
👉 Variable Sliding Window best rahega

Rules:

right se expand

sum > k → left se shrink

sum == k → mil gaya

🧩 Logic (Pseudo)
left = 0, sum = 0

for right from 0 to n-1:
    sum += arr[right]

    while(sum > k):
        sum -= arr[left]
        left++

    if(sum == k):
        return true


To fir aab proper code karte hai 
int left = 0;
int sum = 0;
boolean istotal = false;

for(int right = 0; right < arr.length; right++){
    sum += arr[right];

    while(sum > k){
        sum -= arr[left];
        left++;
    }

    if(sum == k){
        istotal = true;
        break;
    }
}
System.out.println(istotal);
✔️ Sab kuch correct hai:

✔ Variable Sliding Window

✔ Positive numbers ka rule apply

✔ while(sum > k) perfectly used

✔ Early break on success

✔ Output boolean as expected

👉 Is code ko LeetCode / exam me likh sakte ho without fear 💯

🧠 Dry Run (1 line confidence check)
1+4+20+3+10 = 38 → shrink
20+3+10 = 33 → FOUND ✅

Output:

true


Prefix Sum – Basic Idea (Zero se)

Prefix sum ka matlab:
array ke start se leke current index tak ka total sum

🔹 Example Array
arr = {1, 4, 20, 3, 10, 5}
Prefix Sum Array
index:   0   1   2   3   4   5
arr:     1   4  20   3  10   5
prefix:  1   5  25  28  38  43

👉 prefix[i] = arr[0] + arr[1] + ... + arr[i]

🔑 Golden Rule (LOCK THIS 🔒)

Agar:

prefix[j] - prefix[i] = k

to:

subarray (i+1 to j) ka sum = k

Matlab:

Agar kisi prefix se k pehle ka prefix exist karta hai
to beech ka subarray ka sum = k

🧠 Q1 ko Prefix se kaise sochen
Problem:
arr = {1,4,20,3,10,5}
k = 33
Prefix calculate karte jao:

prefix = 1

prefix = 5

prefix = 25

prefix = 28

prefix = 38

Ab dekho:

38 - 33 = 5

👉 5 pehle aa chuka hai (index 1)
👉 Matlab subarray exists:

index 2 to 4 → {20,3,10}
🧠 Prefix + HashSet Logic (Check existence)

Steps:
1️⃣ Ek variable prefixSum
2️⃣ Ek HashSet (store previous prefix sums)
3️⃣ Har step pe check:

prefixSum - k

Agar set me hai → answer true

✅ Prefix Sum Code (Clean & Simple)
import java.util.HashSet;

class Main {
    public static void main(String[] args){

        int[] arr = {1, 4, 20, 3, 10, 5};
        int k = 33;

        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];

            if(prefixSum == k || set.contains(prefixSum - k)){
                found = true;
                break;
            }

            set.add(prefixSum);
        }

        System.out.println(found);
    }
}
🖨️ Output
true
🔍 Sliding Window vs Prefix (VERY IMPORTANT)
Case	Use
All positive numbers	Sliding Window ✅
Positive + Negative	Prefix + HashMap ✅
Multiple range queries	Prefix Sum Array
Count subarrays	Prefix + HashMap
🧠 ONE LINE MEMORY

Sliding window = grow & shrink
Prefix sum = subtract & check history

Ab confirm karne ke liye (NO CODE):

Array:

[10, 2, -2, -20, 10]


 aab aapka day 11 finish