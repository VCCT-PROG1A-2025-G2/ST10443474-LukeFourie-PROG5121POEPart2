# ChatApp Java Application
ChatApp is a simple Java-based chat application that allows users to register, log in, send messages with validation, and store messages in JSON format. The project includes a user-friendly GUI via `JOptionPane`, validation logic, unit tests, and JSON export functionality.

## Features
- **User Registration** with validation:
  - Username must contain `_` and be 5 characters or less.
  - Password must be 8+ characters and contain at least one uppercase letter, number, and special character.
  - Cell phone number must match South African format: `+27XXXXXXXXX`.

- **Login Functionality** with personalized greeting.

- **Messaging**:
  - Send messages (max 250 characters).
  - Validate recipient number format.
  - Generate unique message IDs and hashes.
  - Store messages as JSON files.

- **Storage**:
  - Persist messages using `Gson` to `messages.json`.

- **Testing**:
  - Includes JUnit tests for login and message logic.

## Project Structure
```plaintext
chatapp/
│
├── Login.java               # Handles user data and authentication
├── LoginTest.java           # Unit tests for Login
├── Message.java             # Message handling logic and storage
├── MessageTest.java         # Unit tests for Message
├── Main.java                # Simple CLI-based example usage
└── QuickChat.java           # GUI-based app using JOptionPane
```

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- [JUnit 5](https://junit.org/junit5/) for testing
- [Gson](https://github.com/google/gson) library for JSON operations

### Compile and Run
You can compile and run from the command line or use an IDE like NetBeans.

#### Run CLI Demo:
```bash
javac chatapp/Main.java
java chatapp.Main
```

#### Run GUI Application:
```bash
javac chatapp/QuickChat.java
java chatapp.QuickChat
```

### Run Unit Tests
Use your IDE's test runner or use the command line if set up with a build tool like Maven or Gradle.

## Example Output
**User Registration**
```
Enter a username: kyl_1
Enter a password: Ch&&sec@ke99!
...
User successfully registered.
```

**Sending Message**
```
Recipient: +27123456789
Message: Hello, this is a test.
Message ID: 1837461283
Message Hash: 18:1:HELLOTEST
```

## Known Issues
- `Message.pritnMessage()` and `checkMessageID()` are incomplete methods and throw `UnsupportedOperationException`.
- Some test assertions refer to incorrect expected strings or methods (`pritnMessage()` instead of `printMessage()`).

## Future Improvements
- Implement full message history view.
- Enhance GUI with JavaFX or Swing panels.
- Add message encryption and authentication tokens.

## Author
Luke John Fourie

