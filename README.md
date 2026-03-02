# 🚀 JAY_JAVA_DSA

A collection of my ongoing Data Structures and Algorithms practice, focused on building strong fundamentals and writing optimized solutions.

---

---

## 📅 Day 1 – Patterns

### 🔹 1. Solid Rectangle (4x5)

**Concept:** Nested loops  

**Approach:**
- Outer loop controls rows
- Inner loop controls columns
- Prints `n × m` stars in every row

**Time Complexity:** O(n × m)

**What I Learned:**
- Basic nested loop structure
- Understanding row and column execution
- How loop nesting affects output shape


---

### 🔹 2. Hollow Rectangle (5x5)

**Concept:** Nested loops + boundary conditions  

**Approach:**
- Print `*` when:
  - `i == 1` (first row)
  - `i == n` (last row)
  - `j == 1` (first column)
  - `j == m` (last column)
- Otherwise print space

**Time Complexity:** O(n × m)

**What I Learned:**
- Applying conditions inside nested loops
- Writing boundary-based logic
- Avoiding hardcoded values by using `n` and `m`


---

### 🔹 3. Pyramid Pattern

**Concept:** Nested loops + space management  

**Approach:**
- First print spaces (`n - i`)
- Then print stars (`2*i - 1`)
- Repeat for each row

**Time Complexity:** O(n²)

**What I Learned:**
- Managing spaces and alignment
- Using mathematical formulas inside loops
- Building symmetrical patterns


---

### 🔹 4. Inverse Pyramid

**Concept:** Reverse loop logic  

**Approach:**
- Print increasing spaces
- Print decreasing stars
- Reverse of normal pyramid logic

**Time Complexity:** O(n²)

**What I Learned:**
- Understanding reverse iteration
- How modifying loop conditions changes pattern structure


---

### 🔹 5. Numerical Pyramid

**Concept:** Nested loops with number progression  

**Approach:**
- Print spaces for alignment
- Print increasing numbers in each row
- Maintain number pattern logic inside loop

**Time Complexity:** O(n²)

**What I Learned:**
- Combining loops with number patterns
- Controlling variable increments inside nested loops
- Logical thinking beyond star patterns

---
---

### 🔹 6. Half Pyramid

**Concept:** Nested loops (increasing pattern)

**Approach:**
- Outer loop controls rows
- Inner loop prints stars equal to row number
- Star count increases every row

**Time Complexity:** O(n²)

**What I Learned:**
- Basic increasing pattern logic
- Relationship between row number and star count


---

### 🔹 7. Half Pyramid (180° Rotated)

**Concept:** Nested loops + space alignment

**Approach:**
- Print spaces (`n - i`) first
- Then print stars (`i`)
- Creates right-aligned triangle

**Time Complexity:** O(n²)

**What I Learned:**
- Combining spaces and stars
- Understanding right alignment logic


---

### 🔹 8. Binary Pattern

**Concept:** Nested loops with alternating values

**Approach:**
- Use condition like `(i + j) % 2`
- Print `1` if even
- Print `0` if odd

**Time Complexity:** O(n²)

**What I Learned:**
- Applying mathematical conditions inside loops
- Pattern generation using parity logic


---

### 🔹 9. Butterfly Pattern

**Concept:** Complex nested loops (combination pattern)

**Approach:**
- Print stars increasing on left
- Print spaces in middle
- Mirror stars on right
- Reverse logic for bottom half

**Time Complexity:** O(n²)

**What I Learned:**
- Dividing pattern into top and bottom halves
- Combining multiple loop segments
- Logical breakdown of complex patterns


---

### 🔹 10. Solid Rhombus

**Concept:** Nested loops + shifting alignment

**Approach:**
- Print leading spaces (`n - i`)
- Print fixed number of stars (`n`)
- Shift pattern right every row

**Time Complexity:** O(n²)

**What I Learned:**
- Pattern shifting logic
- Controlling horizontal movement using spaces


---

### 🔹 11. Pattern Numericals

**Concept:** Nested loops with number progression

**Approach:**
- Print numbers instead of stars
- Control increment inside inner loop
- Reset or update counter per row

**Time Complexity:** O(n²)

**What I Learned:**
- Managing numeric sequences
- Combining loops with variable updates
- Stronger logical thinking beyond star patterns

---