# ☕ Day 16 - Strings Basics

Today I started learning Strings in Java and practiced basic string manipulation.

---

## 📚 Topics Learned

- Strings
- String input
- `String`
- `length()`
- `charAt()`
- `equals()`
- String Traversal
- String Reversal
- Palindrome

---

# 🎯 Problem 1: Reverse a String

## 📌 Objective

Reverse a given string and print the reversed string.

## 💻 File

`ReverseString.java`

## ▶️ Sample Input

```text
hello
```

## ▶️ Output

```text
Reversed String = olleh
```

## 📖 How It Works

The program starts from the last character of the string and moves toward the first character.

For example:

```text
hello

Index:
0 1 2 3 4

Characters:
h e l l o
```

The program reads:

```text
o → l → l → e → h
```

Therefore:

```text
olleh
```

## 📖 Concepts Used

- String
- `length()`
- `charAt()`
- `for` Loop
- String Traversal

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

---

# 🎯 Problem 2: Check Palindrome String

## 📌 Objective

Check whether a string is a palindrome.

A palindrome is a string that remains the same when reversed.

## 💻 File

`PalindromeString.java`

## ▶️ Sample Input

```text
madam
```

## ▶️ Output

```text
Palindrome
```

## 📖 Examples

```text
madam → Palindrome
level → Palindrome
radar → Palindrome
hello → Not Palindrome
java → Not Palindrome
```

## 📖 How It Works

For:

```text
madam
```

Reverse:

```text
madam
```

Original and reverse are equal.

Therefore:

```text
Palindrome
```

For:

```text
hello
```

Reverse:

```text
olleh
```

They are different.

Therefore:

```text
Not Palindrome
```

## 📖 Concepts Used

- String
- `length()`
- `charAt()`
- `equals()`
- `for` Loop
- String Reversal

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

---

# 💡 Important String Methods

## 1. `length()`

Returns the number of characters.

```java
String str = "hello";

System.out.println(str.length());
```

Output:

```text
5
```

---

## 2. `charAt()`

Returns the character at a particular index.

```java
String str = "hello";

System.out.println(str.charAt(1));
```

Output:

```text
e
```

---

## 3. `equals()`

Compares two strings.

```java
String a = "hello";
String b = "hello";

System.out.println(a.equals(b));
```

Output:

```text
true
```

### ⚠️ Important

For comparing String values, use:

```java
a.equals(b)
```

instead of:

```java
a == b
```

---

# 🧪 Test Cases

## Reverse String

### Test Case 1

```text
Input:
hello

Output:
Reversed String = olleh
```

### Test Case 2

```text
Input:
java

Output:
Reversed String = avaj
```

### Test Case 3

```text
Input:
12345

Output:
Reversed String = 54321
```

---

## Palindrome String

### Test Case 1

```text
Input:
madam

Output:
Palindrome
```

### Test Case 2

```text
Input:
hello

Output:
Not Palindrome
```

### Test Case 3

```text
Input:
level

Output:
Palindrome
```

---

# ⭐ Bonus Challenge

Try solving this without looking at a solution:

## Count Vowels in a String

Example:

```text
Input:
education

Output:
Vowels = 5
```

Count:

```text
a, e, i, o, u
```

Try to solve it using a loop and `charAt()`.

---

# 📂 Folder Structure

```text
Day16
│
├── ReverseString.java
├── PalindromeString.java
└── README.md
```

---

# 📊 Day 16 Progress

- Problems Solved: 2
- Topic: Strings Basics
- Status: Completed

---

## 🚀 Day 16 Completed ✅
