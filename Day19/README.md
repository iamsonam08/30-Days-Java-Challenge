# ☕ Day 19 - Character Analysis

Today I practiced character classification and frequency-based string problems.

---

## 📚 Topics Learned

- Character Classification
- Uppercase Letters
- Lowercase Letters
- Digits
- Special Characters
- String Traversal
- Character Frequency
- Nested Loops
- Boolean Variables
- `break`
- Time Complexity
- Space Complexity

---

# 🎯 Problem 1: Count Character Types

## 📌 Objective

Count the number of uppercase letters, lowercase letters, digits, and special characters in a string.

## 💻 File

`CharacterTypeCount.java`

## ▶️ Sample Input

```text
Java@123
```

## ▶️ Output

```text
Uppercase = 1
Lowercase = 3
Digits = 3
Special Characters = 1
```

## 📖 How It Works

The program checks every character and determines its type.

### Uppercase

```text
A - Z
```

### Lowercase

```text
a - z
```

### Digits

```text
0 - 9
```

Anything that does not belong to these categories is counted as a special character.

For example:

```text
Java@123
```

contains:

```text
J → Uppercase
a → Lowercase
v → Lowercase
a → Lowercase
@ → Special Character
1 → Digit
2 → Digit
3 → Digit
```

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- Character comparison
- `if-else`
- Counters

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 🎯 Problem 2: First Non-Repeating Character

## 📌 Objective

Find the first character in a string that occurs exactly once.

## 💻 File

`FirstNonRepeatingCharacter.java`

## ▶️ Sample Input

```text
aabbcde
```

## ▶️ Output

```text
First non-repeating character = c
```

## 📖 How It Works

The program checks each character and counts how many times it appears in the entire string.

For:

```text
aabbcde
```

The frequencies are:

```text
a → 2
b → 2
c → 1
d → 1
e → 1
```

The first character whose frequency is `1` is:

```text
c
```

Therefore:

```text
First non-repeating character = c
```

## 📖 Concepts Used

- String Traversal
- Nested Loops
- Character Comparison
- Frequency Counting
- Boolean Variable
- `break`

## ⏱️ Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)

---

# 💡 Important Concepts

## 1. Character Range

Characters can be compared using their character values.

```java
ch >= 'A' && ch <= 'Z'
```

checks for uppercase letters.

```java
ch >= 'a' && ch <= 'z'
```

checks for lowercase letters.

```java
ch >= '0' && ch <= '9'
```

checks for digits.

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

The first loop selects a character.

The second loop counts how many times that character occurs.

---

## 3. Boolean Variable

A boolean stores either:

```text
true
```

or:

```text
false
```

Example:

```java
boolean found = false;
```

When a non-repeating character is found:

```java
found = true;
```

---

## 4. `break`

`break` immediately stops the loop.

In this problem, once the first non-repeating character is found, there is no reason to continue searching.

---

# 🧪 Test Cases

## Character Type Count

### Test Case 1

```text
Input:
Java@123

Output:
Uppercase = 1
Lowercase = 3
Digits = 3
Special Characters = 1
```

### Test Case 2

```text
Input:
HELLO123!

Output:
Uppercase = 5
Lowercase = 0
Digits = 3
Special Characters = 1
```

### Test Case 3

```text
Input:
hello

Output:
Uppercase = 0
Lowercase = 5
Digits = 0
Special Characters = 0
```

---

## First Non-Repeating Character

### Test Case 1

```text
Input:
aabbcde

Output:
First non-repeating character = c
```

### Test Case 2

```text
Input:
aabbcc

Output:
No non-repeating character found
```

### Test Case 3

```text
Input:
swiss

Output:
First non-repeating character = w
```

---

# ⭐ Bonus Challenge

Try solving this yourself:

## Find the First Repeating Character

### Example

```text
Input:
abcdefca

Output:
First repeating character = c
```

### Hint

For every character, check whether it appears again later in the string.

Try it yourself before searching for a solution.

---



# 📊 Day 19 Progress

- Problems Solved: 2
- Topic: Character Analysis
- Status: Completed

---

## 🚀 Day 19 Completed ✅
