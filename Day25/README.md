# ☕ Day 25 - Array Rotation

Today I practiced two important array rotation problems:

1. Left Rotate an Array by One Position
2. Right Rotate an Array by One Position

These problems helped me understand how elements can be shifted and repositioned inside an array.

---

## 📚 Topics Learned

- Arrays
- Array Traversal
- Array Rotation
- Left Rotation
- Right Rotation
- Array Shifting
- Temporary Variables
- `for` Loop
- Index Manipulation
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Left Rotate Array by One Position

## 📌 Objective

Rotate the array one position to the left.

The first element moves to the last position.

## 💻 File

`LeftRotate.java`

## ▶️ Sample Input

```text
5
1 2 3 4 5
```

## ▶️ Output

```text
2 3 4 5 1
```

---

## 📖 Explanation

Original array:

```text
1 2 3 4 5
```

The first element is:

```text
1
```

We temporarily store it:

```java
int first = arr[0];
```

Then shift all remaining elements one position to the left:

```text
2 3 4 5 _
```

Finally, put the first element at the last position:

```text
2 3 4 5 1
```

---

## 🧠 Logic

```java
int first = arr[0];

for (int i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
}

arr[n - 1] = first;
```

The first element is preserved before shifting.

---

## 📊 Dry Run

Input:

```text
1 2 3 4 5
```

Store:

```text
first = 1
```

Shift:

```text
2 3 4 5 _
```

Place first element at the end:

```text
2 3 4 5 1
```

Final output:

```text
2 3 4 5 1
```

---

## 📖 Concepts Used

- Array
- Array Traversal
- Indexing
- Shifting
- Temporary Variable
- `for` Loop

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed once.

### Space Complexity

```text
O(1)
```

Only one extra variable is used.

---

# 🎯 Problem 2: Right Rotate Array by One Position

## 📌 Objective

Rotate the array one position to the right.

The last element moves to the first position.

## 💻 File

`RightRotate.java`

## ▶️ Sample Input

```text
5
1 2 3 4 5
```

## ▶️ Output

```text
5 1 2 3 4
```

---

## 📖 Explanation

Original array:

```text
1 2 3 4 5
```

The last element is:

```text
5
```

We temporarily store it:

```java
int last = arr[n - 1];
```

Then shift all elements one position to the right:

```text
_ 1 2 3 4
```

Finally, put `5` at index `0`:

```text
5 1 2 3 4
```

---

## 🧠 Logic

```java
int last = arr[n - 1];

for (int i = n - 1; i > 0; i--) {
    arr[i] = arr[i - 1];
}

arr[0] = last;
```

The loop moves from **right to left**.

This is important because moving from left to right would overwrite values before they are moved.

---

## 📊 Dry Run

Input:

```text
1 2 3 4 5
```

Store:

```text
last = 5
```

Shift elements:

```text
_ 1 2 3 4
```

Place `5` at the beginning:

```text
5 1 2 3 4
```

Final output:

```text
5 1 2 3 4
```

---

## 📖 Concepts Used

- Array
- Array Traversal
- Indexing
- Shifting
- Temporary Variable
- Reverse Traversal
- `for` Loop

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed once.

### Space Complexity

```text
O(1)
```

Only one extra variable is used.

---

# 💡 Important Concepts

## 1. Array Rotation

Array rotation means moving elements from one position to another while maintaining their relative order.

Example:

```text
Original:
1 2 3 4 5
```

Left rotation:

```text
2 3 4 5 1
```

Right rotation:

```text
5 1 2 3 4
```

---

## 2. Left Rotation

In left rotation:

```text
First element → Last position
```

Example:

```text
1 2 3 4 5
↓
2 3 4 5 1
```

---

## 3. Right Rotation

In right rotation:

```text
Last element → First position
```

Example:

```text
1 2 3 4 5
↓
5 1 2 3 4
```

---

## 4. Why Store an Element?

Before shifting, an important element can be overwritten.

For left rotation:

```java
int first = arr[0];
```

For right rotation:

```java
int last = arr[n - 1];
```

The temporary variable protects that element while the other elements are shifted.

---

## 5. Direction of Shifting

For left rotation:

```java
for (int i = 0; i < n - 1; i++)
```

We move from:

```text
Left → Right
```

For right rotation:

```java
for (int i = n - 1; i > 0; i--)
```

We move from:

```text
Right → Left
```

The direction matters because incorrect shifting can overwrite values.

---

# 🧪 Test Cases

## Problem 1: Left Rotation

### Test Case 1

```text
Input:
5
1 2 3 4 5

Output:
2 3 4 5 1
```

### Test Case 2

```text
Input:
4
10 20 30 40

Output:
20 30 40 10
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
-2 -3 -4 -5 -1
```

---

## Problem 2: Right Rotation

### Test Case 1

```text
Input:
5
1 2 3 4 5

Output:
5 1 2 3 4
```

### Test Case 2

```text
Input:
4
10 20 30 40

Output:
40 10 20 30
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
-5 -1 -2 -3 -4
```

---

# ⭐ Bonus Challenge

## Rotate an Array by K Positions

Try solving:

```text
Input:
6
1 2 3 4 5 6

K = 2
```

Left rotation by `2`:

```text
3 4 5 6 1 2
```

Right rotation by `2`:

```text
5 6 1 2 3 4
```

### Hint

First understand how to rotate by one position.

Then think about how to repeat the operation `K` times.

---

# 🧠 Self-Test Questions

Before moving to Day 26, try answering these:

### Question 1

What happens during a left rotation?

### Question 2

What happens during a right rotation?

### Question 3

Why do we store:

```java
int first = arr[0];
```

before left rotation?

### Question 4

Why does right rotation move from:

```text
n - 1 → 1
```

instead of:

```text
0 → n - 2
```

?

### Question 5

What is the time complexity of one rotation?

### Question 6

What is the space complexity?

### Question 7

What is the result of left rotating:

```text
10 20 30 40
```

?

### Question 8

What is the result of right rotating:

```text
10 20 30 40
```

?

---

# ⚠️ Important Learning Point

Do not create another array for a one-position rotation.

For example, avoid:

```java
int[] newArray = new int[n];
```

The goal is to perform the rotation **in-place** using `O(1)` extra space.

Also remember:

### Left Rotation

```text
Shift → Left
```

### Right Rotation

```text
Shift → Right
```

The direction of traversal is important when shifting array elements.

---

# 📂 Folder Structure

```text
Day25
│
├── LeftRotate.java
├── RightRotate.java
└── README.md
```

---

# 📊 Day 25 Progress

- Problems Solved: 2
- Topic: Array Rotation
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 25 Completed ✅

```text
Progress: 25 / 30 Days
Problems Solved: 50 / 60
```
