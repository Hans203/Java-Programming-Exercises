# Static Keyword
---

The great kingdom of Mahishmati is in need of an intelligent system to track its warriors and the legendary Baahubali himself. Queen Shivagami, the powerful ruler of Mahishmati, has commanded the creation of a Warrior Management System to keep track of the kingdom’s warriors and ensure an orderly system. Your task is to develop this system using Java with appropriate use of static methods, static variables, and static blocks.

---

### Requirements of the System

Queen-Mother Shivagami has issued the following requirements:

- The kingdom should always have a ruler (Queen or King), and this must be stored centrally.
- The total number of warriors in Mahishmati should be tracked globally.
- Before any warrior is created, the kingdom’s system should initialize.
- A method should be available to display the current status of Mahishmati, including the ruler’s name and total warriors.

---

### 1. Kingdom

- The kingdom should have only one ruler at any point.
- The kingdom’s name should be set once and remain constant.
- The ruler’s name should be initialized before any object creation.  
  _Let the default ruler name be “Amarendra Baahubali”._

---

### 2. Warrior

- Each warrior has a name and a rank.
- The total number of warriors should be counted across all warrior instances.
- There should be a method to display the total number of warriors.

---

### Notes:

- Identify which variables should be `static`.
- Implement a `static block` as required.
- Decide where to use `static methods`.
- Run the program and observe how static members behave.
