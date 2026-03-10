// To fir Start karte hai Day 4 Aaj 

String kya hota hai? (Simple)

String = characters ka group

Example:

"hello"
"Rishi"
"abc123"

Java me String special class hai.

2️⃣ String banane ke tareeke
🔹 Method 1 (most common)
String s = "hello";
🔹 Method 2
String s = new String("hello");

👉 Abhi hum Method 1 hi use karenge.

3️⃣ String ki indexing (VERY IMPORTANT)

String bhi 0 se start hoti hai (array jaisi).

String s = "hello";
Index	0	1	2	3	4
Char	h	e	l	l	o

Access:

s.charAt(0)  // 'h'
s.charAt(4)  // 'o'
4️⃣ String ki length
s.length()

Example:

System.out.println(s.length()); // 5
5️⃣ Loop ke saath String (CORE)
String s = "hello";

for(int i = 0; i < s.length(); i++){
    System.out.println(s.charAt(i));
}

Output:

h
e
l
l
o

👉 Bilkul array jaisa:

Array → arr[i]

String → s.charAt(i)

Q1. String ke saare characters print karo
String s = "Rishi";

Expected Output:

R
i
s
h
i

class Main{
    public static void main(String [] args){
        String  s = "Rishi";
        for(int  i = 0; i <s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    Q2. Reverse a String
String s = "Rishi";

👉 Output:

ihsiR
Hint:

Loop last index se start karo

i-- use hoga

charAt(i) print karo


class Main{
    public static void main(String [] args){
        String s = "Rishi";
        for(int i = s.length() - 1;i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}

Q3. Count Vowels in a String
String s = "Rishi";

👉 Output:

2

(Vowels: i, i)

Hint:

Loop chalao

char ch = s.charAt(i)

Check: a, e, i, o, u (uppercase bhi socho)

class Main{
    public static void main(String [] args){
        String s = "Rishi";
        int count = 0;
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) == 'i'){
                count++;
           
            }
        }
         System.out.print(count);
    }
}


class Main {
    public static void main(String[] args) {

        String s = "Rishi";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println(count);
    }
}

Q4. Palindrome Check (LeetCode Style)

Example:

String s = "madam";

Output:

true

👉 Logic:

Reverse string

Compare with original

class Main {
    public static void main(String[] args) {

        String s = "madam";
        String rev = "";

        // STEP 1: reverse string
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        // STEP 2: compare
        if(s.equals(rev)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

