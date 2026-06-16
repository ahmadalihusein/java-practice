# My Progress — Java Internship Prep

This file is MINE. It lives on my computer and survives no matter what.
If I ever lose the Claude chat, I can keep going just by reading this + the README.

## My goal
Diploma IT student in Kuala Lumpur prepping for a software internship.
Going DEEP on **Java + SQL + Git** instead of collecting more languages.
(KL job market is heavy on Java — banks, fintech, MNCs.)

## What's installed on my machine (mine forever, no subscription needed)
- Java (JDK 21 LTS, Eclipse Temurin)
- Git
- VSCode  (+ install the "Extension Pack for Java" by Microsoft if not yet)

## How to run a Java file
Open a PowerShell terminal in VSCode: press the `+` button in the TERMINAL panel
(NOT the read-only "Run:" or "Java Build" terminals — those can't be typed in).
Then:
```
java 02-data\Exercise01_Arrays.java
```

## The Git daily loop (this is 90% of Git)
```
git status                    # what have I changed?
git add .                     # stage all changes
git commit -m "what I did"    # save a snapshot with a note
git log --oneline             # see my history of saves
```
- **Git** = save-points on MY computer (works offline).
- **GitHub** = a website that stores a copy online — for backup + showing employers.
  Don't need it yet. Set it up later once I have projects worth showing on my resume.

## Roadmap (do in order — finish what I start)
- [x] 01-basics — variables, loops/FizzBuzz, methods
- [x] 02-data — arrays, ArrayList, HashMap   <-- I AM HERE
- [x] 03-objects — classes & objects
- [ ] 04-project-todo — first complete console app
- [ ] 05-project-database — the app + a real SQL database

## Things I learned that tripped me up (notes to self)
- Array/list index starts at **0**, not 1.
- In Java, dividing two whole numbers drops the decimal: `7 / 2` = `3`, not 3.5.
  To get decimals, cast: `(double) total / count`.
- A method that returns true/false can just `return n % 2 == 0;` — no if/else needed.
- A method should usually either RETURN a value or PRINT — try not to mix both.
- A println inside a loop will print every value from an array.

## If I lose the Claude chat
- All my code + this file + the README are safe in this folder.
- Free Claude chat (claude.ai) can still be my tutor: paste code, ask "why doesn't
  this work?", ask it to explain. It just can't edit my files or install things —
  I'd be the hands. The learning is mine either way.

Last updated: 2026-06-13
Updated : 2026-06-16
