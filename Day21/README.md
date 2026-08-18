# ☕ Day 21 - Substrings & Word Problems

Today I practiced substring searching and finding the longest word in a sentence.

---

## 📚 Topics Learned

- Substrings
- String Searching
- Nested Loops
- Character Comparison
- Word Traversal
- String Length
- Boolean Variables
- `charAt()`
- `length()`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Check Substring

## 📌 Objective

Check whether a given target string exists inside another string.

## 💻 File

`CheckSubstring.java`

## ▶️ Sample Input

```text
Java Programming
Programming
```

## ▶️ Output

```text
Substring Found
```

## 📖 How It Works

The program compares the target string with different positions of the main string.

For example:

```text
Main String:
Java Programming

Target:
Programming
```

The program checks whether all characters of `Programming`
match consecutive characters in the main string.

If all characters match:

```text
Substring Found
```

Otherwise:

```text
Substring Not Found
```

## 📖 Concepts Used

- String Traversal
- Nested Loops
- `charAt()`
- Character Comparison
- Boolean Variable
- `break`

## ⏱️ Complexity

- Time Complexity: O(n × m)
- Space Complexity: O(1)

Where:

- `n` = length of main string
- `m` = length of target string

---

# 🎯 Problem 2: Find Longest Word

## 📌 Objective

Find the longest word from a given sentence.

## 💻 File

`LongestWord.java`

## ▶️ Sample Input

```text
I love programming
```

## ▶️ Output

```text
Longest word = programming
Length = 11
```

## 📖 How It Works

The program reads the sentence character by character.

When it encounters a space, the current word is complete.

It compares the current word with the longest word found so far.

Example:

```text
I
love
programming
```

Lengths:

```text
I → 1
love → 4
programming → 11
```

Therefore:

```text
Longest word = programming
```

## 📖 Concepts Used

- String Traversal
- `charAt()`
- `length()`
- `for` Loop
- String Concatenation
- Comparison

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

---

# 💡 Important Concepts

## 1. Substring

A substring is a continuous part of a string.

Example:

```text
Programming
```

Some substrings are:

```text
Pro
gram
ming
Programming
```

But:

```text
Pmg
```

is not a substring because its characters are not continuous.

---

## 2. Nested Loop

A loop inside another loop is called a nested loop.

Example:

```java
for (...) {

    for (...) {

    }
}
```

The outer loop chooses a starting position.

The inner loop compares characters.

---

## 3. `charAt()`

Returns the character at a particular index.

```java
String str = "Java";

System.out.println(str.charAt(2));
```

Output:

```text
v
```

---

## 4. `length()`

Returns the number of characters.

```java
String str = "Java";

System.out.println(str.length());
```

Output:

```text
4
```

---

# 🧪 Test Cases

## Check Substring

### Test Case 1

```text
Input:
Java Programming
Programming

Output:
Substring Found
```

### Test Case 2

```text
Input:
Hello World
Java

Output:
Substring Not Found
```

### Test Case 3

```text
Input:
abcdef
cde

Output:
Substring Found
```

---

## Longest Word

### Test Case 1

```text
Input:
I love programming

Output:
Longest word = programming
Length = 11
```

### Test Case 2

```text
Input:
Java is powerful

Output:
Longest word = powerful
Length = 8
```

### Test Case 3

```text
Input:
Hello

Output:
Longest word = Hello
Length = 5
```

---

# ⭐ Bonus Challenge

Try solving this yourself:

## Find the Number of Occurrences of a Substring

Example:

```text
Input:
banana
ana

Output:
Occurrences = 2
```

Try to solve it without using:

```java
contains()
indexOf()
```

This will strengthen your substring logic.

---

# 📂 Folder Structure

```text
Day21
│
├── CheckSubstring.java
├── LongestWord.java
└── README.md
```

---

# 📊 Day 21 Progress

- Problems Solved: 2
- Topic: Substrings & Word Problems
- Status: Completed

---

## 🚀 Day 21 Completed ✅
