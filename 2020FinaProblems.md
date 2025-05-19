# 📘 Java Final Exam – CISC 3115

## 💨 Fan Class API

### Class: Fan

Inherits from: `java.lang.Object`

### Fields

- `static int FAST`
- `static int MEDIUM`
- `static int SLOW`

### Constructors

- `Fan()` – No-argument constructor
- `Fan(int speed, boolean on, double radius, String color)` – Parameterized constructor

### Methods

- `int getSpeed()`
- `double getRadius()`
- `String getColor()`
- `boolean isOn()`
- `void setSpeed(int speed)`
- `void setRadius(double radius)`
- `void setColor(String color)`
- `void turnOn()`
- `void turnOff()`
- `boolean equals(Fan f)`
- `String toString()`
- `static Fan read(Scanner sc)`

---

## 🧩 Question 1: CeilingFan Class

Implement a `CeilingFan` class that:

- Inherits from `Fan`
- Has an additional instance variable: `int numBulbs`
- Constructor takes 5 parameters: `speed`, `on`, `radius`, `color`, `numBulbs`
- Overloads the `equals(Fan f)` method
- Overrides the `toString()` method

---

## 🔌 Question 2: Pluggable Interface

Create an interface `Pluggable`:

```java
public interface Pluggable {
    boolean plugIn(int voltage);
}
```

---

## 🪭 Question 3: StandingFan Class

Create a class `StandingFan` that:

- Inherits from `Fan`
- Implements `Pluggable`

### Instance Variables:
- `boolean pluggedIn` → initially `false`
- `int voltage` → initially `110`

### Overrides:

```java
@Override
public boolean plugIn(int inputVoltage) {
    if (inputVoltage == this.voltage) {
        this.pluggedIn = true;
        return true;
    } else {
        this.pluggedIn = false;
        return false;
    }
}

@Override
public void turnOn() {
    if (this.pluggedIn) {
        super.turnOn();
    }
}
```

> No constructor or `toString()` needed in this question.
