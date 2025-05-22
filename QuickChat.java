/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import javax.swing.JOptionPane;

/**
 *
 * @author luke
 */
public class QuickChat {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to QuickChat");

        // Registration
        String username = JOptionPane.showInputDialog("Enter a username:");
        String password = JOptionPane.showInputDialog("Enter a password:");
        String cell = JOptionPane.showInputDialog("Enter your cell phone number (+27...):");
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String lastName = JOptionPane.showInputDialog("Enter your last name:");

        Login user = new Login(username, password, cell, firstName, lastName);
        JOptionPane.showMessageDialog(null, user.registerUser());

        // Login
        String loginUsername = JOptionPane.showInputDialog("Enter your username to login:");
        String loginPassword = JOptionPane.showInputDialog("Enter your password to login:");

        if (!user.loginUser(loginUsername, loginPassword)) {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Welcome to QuickChat, " + firstName);

        int numMessages = Integer.parseInt(JOptionPane.showInputDialog("How many messages do you want to send?"));
        int sentCount = 0;

        while (true) {
            String option = JOptionPane.showInputDialog(
                    "Choose an option:\n1) Send Messages\n2) Show Recently Sent Messages\n3) Quit");

            switch (option) {
                case "1" -> {
                    if (sentCount >= numMessages) {
                        JOptionPane.showMessageDialog(null, "You've reached your message limit.");
                        break;
                    }

                    String recipient = JOptionPane.showInputDialog("Enter recipient cell number (+27...):");
                    if (!recipient.matches("^\\+27\\d{9}$")) {
                        JOptionPane.showMessageDialog(null, "Recipient number incorrectly formatted.");
                        break;
                    }

                    String messageText = JOptionPane.showInputDialog("Enter message (max 250 chars):");
                    if (messageText.length() > 250) {
                        JOptionPane.showMessageDialog(null, "Please enter a message of less than 250 characters.");
                        break;
                    }

                    Message msg = new Message(recipient, messageText, sentCount + 1);

                    String[] sendOptions = {"Send", "Disregard", "Store for Later"};
                    int sendChoice = JOptionPane.showOptionDialog(
                            null, "What would you like to do with the message?", "Send Message",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, sendOptions, sendOptions[0]);

                    if (sendChoice == 0) {
                        JOptionPane.showMessageDialog(null, msg.printMessage());
                        sentCount++;
                    } else if (sendChoice == 2) {
                        msg.storeMessage();
                        JOptionPane.showMessageDialog(null, "Message stored for later.");
                    }
                }

                case "2" -> JOptionPane.showMessageDialog(null, "Coming Soon.");

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Total messages sent: " + sentCount + "\nGoodbye!");
                    System.exit(0);
                }

                default -> JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
            }
        }
    }
}
