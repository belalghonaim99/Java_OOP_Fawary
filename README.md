# 🚗 Car Factory System (Java OOP)

## 📌 Overview

This project is a simple **Car Factory System** implemented in Java using basic Object-Oriented Programming concepts.
It simulates a car that can work with different types of engines and allows switching between them.

---

## 🎯 Features

* Car can have different engine types:

  * Gasoline Engine
  * Electric Engine
  * Hybrid Engine
* Engine can be replaced without changing car logic
* Car supports:

  * Start
  * Stop
  * Accelerate (+20 km/h up to 200)
  * Brake (-20 km/h)
* Engine maintains its own internal speed
* Hybrid engine automatically switches:

  * Electric engine for speed < 50 km/h
  * Gas engine for speed ≥ 50 km/h
* Factory creates cars and replaces engines

---

## 🧠 Concepts Used

* OOP (Object-Oriented Programming)
* Interface (for engine abstraction)
* Polymorphism (multiple engine behaviors)
* Composition (Car has Engine)
* Factory Design Pattern (CarFactory)

---

## 🏗️ Project Structure

```
├── Engine.java
├── GasolineEngine.java
├── ElectronicEngine.java
├── MixedHybridEngine.java
├── Car.java
├── CarFactory.java
└── Main.java
```

---

## ⚙️ How It Works

### 1. Engine Interface

Defines common behavior for all engines:

* start()
* stop()
* increase()
* decrease()
* setSpeed()

---

### 2. Engine Implementations

* **GasolineEngine** → basic fuel engine
* **ElectronicEngine** → electric-based engine
* **MixedHybridEngine** → switches between gas and electric based on speed

---

### 3. Car

* Has an Engine (composition)
* Controls speed
* Notifies engine when speed changes

---

### 4. CarFactory

* Creates cars based on engine type
* Can replace engine for an existing car

---

## ▶️ Example Run

```java
CarFactory factory = new CarFactory();

Car car = factory.createCar("hybrid");

car.start();

car.accelerate(); // 20
car.accelerate(); // 40
car.accelerate(); // 60 → Gas engine
car.brake();      // 40 → Electric engine

car.stop();

factory.replaceEngine(car, "gas");

car.start();
car.accelerate();
car.stop();
```

---

## 🧪 Sample Output

```
Hybrid engine started
Using Electric Engine
Car speed = 20
Using Electric Engine
Car speed = 40
Using Gas Engine
Car speed = 60
Using Electric Engine
Car speed = 40
Hybrid engine stopped
----- Change Engine -----
Gas engine started
Car speed = 20
Gas engine stopped
```

---

## 📝 Notes

* Implementation is kept simple for learning purposes
* No advanced Java features used (beginner-friendly)
* Focus is on clean design and understanding OOP basics

---

## 👨‍💻 Author

Belal Ghonaim
Backend Developer | Java Learner 🚀
