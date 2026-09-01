# ☕ Day 30 - Final Day: Interview-Oriented Problems

Today is the final day of my 30-day Java problem-solving challenge.

I solved two important interview-oriented problems:

1. Majority Element
2. Best Time to Buy and Sell Stock

These problems helped me apply array traversal, greedy thinking, candidate selection, and optimization.

---

## 📚 Topics Learned

- Arrays
- Array Traversal
- Majority Element
- Boyer-Moore Voting Algorithm
- Greedy Approach
- Candidate Selection
- Frequency Verification
- Stock Profit
- Minimum Value Tracking
- Maximum Value Tracking
- Single Traversal
- Time Complexity
- Space Complexity
- Algorithm Optimization

---

# 🎯 Problem 1: Majority Element

## 📌 Objective

Find the element that appears more than `n/2` times in an array.

If no element satisfies this condition, report that there is no majority element.

---

## 💻 File

`MajorityElement.java`

---

## ▶️ Sample Input

```text
7
2 2 1 1 1 2 2
```

## ▶️ Output

```text
Majority Element = 2
```

---

## 📖 Explanation

The array is:

```text
2 2 1 1 1 2 2
```

Array size:

```text
n = 7
```

For an element to be a majority element:

```text
frequency > n / 2
```

Therefore:

```text
frequency > 7 / 2
frequency > 3
```

Frequency of `2`:

```text
4
```

Frequency of `1`:

```text
3
```

Since `2` appears more than `3` times:

```text
Majority Element = 2
```

---

# 🧠 Boyer-Moore Voting Algorithm

The solution uses the Boyer-Moore Voting Algorithm.

We maintain:

```text
candidate
count
```

Initially:

```java
int candidate = 0;
int count = 0;
```

When `count` becomes zero, we select a new candidate:

```java
if (count == 0) {
    candidate = arr[i];
}
```

If the current element equals the candidate:

```java
count++;
```

Otherwise:

```java
count--;
```

Different elements effectively cancel each other.

---

## 📊 Dry Run

For:

```text
2 2 1 1 1 2 2
```

The algorithm keeps changing or strengthening the candidate based on the count.

At the end:

```text
Candidate = 2
```

However, finding a candidate is not enough.

We must verify it.

We count how many times the candidate appears:

```text
2 → 4 times
```

Since:

```text
4 > 7 / 2
```

the candidate is actually the majority element.

---

## 📖 Concepts Used

- Array Traversal
- Candidate
- Counter
- Boyer-Moore Voting Algorithm
- Frequency Verification
- Conditional Statements

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The array is traversed a constant number of times.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# 🎯 Problem 2: Best Time to Buy and Sell Stock

## 📌 Objective

Given stock prices for different days, find the maximum profit possible by buying on one day and selling on a later day.

Only one buy and one sell are allowed.

---

## 💻 File

`BestTimeToBuySellStock.java`

---

## ▶️ Sample Input

```text
6
7 1 5 3 6 4
```

## ▶️ Output

```text
Maximum Profit = 5
```

---

## 📖 Explanation

Stock prices:

```text
Day 1 → 7
Day 2 → 1
Day 3 → 5
Day 4 → 3
Day 5 → 6
Day 6 → 4
```

The best decision is:

```text
Buy at = 1
Sell at = 6
```

Profit:

```text
6 - 1 = 5
```

Therefore:

```text
Maximum Profit = 5
```

---

# 🧠 Logic

We maintain:

```text
minPrice
maxProfit
```

Initially:

```java
int minPrice = prices[0];
int maxProfit = 0;
```

For every price:

1. Update the minimum price if the current price is smaller.
2. Calculate the possible profit.
3. Update the maximum profit.

The main calculation is:

```java
int profit = prices[i] - minPrice;
```

Then:

```java
if (profit > maxProfit) {
    maxProfit = profit;
}
```

---

## 📊 Dry Run

For:

```text
7 1 5 3 6 4
```

| Day | Price | Minimum Price | Profit | Maximum Profit |
|---:|---:|---:|---:|---:|
| 1 | 7 | 7 | - | 0 |
| 2 | 1 | 1 | - | 0 |
| 3 | 5 | 1 | 4 | 4 |
| 4 | 3 | 1 | 2 | 4 |
| 5 | 6 | 1 | 5 | 5 |
| 6 | 4 | 1 | 3 | 5 |

Final:

```text
Maximum Profit = 5
```

---

## 📖 Concepts Used

- Arrays
- Array Traversal
- Minimum Value Tracking
- Maximum Value Tracking
- Greedy Approach
- Profit Calculation
- Conditional Statements

---

## ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The prices are processed in one traversal.

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# 💡 Important Concepts

## 1. Majority Element

An element is a majority element if it appears more than half of the array size.

Condition:

```text
frequency > n / 2
```

Example:

```text
2 2 2 1 3
```

Here:

```text
2 → 3 times
```

Since:

```text
3 > 5 / 2
```

`2` is the majority element.

---

## 2. Boyer-Moore Voting Algorithm

Boyer-Moore Voting Algorithm finds a possible majority candidate using constant extra space.

The basic idea is:

```text
Same element → increase count
Different element → decrease count
Count becomes 0 → choose new candidate
```

The candidate must still be verified afterward.

