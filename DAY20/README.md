# ☕ Day 20 - Advanced String Basics

Today I practiced duplicate removal and anagram checking using strings.

---

## 📚 Topics Learned

- String Traversal
- Duplicate Characters
- Character Frequency
- Anagrams
- Nested Loops
- Boolean Variables
- Character Arrays
- Frequency Array
- `toLowerCase()`
- `return`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Remove Duplicate Characters

## 📌 Objective

Remove duplicate characters from a string while keeping the first occurrence of every character.

## 💻 File

`RemoveDuplicateCharacters.java`

## ▶️ Sample Input

```text
programming
```

## ▶️ Output

```text
String after removing duplicates = progamin
```

## 📖 How It Works

The program checks each character.

If the character has not appeared in the result, it is added.

For example:

```text
programming
```

The characters are processed as:

```text
p → keep
r → keep
o → keep
g → keep
r → duplicate
a → keep
m → keep
m → duplicate
i → keep
n → keep
g → duplicate
```

Final result:

```text
progamin
```

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- Nested Loops
- Boolean Variable
- String Concatenation

## ⏱️ Complexity

- Time Complexity: O(n²)
- Space Complexity: O(n)

---

# 🎯 Problem 2: Check Anagram

## 📌 Objective

Check whether two strings are anagrams.

Two strings are anagrams when they contain the same characters with the same frequency, but the order can be different.

## 💻 File

`CheckAnagram.java`

## ▶️ Sample Input

```text
listen
silent
```

## ▶️ Output

```text
Anagram
```

## 📖 How It Works

Consider:

```text
listen
silent
```

Both strings contain:

```text
l → 1
i → 1
s → 1
t → 1
e → 1
n → 1
```

Therefore, they are anagrams.

The program uses a frequency array.

For every character in the first string:

```java
frequency[str1.charAt(i)]++;
```

For every character in the second string:

```java
frequency[str2.charAt(i)]--;
```

If the strings contain exactly the same characters with the same frequencies, all frequency values become `0`.

Therefore:

```text
Anagram
```

## 📖 Concepts Used

- String
- Character Frequency
- Array
- `charAt()`
- `toLowerCase()`
- Boolean Variable
- `return`

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

The frequency array has a fixed size of 256, so its space usage is considered constant.

---

# 💡 Important Concepts

## 1. Duplicate Character

A character that appears more than once.

Example:

```text
programming
```

Repeated characters:

```text
r
g
m
```

---

## 2. Anagram

Two strings containing the same characters with the same frequencies.

Examples:

```text
listen → silent
earth → heart
```

Both are anagrams.

---

## 3. Frequency Array

A frequency array stores how many times each character appears.

Example:

```text
a → 3
b → 1
c → 2
```

In Java:

```java
int[] frequency = new int[256];
```

---

## 4. `toLowerCase()`

Converts uppercase letters into lowercase letters.

Example:

```java
"JAVA".toLowerCase()
```

Result:

```text
java
```

This makes the anagram comparison case-insensitive.

---

# 🧪 Test Cases

## Remove Duplicate Characters

### Test Case 1

```text
Input:
programming

Output:
String after removing duplicates = progamin
```

### Test Case 2

```text
Input:
hello

Output:
String after removing duplicates = helo
```

### Test Case 3

```text
Input:
aaaaa

Output:
String after removing duplicates = a
```

---

## Check Anagram

### Test Case 1

```text
Input:
listen
silent

Output:
Anagram
```

### Test Case 2

```text
Input:
hello
world

Output:
Not Anagram
```

### Test Case 3

```text
Input:
triangle
integral

Output:
Anagram
```

### Test Case 4

```text
Input:
Java
java

Output:
Anagram
```

---

# ⭐ Bonus Challenge

Try this yourself:

## Check Whether a String Contains Only Unique Characters

### Example 1

```text
Input:
abcdef

Output:
All characters are unique
```

### Example 2

```text
Input:
hello

Output:
Duplicate characters exist
```

### Hint

Use the same basic idea you used in the duplicate-removal problem.

---

# 📂 Folder Structure

```text
Day20
│
├── RemoveDuplicateCharacters.java
├── CheckAnagram.java
└── README.md
```

---

# 📊 Day 20 Progress

- Problems Solved: 2
- Topic: Advanced String Basics
- Status: Completed

---

## 🚀 Day 20 Completed ✅
