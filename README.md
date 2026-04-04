

# 🚀 JAY_JAVA_DSA

A structured documentation of my Data Structures and Algorithms journey using Java.
This repository focuses on building strong logical thinking, mastering nested loops, and developing problem-solving skills step by step before moving into core DSA topics.

---

## 📅 Phase 1 – Pattern Building (Logic Foundation)

In this phase, I focused on strengthening my understanding of nested loops, mathematical expressions inside loops, conditional logic, and symmetry handling.

### ✅ Patterns Completed

* Solid Rectangle
* Hollow Rectangle
* Half Pyramid
* 180° Rotated Half Pyramid
* Full Pyramid
* Inverse Pyramid
* Odd Pyramid
* Numerical Pyramid
* Palindromic Pattern
* Binary Pattern
* Butterfly Pattern
* Solid Rhombus
* Advanced Number Patterns

---

## 🧠 Concepts Practiced

* Nested loop execution flow
* Boundary-based condition logic
* Space and alignment management
* Mathematical expressions like `2*i - 1`
* Symmetry and mirror logic
* Reverse iteration
* Number progression inside loops
* Breaking complex patterns into smaller logical parts

---

## 📊 Time Complexity Insight

Most patterns in this phase have a time complexity of:

O(n²)

Reason:

* The outer loop runs `n` times
* The inner loop runs up to `n` times
* Total operations ≈ n × n

This phase helped me understand how nested loops directly impact performance.

---

## 🎯 What I Improved

* Stronger logical thinking
* Better dry-run ability
* Confidence in writing nested loops without reference
* Improved condition handling inside loops
* Clear understanding of pattern symmetry

---

## 🚀 Next Phase

Moving forward to core DSA topics:

* Arrays
* Searching Algorithms
* Sorting Algorithms
* Recursion
* Data Structures (Stack, Queue, Linked List, Trees)

This repository will continue to evolve as I progress deeper into DSA.

---
## 📅 Day 4 – Arrays & Linear Search

On Day 4, I practiced working with array data structures and implemented the Linear Search algorithm in two different scenarios.

First, I implemented Linear Search on a One-Dimensional Array. In this approach, the algorithm traverses the array element by element and compares each value with the target element. If the target is found, the index of the element is returned; otherwise, the algorithm indicates that the element is not present in the array. This helped reinforce the concept of array traversal and basic searching techniques.

Next, I implemented Linear Search on a Two-Dimensional Array (Matrix). In this case, the algorithm iterates through rows and columns using nested loops to locate the target element inside the matrix. This exercise helped me understand how multi-dimensional arrays are accessed and how search logic adapts when dealing with more complex data structures.

Through this practice, I strengthened my understanding of array traversal, differences between 1D and 2D arrays, and the practical implementation of the Linear Search algorithm. This is part of my continuous effort to build strong fundamentals in Data Structures and Algorithms using Java.

## 📅 Day 5 – Binary Search (Java)

Today I implemented the Binary Search algorithm using Java. Binary Search is an efficient searching technique used to find an element in a **sorted array**. Instead of checking every element like Linear Search, Binary Search repeatedly divides the array into halves to locate the target element.

### 🔹 Steps of the Algorithm

1. First, the array is sorted using `Arrays.sort()` because Binary Search works only on sorted arrays.
2. Two variables are initialized:
   - `l` (low index) → start of the array
   - `h` (high index) → end of the array
3. The middle index is calculated using:

   `mid = (l + h) / 2`

4. The middle element is compared with the search key:
   - If `arr[mid] == searchKey`, the element is found and the index is returned.
   - If `arr[mid] > searchKey`, the search continues in the **left half** of the array.
   - If `arr[mid] < searchKey`, the search continues in the **right half** of the array.
5. This process continues until the element is found or the search space becomes empty.

If the element is not present in the array, the function returns **-1**.

### 🔹 Concepts Practiced

- Binary Search algorithm
- Searching in sorted arrays
- Using `Arrays.sort()` in Java
- Array indexing and loops
- Algorithm efficiency

### 🔹 Time Complexity

Best Case: **O(1)**  
Average Case: **O(log n)**  
Worst Case: **O(log n)**

Binary Search is much faster than Linear Search for large datasets because it reduces the search space by half in each step.

### 🔹 Learning Outcome

By implementing Binary Search, I learned how efficient searching algorithms work and how dividing a problem into smaller parts improves performance. This practice helped strengthen my understanding of arrays, loops, and algorithmic thinking in Java.
## 📅 Day 6 – Bubble Sort (Java)