---

## 3. Greedy Approach

A greedy approach makes the best decision based on the information available at the current step.

In the stock problem, we always keep track of the lowest buying price seen so far.

Then we calculate the profit if we sell today.

---

## 4. Minimum Price

In the stock problem:

```java
minPrice
```

stores the lowest stock price encountered so far.

Example:

```text
7 1 5 3
```

Minimum price becomes:

```text
7 → 1
```

and stays:

```text
1
```

after that.

---

## 5. Maximum Profit

For every price:

```text
Profit = Current Price - Minimum Price
```

Then we keep the largest profit.

Example:

```text
Buy = 1
Sell = 6

Profit = 6 - 1
       = 5
```

---

# 🧪 Test Cases

# Problem 1: Majority Element

### Test Case 1

```text
Input:
7
2 2 1 1 1 2 2

Output:
Majority Element = 2
```

### Test Case 2

```text
Input:
5
3 3 4 3 2

Output:
Majority Element = 3
```

### Test Case 3

```text
Input:
5
1 2 3 4 5

Output:
No Majority Element
```

### Test Case 4

```text
Input:
6
5 5 5 2 2 2

Output:
No Majority Element
```

---

# Problem 2: Best Time to Buy and Sell Stock

### Test Case 1

```text
Input:
6
7 1 5 3 6 4

Output:
Maximum Profit = 5
```

### Test Case 2

```text
Input:
5
7 6 4 3 1

Output:
Maximum Profit = 0
```

### Test Case 3

```text
Input:
5
1 2 3 4 5

Output:
Maximum Profit = 4
```

### Test Case 4

```text
Input:
6
2 4 1 7 5 3

Output:
Maximum Profit = 6
```

---

# ⭐ Bonus Challenge

## Maximum Profit with Multiple Transactions

The previous problem allows only:

```text
One Buy
One Sell
```

Now try allowing multiple transactions.

Example:

```text
Input:
6
7 1 5 3 6 4
```

Possible profit:

```text
Buy at 1
Sell at 5

Profit = 4

Buy at 3
Sell at 6

Profit = 3
```

Total:

```text
7
```

Try solving this yourself.

---

# 🧠 Self-Test Questions

Before considering the 30-day challenge complete, answer these:

### Question 1

What is a majority element?

### Question 2

What condition must a majority element satisfy?

### Question 3

What is the main idea of the Boyer-Moore Voting Algorithm?

### Question 4

Why do we verify the candidate after finding it?

### Question 5

What does `minPrice` represent in the stock problem?

### Question 6

How do we calculate profit?

```text
Profit = ?
```

### Question 7

What is the time complexity of the stock solution?

### Question 8

What is the space complexity of the majority-element solution?

### Question 9

For:

```text
5 4 3 2 1
```

what is the maximum possible stock profit?

### Question 10

For:

```text
2 2 1 2 3
```

what is the majority element?

---

# ⚠️ Important Learning Point

You have now completed the 30-day challenge, but don't make the mistake of thinking:

```text
30 Days = DSA Completed
```

That would be false.

This challenge built your **foundation**.

You practiced:

```text
Variables
↓
Conditions
↓
Loops
↓
Patterns
↓
Strings
↓
Arrays
↓
Searching
↓
Frequency
↓
Two Pointers
↓
Subarrays
↓
Kadane's Algorithm
↓
Greedy Concepts
↓
Boyer-Moore Voting
```

The next stage should be dedicated DSA practice involving:

```text
Arrays
Strings
Hashing
Linked Lists
Stacks
Queues
Recursion
Binary Search
Trees
Heaps
Graphs
Dynamic Programming
```

The important thing now is to stop adding easy problems just to increase the GitHub commit count.

Start solving problems where you need to **derive** the approach yourself.

---

# 📂 Folder Structure

```text
Day30
│
├── MajorityElement.java
├── BestTimeToBuySellStock.java
└── README.md
```

---

# 📊 Day 30 Progress

- Problems Solved: 2
- Topic: Interview-Oriented DSA
- Difficulty: Medium
- Status: Completed

---

# 🏆 30-Day Challenge Completed!

```text
╔════════════════════════════════╗
║      JAVA DSA CHALLENGE        ║
║          COMPLETED             ║
╠════════════════════════════════╣
║ Days Completed:     30 / 30    ║
║ Problems Solved:    60 / 60    ║
║ Language:           Java       ║
║ Status:             COMPLETE   ║
╚════════════════════════════════╝
```

## 🚀 Final Progress

```text
30 / 30 Days ✅
60 / 60 Problems ✅
```

---

# 🎯 What's Next?

The 30-day challenge is complete.

The next step is to start a dedicated **DSA Problem-Solving Phase**.

Recommended progression:

```text
Phase 1 → Arrays & Strings
Phase 2 → Hashing
Phase 3 → Linked List
Phase 4 → Stack & Queue
Phase 5 → Binary Search
Phase 6 → Recursion & Backtracking
Phase 7 → Trees
Phase 8 → Heaps
Phase 9 → Graphs
Phase 10 → Dynamic Programming
```

The goal should now shift from:

```text
"I solved 60 problems."
```

to:

```text
"I can solve unfamiliar problems without seeing the solution."
```

That is the real measure of progress.
