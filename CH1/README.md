# 📚 CH1 — Java Basics

First chapter covering the core basics of Java. This chapter teaches you the fundamental building blocks needed to write any Java program.

---

## 📋 Table of Contents

- [Lessons Covered](#lessons-covered)
- [Learning Objectives](#learning-objectives)
- [Projects](#projects)
- [How to Run](#how-to-run)

---

## 🎯 Learning Objectives

By the end of this chapter, you will be able to:
- ✅ Understand and use different data types (`int`, `double`, `boolean`, `String`, etc.)
- ✅ Perform arithmetic operations and understand operator precedence
- ✅ Differentiate between prefix (++i) and postfix (i++) operators
- ✅ Take user input using the Scanner class
- ✅ Format output using printf and println
- ✅ Use conditional statements (if, else if, else) to control program flow
- ✅ Apply the ternary operator for simple conditions
- ✅ Use the instanceof operator for type checking

---

## 📖 Lessons Covered

### 1️⃣ **Data Types**
- Primitive data types: `int`, `double`, `boolean`, `char`
- Reference data types: `String`
- Type casting and conversion
- **File:** `SProjects/PersonalInfoPrinter.java`

### 2️⃣ **Arithmetic Operators**
- Basic operators: `+`, `-`, `*`, `/`, `%`
- Operator precedence and evaluation order
- **File:** `SProjects/SimpleCalculator.java`

### 3️⃣ **Prefix & Postfix Operators**
- Understanding `++i` (prefix increment)
- Understanding `i++` (postfix increment)
- Practical differences in loops and expressions
- **File:** `SProjects/CounterDemo.java`

### 4️⃣ **User Input & Printf**
- Using Scanner class for console input
- Formatted output with printf
- String concatenation
- **File:** `SProjects/FormattedUserProfile.java`

### 5️⃣ **Selection Statements (if / else / else if)**
- Simple if statements
- if-else branching
- Multiple conditions with else if
- **File:** `SProjects/GradeChecker.java`

### 6️⃣ **Ternary Operator & instanceof**
- Ternary operator syntax: `condition ? trueValue : falseValue`
- Type checking with instanceof
- **File:** `SProjects/NumberSignChecker.java`

---

## 🚀 Projects

### 📦 SProjects (Small Practice Projects)

| # | Project | Description | Concepts |
|---|---------|-------------|----------|
| 1️⃣ | **PersonalInfoPrinter** | Prints a person's info using all data types | Data Types, Variables |
| 2️⃣ | **SimpleCalculator** | Performs +, -, *, / on two numbers | Arithmetic Operators |
| 3️⃣ | **CounterDemo** | Shows the difference between i++ and ++i | Prefix & Postfix |
| 4️⃣ | **FormattedUserProfile** | Takes user input and displays it with printf | Scanner, Printf |
| 5️⃣ | **GradeChecker** | Determines a student's grade from a score | if-else Statements |
| 6️⃣ | **NumberSignChecker** | Checks if a number is positive, negative, or zero | Ternary Operator |

### 🎓 BProjects (Big Real-World Projects)

| # | Project | Description | File |
|---|---------|-------------|------|
| 1️⃣ | **StudentReportCard** | Takes student info and scores, outputs a formatted report card | [`README`](./BProjects/StudentReportCard/README.md) |

---

## ▶️ How to Run

### Running a Single Project

**Navigate to the project:**
```bash
cd CH1/SProjects
```

**Compile the Java file:**
```bash
javac SimpleCalculator.java
```

**Run the program:**
```bash
java SimpleCalculator
```

### Example: Running SimpleCalculator
```bash
cd CH1/SProjects
javac SimpleCalculator.java
java SimpleCalculator
# Output: 
# Enter first number: 10
# Enter second number: 5
# 10 + 5 = 15
# 10 - 5 = 5
# 10 * 5 = 50
# 10 / 5 = 2.0
```

### Running the Big Project (StudentReportCard)
```bash
cd CH1/BProjects/StudentReportCard
javac StudentReportCard.java
java StudentReportCard
```

See [`StudentReportCard/README.md`](./BProjects/StudentReportCard/README.md) for detailed info about this project.

---

## 💡 Tips & Best Practices

| Tip | Explanation |
|-----|-------------|
| 🔍 **Read Error Messages** | Error messages tell you exactly what went wrong |
| 🧪 **Test Edge Cases** | Test with extreme values (0, negative, very large) |
| 📝 **Add Comments** | Explain your code for future reference |
| 🚀 **Run Often** | Compile and run frequently to catch errors early |
| 📚 **Review Concepts** | If stuck, review the concept before moving on |

---

## 📚 Additional Resources

- [Oracle Java Tutorials - Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Scanner Class Documentation](https://docs.oracle.com/javase/21/docs/api/java.base/java/util/Scanner.html)
- [Java Operators Guide](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

## ✅ Chapter Status

- [x] Lessons: All 6 lessons completed
- [x] SProjects: All 6 projects included
- [x] BProjects: StudentReportCard completed

---

## 🔗 Part of

[📚 MJF — Master Java Fundamentals](https://github.com/Ledev0/MJF)
