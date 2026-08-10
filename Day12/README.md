# ☕ Day 12 - Searching Algorithms

Searching is an important concept in DSA. Today I learned two basic searching algorithms: Linear Search and Binary Search.

---

## 📚 Topics Learned

- Searching in Arrays
- Linear Search
- Binary Search
- Array Traversal
- Sorted Arrays
- `for` Loop
- `while` Loop
- `break` Statement
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Linear Search

## 📌 Objective

Find a target element in an array using Linear Search.

Linear Search checks every element one by one until the target element is found.

## 💻 File

`LinearSearch.java`

## ▶️ Sample Input

```text
5
10 25 30 45 50
45
```

## ▶️ Output

```text
Element found at index: 3
```

## 📖 How It Works

Given:

```text
10  25  30  45  50
0   1   2   3   4
```

If the target is `45`, the program checks:

```text
10 → 25 → 30 → 45
```

The target is found at index `3`.

## 📖 Concepts Used

- Arrays
- Array Traversal
- `for` Loop
- `if` Statement
- `break`
- Linear Search

## ⏱️ Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(1)**

---

# 🎯 Problem 2: Binary Search

## 📌 Objective

Find a target element in a **sorted array** using Binary Search.

Binary Search repeatedly divides the search range into two halves.

## ⚠️ Important

Binary Search requires the array to be **sorted**.

## 💻 File

`BinarySearch.java`

## ▶️ Sample Input

```text
6
10 20 30 40 50 60
40
```

## ▶️ Output

```text
Element found at index: 3
```

## 📖 How It Works

Given:

```text
10  20  30  40  50  60
0   1   2   3   4   5
```

Target:

```text
40
```

First, find the middle element.

```text
10  20  30  40  50  60
          ↑
         mid
```

The middle value is compared with the target.

- If `target == mid` → element found.
- If `target > mid` → search the right half.
- If `target < mid` → search the left half.

This continues until the element is found or the search range becomes empty.

## 📖 Concepts Used

- Arrays
- Sorted Arrays
- `while` Loop
- `if-else`
- `left`
- `right`
- `mid`
- Binary Search

## ⏱️ Complexity

- Time Complexity: **O(log n)**
- Space Complexity: **O(1)**

---

# 🔍 Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|---|---|---|
| Sorted array required? | ❌ No | ✅ Yes |
| Searching method | One by one | Divide into halves |
| Best Time | O(1) | O(1) |
| Worst Time | O(n) | O(log n) |
| Space | O(1) | O(1) |
| Difficulty | Easy | Medium |

---

# 🧪 Test Cases

## Linear Search

### Test Case 1

```text
Input:
5
10 20 30 40 50
30

Output:
Element found at index: 2
```

### Test Case 2

```text
Input:
5
10 20 30 40 50
100

Output:
Element not found
```

### Test Case 3

```text
Input:
5
10 20 30 40 50
10

Output:
Element found at index: 0
```

---

## Binary Search

### Test Case 1

```text
Input:
6
10 20 30 40 50 60
40

Output:
Element found at index: 3
```

### Test Case 2

```text
Input:
6
10 20 30 40 50 60
100

Output:
Element not found
```

### Test Case 3

```text
Input:
6
10 20 30 40 50 60
10

Output:
Element found at index: 0
```

---

# 💡 Important Concepts

## 1. Target

The element that we want to find.

```text
Target = 40
```

---

## 2. Index

The position of an element in an array.

Array:

```text
10 20 30 40 50
```

Indexes:

```text
10 → 0
20 → 1
30 → 2
40 → 3
50 → 4
```

Remember: **Array indexing starts from 0.**

---

## 3. `-1`

We use `-1` when the element is not found.

```java
int index = -1;
```

If the element is found, `index` is updated with its position.

---

## 4. Binary Search Variables

Binary Search commonly uses three variables:

```java
int left = 0;
int right = n - 1;
int mid = left + (right - left) / 2;
```

- `left` → beginning of search range
- `right` → end of search range
- `mid` → middle position

---

# 📚 Key Learnings

- Linear Search checks elements one by one.
- Linear Search works on sorted and unsorted arrays.
- Binary Search works on sorted arrays.
- Binary Search is faster than Linear Search for large sorted arrays.
- Array indexes start from `0`.
- `-1` can represent "element not found".
- Binary Search repeatedly reduces the search space by half.
- `O(log n)` is more efficient than `O(n)` for large inputs.

---

# ⭐ Bonus Challenge

Try solving this problem without looking at a solution.

## Find First Occurrence

Given an array and a target element, find the index of the **first occurrence**.

### Example

```text
Input:
6
10 20 20 20 30 40
20

Output:
First occurrence = 1
```

### Challenge

Try to solve this using your own logic before searching for a solution.

---

# 📂 Folder Structure

```text
Day12
│
├── BinarySearch.java
├── LinearSearch.java
└── README.md
```

---

# 📊 Day 12 Progress

- Problems Solved: **2**
- Topic: **Searching Algorithms**
- Status: **Completed**

---

## 🚀 Day 12 Completed ✅
