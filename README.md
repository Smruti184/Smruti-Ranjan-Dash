# Smruti Ranjan Dash - TANDEMLOOP Screening Test
Solutions to the Stage-1 Screening Test for the Full Stack Developer position at TANDEMLOOP, implemented in Java. Includes 4 basic programming problems covering calculator operations, number series generation, and data analysis using arrays.

## 📌 Repository Overview
This repository contains the solutions to the **Stage-1 Screening Test** for the Full Stack Developer position at **TANDEMLOOP**.

- 👨‍💻 **Language Used**: Java
- 🧩 **Total Problems**: 4
- 🗂️ **Package**: `com.TANDEMLOOP.ScreeningTest`
- 🧠 **IDE Recommended**: Eclipse / IntelliJ / VS Code with Java

---

## ✅ Problem Statements & Approach

### 🧮 Problem-1: Calculator using Class

**File**: `Problem1.java`  
**Description**: Takes two `double` inputs (`a`, `b`) and a string (`operation`) such as `Addition`, `Subtraction`, `Multiplication`, or `Division` and prints the result.  
**Edge Case Handled**: Division by zero.

---

### 🔢 Problem-2: Generate Odd Number Series (1, 3, 5, ...)

**File**: `Problem2.java`  
**Description**: Takes one integer input `x` and prints the first `x` odd numbers starting from 1.  
**Example**:  
Input: 4 → Output: `1, 3, 5, 7`  
**Validation**: Rejects non-positive inputs.

---

### 🔁 Problem-3: Conditional Odd Series Based on Input

**File**: `Problem3.java`  
**Description**: 
- If input `x` is odd → prints `x` odd numbers.  
- If input `x` is even → prints `(x-1)` odd numbers.  
**Example**:  
Input: 3 → Output: `1, 3, 5`  
Input: 4 → Output: `1, 3, 5`

---

### 📊 Problem-4: Count Multiples of 1-9

**File**: `Problem4.java`  
**Description**: 
- Takes an array input from the user.
- Counts how many elements are divisible by each of the numbers from 1 to 9.
- Displays the count in `{key: value}` format.  
**Example**:  
Input: `[1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]`  
Output: `1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1`

---

## 💻 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/tandemloop-screening-test.git
