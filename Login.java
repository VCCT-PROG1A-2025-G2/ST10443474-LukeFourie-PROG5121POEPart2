/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

/**
 *
 * @author luke
 */public class Login {

        private final String username;
        private final String password;
        private final String phoneNumber;
        private final String firstName;
        private final String lastName;

        public Login(String username, String password, String phoneNumber, String firstName, String lastName) {
            this.username = username;
            this.password = password;
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public boolean checkUserName() {
            return username.contains("_") && username.length() <= 5;
        }

        public boolean checkPasswordComplexity() {
            return password.length() >= 8
                    && password.matches(".*[A-Z].*")
                    && password.matches(".*[0-9].*")
                    && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        }

        public boolean checkCellPhoneNumber() {
            return phoneNumber.matches("^\\+27\\d{9}$");
        }

        public String registerUser() {
            if (checkUserName() && checkPasswordComplexity() && checkCellPhoneNumber()) {
                return "User successfully registered.";
            } else {
                return "Registration failed due to input errors.";
            }
        }

        public boolean loginUser(String enteredUsername, String enteredPassword) {
            return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
        }

        public String returnLoginStatus(String enteredUsername, String enteredPassword) {
            if (loginUser(enteredUsername, enteredPassword)) {
                return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
            } else {
                return "Username or password incorrect, please try again.";
            }
        }
    }

