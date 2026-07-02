# My Java Journey — What's Next

Where I am: finished fundamentals → OOP → SQL → a MySQL-backed CLI app → Git/GitHub.
This is the path forward, in order. One thing at a time.

## Phase 1 — Polish what I have (days)
- [ ] PreparedStatement — use `?` placeholders instead of gluing user input into SQL.
      Fixes the apostrophe bug (e.g. "Ali's homework") and prevents SQL injection.
      (interviewers love asking juniors about SQL injection)
- [ ] Refactor: pull the repeated "view tasks" loop into one printTasks() method (DRY).

## Phase 2 — Level up core Java (weeks)
- [ ] Maven (or Gradle) — a build tool that manages libraries automatically,
      so I stop loading the MySQL driver with `-cp "libs/..."` by hand.
      EVERY Java job uses one of these. This is the doorway to Spring Boot.
- [ ] Deeper Java: exceptions, file read/write, generics, more Collections.

## Phase 3 — The leap that gets Java devs hired (the big one)
- [ ] Spring Boot — the framework most KL Java jobs (banks, fintech, MNCs) run on.
      Rebuild something like the To-Do app as a WEB API backed by MySQL.
      "Java Developer" in a KL job post almost always means "Java + Spring Boot".

## Phase 4 — Portfolio + interviews
- [ ] Build one bigger Spring Boot + MySQL project → standout GitHub repo.
- [ ] Practice explaining my projects out loud + basic data-structure questions.

## The through-line
Goal = Java internship in KL. Most valuable next skill = Spring Boot,
but Maven comes first (it's the doorway).
Path: finish polishing -> learn Maven -> learn Spring Boot.

Repo: github.com/ahmadalihusein/java-practice