Today I implemented the **Bubble Sort algorithm** using Java. Bubble Sort is one of the simplest sorting algorithms used to arrange elements in ascending or descending order. The algorithm works by repeatedly comparing **adjacent elements** in the array and swapping them if they are in the wrong order.

The idea behind Bubble Sort is that after every iteration, the **largest element “bubbles” to the end of the array**. This process continues until the entire array becomes sorted.

### 🔹 Steps of the Algorithm

1. Start from the first element of the array.
2. Compare the current element with the next element.
3. If the current element is greater than the next element, swap them.
4. Continue comparing and swapping adjacent elements throughout the array.
5. After one complete pass, the largest element moves to the end of the array.
6. Repeat the same process for the remaining unsorted part of the array.
7. Continue this process until all elements are sorted.

### 🔹 Example

Initial Array:

```
9 8 7 4 5 1
```

After multiple passes, the largest elements gradually move to the end of the array until the final sorted array becomes:

```
1 4 5 7 8 9
```

### 🔹 Concepts Practiced

* Sorting algorithms
* Nested loop execution
* Element swapping technique
* Array traversal
* Algorithm step-by-step comparison

### 🔹 Time Complexity

Best Case: **O(n)** (when the array is already sorted, using optimized bubble sort)
Average Case: **O(n²)**
Worst Case: **O(n²)**

The algorithm performs repeated comparisons between elements, which makes it inefficient for large datasets compared to advanced sorting algorithms like **Merge Sort** or **Quick Sort**.

### 🔹 Learning Outcome

By implementing Bubble Sort, I understood how sorting algorithms work internally by comparing and swapping elements step by step. This exercise improved my understanding of nested loops, array indexing, and algorithm execution flow. It also helped me understand how repeated iterations gradually organize an unsorted dataset into a sorted structure.


## 📅 Day 9 – Selection Sort & Insertion Sort (Java)

On Day 9, I implemented two important sorting algorithms: Selection Sort and Insertion Sort. These algorithms helped me understand different approaches to organizing elements in an array and strengthened my understanding of comparison-based sorting techniques.

---

### 🔹 Selection Sort

Selection Sort works by repeatedly finding the minimum element from the unsorted portion of the array and placing it at the correct position in the sorted portion.

Steps of the Algorithm:

1. Start from the first index of the array.
2. Assume the current element is the minimum.
3. Compare it with the remaining elements in the unsorted portion.
4. Find the smallest element in that portion.
5. Swap it with the current position.
6. Move to the next index and repeat the process until the array is sorted.

Example

Initial Array

9 4 7 2 5

Sorted Array

2 4 5 7 9

Time Complexity

Best Case: O(n²)  
Average Case: O(n²)  
Worst Case: O(n²)

Selection Sort performs the same number of comparisons regardless of the input order.

---

### 🔹 Insertion Sort

Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position within the already sorted portion of the array.

Steps of the Algorithm:

1. Assume the first element is already sorted.
2. Pick the next element from the array.
3. Compare it with elements in the sorted portion.
4. Shift elements that are greater than the current element to the right.
5. Insert the element at the correct position.
6. Continue this process until all elements are sorted.

Example

Initial Array

8 3 6 2 5

Sorted Array

2 3 5 6 8

Time Complexity

Best Case: O(n) (when the array is already sorted)  
Average Case: O(n²)  
Worst Case: O(n²)

Insertion Sort works efficiently for small datasets and nearly sorted arrays.

---

### 🔹 Concepts Practiced

- Sorting algorithms and comparison techniques  
- Array traversal and element swapping  
- Element shifting inside arrays  
- Understanding sorted and unsorted portions of an array  
- Algorithm efficiency and complexity analysis  

---

### 🔹 Learning Outcome

By implementing Selection Sort and Insertion Sort, I improved my understanding of how sorting algorithms work internally. This exercise strengthened my knowledge of array manipulation, loop control, and algorithmic thinking in Java.

## 📅 Day 10 – Merge Sort

Today I learned and implemented **Merge Sort**, an efficient sorting algorithm based on the **Divide and Conquer** technique.

### Concept
Merge Sort divides the array into smaller subarrays until each subarray contains only one element. Then it merges those subarrays in a sorted order to produce the final sorted array.

The algorithm follows three main steps:

1. Divide – Split the array into two halves.
2. Conquer – Recursively sort both halves.
3. Merge – Combine the sorted halves into one sorted array.

### Example

Initial Array
[8, 3, 5, 4, 7, 6, 1, 2]

Step 1 – Divide
[8,3,5,4]   [7,6,1,2]

Step 2 – Divide again
[8,3] [5,4]   [7,6] [1,2]

