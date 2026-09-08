# ⚡ Electricity Bill Calculator

A simple **Java-based Electricity Bill Calculator** that calculates the electricity bill based on the number of units consumed by the customer.

## 👨‍💻 Student Information

**Name:** Misbah Shaikh
**PRN:** 12414009

## 📌 Project Description

The Electricity Bill Calculator is a console-based Java application developed using **Java 17** and **Eclipse IDE**.

The program accepts the customer's name and the number of electricity units consumed, then calculates the total electricity bill according to predefined unit slabs.

## ✨ Features

* Enter customer name
* Enter electricity units consumed
* Automatic electricity bill calculation
* Slab-based billing system
* Input validation for negative units
* Displays a formatted electricity bill
* Simple and user-friendly console interface

## 💰 Electricity Slab Rates

| Units Consumed  |         Rate |
| --------------- | -----------: |
| 0–100 units     |  ₹5 per unit |
| 101–200 units   |  ₹7 per unit |
| 201–300 units   | ₹10 per unit |
| Above 300 units | ₹12 per unit |

## 🛠️ Technologies Used

* **Java 17**
* **Eclipse IDE**
* **Java Scanner**
* **Conditional Statements**
* **Methods**

## 📂 Project Structure

```text
ElectricityBillCalculator/
│
├── src/
│   └── electricitybill/
│       └── ElectricityBillCalculator.java
│
├── .classpath
├── .project
└── README.md
```

## ▶️ How to Run

1. Open the project in **Eclipse IDE**.
2. Open `ElectricityBillCalculator.java`.
3. Right-click the file.
4. Select **Run As → Java Application**.
5. Enter the customer name.
6. Enter the number of units consumed.
7. The program displays the calculated electricity bill.

## 🧮 Example

```text
==========================================
       ELECTRICITY BILL CALCULATOR
==========================================

Enter customer name: Misbah
Enter units consumed: 250

------------ ELECTRICITY BILL ------------
Customer Name  : Misbah
Units Consumed : 250.0
Total Bill     : ₹1700.00
------------------------------------------
        Thank you for using our service!
------------------------------------------
```

## ✅ Input Validation

The program does not accept negative electricity units.

Example:

```text
Enter units consumed: -50

Error: Units cannot be negative.
```

## 🎯 Objective

The main objective of this project is to develop a basic Java application that demonstrates:

* User input handling
* Conditional statements
* Methods
* Arithmetic calculations
* Input validation
* Console output

## 👨‍🎓 Developed By

**Misbah Shaikh**
**PRN: 12414009**
