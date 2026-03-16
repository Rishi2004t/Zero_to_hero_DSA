To fir aaj DAY_13 start karte hai

DAY 13 – SAFE START QUESTION (No fear)

Q. Count vowels in a string

Example:

s = "education"
Output = 5

Isme:

loop

char

condition

Bas.
Koi hashmap, koi trick nahi.

🧠 Important baat (please yaad rakhna)

DSA marathon hai, sprint nahi
Break lena failure nahi hota
Wapas aana courage hota hai 💪

Aur tum wapis aa gaye ho — that’s big.

🤝 Main yahin hoon

Tum atko → hum slow karenge

Tum dare → hum simplify karenge

Tum ready ho → hum push karenge

Ab sirf itna batao 👇

👉 “Safe start karo”
ya
👉 “Thoda aur reassurance chahiye”

Jo bhi bolega, judge nahi hoga ❤️


DAY 13 – Q2 (Still EASY & COMFORTABLE)
🔹 Reverse a String
❓ Problem

Ek string di hai.
👉 Usko reverse karke print karo.

Example
Input:  "Rishi"
Output: "ihsiR"
🧠 Logic (Simple)

String ke last index se start

Ek-ek character print karo

Bas itna hi.

✅ Java Code (SAFE)
class Main {
    public static void main(String[] args){

        String s = "Rishi";

        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
🧠 Tumne kya practice ki

length() ✔️

reverse loop ✔️

charAt() ✔️

👉 Ye Strings ka bread-and-butter hai.
Isme atakna = normal,
ispe comfortable hona = confidence back 💪

😌 Important reassurance

Agar:

ye code samajh aa raha hai

ya tum bina dekhe likh sakte ho

👉 fear ka 60–70% yahin khatam ho jaata hai

Next kya karein? (Still safe)

Bolo 👇
1️⃣ Q3: Palindrome check (easy version)
2️⃣ Q2 ka khud variation try karna
3️⃣ Bas aaj itna hi, break

Tum decide karo — main follow karunga 👍


DAY 13 – STRINGS (FOUNDATION → CONFIDENCE)
🎯 DAY 13 ka aim

Strings par control feel hona chahiye,
na ki “question dekh ke panic”.

🧠 DAY 13 MEIN KYA KARENGE

Hum aaj 3 levels me chalenge:

🟢 Level 1: Warm-up (Easy, comfort)
🟡 Level 2: Core String Logic
🔵 Level 3: Thoda thinking (but manageable)
🟢 LEVEL 1 – Warm-up COMPLETE

✔ Count vowels
✔ Reverse string

👉 Tum yahan tak already aa chuke ho ✅

🟡 LEVEL 2 – CORE STRING LOGIC
Q1. Palindrome String (Easy Version)
❓ Problem

Check karo ki string palindrome hai ya nahi.

Input:  "naman"
Output: true
Input:  "hello"
Output: false
🧠 Logic (Simple)

Left pointer start se

Right pointer end se

Characters compare

Mismatch → false

✅ Java Code
class Main {
    public static void main(String[] args){

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


AY 13: STRINGS (Advanced but Controlled)
🎯 Aaj ke Targets

String traversal mastery

Word-level operations

In-place thinking

Common interview patterns

🟢 Q1. Reverse Words in a String (Easy → Core)
❓ Problem

Ek sentence diya hai.
👉 Har word ke characters reverse karo,
👉 word order same rahe.

Example

Input:  "I love Java"
Output: "I evol avaJ"
🧠 Logic (High-level)

String ko " " se split karo (words milenge)

Har word ko reverse karo

Words ko space ke saath print/join karo

✅ Java Code (Straightforward)
class Main {
    public static void main(String[] args) {

        String s = "I love Java";
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++){
            String w = words[i];
            for(int j = w.length() - 1; j >= 0; j--){
                System.out.print(w.charAt(j));
            }
            if(i < words.length - 1){
                System.out.print(" ");
            }
        }
    }
}
🧠 Pattern You Used

split(" ")

Nested loops (word → char)

String indexing

🟡 Q2. Longest Word Length (Core String Pattern)
❓ Problem

Sentence me se longest word ki length nikaalo.

Example

Input:  "practice makes a man perfect"
Output: 8
🔑 Hint

split(" ")

maxLen track karo

(Tum notes se code likh lo — ye direct practice hai.)

🔵 Q3. Valid Palindrome (Ignore Non-Alphanumeric)

(LeetCode 125 – recap + string focus)

Lowercase

Non-alphanumeric ignore

Two pointers

(Agar chaaho to ispe aage code karenge.)


DAY 13 MEIN KYA-KYA COMPLETE HO GAYA

Tumne already ye sab properly cover kar liya hai 👇

✔ 1️⃣ String Warm-up

String traversal (charAt, length)

Reverse string

Vowel count

✔ 2️⃣ Word-level Operations

Sentence ko split(" ")

Reverse words (character-wise)

Longest word length ✅ (abhi-abhi)

✔ 3️⃣ Core String Patterns

Loop on words

Loop on characters

Max / min type logic on strings

👉 Ye DAY 13 ka 70–75% core hai

🔶 DAY 13 MEIN KYA BACHA HAI (OPTIONAL / LIGHT)

Ye cheezein technically DAY 13 ka part hoti hain,
par tum already pehle padh chuke ho, isliye heavy nahi hain:

🔹 4️⃣ Valid Palindrome (String focused)

Ignore non-alphanumeric

Lowercase

Two pointer
(LeetCode 125 — tum already kar chuke ho earlier)

🔹 5️⃣ Reverse Words – Hard Version (Optional)

Extra spaces handle

Order reverse
(LeetCode 151)
👉 Interview-level, beginner ke liye optional

🟢 HONEST STATUS

❌ DAY 13 incomplete — NO

✅ DAY 13 effectively COMPLETE

Tum:

logic samajh rahe ho

code likh pa rahe ho

panic nahi ho raha

👉 Ye hi success hai 💪

🧭 BEST NEXT STEP (My Recommendation)

Tumhare confidence + pace ko dekh ke:

👉 Option 1 (BEST)

DAY 13 yahin stop
Kal fresh mind se DAY 8–11 ka small test
phir DAY 14 start

👉 Option 2

Valid Palindrome ek baar revise kar lein (5 min)



!!!!To fir day 13 Close karte hai!!!