Step 3 – Divide until single elements
[8] [3] [5] [4] [7] [6] [1] [2]

Step 4 – Merge and sort
[3,8] [4,5] [6,7] [1,2]

Step 5 – Merge again
[3,4,5,8] [1,2,6,7]

Final Sorted Array
[1,2,3,4,5,6,7,8]

### Time Complexity

Best Case: O(n log n)  
Average Case: O(n log n)  
Worst Case: O(n log n)

### Space Complexity

O(n)

Merge Sort requires extra memory to store temporary arrays while merging.

### Advantages
- Efficient for large datasets
- Guaranteed O(n log n) performance
- Stable sorting algorithm
- Works well for linked lists and external sorting

### Disadvantages
- Requires extra memory
- Slightly slower for very small datasets

### Key Learning

Merge Sort demonstrates the **Divide and Conquer approach**, where a large problem is broken into smaller parts, solved individually, and then combined to get the final solution.

## Day 11 – Quick Sort

Today I practiced the Quick Sort algorithm, which is a highly efficient sorting algorithm based on the Divide and Conquer technique. It works by selecting a pivot element from the array and partitioning the remaining elements into two groups: elements smaller than the pivot and elements greater than the pivot. After partitioning, the pivot element reaches its correct sorted position.

The same process is then recursively applied to the left and right subarrays until the entire array becomes sorted.

Steps involved in Quick Sort:
1. Choose a pivot element from the array.
2. Rearrange the array so that all elements smaller than the pivot come before it and all elements greater than the pivot come after it.
3. The pivot is placed in its correct sorted position.
4. Recursively apply the same process to the left and right subarrays.

Time Complexity:
Best Case: O(n log n)  
Average Case: O(n log n)  
Worst Case: O(n²) (occurs when pivot selection is poor)

Space Complexity:
O(log n) due to recursive stack calls.

Key Points:
- Quick Sort is efficient for large datasets.
- It is an in-place sorting algorithm (does not require extra array space).
- Performance depends on proper pivot selection.

Today’s learning helped me understand partitioning logic, recursion in sorting algorithms, and how divide and conquer improves sorting efficiency.
## 📅 Day 12 – Factorial using Recursion (Java)

Today I practiced solving the **Factorial problem using Recursion** in Java.  
Factorial is a common example used to understand how recursion works.

### 🔹 What is Factorial?

The factorial of a number **n** (written as n!) is the product of all positive integers from **1 to n**.

Example:
5! = 5 × 4 × 3 × 2 × 1 = 120

### 🔹 Recursive Logic

Recursion works by breaking a problem into smaller subproblems.

Factorial follows this rule:

n! = n × (n-1)!

The recursion stops when it reaches the **base case**.

Base Case:
0! = 1  
1! = 1

### 🔹 Java Implementation

```java
public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
```

### 🔹 Time Complexity
O(n)

### 🔹 Key Learning
- Understanding recursion and base cases
- Breaking problems into smaller subproblems
- How recursive function calls work in the call stack

# Day 13 - Fibonacci Series (DSA Practice)

Today I practiced the Fibonacci Series as part of my daily Data Structures and Algorithms learning challenge.

The Fibonacci series is a sequence of numbers where each number is the sum of the two previous numbers. The series usually starts with 0 and 1.

Example of Fibonacci sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, ...

In this program, the Fibonacci numbers are generated using Java. The logic works by starting with the first two numbers (0 and 1) and then repeatedly adding the previous two numbers to generate the next number in the sequence.

Algorithm Steps:
1. Start with two variables representing the first two Fibonacci numbers.
2. Print the first two numbers.
3. Use a loop to calculate the next number by adding the previous two numbers.
4. Update the variables after each iteration.
5. Continue the process until the required number of terms is printed.

This exercise helped me understand:
- Loop logic
- Variable updating
- Basic sequence generation
- Problem solving using iterative approach

Practicing Fibonacci is useful because it strengthens understanding of iteration, recursion, and algorithmic thinking, which are important concepts in Data Structures and Algorithms.

## 📅 Day 14 – Tower of Hanoi (Recursion)

Today I practiced the Tower of Hanoi problem, which is a classic example used to understand recursion in Data Structures and Algorithms.

### 🔹 Problem Description

The Tower of Hanoi puzzle consists of three rods and n disks of different sizes stacked on one rod in decreasing order (largest disk at the bottom and smallest at the top).

The goal is to move all the disks from the Source rod to the Destination rod using a Helper rod while following these rules:

1. Only one disk can be moved at a time.
2. A larger disk cannot be placed on top of a smaller disk.
3. Only the top disk of a rod can be moved.

