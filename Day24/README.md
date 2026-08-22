# ☕ Day 24 - Frequency & Duplicate Elements

Today I practiced two important array problems:

1. Find the frequency of each element
2. Find duplicate elements

These problems helped me understand how to count occurrences and detect repeated values in an array.

---

## 📚 Topics Learned

- Arrays
- Array Traversal
- Frequency Counting
- Duplicate Detection
- Nested Loops
- Boolean Arrays
- `visited[]`
- Conditional Statements
- `continue`
- Counters
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Find Frequency of Each Element

## 📌 Objective

Find how many times each element occurs in an array.

## 💻 File

`FrequencyOfElements.java`

## ▶️ Sample Input

```text
8
1 2 2 3 1 4 2 3
```

## ▶️ Output

```text
Frequency of elements:
1 → 2
2 → 3
3 → 2
4 → 1
```

---

## 📖 Explanation

Given array:

```text
1 2 2 3 1 4 2 3
```

Count each element:

```text
1 → 2 times
2 → 3 times
3 → 2 times
4 → 1 time
```

Therefore:

```text
1 → 2
2 → 3
3 → 2
4 → 1
```

---

## 🧠 Logic

We use a boolean array:

```java
boolean[] visited = new boolean[n];
```

Initially:

```text
false false false false false false false false
```

When an element has already been counted, we mark its position as:

```text
true
```

Then we skip it:

```java
if (visited[i]) {
    continue;
}
```

For every new element, we count its occurrences using another loop.

---

## 📊 Dry Run

Array:

```text
1 2 2 3 1 4 2 3
```

Start with:

```text
1
```

Find another `1`:

```text
1 → 2 times
```

Then:

```text
2
```

Find all `2`s:

```text
2 → 3 times
```

Then:

```text
3
```

Result:

```text
3 → 2 times
```

Finally:

```text
4 → 1 time
```

---

## 📖 Concepts Used

- Arrays
- Nested Loops
- Boolean Array
- `visited[]`
- Counter
- `continue`
- Comparison

---

## ⏱️ Complexity

### Time Complexity

```text
O(n²)
```

In the worst case, each element may be compared with many other elements.

### Space Complexity

```text
O(n)
```

We use a boolean `visited[]` array.

---

# 🎯 Problem 2: Find Duplicate Elements

## 📌 Objective

Find all elements that occur more than once in an array.

## 💻 File

`FindDuplicates.java`

## ▶️ Sample Input

```text
8
1 2 2 3 1 4 2 3
```

## ▶️ Output

```text
Duplicate elements:
1
2
3
```

---

## 📖 Explanation

Given:

```text
1 2 2 3 1 4 2 3
```

The frequencies are:

```text
1 → 2
2 → 3
3 → 2
4 → 1
```

Elements with frequency greater than `1` are duplicates:

```text
1
2
3
```

---

## 🧠 Logic

We count the occurrence of every element.

If:

```text
count > 1
```

then that element is a duplicate.

Example:

```java
if (count > 1) {
    System.out.println(arr[i]);
}
```

The `visited[]` array prevents printing the same duplicate multiple times.

---

## 📊 Dry Run

For:

```text
1 2 2 3 1 4 2 3
```

Element:

```text
1
```

Count:

```text
2
```

So:

```text
1 = Duplicate
```

Element:

```text
2
```

Count:

```text
3
```

So:

```text
2 = Duplicate
```

Element:

```text
3
```

Count:

```text
2
```

So:

```text
3 = Duplicate
```

Element:

```text
4
```

Count:

```text
1
```

So it is not a duplicate.

Final:

```text
1
2
3
```

---

## 📖 Concepts Used

- Arrays
- Nested Loops
- Boolean Array
- Frequency Counting
- Conditional Statements
- `continue`
- Counter

---

