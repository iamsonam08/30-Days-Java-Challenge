# ☕ Day 28 - String Character Analysis

Today I practiced two string problems:

1. Count vowels, consonants, digits and spaces
2. Find the first non-repeating character

These problems helped me understand character classification, frequency counting and string traversal.

---

## 📚 Topics Learned

- Strings
- Character Traversal
- `charAt()`
- `length()`
- Character Classification
- Vowels
- Consonants
- Digits
- Spaces
- Frequency Counting
- Nested Loops
- `Character.toLowerCase()`
- `break`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Count Vowels, Consonants, Digits & Spaces

## 📌 Objective

Count the number of:

- Vowels
- Consonants
- Digits
- Spaces

in a given String.

## 💻 File

`CountCharacters.java`

---

## ▶️ Sample Input

```text
Hello Java 123
```

## ▶️ Output

```text
Vowels = 4
Consonants = 5
Digits = 3
Spaces = 2
```

---

## 📖 Explanation

The String is:

```text
Hello Java 123
```

Characters are classified into different categories.

### Vowels

```text
e
o
a
a
```

Total:

```text
4
```

### Consonants

```text
H
l
l
J
v
```

Total:

```text
5
```

### Digits

```text
1
2
3
```

Total:

```text
3
```

### Spaces

There are two spaces:

```text
Hello_Java_123
```

Total:

```text
2
```

---

## 🧠 Logic

We traverse the String character by character:

```java
for (int i = 0; i < str.length(); i++)
```

Then get the current character:

```java
char ch = Character.toLowerCase(str.charAt(i));
```

We check whether it is a vowel:

```java
if (ch == 'a' || ch == 'e' || ch == 'i' ||
    ch == 'o' || ch == 'u')
```

If it is between `a` and `z`, it is a consonant:

```java
else if (ch >= 'a' && ch <= 'z')
```

If it is between `0` and `9`, it is a digit:

```java
else if (ch >= '0' && ch <= '9')
```

If it is a space:

```java
else if (ch == ' ')
```

---

## 📖 Concepts Used

- String
- Character
- `charAt()`
- `length()`
- `Character.toLowerCase()`
- Conditional Statements
- `for` Loop
- Counters

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Each character is processed once.

### Space Complexity

```text
O(1)
```

Only counters and a character variable are used.

---

# 🎯 Problem 2: First Non-Repeating Character

## 📌 Objective

Find the first character that appears exactly once in a String.

## 💻 File

`FirstNonRepeatingCharacter.java`

---

## ▶️ Sample Input

```text
aabbcdde
```

## ▶️ Output

```text
First Non-Repeating Character = c
```

---

## 📖 Explanation

For:

```text
aabbcdde
```

The frequencies are:

```text
a → 2
b → 2
c → 1
d → 2
e → 1
```

The first character whose frequency is `1` is:

```text
c
```

Therefore:

```text
First Non-Repeating Character = c
```

---

## 🧠 Logic

For every character, we count how many times it occurs.

Example:

```java
int count = 0;

for (int j = 0; j < str.length(); j++) {

    if (str.charAt(i) == str.charAt(j)) {
        count++;
    }
}
```

If:

```java
count == 1
```

then the character is non-repeating.

We store it:

```java
result = str.charAt(i);
```

Then stop searching:

```java
break;
```

Because we only need the **first** non-repeating character.

---

## 📊 Dry Run

Input:

```text
aabbcdde
```

### Character 1

```text
a → 2
```

Not the answer.

### Character 2

```text
b → 2
```

Not the answer.

### Character 3

```text
c → 1
```

Found.

Therefore:

```text
c
```

---

## 📖 Concepts Used

- String Traversal
- Nested Loops
- Character Comparison
- Frequency Counting
- Counter
- `break`
- `charAt()`

---

## ⏱️ Complexity

### Time Complexity

```text
O(n²)
```

