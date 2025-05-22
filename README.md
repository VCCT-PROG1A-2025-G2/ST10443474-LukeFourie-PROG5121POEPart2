# ST10443474-LukeFourie-PROG5121POEPart2

# ChatApp Java Application

ChatApp is a lightweight Java-based desktop chat simulator that enables user registration, login, and message sending. It includes validation for usernames, passwords, and South African cell phone numbers, and supports JSON-based message storage.

## Features

- User registration and login
- Input validation:
  - Username format
  - Password complexity
  - South African cellphone format (+27...)
- Send messages (up to 250 characters)
- Store messages to file
- Save messages to a JSON file using GSON
- Unit tested with JUnit 5

## Technologies Used

- Java 17+
- Swing (`JOptionPane`) for UI
- JUnit 5 for testing
- GSON for JSON export
- NetBeans IDE (recommended)

## Project Structure
  chatapp/
├── QuickChat.java # Main program entry
├── Login.java # Handles user authentication and validation
├── Message.java # Manages message creation, IDs, hashes, and file storage
├── LoginTest.java # Unit tests for Login functionality
├── MessageTest.java # Unit tests for Message functionality
└── messages.json # (Generated) File storing saved messages


## Running Tests

1. Ensure JUnit 5 is configured (NetBeans usually includes it).
2. Right-click `LoginTest.java` or `MessageTest.java` in NetBeans and select **Test File**.
3. You should see passing results for validation, login logic, and message processing.

### Covered Tests:
- Username and password checks
- SA phone number format validation
- Login success and failure
- Message ID format and character limit
- Message hash structure and JSON file creation

## Usage Instructions

1. **Launch QuickChat.java**.
2. Register with a username, password, cellphone, and name.
3. Login with the same credentials.
4. Choose from:
   - **1) Send Messages**: Enter recipient number and message text.
   - **2) Show Recently Sent Messages** *(Coming soon)*.
   - **3) Quit**: Displays message count and exits.
5. Decide to:
   - Send the message (displays it),
   - Store for later (saves to `messages.json`),
   - Or disregard the message.

## Message Storage Format

Messages are saved to `messages.json` in JSON format like this:

```json
{
  "recipient": "+27834567891",
  "message": "Hi there!",
  "messageNum": 1,
  "messageID": "1234567890",
  "messageHash": "12:1:HITHERE"
}