## ⏱️ Complexity

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(n)
```

---

# 💡 Important Concepts

## 1. Frequency

Frequency means the number of times an element appears.

Example:

```text
2 3 2 4 2
```

Frequency of `2`:

```text
3
```

Frequency of `3`:

```text
1
```

Frequency of `4`:

```text
1
```

---

## 2. Duplicate

A duplicate is an element that appears more than once.

Example:

```text
10 20 10 30 20
```

Duplicates:

```text
10
20
```

---

## 3. Boolean Array

A boolean variable can have two values:

```text
true
false
```

Example:

```java
boolean[] visited = new boolean[n];
```

It helps us remember whether an element has already been processed.

---

## 4. `visited[]`

Suppose:

```text
arr = 1 2 2 3
```

After processing the second `2`, we mark its position as visited.

Then when the loop reaches that position again:

```java
if (visited[i]) {
    continue;
}
```

The program skips it.

This prevents duplicate processing.

---

## 5. `continue`

The `continue` statement skips the current iteration of a loop.

Example:

```java
for (int i = 0; i < n; i++) {

    if (visited[i]) {
        continue;
    }

    // remaining code
}
```

If `visited[i]` is `true`, the remaining code for that iteration is skipped.

---

# 🧪 Test Cases

## Problem 1: Frequency

### Test Case 1

```text
Input:
8
1 2 2 3 1 4 2 3

Output:
1 → 2
2 → 3
3 → 2
4 → 1
```

### Test Case 2

```text
Input:
5
10 10 10 20 20

Output:
10 → 3
20 → 2
```

### Test Case 3

```text
Input:
5
1 2 3 4 5

Output:
1 → 1
2 → 1
3 → 1
4 → 1
5 → 1
```

### Test Case 4

```text
Input:
6
5 5 7 7 7 8

Output:
5 → 2
7 → 3
8 → 1
```

---

# Problem 2: Duplicate Elements

### Test Case 1

```text
Input:
8
1 2 2 3 1 4 2 3

Output:
1
2
3
```

### Test Case 2

```text
Input:
5
10 20 30 40 50

Output:
No duplicate elements found.
```

### Test Case 3

```text
Input:
6
5 5 7 7 7 8

Output:
5
7
```

### Test Case 4

```text
Input:
5
1 1 1 1 1

Output:
1
```

---

# ⭐ Bonus Challenge

## Find the Most Frequent Element

Try solving this problem yourself.

### Example

```text
Input:
7
1 2 2 3 2 4 1
```

Output:

```text
Most Frequent Element = 2
Frequency = 3
```

### Hint

Use the same frequency-counting logic.

Keep track of:

```text
maxFrequency
mostFrequentElement
```

Whenever the current frequency becomes greater than `maxFrequency`, update both.

---

# 🧠 Self-Test Questions

Before moving to Day 25, try answering these:

### Question 1

What does frequency mean?

### Question 2

What is a duplicate element?

### Question 3

Why do we use:

```java
boolean[] visited
```

?

### Question 4

What does:

```java
continue;
```

do?

### Question 5

What is the time complexity of the frequency solution?

### Question 6

Why is the space complexity `O(n)`?

### Question 7

For:

```text
1 2 2 3 3 3 4
```

what is the frequency of `3`?

### Question 8

For:

```text
10 20 10 30 20
```

what are the duplicate elements?

---

# ⚠️ Important Learning Point

There are faster ways to solve frequency and duplicate problems using data structures such as:

```text
HashMap
HashSet
```

For example, a `HashMap` can store:

```text
Element → Frequency
```

However, we are first solving the problem using basic arrays and loops.

This builds the **fundamental** logic required before learning advanced data structures.

---

# 📂 Folder Structure

```text
Day24
│
├── FrequencyOfElements.java
├── FindDuplicates.java
└── README.md
```

---

# 📊 Day 24 Progress

- Problems Solved: 2
- Topic: Frequency & Duplicate Elements
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 24 Completed ✅

```text
Progress: 24 / 30 Days
Problems Solved: 48 / 60
```