### 🔹 Recursive Logic

The problem can be solved using recursion by breaking it into smaller steps.

Steps of the Algorithm:

1. Move n-1 disks from the Source rod to the Helper rod.
2. Move the largest disk from the Source rod to the Destination rod.
3. Move the n-1 disks from the Helper rod to the Destination rod.

This recursive process continues until the base case is reached.

### 🔹 Base Case

If there is only one disk, move it directly from the Source rod to the Destination rod.

### 🔹 Java Implementation

## 📅 Day 15 – Reverse a Number

Today I practiced solving the **Reverse Number problem** in Java. This problem helps build a strong understanding of **digit manipulation, arithmetic operations, and loop-based logic**, which are important fundamentals in algorithmic problem solving.

### 🔹 Problem Description

The task is to reverse the digits of a given integer number.

Example:

Original Number
12345

Reversed Number
54321

The algorithm works by repeatedly extracting the **last digit of the number** and constructing a new number in reverse order.

### 🔹 Algorithm Steps

1. Start with the given integer number.
2. Initialize a variable to store the reversed number.
3. Extract the last digit of the number using the modulus operator `%`.
4. Add this digit to the reversed number by shifting the existing digits to the left.
5. Remove the last digit from the original number using integer division `/`.
6. Repeat the process until the number becomes zero.
7. The final value obtained is the reversed number.

### 🔹 Concepts Practiced

* Digit extraction using modulus operator
* Integer division to remove digits
* Loop-based number processing
* Mathematical manipulation of integers
* Logical step-by-step problem solving

### 🔹 Time Complexity

O(n)

Where **n represents the number of digits in the given number**, since each digit is processed once.

### 🔹 Space Complexity

O(1)

The algorithm uses only a few variables and does not require additional memory proportional to the input size.

### 🔹 Learning Outcome

By implementing the Reverse Number problem, I improved my understanding of how numbers can be manipulated using arithmetic operations. This exercise strengthened my ability to work with loops, handle digit extraction, and construct new values step by step while solving algorithmic problems.

## 📅 Day 16 – Palindrome Check (Number)

Today I implemented a program to check whether a given number is a **Palindrome**. This problem helps in understanding **number reversal, comparison logic, and conditional statements**, which are important in basic algorithm design.

### 🔹 Problem Description

A number is called a **Palindrome** if it reads the same forward and backward.

Example:

121 → Palindrome
123 → Not a Palindrome

The idea is to reverse the number and compare it with the original number.

### 🔹 Algorithm Steps

1. Take the input number and store it in a temporary variable.
2. Initialize a variable to store the reversed number.
3. Extract the last digit using the modulus operator `%`.
4. Add the digit to the reversed number by shifting existing digits.
5. Remove the last digit from the number using division `/`.
6. Repeat the process until the number becomes zero.
7. Compare the reversed number with the original number.
8. If both are equal, the number is a Palindrome; otherwise, it is not.

### 🔹 Concepts Practiced

* Number reversal logic
* Modulus and division operations
* Loop execution and condition checking
* Comparison of values
* Problem solving using step-by-step logic

### 🔹 Time Complexity

O(n)

Where **n is the number of digits**, since each digit is processed once.

### 🔹 Space Complexity

O(1)

Only a few variables are used, so no extra space is required.

### 🔹 Learning Outcome

By solving the Palindrome problem, I strengthened my understanding of number manipulation and comparison logic. This exercise improved my ability to combine multiple concepts like loops, arithmetic operations, and condition checking to solve a complete problem.


## 📅 Day 17 – Print All Subsets of a String (Recursion)

Today I implemented a program to generate **all subsets of a given string** using recursion. This problem is an important step toward understanding **backtracking and recursive decision making**, which are key concepts in Data Structures and Algorithms.

### 🔹 Problem Description

Given a string, the task is to print all possible subsets (also called subsequences) of that string.

Example:

Input: ABC

Output:
A
B
C
AB
AC
BC
ABC

The empty subset can also be considered as part of the result.

---

### 🔹 Recursive Logic

At each step, we have **two choices** for every character:

1. Include the current character in the subset
2. Exclude the current character from the subset

This creates a **decision tree**, and recursion is used to explore all possible combinations.

---

### 🔹 Algorithm Steps

1. Start from the first character of the string.
2. For each character, make two recursive calls:

   * One including the current character
   * One excluding the current character
3. Move to the next index after each recursive call.
4. When the end of the string is reached, print the current subset.
5. Repeat this process until all combinations are generated.

---

### 🔹 Concepts Practiced

