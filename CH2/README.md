# 🔁 CH2 — Control Flow Statements

Second chapter covering essential control flow statements in Java. This chapter teaches you how to control the execution flow of your programs using conditional and repetition structures.

---

## 📋 Table of Contents

- [Lessons Covered](#lessons-covered)
- [Learning Objectives](#learning-objectives)
- [Projects](#projects)
- [How to Run](#how-to-run)

---

## 🎯 Learning Objectives

By the end of this chapter, you will be able to:
- ✅ Implement multi-way branching using `switch` statements.
- ✅ Utilize `while` loops for indefinite repetition, including sentinel and flag-controlled loops.
- ✅ Apply `do-while` loops for scenarios requiring at least one iteration.
- ✅ Master `for` loops for definite iteration and count-controlled loops.
- ✅ Solve problems involving complex looping patterns and nested loops.
- ✅ Control loop execution using `break` and `continue` branching statements.

---

## 📖 Lessons Covered

### 9️⃣ **Selection Statement (Switch Statements)**
- Using `switch` for multiple choices
- Fall-through behavior and `break` in `switch`
- Enhanced `switch` expressions (Java 14+)
- **File:** `SProjects/GradeSwitch.java`

### 🔟 **Repetition Control Statement (While Loop)**
- Basic `while` loop syntax and execution
- Infinite loops and how to avoid them
- **File:** `SProjects/CountdownTimer.java`

### 1️⃣1️⃣ **Sentinel and Flag-Controlled While Loops**
- Using a sentinel value to terminate input
- Using a boolean flag to control loop execution
- **File:** `SProjects/InputValidator.java`

### 1️⃣2️⃣ **Repetition Control Statement (Do-While Loop)**
- `do-while` loop syntax and use cases
- Guaranteeing at least one iteration
- **File:** `SProjects/NumberGuessing.java`

### 1️⃣3️⃣ **Repetition Control Statement (For Loop)**
- Basic `for` loop syntax and components
- Nested `for` loops for patterns
- **File:** `SProjects/MultiplicationTable.java`

### 1️⃣4️⃣ **Questions and Exercises in Loops**
- Problem-solving techniques using various loop types
- Implementing patterns and iterative algorithms
- **File:** `SProjects/LoopPatterns.java`

### 1️⃣5️⃣ **Branching Statements (Break / Continue)**
- `break` statement to exit loops and switch
- `continue` statement to skip current iteration
- **File:** `SProjects/BreakContinueDemo.java`

---

## 🚀 Projects

### 📦 SProjects (Small Practice Projects)

| # | Project | Description | Concepts |
|---|---------|-------------|----------|
| 1️⃣ | **GradeSwitch** | Uses `switch` instead of `if-else` to determine a student's grade | Switch Statements |
| 2️⃣ | **CountdownTimer** | Implements a simple countdown using a `while` loop | While Loops |
| 3️⃣ | **InputValidator** | A sentinel loop that continuously asks for valid input | Sentinel/Flag Loops |
| 4️⃣ | **NumberGuessing** | A simple guessing game using a `do-while` loop | Do-While Loops |
| 5️⃣ | **MultiplicationTable** | Generates a multiplication table using a `for` loop | For Loops |
| 6️⃣ | **LoopPatterns** | Draws various patterns using nested loops | Nested Loops, For Loops |
| 7️⃣ | **BreakContinueDemo** | Demonstrates the functionality of `break` and `continue` statements | Break/Continue |

### 🎓 BProjects (Big Real-World Projects)

| # | Project | Description | File |
|---|---------|-------------|------|
| 1️⃣ | **ATM Simulator** | Simulates a basic ATM with PIN entry, withdraw, deposit, and balance check functionalities. | [`README`](./BProjects/ATMSimulator/README.md) |

---

## ▶️ How to Run

### Running a Single Project

**Navigate to the project:**
```bash
cd CH2/SProjects
```

**Compile the Java file:**
```bash
javac YourProjectName.java
```

**Run the program:**
```bash
java YourProjectName
```

### Example: Running MultiplicationTable
```bash
cd CH2/SProjects
javac MultiplicationTable.java
java MultiplicationTable
# Output: (Example of a 5x5 table)
# 1   2   3   4   5
# 2   4   6   8  10
# 3   6   9  12  15
# 4   8  12  16  20
# 5  10  15  20  25
```

### Running the Big Project (ATM Simulator)
```bash
cd CH2/BProjects/ATMSimulator
javac ATMSimulator.java
java ATMSimulator
```

See [`ATMSimulator/README.md`](./BProjects/ATMSimulator/README.md) for detailed info about this project.

---

## 💡 Tips & Best Practices

| Tip | Explanation |
|-----|-------------|
| 🔍 **Read Error Messages** | Error messages tell you exactly what went wrong |
| 🧪 **Test Edge Cases** | Test with extreme values (0, negative, very large) |
| 📝 **Add Comments** | Explain your code for future reference |
| 🚀 **Run Often** | Compile and run frequently to catch errors early |
| 📚 **Review Concepts** | If stuck, review the concept before moving on |
| 🔄 **Choose the Right Loop** | Select `while`, `do-while`, or `for` based on your specific control flow needs. |

---

## 📚 Additional Resources

- [Oracle Java Tutorials - Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Baeldung - Java Switch Statement](https://www.baeldung.com/java-switch)
- [GeeksforGeeks - Loops in Java](https://www.geeksforgeeks.org/loops-in-java/)

---

## ✅ Chapter Status

- [ ] Lessons: All 7 lessons outlined
- [ ] SProjects: All 7 projects included
- [ ] BProjects: ATM Simulator included

---

## 🔗 Part of

[📚 MJF — Master Java Fundamentals](https://github.com/Ledev0/MJF)
