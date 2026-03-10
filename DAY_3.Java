//To fir AAj hum DAy 3 Starrt karte hai 

Array kya hota hai? (Simple)

Array = same type ke multiple values ko ek naam ke andar store karna

Without array (bad idea):
int a = 10;
int b = 20;
int c = 30;
With array (good idea):
int[] arr = {10, 20, 30};

Array banane ke tareeke
Method 1: Direct values
int[] arr = {10, 20, 30, 40};
Method 2: Size deke (empty array)
int[] arr = new int[5];  // size = 5
3️⃣ Indexing (MOST IMPORTANT)

Array 0 se start hota hai.

int[] arr = {10, 20, 30, 40};

arr[0] = 10
arr[1] = 20
arr[2] = 30
arr[3] = 40

👉 Last index = size - 1

4️⃣ Array ka size kaise milega?
arr.length

Example:

System.out.println(arr.length); // 4
5️⃣ Loop ke saath Array (CORE CONCEPT)
int[] arr = {10, 20, 30, 40};

for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}

 Yahan:

i = index

arr[i] = value

Q1. Array ke saare elements print karo


class Main {
    public static void main(String[] args) {
        int[] arr ={5 ,10,15,  20,};
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        
    }
}



class Main {
    public static void main(String[] args) {
        int[] arr ={5 ,10,15,  20,};
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        
    }
}

Q2. Find Sum of Array Elements
int[] arr = {5, 10, 15, 20};

👉 Output hona chahiye:

50


class Main {
    public static void main(String[] args) {
        int[] arr ={5 ,10,15,  20,};
         int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum += arr[i];
            
        }
        System.out.println(sum);
        
    }
}

Q3: Array me Maximum Element nikaalna

Array:

int[] arr = {5, 10, 15, 20};

Goal:

20

class Main {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};

        // Step 1: pehle element ko max maan lo
        int max = arr[0];

        // Step 2: poore array me loop chalao
        for(int i = 0; i < arr.length; i++) {

            // Step 3: compare karo
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 4: print max
        System.out.println(max);
    }
}

Q1. Minimum Element in Array
int[] arr = {5, 10, 15, 20};


 Output:5

 class Main{
    public static void main(String [] args){
        
        int [] arr = {12, 4, 8, 34};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

Q2. Average of Array Elements
int[] arr = {12, 4, 8, 34};

👉 Output:

14.5

class Main {
    public static void main(String[] args) {

        int[] arr = {12, 4, 8, 34};

        int sum = 0;

        // sum nikaalo
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // average nikaalo
        double avg = (double) sum / arr.length;

        System.out.println(avg);
    }
}

Q3 (Count Even Numbers)

class Main{
    public static void main(String [] args){
        int arr [] = {23, 45, 12, 60, 18};
        int count  = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                 count++;
            }
        }
     System.out.println(count);   
    }
}

Q4. Reverse Traversal (Print Only)
int[] arr = {23, 45, 12, 60, 18};

👉 Output:

18
60
12
45
23

💡 Hint:

Loop last index se start karo

i-- use hoga

class Main{
    public static void main(String [] args){
        int []  arr= {12, 43, 24, 5, 64};
        for(int i = arr.length - 1; i >= 0 ; i--){
        System.out.println(arr[i]);    
        }
        
    }
}


Array vs ArrayList (Simple words)
🔹 Array
int[] arr = new int[5];

Size fixed

Baad me badha nahi sakte

🔹 ArrayList
ArrayList<Integer> list = new ArrayList<>();

Size dynamic

Jab chaho add karo

👉 LeetCode zyada tar ArrayList use karwata hai

2️⃣ ArrayList banane ka syntax
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();

📌 Integer (capital I) use hota hai
(not int — ye Java ka rule hai)

3️⃣ .add() – element add karna
list.add(10);
list.add(20);
list.add(30);

Ab list hogi:

[10, 20, 30]
4️⃣ .get(index) – element lena
System.out.println(list.get(0)); // 10
System.out.println(list.get(1)); // 20

⚠️ Index yahan bhi 0 se start hota hai

5️⃣ .size() – total elements
System.out.println(list.size()); // 3
6️⃣ Loop ke saath ArrayList (IMPORTANT)
for(int i = 0; i < list.size(); i++){
    System.out.println(list.get(i));
}

🧠 Difference yaad rakho:

Array → arr.length

ArrayList → list.size()


import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Step 1: ArrayList banayi
        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: elements add kiye
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        // Step 3: loop se print
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

5
10
15
20

Super Important Comparison (Array vs ArrayList)
Array	ArrayList
arr.length	list.size()
arr[i]	list.get(i)
size fixed	size dynamic

Pascal’s Triangle – STEP 2 (MOST IMPORTANT PART)
👉 Beech ke numbers ka logic (real brain part)

Ab hum ye banayenge:

[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> triangle = new ArrayList<>();

        for(int row = 0; row < numRows; row++){

            List<Integer> currentRow = new ArrayList<>();

            // first element
            currentRow.add(1);

            // beech ke elements
            for(int col = 1; col < row; col++){
                int val = triangle.get(row - 1).get(col - 1)
                        + triangle.get(row - 1).get(col);
                currentRow.add(val);
            }

            // last element (row > 0 ke liye)
            if(row > 0){
                currentRow.add(1);
            }

            triangle.add(currentRow);
        }

        System.out.println(triangle);
    }
}

