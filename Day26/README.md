# ☕ Day 26 - Maximum Subarray Sum

Today I practiced two approaches for finding the maximum subarray sum:

1. Brute Force Approach
2. Kadane's Algorithm

This helped me understand how an inefficient solution can be optimized into an efficient O(n) solution.

---

## 📚 Topics Learned

- Arrays
- Subarrays
- Contiguous Elements
- Nested Loops
- Brute Force
- Kadane's Algorithm
- Greedy Approach
- Dynamic Programming Concept
- `Math.max()`
- Time Complexity
- Space Complexity
- Algorithm Optimization

---

# 🎯 Problem 1: Maximum Subarray Sum - Brute Force

## 📌 Objective

Find the maximum possible sum of a contiguous subarray.

## 💻 File

`MaximumSubarrayBruteForce.java`

---

## ▶️ Sample Input

```text
5
-2 1 -3 4 -1
```

## ▶️ Output

```text
Maximum Subarray Sum = 4
```

---

## 📖 What is a Subarray?

A subarray is a **contiguous part of an array**.

For:

```text
1 2 3 4
```

Some valid subarrays are:

```text
1
2
3
4
1 2
2 3
3 4
1 2 3
2 3 4
1 2 3 4
```

But:

```text
1 3
```

is not a subarray because the elements are not contiguous.

---

## 🧠 Logic

The brute-force solution uses two loops.

The first loop chooses the starting position.

The second loop extends the subarray and calculates its sum.

Example:

```java
for (int i = 0; i < n; i++) {

    int currentSum = 0;

    for (int j = i; j < n; j++) {

        currentSum += arr[j];

        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    }
}
```

---

## 📊 Example

For:

```text
-2 1 -3 4 -1
```

Some subarrays are:

```text
-2
-2 1
-2 1 -3
1
1 -3
1 -3 4
4
4 -1
```

The largest sum is:

```text
4
```

Therefore:

```text
Maximum Subarray Sum = 4
```

---

## ⏱️ Complexity

### Time Complexity

```text
O(n²)
```

Two loops are used.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# 🎯 Problem 2: Maximum Subarray Sum - Kadane's Algorithm

## 📌 Objective

Find the maximum subarray sum using Kadane's Algorithm.

## 💻 File

`MaximumSubarrayKadane.java`

---

## ▶️ Sample Input

```text
9
-2 1 -3 4 -1 2 1 -5 4
```

## ▶️ Output

```text
Maximum Subarray Sum = 6
```

---

## 📖 Maximum Subarray

The maximum subarray is:

```text
4 -1 2 1
```

Its sum is:

```text
4 + (-1) + 2 + 1 = 6
```

Therefore:

```text
Maximum Subarray Sum = 6
```

---

# 🧠 Kadane's Algorithm

Kadane's Algorithm finds the maximum subarray sum in:

```text
O(n)
```

The main idea is to maintain:

```text
currentSum
maxSum
```

For every element, we decide whether to:

1. Start a new subarray
2. Continue the previous subarray

The main statement is:

```java
currentSum = Math.max(arr[i], currentSum + arr[i]);
```

This means:

```text
currentSum =
maximum of:

arr[i]

OR

currentSum + arr[i]
```

Then:

```java
maxSum = Math.max(maxSum, currentSum);
```

keeps the maximum value found so far.

---

# 📊 Kadane's Algorithm Dry Run

Array:

```text
-2 1 -3 4 -1 2 1 -5 4
```

| Element | Current Sum | Maximum Sum |
|---------|-------------|-------------|
| -2 | -2 | -2 |
| 1 | 1 | 1 |
| -3 | -2 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Final answer:

```text
Maximum Subarray Sum = 6
```

---

# 🔥 Brute Force vs Kadane's Algorithm

| Approach | Time Complexity | Space Complexity |
|----------|-----------------|------------------|
| Brute Force | O(n²) | O(1) |
| Kadane's Algorithm | O(n) | O(1) |

Kadane's Algorithm is much more efficient for large arrays.

---

# 💡 Important Concepts

## 1. Subarray

A subarray is a contiguous portion of an array.

Example:

```text
1 2 3 4
```

Valid:

```text
2 3
```

Invalid:

```text
1 3
```

because `1` and `3` are not next to each other.

---

## 2. Contiguous

Contiguous means elements are next to each other without gaps.

Example:

```text
2 3 4
```

is contiguous.

But:

```text
2 4
```

is not contiguous in:

```text
2 3 4
```

---

## 3. Brute Force

Brute force means trying all possible possibilities to find the answer.

The brute-force solution is easy to understand but can become slow for large input sizes.

---

## 4. Kadane's Algorithm

Kadane's Algorithm efficiently finds the maximum subarray sum.

Its time complexity is:

```text
O(n)
```

It processes the array in a single traversal.

---

## 5. `Math.max()`

Java provides:

```java
Math.max(a, b)
```

It returns the larger of two values.

Example:

```java
int result = Math.max(10, 20);
```

Output:

```text
20
```

---

# 🧪 Test Cases

## Problem 1 and Problem 2

Both programs should produce the same maximum sum.

### Test Case 1

```text
Input:
5
-2 1 -3 4 -1

Output:
Maximum Subarray Sum = 4
```

### Test Case 2

```text
Input:
9
-2 1 -3 4 -1 2 1 -5 4

Output:
Maximum Subarray Sum = 6
```

### Test Case 3

```text
Input:
5
1 2 3 4 5

Output:
Maximum Subarray Sum = 15
```

### Test Case 4

```text
Input:
4
-5 -2 -8 -1

Output:
Maximum Subarray Sum = -1
```

### Test Case 5

```text
Input:
5
-1 -2 -3 -4 -5

Output:
Maximum Subarray Sum = -1
```

---

# ⭐ Bonus Challenge

## Find the Maximum Subarray Itself

Instead of only finding the maximum sum, try to print the subarray that produces the maximum sum.

Example:

```text
Input:
9
-2 1 -3 4 -1 2 1 -5 4
```

Output:

```text
Maximum Subarray:
4 -1 2 1

Maximum Sum:
6
```

### Hint

In addition to:

```text
currentSum
maxSum
```

maintain:

```text
start
end
```

to remember where the maximum subarray begins and ends.

---

# 🧠 Self-Test Questions

Before moving to Day 27, try answering:

### Question 1

What is a subarray?

### Question 2

What does contiguous mean?

### Question 3

What is the time complexity of the brute-force approach?

### Question 4

What is the time complexity of Kadane's Algorithm?

### Question 5

Why is Kadane's Algorithm more efficient?

### Question 6

What does this statement do?

```java
currentSum = Math.max(arr[i], currentSum + arr[i]);
```

### Question 7

What is the maximum subarray sum of:

```text
1 -2 3 4 -1
```

### Question 8

What happens if all elements are negative?

Example:

```text
-5 -2 -8 -1
```

Answer:

```text
-1
```

---

# ⚠️ Important Learning Point

Do not memorize Kadane's Algorithm blindly.

You need to understand this decision:

```text
Start new subarray
        OR
Continue current subarray
```

For every element, we choose the option that gives the larger sum.

That single decision is the core idea behind Kadane's Algorithm.

---

# 📂 Folder Structure

```text
Day26
│
├── MaximumSubarrayBruteForce.java
├── MaximumSubarrayKadane.java
└── README.md
```

---

# 📊 Day 26 Progress

- Problems Solved: 2
- Topic: Maximum Subarray Sum
- Difficulty: Medium
- Status: Completed

---

# 🚀 Day 26 Completed ✅

```text
Progress: 26 / 30 Days
Problems Solved: 52 / 60
```
