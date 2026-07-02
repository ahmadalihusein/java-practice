# Capstone — Persistent To-Do App (Java + MySQL)

Your To-Do app from project 04, rebuilt so tasks are saved in MySQL.
The magic: close the app, reopen it, YOUR TASKS ARE STILL THERE.

## It's the same app — just swap where data lives
| Old To-Do (project 04) | This version |
|------------------------|--------------|
| ArrayList<Task> in memory | `tasks` table in MySQL |
| tasks.add(...)            | INSERT (executeUpdate) |
| the view for-loop         | SELECT (executeQuery + while rs.next()) |
| task.done = true          | UPDATE (executeUpdate) |
| gone when closed          | saved forever |

## Setup (do once)
1. Start MySQL in XAMPP.
2. Create the table — run schema.sql's CREATE TABLE against the `practice1` db.

## Build it in stages (open TodoAppDB.java)
- [x] Stage 1: connection + menu loop (given — just run it)
- [ ] Stage 2: Add a task    -> INSERT   (like DbInsert.java)
- [ ] Stage 3: View tasks    -> SELECT   (like DbRead.java)
- [ ] Stage 4: Mark as done  -> UPDATE
- [ ] Stage 5 (level up): switch to PreparedStatement (safer — fixes the apostrophe bug)

## Run it
Make sure MySQL is running, then:
```
java -cp "libs/mysql-connector-j-8.4.0.jar" 07-project-persistent-todo/TodoAppDB.java
```
(or the green Run button, since libs is configured)

## The real test of "persistence"
Add a few tasks, quit, then run the app AGAIN. They should still be listed.
That's the whole point — the data outlived the program.
