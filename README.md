# Java Practice Projects

A self-directed learning repository where I built up from Java fundamentals to a
database-backed application. Each folder is a step up in difficulty, ending in a
persistent task manager that stores its data in MySQL.

**Skills demonstrated:** Java · Object-Oriented Programming · SQL · JDBC · MySQL · Git

---

## Highlight project — Persistent To-Do App (`07-project-persistent-todo`)
A command-line task manager backed by a **MySQL** database, so tasks survive
between runs.

- Full **CRUD** functionality — add, view, mark-as-done, and delete tasks
- Connects Java to MySQL through **JDBC** (`Connection`, `Statement`, `ResultSet`)
- Uses SQL `INSERT`, `SELECT`, `UPDATE`, and `DELETE`
- Handles invalid input and database errors with `try/catch`

**Run it:**
```
java -cp "libs/mysql-connector-j-8.4.0.jar" 07-project-persistent-todo/TodoAppDB.java
```
(Requires a running MySQL server and a `tasks` table — see
`07-project-persistent-todo/schema.sql`.)

---

## What's in each folder
| Folder | Focus |
|--------|-------|
| `01-basics` | variables, loops, conditions, methods |
| `02-data` | arrays, `ArrayList`, `HashMap` |
| `03-objects` | classes, objects, constructors, methods |
| `04-project-todo` | first complete console app (in-memory) |
| `05-sql-basics` | SQL fundamentals (`CREATE`, `INSERT`, `SELECT`) |
| `06-java-database` | connecting Java to MySQL with JDBC |
| `07-project-persistent-todo` | **capstone** — the To-Do app, database-backed |

## Tech used
- **Java 21** (Temurin JDK)
- **MySQL / MariaDB** (via XAMPP)
- **JDBC** (MySQL Connector/J)
- **Git** for version control

---

*Built as internship preparation, focusing on the core stack used by many
software teams: Java, SQL, and Git.*