For every character, we may scan the entire String again.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# 💡 Important Concepts

## 1. Character Classification

Characters can be classified as:

```text
Vowel
Consonant
Digit
Space
```

Example:

```text
A → Vowel
B → Consonant
7 → Digit
' ' → Space
```

---

## 2. Frequency

Frequency means how many times a character appears.

Example:

```text
banana
```

Frequency:

```text
b → 1
a → 3
n → 2
```

---

## 3. Non-Repeating Character

A non-repeating character appears exactly once.

Example:

```text
aabbcdd
```

Here:

```text
c → 1
```

Therefore:

```text
c
```

is non-repeating.

---

## 4. `break`

The `break` statement immediately stops a loop.

Example:

```java
if (count == 1) {
    result = str.charAt(i);
    break;
}
```

Once the first non-repeating character is found, there is no need to continue.

---

## 5. `Character.toLowerCase()`

This converts a character to lowercase.

Example:

```java
char ch = Character.toLowerCase('A');
```

Result:

```text
a
```

This allows uppercase and lowercase letters to be handled consistently.

---

# 🧪 Test Cases

## Problem 1: Count Characters

### Test Case 1

```text
Input:
Hello Java 123

Output:
Vowels = 4
Consonants = 5
Digits = 3
Spaces = 2
```

### Test Case 2

```text
Input:
Java

Output:
Vowels = 2
Consonants = 2
Digits = 0
Spaces = 0
```

### Test Case 3

```text
Input:
12345

Output:
Vowels = 0
Consonants = 0
Digits = 5
Spaces = 0
```

### Test Case 4

```text
Input:
Hello World

Output:
Vowels = 3
Consonants = 7
Digits = 0
Spaces = 1
```

---

# Problem 2: First Non-Repeating Character

### Test Case 1

```text
Input:
aabbcdde

Output:
First Non-Repeating Character = c
```

### Test Case 2

```text
Input:
aabbcc

Output:
No non-repeating character found.
```

### Test Case 3

```text
Input:
swiss

Output:
First Non-Repeating Character = w
```

### Test Case 4

```text
Input:
abcdef

Output:
First Non-Repeating Character = a
```

---

# ⭐ Bonus Challenge

## Find the First Repeating Character

Example:

```text
Input:
abcdefca
```

Output:

```text
First Repeating Character = c
```

### Hint

Instead of:

```text
count == 1
```

look for:

```text
count > 1
```

But be careful: "first repeating character" can be interpreted in different ways. For this challenge, return the first character in left-to-right order whose total frequency is greater than `1`.

---

# 🧠 Self-Test Questions

Before moving to Day 29, try answering:

### Question 1

What is the difference between a vowel and a consonant?

### Question 2

What does `charAt(i)` return?

### Question 3

What does `length()` return?

### Question 4

What does frequency mean?

### Question 5

What is a non-repeating character?

### Question 6

Why do we use `break` after finding the first non-repeating character?

### Question 7

What is the time complexity of `FirstNonRepeatingCharacter.java`?

### Question 8

For:

```text
programming
```

what is the first non-repeating character?

---

# ⚠️ Important Learning Point

The solution for finding the first non-repeating character uses:

```text
O(n²)
```

because it uses nested loops.

This is fine for learning the basic logic.

Later, we can optimize this using a frequency array or `HashMap` and reduce the time complexity to approximately:

```text
O(n)
```

Do not jump directly to `HashMap`. First understand why the basic solution works.

---

# 📂 Folder Structure

```text
Day28
│
├── CountCharacters.java
├── FirstNonRepeatingCharacter.java
└── README.md
```

---

# 📊 Day 28 Progress

- Problems Solved: 2
- Topic: String Character Analysis
- Difficulty: Easy → Medium
- Status: Completed

---

# 🚀 Day 28 Completed ✅

```text
Progress: 28 / 30 Days
Problems Solved: 56 / 60
```
