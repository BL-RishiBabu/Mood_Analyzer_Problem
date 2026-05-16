# Mood Analyzer Problem

## Project Overview

The Mood Analyzer Problem is a small exercise to implement a class that analyzes a text message and returns whether the mood is `HAPPY` or `SAD`. The project emphasizes unit tests, constructor/refactor design, and robust exception handling using custom exceptions for invalid input (e.g., `NULL` or empty messages).

## Features
- **Mood Detection**: Analyze a provided message and return `HAPPY` or `SAD`.
- **Constructor Support**: Support analyzing mood via constructor-initialized message and via a method that accepts a message parameter.
- **Unit Tests**: Test cases for normal inputs, constructor-based usage, and repeatable scenarios.
- **Custom Exceptions**: Throw a `MoodAnalysisException` (or similar) for `NULL` or empty inputs with distinct error types (e.g., `NULL`, `EMPTY`).

## Use Cases / Test Cases
- **UC1**: Given a message, analyze and respond `HAPPY` or `SAD`.
	- TC 1.1: Given "I am in Sad Mood" should return `SAD`.
	- TC 1.2: Given "I am in Any Mood" (or any non-sad phrase) should return `HAPPY`.
	- Repeat TC 1.1 and TC 1.2 for constructor-based analysis (no-arg analyze method should still return correct mood when message provided in constructor).
- **UC2**: Handle invalid input (like `NULL`).
	- TC 2.1: Given `NULL` message should return `HAPPY` only if you choose to default, but this project expects a handled exception — test should assert appropriate handling using try/catch.
- **UC3**: Inform user when an invalid mood is entered.
	- TC 3.1: Given `NULL` should throw `MoodAnalysisException` with type `NULL`.
	- TC 3.2: Given empty message should throw `MoodAnalysisException` with type `EMPTY`.

## Exception Handling
- **Custom Exception**: Implement a `MoodAnalysisException` that differentiates between `NULL` and `EMPTY` input scenarios.
- **Behavior**: Tests should verify that invalid inputs raise the expected exception and that the exception message or type clearly indicates the problem (e.g., "Empty Mood", "Null Mood").

## Design Notes
- **Class**: `MoodAnalyzer` (or `MoodAnalyser`) with:
	- Constructor that accepts a message (for constructor-based tests).
	- An `analyzeMood()` method that uses the internal message and returns `HAPPY`/`SAD`.
	- An overloaded `analyzeMood(String message)` method that analyzes a passed message.
- **Refactor**: Ensure that tests exist for both constructor and method-based usage. Keep logic simple and testable.

## Sample Behavior
- Input: `"I am in Sad Mood"` → Output: `SAD`.
- Input: `"I am in Any Mood"` → Output: `HAPPY`.
- Input: `null` → Throws `MoodAnalysisException` (type `NULL`).
- Input: `` (empty string) → Throws `MoodAnalysisException` (type `EMPTY`).

## How to Run
- If your project uses Maven: run `mvn test` to execute unit tests.
- If your project uses Gradle: run `gradle test`.
- If running manually: compile the source and run tests with your preferred test runner (e.g., JUnit).

## Contributing
- **Tests First**: Add unit tests for any new behavior before implementing changes.
- **Exceptions**: When adding input validation, ensure a corresponding test covers the expected exception type and message.

## Notes
- This README is based on project slides that outline test cases, constructor refactor, and custom exception handling for the Mood Analyzer problem.
