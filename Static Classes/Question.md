# Static Class


Imagine you are tasked with designing a software system based on the **John Wick** movie universe. In this system, you need to model the main characters and key organizations, like **John Wick**, **The Continental Hotel**, and **The High Table**. Each of these entities has certain attributes and behaviours that may or may not depend on other entities.

Based on the following descriptions, determine which attributes and methods should be defined as static, and identify where inner classes might be useful for this design:

---

### 1. John Wick

- **Attributes:**  
  John Wick has a unique name, reputation, and a status (active, retired).  
  His name and reputation remain unchanged throughout the story.

- **Behaviour:**  
  John Wick has several key behaviours like retrieving his weapons or checking in with the Continental.

---

### 2. The Continental Hotel

- **Attributes:**  
  The hotel has a name, a location, and a manager who is responsible for maintaining the rules of the hotel.

- **Behaviour:**  
  The hotel enforces specific rules, such as no business (killing) on the premises, and manages guests, including John Wick and other assassins.

---

### 3. The High Table

- **Attributes:**  
  The High Table is an organization consisting of members, each of whom has a specific role (e.g., Chairman, Enforcer).

- **Behaviour:**  
  The High Table governs the world's most powerful assassins, and the members occasionally make decisions or issue commands related to their operation.

---

### For each of the three classes (John Wick, The Continental Hotel, The High Table), determine:

- Which attributes should be static (shared across all instances)?
- Which attributes should be instance variables (unique to each instance)?
- For each class, would it make sense to have an inner class? If so, describe what this inner class might represent and why it is useful. Consider:
  - Is there a specific behavior or attribute that belongs inside another class, like the manager inside the Continental Hotel?
  - Should roles within the High Table be defined using an inner class?
- What methods would you define for each class, and would any of them be static or need an inner class to support certain behavior?

---

### Task:

Implement the classes and demonstrate the same.
