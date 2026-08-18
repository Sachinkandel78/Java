# Java

A collection of Java practice files covering core language basics, object-oriented programming, GUI development with AWT, and basic client-server networking. Built while learning Java, mostly as standalone, self-contained programs rather than a single structured application.

## 📂 What's inside

| File | Description |
|---|---|
| `HelloWorld.java` | Classic "Hello, World" program |
| `Main.java` | Basic Java program (Hello World variant) |
| `sachin.java` | Simple console output practice |
| `demo.java` | Basic OOP practice |
| `rectangle.java` | A `rectangle` class (with a `demo` driver class) that calculates area from length and breadth |
| `Employee.java` | An `Employee` class demonstrating fields, getters/setters, and encapsulation |
| `First.java` | AWT GUI demo — a form with menus, panels, labels, choice boxes, and text fields |
| `FrmaeDemo.java` | Basic AWT `Frame` example (window with background color and title) |
| `Demomenu.java` | AWT GUI demo focused on menus, panels, and layout |
| `Demo3.java` | AWT GUI demo with a menu bar, font/color menu items, and form-style panels |
| `clientside.java` | A simple TCP client using `Socket`/`DataInputStream` to connect to a local server |
| `Demo.class`, `Main.class`, `FrmaeDemo.class` | Compiled `.class` files from the corresponding `.java` sources |
| `java practice/` | A near-duplicate copy of several of the above files (Demo, Demo3, Demomenu, FrmaeDemo, clientside) — used as a separate practice/scratch area |

## 🧠 Topics covered

- Java basics: classes, methods, `main`, console I/O
- Object-oriented programming: encapsulation, getters/setters
- GUI programming with **AWT** (`Frame`, `Panel`, `MenuBar`, `Menu`, `MenuItem`, `Choice`, `Label`, `TextField`, event handling)
- Basic networking: TCP sockets (client side)

## 🚀 How to run

Each file is a standalone program. Using the command line with the JDK installed:

```bash
# Compile
javac FileName.java

# Run (class name must match the public class in the file)
java FileName
```

For example:

```bash
javac HelloWorld.java
java Demo   # HelloWorld.java's public class is named "Demo"
```

> **Note:** Some files (like `HelloWorld.java`) declare a public class with a different name than the file itself (e.g. `class Demo` inside `HelloWorld.java`) — compile using the actual filename, but run using the public class name.

For the AWT GUI examples (`First.java`, `Demo3.java`, `Demomenu.java`, `FrmaeDemo.java`), a graphical environment (desktop) is required to display the window — they won't run in a headless environment.

For `clientside.java`, a corresponding server (listening on `localhost:1212`) needs to be running first for the client to connect successfully.

## 🛠️ Requirements

- JDK (Java Development Kit) 8 or later
- A desktop/graphical environment for the AWT-based demos

## 📌 Notes

- These files are individual practice exercises rather than a single cohesive project — each can be compiled and run independently.
- `java practice/` largely duplicates files found at the repo root and was likely used as a sandbox while experimenting.
- A few files contain minor typos/bugs (e.g. `sachin.java` uses `system.out.println` instead of `System.out.println`) reflecting the learning-in-progress nature of the repo.
