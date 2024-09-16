# Data Structures and Algorithm

Data structure and Algorithm (DSA) use Java

## Explanations
- [English](./docs/en)

## Contribution Guidelines

**If you have a problem that belongs to a new _topic_ or _category_ than one which are present:**

1. i have Create a new folder and an folder_name.java for it inside.
2. To each new file, i write the code for resolving DSA `problem`.
3. The folder name can also only contain **lowercase characters** and **dashes** or **hyphens** (`-`) (Eg. `strings` `sorting` etc.)

**Folder Structure**

```bash
problem-name\
| - README.md
| - all folders through Day whise     
| - open any folder 
    | - folder_name.java
```

#### `README.md` Specification / Template

````markdown
# <Title of the Problem>

< description of the problem >

## Prerequisites

- prerequisite library or package
- [prerequisite library](https://www.example.com/link-to-official-library)

## Instructions

- instructions to run the project
- < Simple and reproducible commands to execute the project >
  ```bash
   make # or 'cargo run', or 'dotnet run' or 'mvn exec:java' etc.
  ```

## Test Cases & Output < if exists>

< If you can provide test cases, describe it here, else remove this section >
````

#### `.gitignore` File

```gitignore
# add all output files and build files to be excluded from git tracking
main     # executable file also must have the project name
target/  # the build file, for example for rust
```

#### Build File / Specification File / Configuration File

It can be any of the following ones

- **C/C++**: `Makefile`
- **Python**: `requirements.txt`
- **JavaScript**: `package.json` and `package-lock.json`
- **Rust**: `Cargo.toml` and `Cargo.lock`
- **Go**: `go.mod`

#### Source Code File

The source code files should either be in `src/` folder (**Eg.** `src/main.cpp` or `src/main.js`) or the root folder (**Eg.** `palindrome.go` or `App.java`) where `ext` is the file extension for the specific programming language.

Again, the source codes must conform to a valid file structure convention that the programming language enforces.

### 2. Naming Convention

The programming should keep the naming convention rule of each programming language.

### Other topic

- [First-time contribution](CONTRIBUTING.md)

## Reviewers

| Programming Language | Users                                                       |
| Java                 | @TawfikYasser, @aayushjain7, @mohitchakraverty              |

## Contributors

<a href="https://github.com/MakeContributions/DSA/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=MakeContributions/DSA" />
</a>

## Open Graph

<img src="https://opengraph.github.com/3b128f0e88464a82a37f2daefd7d594c6f41a3c22b3bf94c0c030135039b5dd7/MakeContributions/DSA" />

## License

[MIT](./LICENSE)
