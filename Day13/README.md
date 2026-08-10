# ☕ Day 13 - Array Counting & Frequency

Today I practiced counting and frequency-based problems using arrays.

---

## 📚 Topics Learned

- Array Traversal
- Even and Odd Numbers
- Modulus Operator
- Counting Elements
- Frequency of an Element
- Conditional Statements
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Count Even and Odd Numbers

## 📌 Objective

Given an array, count the number of even and odd elements.

## 💻 File

`CountEvenOdd.java`

## ▶️ Sample Input

```text
6
10 15 20 25 30 35
```

## ▶️ Output

```text
Even Count = 3
Odd Count = 3
```

## 📖 How It Works

A number is even when:

```java
number % 2 == 0
```

Otherwise, the number is odd.

For example:

```text
10 → Even
15 → Odd
20 → Even
25 → Odd
30 → Even
35 → Odd
```

## 📖 Concepts Used

- Arrays
- Array Traversal
- `for` Loop
- `if-else`
- Modulus `%`
- Counter Variables

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 🎯 Problem 2: Frequency of an Element

## 📌 Objective

Find how many times a target element occurs in an array.

## 💻 File

`FrequencyOfElement.java`

## ▶️ Sample Input

```text
7
10 20 10 30 10 40 20
10
```

## ▶️ Output

```text
Frequency of 10 = 3
```

## 📖 How It Works

The program checks every element.

```text
10 → Match → frequency = 1
20 → No match
10 → Match → frequency = 2
30 → No match
10 → Match → frequency = 3
40 → No match
20 → No match
```

Therefore:

```text
Frequency = 3
```

## 📖 Concepts Used

- Arrays
- Array Traversal
- Searching
- `for` Loop
- `if` Statement
- Counter Variable

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 🔍 Important Concepts

## 1. Modulus Operator `%`

The `%` operator gives the remainder.

Example:

```text
10 % 2 = 0
11 % 2 = 1
12 % 2 = 0
13 % 2 = 1
```

Therefore:

```java
number % 2 == 0
```

means the number is even.

---

## 2. Counter Variable

A counter stores how many times something happens.

Example:

```java
int count = 0;

count++;
```

Every time the condition is true, the counter increases by 1.

---

## 3. Frequency

Frequency means the number of times an element appears.

Example:

```text
Array:
10 20 10 30 10

Frequency of 10 = 3
```

---

# 🧪 Test Cases

## Count Even and Odd

### Test Case 1

```text
Input:
5
1 2 3 4 5

Output:
Even Count = 2
Odd Count = 3
```

### Test Case 2

```text
Input:
4
2 4 6 8

Output:
Even Count = 4
Odd Count = 0
```

---

## Frequency

### Test Case 1

```text
Input:
6
10 20 10 30 10 40
10

Output:
Frequency of 10 = 3
```

### Test Case 2

```text
Input:
5
1 2 3 4 5
10

Output:
Frequency of 10 = 0
```

---

# ⭐ Bonus Challenge

Try this yourself:

## Find the Number of Positive, Negative and Zero Elements

Example:

```text
Input:
7
10 -5 0 20 -2 0 8

Output:
Positive = 3
Negative = 2
Zero = 2
```



# 📊 Day 13 Progress

- Problems Solved: 2
- Topic: Array Counting & Frequency
- Status: Completed

---

## 🚀 Day 13 Completed ✅
