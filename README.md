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