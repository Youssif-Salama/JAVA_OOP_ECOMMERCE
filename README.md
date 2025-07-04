```markdown
# 🛒 Java Shopping Cart System

This is a **console-based Java shopping cart application** that simulates product purchasing with features like **shipping**, **expiry dates**, and a **cart checkout system**. It follows solid OOP principles including **inheritance**, **interfaces**, and **encapsulation**.

---

## 📁 Project Structure

---

## 🧠 Features

- ✅ Add various types of products:
  - Normal
  - Shippable
  - Expirable
  - Shippable + Expirable
- ✅ Customer input (name + balance)
- ✅ Product listing
- ✅ Quantity check before adding to cart
- ✅ Shipping weight calculation
- ✅ Final checkout with:
  - Subtotal
  - Shipping fee
  - Total deduction from balance

---

## 🚀 How to Run

> Make sure Java (JDK 11+) is installed

```bash
# Go to source directory
cd src

# Compile
javac Main.java

# Run
java Main
````

---

## 📦 Product Types

| Class Name                  | Description            |
| --------------------------- | ---------------------- |
| `Product`                   | Base product           |
| `ShippableProduct`          | Adds shipping weight   |
| `ExpirableProduct`          | Adds expiry date       |
| `ShippableExpirableProduct` | Combines both features |

---

## 🧩 Interfaces

| Interface   | Method Required   |
| ----------- | ----------------- |
| `Shippable` | `getWeight()`     |
| `Expirable` | `getExpiryDate()` |

---

## 💡 Example Flow

1. Add customer name + balance
2. Show products
3. Select product name and quantity
4. Add item to cart
5. Show shipping info (if applicable)
6. Calculate total + deduct from balance

---

## 🧾 Sample Output

```
✅ Products added: 8
Enter customer Data [name, balance]
youssif
1000000
✅ Welcome, youssif. Your balance is EGP 1000000.0
✅ Cart created for, youssif. Your cart is empty
To display products Y/N
y
Products:
- Scratch Card | EGP 50.0 | Qty: 100

- Book | EGP 80.0 | Qty: 30

- TV | EGP 500.0 | Qty: 2

- Microwave | EGP 300.0 | Qty: 5

- Biscuits | EGP 150.0 | Qty: 10

- Juice | EGP 25.0 | Qty: 20

- Cheese | EGP 100.0 | Qty: 5

- Milk | EGP 60.0 | Qty: 12

Write the name and quantity of the product you want to buy!!!
milk
4
✅ Item added to cart 

Cart Items:
- Milk | EGP 60.0 | Qty: 4
Do you want to add more items? Y/N
y
Write the name and quantity of the product you want to buy!!!
cheese
2
✅ Item added to cart 

Cart Items:
- Milk | EGP 60.0 | Qty: 4
- Cheese | EGP 100.0 | Qty: 2
Do you want to add more items? Y/N
n

📦 ** Shipment notice **
- Milk 1.0kg
- Milk 1.0kg
- Milk 1.0kg
- Milk 1.0kg
- Cheese 0.4kg
- Cheese 0.4kg
Total package weight: 4.80 kg

 ** Checkout receipt **
4x Milk 240.00
2x Cheese 200.00
----------------------
Subtotal: EGP 440.00
Shipping: EGP 30.00
Total Paid: EGP 470.00
✅ Payment successful. Remaining Balance: EGP 999530.00
```

---

## 👤 Author

**Youssif Salama**
GitHub: [@youssif](https://github.com/Youssif-Salama)