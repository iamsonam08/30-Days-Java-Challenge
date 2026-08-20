# ☕ Day 22 - Array Logic Problems

Today I practiced two important array problems:

1. Find the Second Largest Element
2. Find the Missing Number

These problems helped me practice array traversal, comparison, mathematical formulas, and time complexity.

---

## 📚 Topics Learned

- Arrays
- Array Traversal
- Finding Largest Element
- Finding Second Largest Element
- Distinct Elements
- `Integer.MIN_VALUE`
- Missing Number
- Mathematical Formula
- Conditional Statements
- Arithmetic Operators
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Find Second Largest Element

## 📌 Objective

Find the **second largest distinct element** in a given array.

## 💻 File

`SecondLargest.java`

## ▶️ Sample Input

```text
6
10 25 7 40 15 30
```

## ▶️ Output

```text
Second Largest = 30
```

## 📖 Explanation

The array is:

```text
10 25 7 40 15 30
```

The largest element is:

```text
40
```

The second largest element is:

```text
30
```

Therefore:

```text
Second Largest = 30
```

---

## 🧠 Logic

We maintain two variables:

```java
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
```

We traverse the array and compare each element.

If the current element is greater than `largest`:

```java
secondLargest = largest;
largest = arr[i];
```

Otherwise, if the current element is greater than `secondLargest` and different from `largest`:

```java
secondLargest = arr[i];
```

---

## 📊 Dry Run

For:

```text
10 25 7 40 15 30
```

| Element | Largest | Second Largest |
|---------|---------|----------------|
| 10 | 10 | - |
| 25 | 25 | 10 |
| 7 | 25 | 10 |
| 40 | 40 | 25 |
| 15 | 40 | 25 |
| 30 | 40 | 30 |

Final result:

```text
Largest = 40
Second Largest = 30
```

---

## 🔹 Why `Integer.MIN_VALUE`?

```java
Integer.MIN_VALUE
```

represents the smallest possible `int` value in Java:

```text
-2147483648
```

It is used to initialize `largest` and `secondLargest`.

This also allows the program to work with negative numbers.

Example:

```text
-10 -20 -5 -30
```

Result:

```text
Largest = -5
Second Largest = -10
```

---

## 🔹 What Does Distinct Mean?

Distinct means **different and not repeated**.

Example:

```text
10 20 20 30
```

Distinct values:

```text
10 20 30
```

Therefore:

```text
Largest = 30
Second Largest = 20
```

---

## 📖 Concepts Used

- Array
- Array Traversal
- `for` Loop
- `if-else`
- Comparison Operators
- `Integer.MIN_VALUE`
- Variables

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed only once.

### Space Complexity

```text
O(1)
```

Only a fixed number of variables are used.

---

# 🎯 Problem 2: Find Missing Number

## 📌 Objective

Given `n-1` numbers from `1` to `n`, find the missing number.

## 💻 File

`MissingNumber.java`

## ▶️ Sample Input

```text
5
1 2 3 5
```

## ▶️ Output

```text
Missing Number = 4
```

---

## 📖 Explanation

Numbers from `1` to `5` should be:

```text
1 2 3 4 5
```

But the given numbers are:

```text
1 2 3 5
```

Therefore:

```text
4
```

is missing.

---

## 🧮 Formula

The sum of numbers from `1` to `n` is:

```text
Expected Sum = n × (n + 1) / 2
```

Then:

```text
Missing Number = Expected Sum - Actual Sum
```

---

## 📊 Example

Given:

```text
n = 5
```

Expected sum:

```text
5 × (5 + 1) / 2
= 5 × 6 / 2
= 15
```

Actual sum:

```text
1 + 2 + 3 + 5
= 11
```

Therefore:

```text
Missing Number = 15 - 11
               = 4
```

So:

```text
Missing Number = 4
```

---

## 📖 Concepts Used

- Arrays
- Array Traversal
- Mathematical Formula
- Addition
- Subtraction
- Multiplication
- Division
- Variables

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The numbers are processed once.

### Space Complexity

