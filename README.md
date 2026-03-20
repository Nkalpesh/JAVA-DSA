# 🧠 Data Structures & Algorithms in Java

A structured collection of **Data Structures and Algorithms (DSA)** problems solved in **Java**, focused on improving problem-solving skills and preparing for **coding interviews**.

---

## 🚀 About This Repository

* 📌 Contains solutions to **LeetCode & standard DSA problems**
* 🧠 Covers core concepts from **beginner to advanced level**
* ⚡ Focus on **optimized approaches & clean code**
* 📈 Regularly updated with new problems

---

## 🛠 Tech Stack

* **Language:** Java
* **Platform:** LeetCode
* **IDE:** IntelliJ IDEA / VS Code

---

## 📂 Folder Structure

```bash
DSA-Java/
│
├── Arrays/
├── Strings/
├── LinkedList/
├── Stack/
├── Queue/
├── Trees/
├── Graphs/
├── DynamicProgramming/
├── Recursion/
├── BinarySearch/
└── SlidingWindow/
```

---

## 📊 Topics Covered

### 🔢 Arrays

* Two Pointer Technique
* Prefix Sum
* Kadane’s Algorithm

### 🔤 Strings

* String Manipulation
* Pattern Matching
* Anagrams

### 🔗 Linked List

* Reverse Linked List
* Cycle Detection
* Merge Lists

### 🌳 Trees

* Binary Tree Traversals
* BST Operations
* Lowest Common Ancestor

### 🌐 Graphs

* BFS & DFS
* Topological Sort
* Shortest Path

### ⚡ Dynamic Programming

* Knapsack
* Longest Common Subsequence
* Fibonacci Variants

### 🔁 Recursion & Backtracking

* Subsets
* Permutations
* N-Queens

---

## 🧩 Example Problem

### 🔹 Two Sum

```java
// Find two indices such that nums[i] + nums[j] = target
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 📈 Progress Tracker

* ✅ Arrays
* ✅ Strings
* ✅ Linked List
* 🔄 Graphs (In Progress)
* 🔄 Dynamic Programming (In Progress)

---

## 🎯 Goals

* Solve **300+ DSA problems**
* Master **Data Structures & Algorithms**
* Prepare for **FAANG / product-based companies**

---

## 🔗 Profiles

* 💻 LeetCode: https://leetcode.com/KalpeshNaik
* 🧑‍💻 GitHub: https://github.com/Nkalpesh

---

## ⭐ Contribute

Feel free to:

* Add new problems
* Improve solutions
* Optimize existing code

---

## 🙋‍♂️ Author

**Kalpesh Naik**
📍 Mumbai, India

---

## ⭐ Support

If you find this repository useful, give it a ⭐!
