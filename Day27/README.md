# ☕ Day 27 - Strings

Today I started solving basic string problems.

Problems solved:

1. Reverse a String
2. Check Whether a String is a Palindrome

These problems introduced string traversal, character access, comparison, and the two-pointer technique.

---

## 📚 Topics Learned

- Strings
- String Traversal
- `String`
- `charAt()`
- `length()`
- Character Comparison
- String Reversal
- Palindrome
- Two Pointer Technique
- `while` Loop
- `boolean`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Reverse a String

## 📌 Objective

Reverse the characters of a given string.

## 💻 File

`ReverseString.java`

## ▶️ Sample Input

```text
Hello
```

## ▶️ Output

```text
olleH
```

---

## 📖 Explanation

For:

```text
Hello
```

We start from the last character and move towards the first character:

```text
o → l → l → e → H
```

Therefore:

```text
olleH
```

---

## 🧠 Logic

We use:

```java
for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
}
```

`str.length() - 1` gives the index of the last character.

`charAt(i)` gives the character at index `i`.

---

## 📊 Example

String:

```text
Java
```

Indexes:

```text
J  a  v  a
0  1  2  3
```

Start from index `3`:

```text
a
```

Then:

```text
v
```

Then:

```text
a
```

Then:

```text
J
```

Final:

```text
avaJ
```

---

## 📖 Concepts Used

- String
- String Indexing
- `length()`
- `charAt()`
- `for` Loop
- Character Traversal

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Every character is processed once.

### Space Complexity

```text
O(n)
```

A new reversed string is created.

---

# 🎯 Problem 2: Check Palindrome

## 📌 Objective

Check whether a string reads the same from left to right and right to left.

## 💻 File

`CheckPalindrome.java`

---

## ▶️ Sample Input

```text
madam
```

## ▶️ Output

```text
Palindrome
```

---

## 📖 Explanation

A palindrome remains the same when reversed.

Examples:

```text
madam
level
radar
racecar
```

Not palindromes:

```text
hello
java
computer
```

---

## 🧠 Logic

We use two pointers:

```java
int left = 0;
int right = str.length() - 1;
```

Then compare:

```java
str.charAt(left)
```

with:

```java
str.charAt(right)
```

If they are different:

```java
isPalindrome = false;
```

If they are equal, move both pointers:

```java
left++;
right--;
```

---

## 📊 Dry Run

String:

```text
madam
```

### Step 1

```text
m a d a m
↑       ↑
L       R
```

```text
m == m
```

Match.

---

### Step 2

```text
m a d a m
  ↑   ↑
  L   R
```

```text
a == a
```

Match.

---

### Step 3

Pointers reach:

```text
d
```

No more comparison is required.

Therefore:

```text
Palindrome
```

---

## 📖 Concepts Used

- Strings
- `charAt()`
- `length()`
- Two Pointer Technique
- `while` Loop
- Boolean Variable
- Character Comparison

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

At most half of the characters are compared.

### Space Complexity

```text
O(1)
```

No additional string or array is required.

---

# 💡 Important Concepts

## 1. String

A String is a sequence of characters.

Example:

```text
"Java"
```

contains:

```text
J a v a
```

---

## 2. `length()`

Returns the number of characters.

Example:

```java
String str = "Java";

System.out.println(str.length());
```

Output:

```text
4
```

---

## 3. `charAt()`

Returns the character at a specific index.

Example:

```java
String str = "Java";

System.out.println(str.charAt(0));
```

Output:

```text
J
```

---

## 4. String Indexing

For:

```text
Java
```

the indexes are:

```text
J  a  v  a
0  1  2  3
```

The last index is:

```text
length - 1
```

So:

```java
str.charAt(str.length() - 1)
```

returns the last character.

---

## 5. Palindrome

A palindrome is a word or sequence that remains the same when reversed.

Example:

```text
level
```

Reverse:

```text
level
```

Therefore:

```text
Palindrome
```

---

# 🧪 Test Cases

## Problem 1: Reverse String

### Test Case 1

```text
Input:
Hello

Output:
olleH
```

### Test Case 2

```text
Input:
Java

Output:
avaJ
```

### Test Case 3

```text
Input:
12345

Output:
54321
```

### Test Case 4

```text
Input:
a

Output:
a
```

---

## Problem 2: Palindrome

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
racecar

Output:
Palindrome
```

### Test Case 4

```text
Input:
level

Output:
Palindrome
```

---

# ⭐ Bonus Challenge

## Check Palindrome Ignoring Case

Try:

```text
Madam
```

Your program should return:

```text
Palindrome
```

Hint:

Use:

```java
str.toLowerCase()
```

before checking.

---

# 🧠 Self-Test Questions

Before moving to Day 28, try answering these:

### Question 1

What does `length()` return?

### Question 2

What does `charAt(0)` return for:

```text
Java
```

?

### Question 3

What is the last index of a String of length `n`?

### Question 4

What is a palindrome?

### Question 5

Why do we use two pointers for palindrome checking?

### Question 6

What is the time complexity of palindrome checking?

### Question 7

What is the difference between:

```java
str.charAt(i)
```

and:

```java
str.length()
```

?

### Question 8

Is this a palindrome?

```text
12321
```

---

# ⚠️ Important Learning Point

Do not confuse a **String** with a **character**.

```java
String str = "Java";
```

is a String.

But:

```java
char ch = 'J';
```

is a single character.

Notice:

```text
"Java" → String
'J'    → char
```

Double quotes are generally used for Strings, while single quotes are used for a single `char`.

---

# 📂 Folder Structure

```text
Day27
│
├── ReverseString.java
├── CheckPalindrome.java
└── README.md
```

---

# 📊 Day 27 Progress

- Problems Solved: 2
- Topic: Strings
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 27 Completed ✅

```text
Progress: 27 / 30 Days
Problems Solved: 54 / 60
```
