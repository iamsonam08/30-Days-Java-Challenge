# ☕ Day 29 - Array Searching Problems

Today I practiced two important array problems:

1. Two Sum
2. Find Common Elements in Two Arrays

These problems helped me improve my array searching, comparison, and nested-loop logic.

---

## 📚 Topics Learned

- Arrays
- Array Traversal
- Searching
- Pair Searching
- Two Sum
- Common Elements
- Nested Loops
- Boolean Variables
- `break`
- `continue`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Two Sum

## 📌 Objective

Given an array and a target value, find two elements whose sum is equal to the target.

## 💻 File

`TwoSum.java`

---

## ▶️ Sample Input

```text
5
2 7 11 15 3
9
```

## ▶️ Output

```text
2 + 7 = 9
```

---

## 📖 Explanation

Given array:

```text
2 7 11 15 3
```

Target:

```text
9
```

We check pairs of elements.

The first valid pair is:

```text
2 + 7 = 9
```

Therefore:

```text
2 + 7 = 9
```

---

## 🧠 Logic

We use two loops.

The first loop selects the first element:

```java
for (int i = 0; i < n - 1; i++)
```

The second loop selects the second element:

```java
for (int j = i + 1; j < n; j++)
```

Then we check:

```java
if (arr[i] + arr[j] == target)
```

If the sum equals the target, we found the required pair.

---

## 📊 Dry Run

Array:

```text
2 7 11 15 3
```

Target:

```text
9
```

Check:

```text
2 + 7 = 9 ✓
```

The target is found, so the program stops.

---

## 📖 Concepts Used

- Arrays
- Nested Loops
- Pair Searching
- Addition
- Comparison
- Boolean Variable
- `break`

---

## ⏱️ Complexity

### Time Complexity

```text
O(n²)
```

In the worst case, we check many pairs.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# 🎯 Problem 2: Find Common Elements

## 📌 Objective

Find the elements that are present in both arrays.

## 💻 File

`CommonElements.java`

---

## ▶️ Sample Input

```text
5
1 2 3 4 5
5
3 4 5 6 7
```

## ▶️ Output

```text
Common Elements:
3
4
5
```

---

## 📖 Explanation

First array:

```text
1 2 3 4 5
```

Second array:

```text
3 4 5 6 7
```

Elements present in both arrays are:

```text
3
4
5
```

Therefore:

```text
Common Elements:
3
4
5
```

---

## 🧠 Logic

For every element in the first array, we search for the same element in the second array.

Example:

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < m; j++) {

        if (arr1[i] == arr2[j]) {
            // Common element
        }
    }
}
```

If the values are equal, the element exists in both arrays.

---

## 📖 Concepts Used

- Arrays
- Nested Loops
- Array Searching
- Comparison
- Boolean Array
- `continue`
- `break`

---

## ⏱️ Complexity

### Time Complexity

```text
O(n × m)
```

Every element of the first array may be compared with every element of the second array.

### Space Complexity

```text
O(n)
```

A boolean array is used to track processed elements.

---

# 💡 Important Concepts

## 1. Two Sum

Two Sum means finding two elements whose sum equals a given target.

Example:

```text
Array:
2 7 11 15

Target:
9
```

Answer:

```text
2 + 7 = 9
```

---

## 2. Pair

A pair means two elements considered together.

Example:

```text
10 20 30
```

Possible pairs:

```text
10 + 20
10 + 30
20 + 30
```

---

## 3. Common Element

An element that exists in both arrays is called a common element.

Example:

```text
Array 1:
1 2 3 4

Array 2:
3 4 5 6
```

Common elements:

```text
3
4
```

---

## 4. Nested Loop

A nested loop is a loop inside another loop.

Example:

```java
for (...) {

    for (...) {

    }
}
```

In Two Sum, nested loops allow us to check different pairs.

---

## 5. `break`

`break` stops the current loop immediately.

Example:

```java
if (arr[i] + arr[j] == target) {
    found = true;
    break;
}
```

Once the required pair is found, there is no need to continue searching.

---

## 6. `continue`

`continue` skips the current iteration.

Example:

```java
if (printed[i]) {
    continue;
}
```

This prevents already processed elements from being checked again.

---

# 🧪 Test Cases

## Problem 1: Two Sum

### Test Case 1

```text
Input:
5
2 7 11 15 3
9

Output:
2 + 7 = 9
```

### Test Case 2

```text
Input:
4
1 4 6 8
10

Output:
4 + 6 = 10
```

### Test Case 3

```text
Input:
5
1 2 3 4 5
20

Output:
No pair found.
```

### Test Case 4

```text
Input:
5
-3 4 2 5 -1
1

Output:
-3 + 4 = 1
```

---

# Problem 2: Common Elements

### Test Case 1

```text
Input:
5
1 2 3 4 5
5
3 4 5 6 7

Output:
Common Elements:
3
4
5
```

### Test Case 2

```text
Input:
4
1 2 3 4
4
5 6 7 8

Output:
No common elements found.
```

### Test Case 3

```text
Input:
5
10 20 30 40 50
4
20 40 60 80

Output:
Common Elements:
20
40
```

### Test Case 4

```text
Input:
4
1 1 2 3
3
1 2 4

Output:
Common Elements:
1
2
```

---

# ⭐ Bonus Challenge

## Two Sum Using a HashMap

The current Two Sum solution uses:

```text
O(n²)
```

Try to solve the same problem using a `HashMap`.

Target:

```text
9
```

Array:

```text
2 7 11 15
```

Expected result:

```text
2 + 7 = 9
```

The optimized solution can achieve approximately:

```text
O(n)
```

time complexity.

Try solving it yourself before looking at a solution.

---

# 🧠 Self-Test Questions

Before moving to Day 30, try answering:

### Question 1

What is the Two Sum problem?

### Question 2

Why does the second loop start from:

```java
j = i + 1
```

instead of:

```java
j = 0
```

?

### Question 3

What is the time complexity of the basic Two Sum solution?

### Question 4

What are common elements?

### Question 5

What is the time complexity of finding common elements using nested loops?

### Question 6

Why do we use `break` after finding a pair?

### Question 7

What is the difference between `break` and `continue`?

### Question 8

Can Two Sum be solved in O(n)?

Yes, using a suitable data structure such as a `HashMap`.

---

# ⚠️ Important Learning Point

The brute-force Two Sum solution is:

```text
O(n²)
```

It works, but it is not the best solution for large arrays.

A `HashMap` can reduce the expected time complexity to approximately:

```text
O(n)
```

This is an important DSA pattern:

```text
Brute Force
     ↓
Identify repeated work
     ↓
Use a suitable data structure
     ↓
Optimized Solution
```

First understand the brute-force approach. Then learn the optimized version.

---

# 📂 Folder Structure

```text
Day29
│
├── TwoSum.java
├── CommonElements.java
└── README.md
```

---

# 📊 Day 29 Progress

- Problems Solved: 2
- Topic: Array Searching Problems
- Difficulty: Medium
- Status: Completed

---

# 🚀 Day 29 Completed ✅

```text
Progress: 29 / 30 Days
Problems Solved: 58 / 60
```

---

# 🔥 Next: Day 30

Day 30 will be the final day of this 30-day challenge.

The final two problems will be **more interview-oriented** and will combine the concepts learned throughout the challenge.

```text
30 Days
60 Problems
Java + DSA Fundamentals
```
