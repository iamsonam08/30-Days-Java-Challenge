# ☕ Day 23 - Array Manipulation

Today I practiced two important array manipulation problems:

1. Move all zeros to the end of an array
2. Reverse an array

These problems introduced array manipulation and the two-pointer technique.

---

## 📚 Topics Learned

- Array Traversal
- Array Manipulation
- Moving Elements
- Reversing an Array
- Two Pointer Technique
- Swapping
- `while` Loop
- `for` Loop
- Temporary Variable
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Move All Zeros to the End

## 📌 Objective

Move all zeros to the end of an array while maintaining the original order of non-zero elements.

## 💻 File

`MoveZeros.java`

## ▶️ Sample Input

```text
5
0 1 0 3 12
```

## ▶️ Output

```text
1 3 12 0 0
```

---

## 📖 Explanation

Given:

```text
0 1 0 3 12
```

The non-zero elements are:

```text
1 3 12
```

We place them at the beginning:

```text
1 3 12
```

Then we fill the remaining positions with zeros:

```text
1 3 12 0 0
```

---

## 🧠 Logic

We use an `index` variable:

```java
int index = 0;
```

Whenever we find a non-zero element:

```java
if (arr[i] != 0) {
    arr[index] = arr[i];
    index++;
}
```

After all non-zero elements are placed, we fill the remaining positions with zero.

---

## 📊 Dry Run

Input:

```text
0 1 0 3 12
```

Non-zero elements:

```text
1 3 12
```

After placing them:

```text
1 3 12 _ _
```

Fill remaining positions:

```text
1 3 12 0 0
```

Final output:

```text
1 3 12 0 0
```

---

## 📖 Concepts Used

- Arrays
- Array Traversal
- `for` Loop
- `while` Loop
- Conditional Statements
- Index Variable
- Array Manipulation

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed a constant number of times.

### Space Complexity

```text
O(1)
```

No extra array is created.

---

# 🎯 Problem 2: Reverse an Array

## 📌 Objective

Reverse the elements of an array without using another array.

## 💻 File

`ReverseArray.java`

## ▶️ Sample Input

```text
5
1 2 3 4 5
```

## ▶️ Output

```text
5 4 3 2 1
```

---

## 📖 Explanation

The original array is:

```text
1 2 3 4 5
```

We swap the first element with the last:

```text
1 ↔ 5
```

Array becomes:

```text
5 2 3 4 1
```

Then swap:

```text
2 ↔ 4
```

Array becomes:

```text
5 4 3 2 1
```

The middle element `3` does not need to move.

Final result:

```text
5 4 3 2 1
```

---

## 🧠 Two Pointer Technique

We use two variables:

```java
int left = 0;
int right = n - 1;
```

`left` starts from the beginning.

`right` starts from the end.

Then:

```java
while (left < right)
```

We swap the elements:

```java
int temp = arr[left];

arr[left] = arr[right];

arr[right] = temp;
```

Then move both pointers:

```java
left++;
right--;
```

---

## 📊 Dry Run

Array:

```text
1 2 3 4 5
```

### Step 1

```text
left = 0
right = 4

Swap 1 and 5

5 2 3 4 1
```

### Step 2

```text
left = 1
right = 3

Swap 2 and 4

5 4 3 2 1
```

### Step 3

```text
left = 2
right = 2
```

Stop.

Final:

```text
5 4 3 2 1
```

---

## 📖 Concepts Used

- Arrays
- Two Pointer Technique
- Swapping
- Temporary Variable
- `while` Loop
- Array Traversal

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Each element is processed at most once.

### Space Complexity

```text
O(1)
```

Only a temporary variable is used for swapping.

---

# 💡 Important Concepts

## 1. Two Pointer Technique

The two-pointer technique uses two variables to work with different positions of an array.

Example:

```text
1 2 3 4 5
↑       ↑
left   right
```

We move:

```text
left → 
← right
```

until they meet.

---

## 2. Swapping

To swap two values, we use a temporary variable.

Example:

```java
int temp = a;

a = b;

b = temp;
```

If:

```text
a = 10
b = 20
```

After swapping:

```text
a = 20
b = 10
```

---

## 3. In-Place Modification

An in-place operation modifies the original array instead of creating another array.

For example:

```text
1 2 3 4 5
```

is directly changed to:

```text
5 4 3 2 1
```

This saves extra memory.

---

# 🧪 Test Cases

## Problem 1: Move Zeros

### Test Case 1

```text
Input:
5
0 1 0 3 12

Output:
1 3 12 0 0
```

### Test Case 2

```text
Input:
5
1 2 3 4 5

Output:
1 2 3 4 5
```

### Test Case 3

```text
Input:
5
0 0 1 2 3

Output:
1 2 3 0 0
```

### Test Case 4

```text
Input:
4
0 0 0 0

Output:
0 0 0 0
```

---

# Problem 2: Reverse Array

### Test Case 1

```text
Input:
5
1 2 3 4 5

Output:
5 4 3 2 1
```

### Test Case 2

```text
Input:
4
10 20 30 40

Output:
40 30 20 10
```

### Test Case 3

```text
Input:
1
100

Output:
100
```

### Test Case 4

```text
Input:
5
-1 -2 -3 -4 -5

Output:
-5 -4 -3 -2 -1
```

---

# ⭐ Bonus Challenge

## Move All Negative Numbers to the Beginning

Example:

```text
Input:
1 -2 3 -4 5 -6

Output:
-2 -4 -6 1 3 5
```

Try solving it yourself.

Do not worry about preserving the exact order initially. Focus on understanding how elements can be rearranged.

---

# 🧠 Self-Test Questions

Before moving to Day 24, try answering these:

### Question 1

Why do we use:

```java
int left = 0;
int right = n - 1;
```

in array reversal?

### Question 2

Why is the condition:

```java
while (left < right)
```

used instead of:

```java
while (left <= right)
```

### Question 3

What is the purpose of:

```java
int temp = arr[left];
```

### Question 4

What is the time complexity of reversing an array?

### Question 5

Why is the space complexity `O(1)`?

### Question 6

For:

```text
0 2 0 4 5
```

what will be the output after moving zeros?

---

# ⚠️ Important Learning Point

Do not create another array just to reverse the array.

For example, avoid:

```java
int[] reversed = new int[n];
```

for this problem.

The goal is to learn **in-place** manipulation using two pointers.

This is an important pattern that will appear repeatedly in DSA problems.

---

# 📂 Folder Structure

```text
Day23
│
├── MoveZeros.java
├── ReverseArray.java
└── README.md
```

---

# 📊 Day 23 Progress

- Problems Solved: 2
- Topic: Array Manipulation
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 23 Completed ✅

```text
Progress: 23 / 30 Days
Problems Solved: 46 / 60
```
