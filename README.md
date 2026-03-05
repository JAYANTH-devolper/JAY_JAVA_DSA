

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