* Recursion and recursive function calls
* Backtracking and decision trees
* String manipulation
* Exploring all possible combinations
* Breaking problems into smaller subproblems

---

### 🔹 Time Complexity

O(2ⁿ)

Each character has two choices (include or exclude), leading to **2ⁿ subsets**.

---

### 🔹 Space Complexity

O(n)

Due to the recursion call stack and temporary storage of subsets.

---

### 🔹 Learning Outcome

By solving this problem, I developed a strong understanding of how recursion can be used to explore all possible combinations. This problem also introduced me to **backtracking concepts**, which are widely used in advanced problems like permutations, combinations, and constraint-based problems.
## 📅 Day 18 – Permutations of a String (Recursion)

Today I implemented a program to generate **all permutations of a given string** using recursion. This problem is an important extension of recursion and introduces deeper understanding of **backtracking and swapping techniques**.

### 🔹 Problem Description

Given a string, the task is to print all possible **permutations** of that string.

A permutation is an arrangement of all characters of the string in different possible orders.

Example:

Input: ABC

Output:
ABC
ACB
BAC
BCA
CAB
CBA

---

### 🔹 Recursive Logic

The idea is to fix one character at a time and recursively generate permutations for the remaining characters.

At each step:

1. Choose a character
2. Swap it with the current position
3. Recursively solve for the remaining string
4. Backtrack by restoring the original order

This ensures all possible arrangements are explored.

---

### 🔹 Algorithm Steps

1. Start from the first index of the string.
2. Iterate through the string and swap the current index with every possible index.
3. Fix one character and recursively generate permutations for the remaining substring.
4. Once a permutation is formed, print it.
5. Backtrack by swapping the characters back to their original positions.
6. Repeat the process for all positions.

---

### 🔹 Concepts Practiced

* Recursion and backtracking
* Swapping elements
* Generating all possible arrangements
* Decision making in recursive calls
* Problem decomposition

---

### 🔹 Time Complexity

O(n!)

There are **n! (factorial)** possible permutations for a string of length n.

---

### 🔹 Space Complexity

O(n)

Due to recursion stack usage.

---

### 🔹 Learning Outcome

By solving the permutations problem, I gained a deeper understanding of **backtracking and recursive problem solving**. This problem helped me visualize how complex combinations are generated step by step and improved my ability to handle advanced recursive algorithms.

## 📅 Day 19 – N-Queens Problem (Backtracking)

Today I implemented the **N-Queens problem**, which is a classic problem in Data Structures and Algorithms used to understand **backtracking and constraint-based problem solving**.

### 🔹 Problem Description

The N-Queens problem involves placing **N queens on an N × N chessboard** such that no two queens attack each other.

Conditions:

* No two queens should be in the same **row**
* No two queens should be in the same **column**
* No two queens should be in the same **diagonal**

Example:

For N = 4, one possible valid arrangement is:

Q . . .
. . Q .
. Q . .
. . . Q

---

### 🔹 Backtracking Logic

The problem is solved using **backtracking**, where we try to place queens row by row.

At each row:

1. Try placing a queen in each column
2. Check if the position is safe
3. If safe, place the queen and move to the next row
4. If not safe, try the next column
5. If no valid position is found, backtrack to the previous row and try a different position

This ensures all valid configurations are explored.

---

### 🔹 Algorithm Steps

1. Start from the first row of the chessboard.
2. For each column in the current row, check if placing a queen is safe.
3. If safe, place the queen and move to the next row recursively.
4. If placing the queen leads to a solution, print/store the configuration.
5. If not, remove the queen (backtrack) and try the next column.
6. Continue this process until all rows are processed.

---

### 🔹 Concepts Practiced

* Backtracking and recursion
* Constraint checking (row, column, diagonal)
* Decision making and undoing choices
* 2D array representation
* Exploring all possible solutions

---

### 🔹 Time Complexity

O(N!)

The number of possible ways grows rapidly, as we try multiple placements for each row.

---

### 🔹 Space Complexity

O(N)

Due to recursion stack and storage for the board configuration.

---

### 🔹 Learning Outcome

By solving the N-Queens problem, I gained a strong understanding of **backtracking and constraint satisfaction problems**. This problem improved my ability to explore multiple possibilities, make decisions, and backtrack when a solution path fails. It is an important step toward mastering advanced recursion and complex problem solving.

## 📅 Day 20 – Sudoku Solver (Backtracking)

Today I implemented the **Sudoku Solver problem** using recursion and backtracking. This problem is a classic example of **constraint-based problem solving** and helps in mastering advanced recursion techniques.

### 🔹 Problem Description

