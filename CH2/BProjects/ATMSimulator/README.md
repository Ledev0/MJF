# 🎓 ATM Simulator

This project simulates a basic ATM (Automated Teller Machine) with core functionalities using Java control flow statements.

## ✨ Features

- **PIN Entry:** Requires a correct PIN to access the account.
- **Account Balance:** Displays the current balance.
- **Deposit:** Allows users to deposit money into their account.
- **Withdrawal:** Allows users to withdraw money from their account, with balance checks.
- **Menu System:** Navigable menu for different operations.
- **Exit Option:** Allows users to securely exit the ATM.

## ⚙️ Concepts Covered

- **Loops:** `while` and `do-while` loops for continuous operation and input validation.
- **Switch Statements:** To handle menu selections (deposit, withdraw, check balance, exit).
- **Conditional Statements:** `if-else` for balance checks during withdrawal.
- **User Input:** `Scanner` class for taking user input (PIN, amount, menu choice).

## ▶️ How to Run

1.  **Navigate to the project directory:**
    ```bash
    cd CH2/BProjects/ATMSimulator
    ```
2.  **Compile the Java source code:**
    ```bash
    javac ATMSimulator.java
    ```
3.  **Run the application:**
    ```bash
    java ATMSimulator
    ```

## 📝 Example Usage

```
Welcome to the ATM!
Enter your PIN: **** (e.g., 1234)

Main Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 1
Your current balance is: $1000.00

Main Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 2
Enter amount to deposit: 500
Deposit successful! Your new balance is: $1500.00

Main Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 3
Enter amount to withdraw: 200
Withdrawal successful! Your new balance is: $1300.00

Main Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 4
Thank you for using the ATM. Goodbye!
```