```text
O(1)
```

No additional array is required.

---

# 💡 Important Concepts

## 1. Array

An array stores multiple values of the same data type.

Example:

```java
int[] arr = {10, 20, 30, 40};
```

Indexes:

```text
Index:    0   1   2   3
          ↓   ↓   ↓   ↓
Array:   10  20  30  40
```

---

## 2. Array Traversal

Traversal means visiting every element of an array one by one.

Example:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

For:

```text
10 20 30 40
```

The traversal is:

```text
10 → 20 → 30 → 40
```

---

## 3. Largest Element

To find the largest element:

```java
int largest = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {

    if (arr[i] > largest) {
        largest = arr[i];
    }
}
```

---

## 4. Second Largest Element

For second largest, we maintain:

```java
largest
secondLargest
```

When a new largest element is found:

```java
secondLargest = largest;
largest = arr[i];
```

This is the main logic of Problem 1.

---

## 5. `Integer.MIN_VALUE`

```java
Integer.MIN_VALUE
```

represents:

```text
-2147483648
```

It is useful when initializing variables for finding the largest value.

---

## 6. Missing Number Formula

For numbers from `1` to `n`:

```text
Expected Sum = n × (n + 1) / 2
```

Then:

```text
Missing Number = Expected Sum - Actual Sum
```

---

# 🧪 Test Cases

## Problem 1: Second Largest

### Test Case 1

```text
Input:
5
10 20 30 40 50

Output:
Second Largest = 40
```

### Test Case 2

```text
Input:
5
10 10 20 20 30

Output:
Second Largest = 20
```

### Test Case 3

```text
Input:
6
-10 -20 -5 -30 -15 -8

Output:
Second Largest = -8
```

### Test Case 4

```text
Input:
4
5 5 5 5

Output:
Second largest element does not exist.
```

---

## Problem 2: Missing Number

### Test Case 1

```text
Input:
5
1 2 3 5

Output:
Missing Number = 4
```

### Test Case 2

```text
Input:
6
1 2 3 4 6

Output:
Missing Number = 5
```

### Test Case 3

```text
Input:
4
2 3 4

Output:
Missing Number = 1
```

### Test Case 4

```text
Input:
5
2 3 4 5

Output:
Missing Number = 1
```

---

# ⭐ Bonus Challenge

## Find the Second Smallest Element

Try solving this problem yourself.

### Example

```text
Input:
5
10 5 20 3 15
```

Output:

```text
Second Smallest = 5
```

### Hint

Use the same logic as the second-largest problem.

Instead of:

```java
largest
secondLargest
```

use:

```java
smallest
secondSmallest
```

---

# 🧠 Self-Test Questions

Before moving to Day 23, try answering these questions.

### Question 1

Why do we use:

```java
secondLargest = largest;
largest = arr[i];
```

when a new largest element is found?

### Question 2

What is the second largest element in:

```text
20 5 30 10 40
```

### Question 3

What is the second largest distinct element in:

```text
10 20 20 30
```

### Question 4

What is the formula for the sum of numbers from `1` to `n`?

### Question 5

What is the time complexity of the second-largest solution?

### Question 6

Can the missing-number problem be solved by sorting?

Yes.

But sorting takes:

```text
O(n log n)
```

The mathematical solution takes:

```text
O(n)
```

Therefore, the mathematical solution is more efficient.

---

# ⚠️ Important Learning Point

Do not simply use sorting to solve the second-largest problem:

```java
Arrays.sort(arr);
```

Although it works, it gives:

```text
O(n log n)
```

The goal of this problem is to find the answer in:

```text
O(n)
```

by maintaining:

```text
largest
secondLargest
```

This teaches how to solve the problem using a **single traversal**.

---

# 📂 Folder Structure

```text
Day22
│
├── SecondLargest.java
├── MissingNumber.java
└── README.md
```

---

# 📊 Day 22 Progress

- Problems Solved: 2
- Topic: Array Logic Problems
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 22 Completed ✅

```text
Progress: 22 / 30 Days
Problems Solved: 44 / 60
```