Sudoku is a 9 × 9 grid-based puzzle where some cells are already filled, and the goal is to fill the remaining cells such that:

* Each row contains digits from **1 to 9** without repetition
* Each column contains digits from **1 to 9** without repetition
* Each 3 × 3 subgrid contains digits from **1 to 9** without repetition

Empty cells are represented using a placeholder (such as `.`), and the task is to fill them correctly.

---

### 🔹 Backtracking Logic

The Sudoku Solver uses **backtracking**, where we try possible numbers and revert if a choice leads to an invalid state.

At each empty cell:

1. Try placing digits from **1 to 9**
2. Check if the number is valid in the current row, column, and 3 × 3 grid
3. If valid, place the number and move to the next empty cell
4. If the placement leads to a solution, continue
5. If not, remove the number (backtrack) and try the next possible value

This process continues until the board is completely filled.

---

### 🔹 Algorithm Steps

1. Traverse the board to find an empty cell.
2. For that cell, try all digits from 1 to 9.
3. Check whether the current number is valid.
4. If valid, place the number and recursively solve the remaining board.
5. If the solution fails, remove the number and try the next one.
6. Repeat the process until all cells are filled correctly.

---

### 🔹 Concepts Practiced

* Recursion and backtracking
* Constraint checking (row, column, subgrid)
* 2D array manipulation
* Decision making and undoing choices
* Solving complex problems step by step

---

### 🔹 Time Complexity

O(9^(n²)) (worst case)

The algorithm tries multiple possibilities for each empty cell, making it computationally intensive.

---

### 🔹 Space Complexity

O(n²)

Due to recursion stack and board storage.

---

### 🔹 Learning Outcome

By solving the Sudoku problem, I gained a deeper understanding of **backtracking and constraint satisfaction techniques**. This problem improved my ability to handle complex recursive logic, validate conditions efficiently, and explore multiple solution paths systematically. It is a significant step toward mastering advanced DSA problems.

## 📅 Day 21 – Rat in a Maze (Backtracking)

Today I implemented the **Rat in a Maze problem**, which is a classic backtracking problem used to understand **path finding and recursive exploration** in Data Structures and Algorithms.

### 🔹 Problem Description

The problem consists of a maze represented as a matrix where:

* `1` indicates a path that can be used
* `0` indicates a blocked cell

The goal is to find a path for a rat to move from the **top-left corner (0,0)** to the **bottom-right corner (n-1,n-1)**.

The rat can move in allowed directions and must avoid blocked cells.

---

### 🔹 Backtracking Logic

The problem is solved using **backtracking**, where we explore all possible paths and undo choices when a path does not lead to a solution.

At each cell:

1. Check if the current position is safe
2. Mark the cell as part of the path
3. Move in possible directions (such as right and down in the basic version)
4. If a move leads to a solution, continue
5. If not, backtrack by unmarking the cell and try another path

This ensures that all possible valid paths are explored.

---

### 🔹 Algorithm Steps

1. Start from the initial position (0,0).
2. Check if the current cell is valid and not blocked.
3. Mark the cell as part of the solution path.
4. Recursively move to the next possible positions.
5. If the destination is reached, print/store the solution.
6. If a move does not lead to a solution, backtrack and try a different path.
7. Repeat until all possible paths are explored or a solution is found.

---

### 🔹 Concepts Practiced

* Backtracking and recursion
* Path finding in a matrix
* Decision making and undoing choices
* 2D array traversal
* Problem solving using multiple possibilities

---

### 🔹 Time Complexity

O(2ⁿ)

In the basic version, the algorithm explores multiple paths, leading to exponential complexity.

---

### 🔹 Space Complexity

O(n²)

Due to the solution matrix and recursion stack.

---

### 🔹 Learning Outcome

By solving the Rat in a Maze problem, I improved my understanding of **backtracking and path exploration techniques**. This problem helped me learn how to explore multiple possibilities, handle constraints, and backtrack when a solution path fails. It is an important step toward solving advanced problems involving graphs and search algorithms.
## 📅 Day 22 – Generate Parentheses (Recursion & Backtracking)

Today I implemented the **Generate Parentheses problem** using recursion and backtracking. This problem is an important example of **constraint-based recursion**, where only valid combinations are generated instead of checking all possibilities.

### 🔹 Problem Description

Given an integer **n**, the task is to generate all combinations of **n pairs of valid parentheses**.

A valid combination means:

* Every opening bracket `(` must have a corresponding closing bracket `)`
* The parentheses must be properly balanced

Example:

Input: n = 3

Output:
((()))
(()())
(())()
()(())
()()()

---

