# Java Calculator

A simple desktop calculator application built using Java Swing and AWT for GUI development.

This project was created as a side project to practice GUI programming in Java.

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, division
- Extended operations: square, square root, percentage
- Decimal support
- Input deletion (backspace) and clear functionality
- Toggle power (ON/OFF) functionality
- Error handling for invalid operations (e.g., divide by zero)

## Technologies Used

- Java (JDK 8 or higher)
- Java Swing
- Java AWT

## GUI Overview

The calculator interface includes:
- A display text field (non-editable) for user input and results
- Number buttons (0-9)
- Arithmetic operator buttons (+, −, ×, ÷)
- Function buttons:
  - `C` - Clear the entire input
  - `Delete` - Remove the last digit/character
  - `.` - Decimal point
  - `x²` - Square the input
  - `√` - Square root of input
  - `%` - Calculate percentage
- `=` button to evaluate the expression
- Radio buttons to turn the calculator ON or OFF

## Running the Project

1. Clone or download the repository.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run `Calculator.java`.

```bash
javac Calculator.java
java Calculator
