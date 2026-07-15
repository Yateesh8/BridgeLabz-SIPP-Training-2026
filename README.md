# BridgeLabz SIPP Training 2026

Java code and practice solutions from the **BridgeLabz Summer Internship Placement Program (SIPP) 2026** — covering Core Java fundamentals, Object-Oriented Programming, Collections & DSA, and RDBMS, built through daily hands-on assignments.

![Java](https://img.shields.io/badge/Java-100%25-orange?logo=openjdk)
![Status](https://img.shields.io/badge/status-in%20progress-blue)

## About

This repository tracks day-by-day coursework from BridgeLabz's SIPP training track. Each module folder holds problem-wise solutions organized by topic and difficulty level, moving from language basics up to Collections, DSA patterns, and SQL fundamentals — the same building blocks tested in campus placement rounds at MNCs.

## Repository Structure

```
BridgeLabz-SIPP-Training-2026/
│
├── core-java-practice/
│   └── gcr-codebase/
│       ├── programming-elements/     # I/O, variables, basic arithmetic programs
│       ├── control-flow/             # if-else, loops (Level-1 & Level-2)
│       ├── Methods/                  # method design & overloading (Level-1 & Level-2)
│       ├── Arrays/                   # 1D/2D array problems (Level-1 & Level-2)
│       ├── Strings/                  # string manipulation (Level-1 & Level-2)
│       ├── Recursion/                # factorial, Fibonacci, Tower of Hanoi, subsets, etc.
│       ├── Exception Handling/       # try-catch, custom exceptions, try-with-resources
│       └── Java_IO/                  # file I/O, serialization, stream processing
│   └── leet-code-codebase/           # LeetCode-style problems (Roman to Integer, Palindrome, etc.)
│
├── oops-practice/
│   └── gcr-codebase/
│       ├── OOPS_Programming_Fundamentals/  # scenario-based OOP design
│       ├── Encapsulation_And_Abstraction/  # banking, payroll, hospital systems
│       ├── Inheritance/                    # multi-level inheritance case studies
│       ├── Polymorphism/                   # runtime/compile-time polymorphism
│       ├── Interface/                      # interface-driven system design
│       └── CollectionFramework/            # Lists, Maps, Sets in OOP context
│   └── java-generics/                # generic classes, bounded types, repositories
│
├── CollectionsAndDSA/
│   └── gcr-codebase/
│       ├── CollectionFramework/               # real-world collection use cases
│       ├── LinkedList/                        # custom linked list problems
│       ├── stack/                             # stack-based problem solving
│       ├── binary-search/                     # search variants (rotated array, peak element, etc.)
│       ├── sorting-algorithms/                # bubble, insertion, selection, merge, quick, counting sort
│       ├── efficient-sorting/                 # merge/quick sort applied to real datasets
│       ├── two-pointers-sliding-window/       # two-pointer & sliding window scenarios
│       └── java-generics/                     # generics applied to DSA structures
│
├── RDBMS/
│   └── gcr-codebase/
│       ├── RDBMS-Fundamentals/        # core SQL concepts (tasks 1-5)
│       └── JoinsAndBasicQueries/      # JOINs, aggregation, filtering (cases 1-5)
│
└── .gitignore
```

## Modules Covered

| Module | Focus Area | Topics |
|---|---|---|
| **Core Java** | Language fundamentals | I/O, control flow, methods, arrays, strings, recursion, exception handling, file I/O |
| **OOPs** | Object-oriented design | Encapsulation, abstraction, inheritance, polymorphism, interfaces, generics |
| **Collections & DSA** | Data structures & algorithms | Collection Framework, LinkedList, Stack, Binary Search, Sorting, Two Pointers/Sliding Window |
| **RDBMS** | Database fundamentals | SQL basics, JOINs, filtering, aggregation queries |

Problems are grouped by **Level-1** (foundational) and **Level-2** (applied/scenario-based) where applicable, and many DSA/OOP exercises are framed as real-world systems (e.g. smart parking, warehouse management, hospital records, flight ticket pricing) rather than abstract problems — closer to how these concepts show up in interviews.

## Tech Stack

- **Language:** Java (JDK 8+)
- **Database:** SQL (RDBMS fundamentals, vendor-agnostic queries)
- **Build:** Plain `javac`/`java` — no external build tool required

## Getting Started

Clone the repository:

```bash
git clone https://github.com/Yateesh8/BridgeLabz-SIPP-Training-2026.git
cd BridgeLabz-SIPP-Training-2026
```

Compile and run any individual file, for example:

```bash
cd core-java-practice/gcr-codebase/Recursion
javac TowerOfHanoi.java
java TowerOfHanoi
```

Most files are self-contained with a `main` method, so they can be compiled and run independently without any project setup.

## Progress

- [x] Core Java — programming elements, control flow, methods, arrays, strings, recursion, exception handling, file I/O
- [x] OOPs — encapsulation, abstraction, inheritance, polymorphism, interfaces, generics
- [x] Collections & DSA — Collection Framework, LinkedList, Stack, Binary Search, Sorting, Two Pointers/Sliding Window
- [x] RDBMS — fundamentals, joins & basic queries
- [ ] Advanced topics (to be added as training progresses)

## Author

**Yateesh Gangwar**
Final-year B.Tech student, GLA University
[GitHub](https://github.com/Yateesh8)

## License

This repository is for personal learning and training documentation as part of the BridgeLabz SIPP program. Feel free to reference it, but please avoid direct copying if you're enrolled in the same program — solve it yourself first!