### 🔹 Backtracking Logic

The problem is solved using **backtracking**, where we build the solution step by step while maintaining valid conditions.

At each step:

1. We can add an opening bracket `(` if the count of open brackets is less than n
2. We can add a closing bracket `)` only if it does not exceed the number of open brackets
3. We continue building the string until its length becomes `2 * n`
4. Once the string is complete and valid, we store it

This ensures that only **valid combinations** are generated.

---

### 🔹 Algorithm Steps

1. Start with an empty string.
2. Keep track of the number of open and close brackets used.
3. Add an opening bracket if the count is less than n.
4. Add a closing bracket if the count of closing brackets is less than opening brackets.
5. Repeat recursively until the length reaches `2 * n`.
6. Store the valid combination.

---

### 🔹 Concepts Practiced

* Recursion and backtracking
* Constraint-based problem solving
* String building during recursion
* Decision making and pruning invalid states
* Generating valid combinations

---

### 🔹 Time Complexity

O(2ⁿ)

The number of recursive calls grows exponentially with n.

---

### 🔹 Space Complexity

O(n)

Due to recursion stack and temporary string storage.

---

### 🔹 Learning Outcome

By solving the Generate Parentheses problem, I developed a strong understanding of **constraint handling in recursion**. This problem helped me learn how to generate only valid solutions instead of checking all possibilities, which improves efficiency and problem-solving skills in advanced DSA problems.

## 📅 Day 23 – Valid Parentheses (Stack)

Today I implemented the **Valid Parentheses problem** using a Stack. This problem is a fundamental example of how stacks are used to solve **balanced expression and matching problems** in Data Structures and Algorithms.

### 🔹 Problem Description

Given a string containing only the characters:

`(`, `)`, `{`, `}`, `[`, `]`

The task is to determine whether the input string is **valid**.

A string is considered valid if:

* Every opening bracket has a corresponding closing bracket
* Brackets are closed in the correct order
* Each closing bracket matches the most recent unmatched opening bracket

Example:

Input: `"()"` → Valid
Input: `"({[]})"` → Valid
Input: `"(]"` → Invalid
Input: `"([)]"` → Invalid

---

### 🔹 Stack Logic

The problem is solved using a **Stack**, which follows the **Last In First Out (LIFO)** principle.

Steps:

1. Traverse each character in the string
2. If it is an opening bracket, push the expected closing bracket onto the stack
3. If it is a closing bracket, check:

   * If the stack is empty → invalid
   * If the top of the stack does not match → invalid
4. Continue until all characters are processed
5. If the stack is empty at the end → valid string

---

### 🔹 Algorithm Steps

1. Create an empty stack
2. Loop through each character in the string
3. Push expected closing brackets for every opening bracket
4. For closing brackets, compare with the top of the stack
5. If mismatch occurs, return false
6. After traversal, check if the stack is empty
7. Return true if empty, otherwise false

---

### 🔹 Concepts Practiced

* Stack data structure
* LIFO (Last In First Out) principle
* String traversal
* Matching and validation logic
* Efficient problem solving using stacks

---

### 🔹 Time Complexity

O(n)

Each character is processed once.

---

### 🔹 Space Complexity

O(n)

In the worst case, all characters are pushed onto the stack.

---

### 🔹 Learning Outcome

By solving the Valid Parentheses problem, I learned how stacks can be used to handle **matching and balancing problems efficiently**. This problem strengthened my understanding of stack operations and helped me move from recursive thinking to iterative problem solving using data structures.
## 📅 Day 24 – Next Greater Element (Stack)

Today I implemented the **Next Greater Element problem** using a Stack. This problem is a classic example of how stacks are used to optimize solutions and reduce time complexity from brute force to efficient approaches.

### 🔹 Problem Description

Given an array of integers, the task is to find the **next greater element for each element** in the array.

The next greater element of an element is the first element to its right that is greater than it. If no such element exists, return `-1`.

Example:

Input:
[4, 5, 2, 10]

Output:
[5, 10, 10, -1]

---

### 🔹 Stack Logic

The problem is solved using a **Stack** to keep track of useful elements while traversing the array.

Steps:

1. Traverse the array from **right to left**
2. For each element, remove all elements from the stack that are smaller than or equal to it
3. The top of the stack will be the next greater element
4. If the stack is empty, the result is `-1`
5. Push the current element onto the stack

This ensures that only relevant elements are kept in the stack.

---

### 🔹 Algorithm Steps

1. Create an empty stack
2. Initialize a result array
3. Traverse the array from right to left
4. While the stack is not empty and the top element is smaller than or equal to the current element, pop it
5. If the stack is empty, store `-1`
6. Otherwise, store the top of the stack as the next greater element
7. Push the current element onto the stack
8. Repeat for all elements

