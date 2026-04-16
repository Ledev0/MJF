# ⚙️ CH4 — Arrays & Strings

Fourth chapter focusing on Java arrays and strings. This chapter covers one-dimensional and multi-dimensional arrays, character arrays, passing arrays to methods, and various string manipulation techniques.

---

## 📋 Table of Contents

- [Lessons Covered](#lessons-covered)
- [Learning Objectives](#learning-objectives)
- [Projects](#projects)
- [How to Run](#how-to-run)

---

## 🎯 Learning Objectives

By the end of this chapter, you will be able to:

- ✅ Understand the concept of one-dimensional (1D) arrays and their usage.
- ✅ Perform common array operations like finding min, max, sum, and average.
- ✅ Work with character arrays, including conversion and manipulation.
- ✅ Pass arrays to methods and understand how changes affect the original array.
- ✅ Utilize multi-dimensional arrays for more complex data structures.
- ✅ Apply various string methods for comparison, concatenation, searching, and modification.

---

## 📖 Lessons Covered

### 2️⃣4️⃣ **One Dimensional Arrays (1D)**

- Introduction to 1D arrays, declaration, initialization, and access.
- **File:** `SProjects/ArrayBasics.java`

### 2️⃣5️⃣ **Exercises & Practice for Arrays**

- Practical exercises to solidify understanding of 1D arrays.
- **File:** `SProjects/ArrayStats.java`

### 2️⃣6️⃣ **Char Array**

- Working with character arrays, string to char array conversion, and manipulation.
- **File:** `SProjects/CharArrayDemo.java`

### 2️⃣7️⃣ **Passing Arrays to Methods**

- Understanding how arrays are passed to methods and their implications.
- **File:** `SProjects/ArrayMethods.java`

### 2️⃣8️⃣ **Multidimensional Arrays**

- Introduction to 2D arrays, declaration, initialization, and access.
- **File:** `SProjects/MatrixOps.java`

### 2️⃣9️⃣ **String & Array String**

- Core concepts of strings, string arrays, and various string methods.
- **File:** `SProjects/StringMethodsDemo.java`

---

## 🚀 Projects

### 📦 SProjects (Small Practice Projects)

| # | Project | Description | Concepts |
|---|---------|-------------|----------|
| 1️⃣ | **ArrayBasics** | Create a 1D array, take user input, and print the array elements. | 1D Arrays, User Input |
| 2️⃣ | **ArrayStats** | Find the maximum, minimum, sum, and average of array elements. | Array Traversal, Basic Statistics |
| 3️⃣ | **CharArrayDemo** | Convert a word into a char array, reverse it, and count consonants (excluding a, e, i, o, u). | Char Arrays, String to Char Array, Loops, Conditionals |
| 4️⃣ | **ArrayMethods** | Write methods that receive an array: print it, calculate sum, and return a reversed array. | Passing Arrays to Methods, Array Manipulation |
| 5️⃣ | **MatrixOps** | Create two 2D matrices, then add and subtract them using methods. | Multidimensional Arrays, Methods |
| 6️⃣ | **StringMethodsDemo** | Demonstrate compareTo, concat, trim, valueOf, equals, equalsIgnoreCase, replace, contains, endsWith, startsWith, substring. | String Methods |

### 🎓 BProjects (Big Real-World Projects)

| # | Project | Description | File |
|---|---------|-------------|------|
| 1️⃣ | **StudentGradeAnalyzer** | A simple console application that analyzes student grades using arrays and strings. | [`README`](./BProjects/StudentGradeAnalyzer/README.md) |

---

## How to Run

### Running a Single Project

**Navigate to the project:**

```bash
cd CH4/SProjects
```

**Compile the Java file:**

```bash
javac YourProjectName.java
```

**Run the program:**

```bash
java YourProjectName
```

### Example: Running ArrayBasics

```bash
cd CH4/SProjects
javac ArrayBasics.java
java ArrayBasics
# Expected Output: (Example output for ArrayBasics)
# Enter 5 integer elements:
# 10
# 20
# 30
# 40
# 50
# Array elements are: 10 20 30 40 50
```

### Running the Big Project (Student Grade Analyzer)

```bash
cd CH4/BProjects/StudentGradeAnalyzer
javac StudentGradeAnalyzer.java
java StudentGradeAnalyzer
```

See [`StudentGradeAnalyzer/README.md`](./BProjects/StudentGradeAnalyzer/README.md) for detailed info about this project.

---

## 💡 Tips & Best Practices

| Tip | Explanation |
|-----|-------------|
| 📏 **Array Bounds** | Always be mindful of array indices to avoid `ArrayIndexOutOfBoundsException`. |
| 🔄 **Iterate Arrays** | Use enhanced for loops (`for-each`) for simple iteration, and traditional for loops for index-based access. |
| 📑 **Immutability of Strings** | Remember that `String` objects are immutable in Java; methods that appear to modify a string actually return a new string. |
| ✍️ **StringBuilder/StringBuffer** | Use `StringBuilder` (or `StringBuffer` for thread-safety) for efficient mutable string operations. |
| 🧐 **`equals()` vs `==` for Strings** | Always use `equals()` or `equalsIgnoreCase()` to compare string content, not `==` (which compares object references). |

---

## 📚 Additional Resources

- [Oracle Java Tutorials - Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Baeldung - Java Arrays Tutorial](https://www.baeldung.com/java-arrays-tutorial)
- [GeeksforGeeks - String in Java](https://www.geeksforgeeks.org/string-class-in-java/)

---

## ✅ Chapter Status

- [✅] Lessons: All 6 lessons outlined
- [✅] SProjects: All 6 projects included
- [✅] BProjects: Student Grade Analyzer included

---

## 🔗 Part of

[📚 MJF — Master Java Fundamentals](https://github.com/Ledev0/MJF)
