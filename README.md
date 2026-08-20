# Java

A collection of Java practice programs covering core syntax, object-oriented programming, GUI development with AWT, and basic client-server networking. These are standalone learning exercises rather than one cohesive application — each file can be compiled and run on its own.

## 📂 Files flow

**Core Java & OOP**
| File | Description |
|---|---|
| `HelloWorld.java` | Classic "Hello, World" program |
| `Main.java` | Basic Hello World variant |
| `sachin.java` | Simple console output practice |
| `demo.java` | Basic OOP practice |
| `rectangle.java` | `rectangle` class calculating area from length and breadth, with a `demo` driver class |
| `Employee.java` | `Employee` class demonstrating fields, getters/setters, and encapsulation |

**GUI (AWT)**
| File | Description |
|---|---|
| `FrmaeDemo.java` | Basic `Frame` example — window with background color and title |
| `First.java` | Form-style GUI with menus, panels, labels, a choice box, and text fields |
| `Demomenu.java` | GUI demo focused on menus, panels, and layout |
| `Demo3.java` | GUI demo with a menu bar, font/color menu items, and form panels |

**Networking**
| File | Description |
|---|---|
| `clientside.java` | TCP client using `Socket` / `DataInputStream` to connect to a local server on port `1212` |

**Other**
| File | Description |
|---|---|
| `Demo.class`, `Main.class`, `FrmaeDemo.class` | Compiled output from the corresponding `.java` sources |
| `java practice/` | Duplicate copies of `Demo`, `Demo3`, `Demomenu`, `FrmaeDemo`, and `clientside` — used as a scratch/practice area |

## 🧠 Topics covered

- Java fundamentals: classes, methods, `main`, console I/O
- Object-oriented programming: encapsulation, getters/setters
- GUI programming with **AWT**: `Frame`, `Panel`, `MenuBar`, `Menu`, `MenuItem`, `Choice`, `Label`, `TextField`, event handling
- Basic networking: TCP sockets (client side)

## 🚀 How to run

Each file is standalone. With the JDK installed:

```bash
# Compile
javac FileName.java

# Run (using the public class name, not necessarily the filename)
java ClassName
```

Example:

```bash
javac HelloWorld.java
java Demo   # HelloWorld.java's public class is named "Demo"
```

> Some files declare a public class with a different name than the file itself — compile using the actual filename, but run using the public class name inside it.

**GUI demos** (`First.java`, `Demo3.java`, `Demomenu.java`, `FrmaeDemo.java`) need a graphical/desktop environment to display their windows — they won't run headless.

**`clientside.java`** needs a server listening on `localhost:1212` before it will connect successfully.

## 🛠️ Requirements

- JDK 8 or later
- A desktop environment for the AWT-based demos

## 📌 Notes

- Files are independent practice exercises, not a single project.
- `java practice/` is an exact duplicate of several root-level files, kept as a sandbox while experimenting.
- A few files have minor typos (e.g. `sachin.java` uses `system.out.println` instead of `System.out.println`), reflecting the learning-in-progress nature of the repo.