---

### 🔹 Concepts Practiced

* Stack data structure
* Monotonic stack pattern
* Array traversal (right to left)
* Optimization from brute force to efficient solution
* Problem solving using data structures

---

### 🔹 Time Complexity

O(n)

Each element is pushed and popped at most once.

---

### 🔹 Space Complexity

O(n)

Stack is used to store elements.

---

### 🔹 Learning Outcome

By solving the Next Greater Element problem, I learned how to use a **monotonic stack** to efficiently solve problems involving comparisons. This problem improved my understanding of optimizing algorithms and recognizing patterns that reduce time complexity in real-world scenarios.

## 📅 Day 25 – Stock Span Problem (Stack)

Today I implemented the **Stock Span Problem** using a Stack. This problem is a classic example of the **monotonic stack pattern**, which is widely used to solve range-based problems efficiently.

### 🔹 Problem Description

Given an array of stock prices where each element represents the price on a particular day, the task is to calculate the **span of stock’s price for each day**.

The span is defined as the number of consecutive days (including the current day) where the stock price was **less than or equal to today’s price**.

Example:

Input:
[100, 80, 60, 70, 60, 75, 85]

Output:
[1, 1, 1, 2, 1, 4, 6]

---

### 🔹 Stack Logic

The problem is solved using a **Stack that stores indices** of elements.

Steps:

1. Traverse the array from left to right
2. Remove indices from the stack while the current price is greater than or equal to the price at those indices
3. If the stack becomes empty, the span is `i + 1`
4. Otherwise, the span is the difference between the current index and the index at the top of the stack
5. Push the current index onto the stack

This ensures that only relevant elements are kept for span calculation.

---

### 🔹 Algorithm Steps

1. Create an empty stack to store indices
2. Initialize a result array to store spans
3. Traverse the stock prices array
4. While the stack is not empty and current price is greater than or equal to the top index price, pop from stack
5. Calculate span based on stack condition
6. Push current index into the stack
7. Repeat for all elements

---

### 🔹 Concepts Practiced

* Stack data structure
* Monotonic stack pattern
* Index-based calculations
* Efficient range computation
* Optimizing from O(n²) to O(n)

---

### 🔹 Time Complexity

O(n)

Each element is pushed and popped at most once.

---

### 🔹 Space Complexity

O(n)

Stack is used to store indices.

---

### 🔹 Learning Outcome

By solving the Stock Span problem, I learned how to use a **monotonic stack to efficiently calculate ranges**. This problem strengthened my understanding of stack-based optimization and helped me recognize patterns that are commonly used in advanced DSA problems.

## 📅 Day 26 – Maximum Sum Subarray of Size K (Sliding Window)

Today I implemented the **Maximum Sum Subarray of Size K** using the Sliding Window technique. This problem is a fundamental example of how to optimize problems that involve **subarrays and continuous ranges**.

### 🔹 Problem Description

Given an array of integers and a number `k`, the task is to find the **maximum sum of any contiguous subarray of size k**.

Example:

Input:
Array: [2, 1, 5, 1, 3, 2]
k = 3

Output:
9

Explanation:
Subarrays of size 3:
[2, 1, 5] → sum = 8
[1, 5, 1] → sum = 7
[5, 1, 3] → sum = 9
[1, 3, 2] → sum = 6

Maximum = 9

---

### 🔹 Sliding Window Logic

Instead of calculating the sum of every subarray using nested loops, we use a **sliding window** to optimize the solution.

Steps:

1. Calculate the sum of the first window of size `k`
2. Slide the window one step at a time
3. Add the next element and remove the first element of the previous window
4. Update the maximum sum during each step

This avoids recalculating the sum from scratch.

---

### 🔹 Algorithm Steps

1. Initialize the sum of the first `k` elements
2. Store it as the current maximum
3. Traverse the array from index `k` to end
4. Add current element and subtract the element leaving the window
5. Update the maximum sum
6. Continue until the end of the array

---

### 🔹 Concepts Practiced

* Sliding window technique
* Subarray processing
* Optimization of nested loops
* Efficient range updates
* Array traversal

---

### 🔹 Time Complexity

O(n)

Each element is processed once.

---

### 🔹 Space Complexity

O(1)

No extra space is used apart from variables.

---

### 🔹 Learning Outcome

By solving this problem, I learned how the **sliding window technique** helps optimize problems involving contiguous subarrays. This approach reduces time complexity and is widely used in many real-world and interview problems.
