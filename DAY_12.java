TO fir start karte hai AAj DAy 12

DAY 12 — START (HashMap + Frequency Patterns)
🎯 DAY 12 Goal

HashMap ko natural tool banaana

“count / frequency / uniqueness” type problems me confident feel

🧠 Concepts we’ll cover today

1️⃣ Frequency count (array & string)
2️⃣ Most frequent element
3️⃣ First non-repeating character
4️⃣ Anagram check (logic level)

🟢 Warm-up (Very Easy, 2 min)

Q1. Frequency Count

int[] arr = {2, 3, 2, 5, 3, 3};

👉 Print frequency of each number.

(Expected idea: 2→2, 3→3, 5→1)

🔑 Why DAY 12 is important

Ye DAY 8 (frequency) ka upgraded version hai

DAY 11 (prefix + map) ke baad HashMap ka use natural ho jaata hai

Strings + Arrays dono me kaam aata hai

👉 Ab next step

Bolo:

“Q1 kara do” → main code + explanation dunga

“direct LeetCode wala do” → 242 / 387 se start karenge

Ya “thoda slow start” → pehle 1–2 examples dry run karenge'

Problem
int[] arr = {2, 3, 2, 5, 3, 3};

👉 Hume har number ki frequency (kitni baar aaya) nikalni hai.

🧠 Soch (Before Dry Run)

Hum ek HashMap use karenge:

Key → number

Value → count (frequency)

Rule:

Jab number dikhe:

pehle se hai → count + 1

nahi hai → count = 1

🧩 Dry Run (Line by Line in Mind)
🔹 Start
map = { }
🔹 i = 0 → arr[i] = 2

2 map me nahi hai
👉 add karo

map = { 2 = 1 }
🔹 i = 1 → arr[i] = 3

3 map me nahi hai
👉 add karo

map = { 2 = 1, 3 = 1 }
🔹 i = 2 → arr[i] = 2

2 map me already hai
👉 count badhao

map = { 2 = 2, 3 = 1 }
🔹 i = 3 → arr[i] = 5

5 map me nahi hai
👉 add karo

map = { 2 = 2, 3 = 1, 5 = 1 }
🔹 i = 4 → arr[i] = 3

3 map me hai
👉 count badhao

map = { 2 = 2, 3 = 2, 5 = 1 }
🔹 i = 5 → arr[i] = 3

3 map me hai
👉 count badhao

map = { 2 = 2, 3 = 3, 5 = 1 }
✅ Final Answer (Conceptually)
2 → 2 times
3 → 3 times
5 → 1 time
🔒 ONE-LINE MEMORY RULE

HashMap = history of counts

🧠 Common Confusion Clear

❌ Map index based nahi hota

❌ Order important nahi

✔ Key = element

✔ Value = frequency

Ab next kya karein?



Q1. Most Frequent Element (HashMap)
❓ Problem

Array me se wo element print karo jo sabse zyada baar aaya ho.

Input

int[] arr = {2, 3, 2, 5, 3, 3};

Output

3
✅ Java Code (Clean & Easy)
import java.util.HashMap;

class Main {
    public static void main(String[] args){

        int[] arr = {2, 3, 2, 5, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: find max frequency element
        int maxFreq = 0;
        int answer = -1;

        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
🧠 Logic (2 lines me)

Pehle frequency banao (HashMap)

Phir max value wali key nikaalo

⏱️ Complexity

Time: O(n)

Space: O(n)

Next kya code karein? 👊

Q2. First Non-Repeating Character (String)

(LeetCode 387 – very important)

❓ Problem (Simple)

Ek string di hai.
👉 Jo character pehli baar aata ho aur repeat na hota ho,
uska index print/return karo.
Agar koi na ho → -1.

Example

s = "leetcode"
Output = 0   // 'l'
✅ Java Code (Clean & Exam-Ready)
import java.util.HashMap;

class Main {
    public static void main(String[] args){

        String s = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: find first non-repeating
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
🧠 Logic (Very Short)

1️⃣ Pehle har character ki frequency nikaali
2️⃣ Phir string ko order me check kiya
3️⃣ Jiska count 1 mila → answer

⏱️ Complexity

Time: O(n)

Space: O(n)


Q4. Valid Anagram
❓ Problem (Simple)

Do strings s aur t diye hain.
Agar dono me same characters same count ke saath hain → anagram.

Example

s = "anagram"
t = "nagaram"
Output = true
s = "rat"
t = "car"
Output = false
🧠 Best Logic (Frequency)

Length alag → false

Har character ka count compare

✅ Java Code (Fast & Clean)
Option A: Frequency Array (Best & Fastest)

(Assume lowercase letters)

class Main {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
🧠 Why this works

s character → +1

t character → -1

End me sab 0 ho gaya → perfect match

⏱️ Complexity

Time: O(n)

Space: O(1) (fixed 26)

❌ Common Mistakes (Avoid)

❌ Sorting strings (O(n log n), slow)

❌ Map compare karna bina length check

❌ Case / character range ignore karna

