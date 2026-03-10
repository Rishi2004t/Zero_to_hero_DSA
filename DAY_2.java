// To Fir aaj hum Day 2 start karte hai

Sabse pehla question:
Q1. Solid Rectangle Pattern

Output:

* * * *
* * * *
* * * *
Pehle socho:

Kitni rows? → 3

Har row me kitne stars? → 4

 Hint: loop ke andar loop lagega.

 Repetition samjho

Rows repeat ho rahi hain → outer loop

Stars repeat ho rahe hain har row me → inner loop

 Pattern printing ka golden rule:

Outer loop = rows
Inner loop = columns (stars / numbers)

Step 3: Loop thinking (without code)

Soch ke dekho:

Pehle row 1 print karo

Usme 4 stars

Phir row 2 print karo

Usme bhi 4 stars

Phir row 3 print karo

Usme bhi 4 stars

Har row ke baad → next line

🔍 Step 4: Dry Run (Mind me)
Row = 1 → print * * * *
Row = 2 → print * * * *
Row = 3 → print * * * *
STOP
 Important Concepts Used

Loop ke andar loop (nested loop)

First loop controls height

Second loop controls width


 Q1.Solid Rectangle – Final Code

 class Main {
    public static void main(String[] args) {

        // outer loop -> rows
        for(int row = 1; row <= 3; row++) {

            // inner loop -> columns
            for(int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }

            // new line after each row
            System.out.println();
        }
    }
}

Output:
* * * *
* * * *
* * * *
 Dry Run (Short)

row = 1 → 4 stars → next line

row = 2 → 4 stars → next line

row = 3 → 4 stars → stop

Q2: Right Triangle Pattern

Output:

*
* *
* * *
* * * *

class Main {
    public static void main(String[] args) {

        // outer loop -> rows
        for(int row = 1; row <= 4; row++) {

            // inner loop -> stars = row number
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }
}

Q3: Inverted Right Triangle

Output:

* * * *
* * *
* *
*

class Main {
    public static void main(String[] args) {

        int totalRows = 4;

        // outer loop -> rows
        for(int row = 1; row <= totalRows; row++) {

            // inner loop -> decreasing stars
            for(int col = 1; col <= totalRows - row + 1; col++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }
}

Q4: Number Triangle

Output:

1
1 2
1 2 3
1 2 3 4

class Main {
    public static void main(String[] args) {

        // outer loop -> rows
        for(int row = 1; row <= 4; row++) {

            // inner loop -> numbers
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // next line
            System.out.println();
        }
    }
}

Q5: Same Number Triangle

Output:

1
2 2
3 3 3
4 4 4 4

class Main {
    public static void main(String[] args) {

        // outer loop -> rows
        for(int row = 1; row <= 4; row++) {

            // inner loop -> columns
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            // new line after each row
            System.out.println();
        }
    }
}

 to fir ek day ka leetcode ka Question karte hai
 class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // new line after each row
            System.out.println();
        }
    }
}

