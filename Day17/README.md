# ☕ Day 17 - String Counting & Character Frequency

Today I practiced string traversal and counting characters in a String.

---

## 📚 Topics Learned

- String Traversal
- `charAt()`
- `length()`
- Vowels and Consonants
- Character Frequency
- `toLowerCase()`
- Conditional Statements
- Counter Variables

---

# 🎯 Problem 1: Count Vowels and Consonants

## 📌 Objective

Count the number of vowels and consonants present in a string.

## 💻 File

`CountVowelsConsonants.java`

## ▶️ Sample Input

```text
education
```

## ▶️ Output

```text
Vowels = 5
Consonants = 4
```

## 📖 How It Works

The program checks every character in the string.

Vowels are:

```text
a, e, i, o, u
```

Example:

```text
education
```

Characters are checked one by one.

The program counts:

```text
Vowels = 5
Consonants = 4
```

Spaces, numbers and special characters are ignored.

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- `toLowerCase()`
- `for` Loop
- `if-else`
- Counter Variables

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 🎯 Problem 2: Character Frequency

## 📌 Objective

Find how many times a given character occurs in a string.

## 💻 File

`CharacterFrequency.java`

## ▶️ Sample Input

```text
programming
g
```

## ▶️ Output

```text
Frequency of 'g' = 2
```

## 📖 How It Works

The program checks every character and compares it with the target character.

For:

```text
programming
```

Target:

```text
g
```

The character `g` appears two times.

Therefore:

```text
Frequency = 2
```

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- `for` Loop
- Character Comparison
- Counter Variable

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 💡 Important Concepts

## 1. `charAt()`

Used to access a character at a particular index.

```java
String str = "hello";

char ch = str.charAt(1);
```

Output:

```text
e
```

---

## 2. `length()`

Returns the number of characters in a string.

```java
String str = "hello";

System.out.println(str.length());
```

Output:

```text
5
```

---

## 3. `toLowerCase()`

Converts uppercase letters into lowercase letters.

```java
String str = "JAVA";

str = str.toLowerCase();
```

Result:

```text
java
```

This makes checking vowels easier.

---

## 4. Counter Variable

A counter stores how many times something happens.

Example:

```java
int count = 0;

count++;
```

Every time the condition is true, the value increases by 1.

---

# 🧪 Test Cases

## Count Vowels and Consonants

### Test Case 1

```text
Input:
hello

Output:
Vowels = 2
Consonants = 3
```

### Test Case 2

```text
Input:
JAVA

Output:
Vowels = 2
Consonants = 2
```

### Test Case 3

```text
Input:
Hello World

Output:
Vowels = 3
Consonants = 7
```

---

## Character Frequency

### Test Case 1

```text
Input:
programming
g

Output:
Frequency of 'g' = 2
```

### Test Case 2

```text
Input:
banana
a

Output:
Frequency of 'a' = 3
```

### Test Case 3

```text
Input:
hello
z

Output:
Frequency of 'z' = 0
```

---

# ⭐ Bonus Challenge

Try this without looking at a solution:

## Find the First Non-Repeating Character

Example:

```text
Input:
aabbcde

Output:
First non-repeating character = c
```

Try to solve it yourself first.

---

# 📊 Day 17 Progress

- Problems Solved: 2
- Topic: String Counting & Frequency
- Status: Completed

---

## 🚀 Day 17 Completed ✅
