# ☕ Day 18 - String Manipulation

Today I practiced basic string manipulation and learned how to work with spaces and words in a sentence.

---

## 📚 Topics Learned

- String Traversal
- `charAt()`
- `length()`
- `trim()`
- `isEmpty()`
- Removing spaces
- Counting words
- Conditional Statements
- Counter Variables

---

# 🎯 Problem 1: Remove Spaces from a String

## 📌 Objective

Remove all spaces from a given string and print the resulting string.

## 💻 File

`RemoveSpaces.java`

## ▶️ Sample Input

```text
Java is easy
```

## ▶️ Output

```text
String without spaces = Javaiseasy
```

## 📖 How It Works

The program checks every character in the string.

If the character is not a space, it is added to the result.

For example:

```text
Java is easy
```

Characters:

```text
J a v a _ i s _ e a s y
```

Spaces are ignored.

Result:

```text
Javaiseasy
```

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- `for` Loop
- Character Comparison
- String Concatenation

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

---

# 🎯 Problem 2: Count Words in a String

## 📌 Objective

Count the number of words present in a sentence.

## 💻 File

`CountWords.java`

## ▶️ Sample Input

```text
Java is very easy
```

## ▶️ Output

```text
Number of words = 4
```

## 📖 How It Works

A simple way to count words is to count the spaces between them.

For:

```text
Java is very easy
```

There are:

```text
Java → is → very → easy
```

So there are 4 words.

The program starts with:

```java
words = 1;
```

and increases the count whenever it finds a space.

For an empty string, the answer is:

```text
0
```

## 📖 Concepts Used

- String
- `charAt()`
- `length()`
- `trim()`
- `isEmpty()`
- `for` Loop
- Counter Variable

## ⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

# 💡 Important String Methods

## 1. `charAt()`

Returns the character at a particular index.

```java
String str = "Java";

System.out.println(str.charAt(1));
```

Output:

```text
a
```

---

## 2. `length()`

Returns the number of characters in a string.

```java
String str = "Java";

System.out.println(str.length());
```

Output:

```text
4
```

---

## 3. `trim()`

Removes spaces from the beginning and end of a string.

Example:

```java
String str = "   Java is easy   ";

str = str.trim();
```

Result:

```text
Java is easy
```

---

## 4. `isEmpty()`

Checks whether a string contains no characters.

Example:

```java
String str = "";

System.out.println(str.isEmpty());
```

Output:

```text
true
```

---

# 🧪 Test Cases

## Remove Spaces

### Test Case 1

```text
Input:
Java is easy

Output:
String without spaces = Javaiseasy
```

### Test Case 2

```text
Input:
Hello World

Output:
String without spaces = HelloWorld
```

### Test Case 3

```text
Input:
I love Java

Output:
String without spaces = IloveJava
```

---

## Count Words

### Test Case 1

```text
Input:
Java is easy

Output:
Number of words = 3
```

### Test Case 2

```text
Input:
I love programming

Output:
Number of words = 3
```

### Test Case 3

```text
Input:
Java

Output:
Number of words = 1
```

### Test Case 4

```text
Input:

Output:
Number of words = 0
```

---

# ⭐ Bonus Challenge

Try solving this yourself:

## Count the Number of Digits in a String

### Example

```text
Input:
java12345

Output:
Number of digits = 5
```

Hint:

Check whether each character is between:

```java
'0' and '9'
```

---



---

# 📊 Day 18 Progress

- Problems Solved: 2
- Topic: String Manipulation
- Status: Completed

---

## 🚀 Day 18 Completed ✅
