## Civil War Simulation - Objects and Classes

## Objective  
Practice using **objects**, **classes**, **constructors**, **methods**, and **static methods** in Java.

---

## Instructions

You are required to create **two Java classes**:

### 1. `civilwar` (Class representing the Avengers and Battle Logic)

- **Attributes (instance variables):**
  - `String av1, av2, av3` → names of three Avengers.
  - `int num1, num2, num3` → battle points for the Avengers.

- **Constructor:**
  - Accepts three Avengers' names and their battle points, and initializes the instance variables.

- **Static Methods:**
  - `prime(int n)`: Checks if a number `n` is a prime number. Returns `true` if prime, otherwise `false`.
  - `palin(int n)`: Checks if a number `n` is a palindrome number. Returns `true` if palindrome, otherwise `false`.

- **Instance Method:**
  - `duel(String a, String b, int num1, int num2)`:
    - Determines the result of a battle between two Avengers.
    - Rules:
      - If **both** Avengers have prime or palindrome battle points → **Tie**.
      - If **only one** Avenger has a prime or palindrome battle point → That Avenger wins.
      - If **neither** has a prime or palindrome battle point → **No Winner**.

---

### 2. `civilwardriver` (Driver Class to Test the Program)

- **Main method tasks:**
  1. Create a `Scanner` object to read user input.
  2. Ask the user to input:
     - Names of three Avengers.
     - Their corresponding battle points (must be integers).
  3. Create an object of the `civilwar` class, passing the inputs to the constructor.
  4. Display available duel options to the user (Avenger 1 vs Avenger 2, etc.).
  5. Ask the user to choose a duel.
  6. Call the `duel` method using the created object and display the outcome.
  7. Handle invalid inputs using a `try-catch` block (especially for wrong input types).

---

## Sample Output

```
Enter Three Avengers:
Ironman
Captain America
Thor
Enter battle points for the three Avengers:
23
121
10
Available duels:
1. Ironman/Captain America
2. Ironman/Thor
3. Captain America/Thor
Select your preferred duel: 1
The outcome of the great battle between Ironman and Captain America: Tie
```

---
