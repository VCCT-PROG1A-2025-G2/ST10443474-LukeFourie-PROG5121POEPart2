/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luke
 */
public class LoginTest {

        @Test
        public void testCorrectUsername() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertTrue(login.checkUserName());
        }

        @Test
        public void testIncorrectUsername() {
            Login login = new Login("kyle!!!!!!", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertFalse(login.checkUserName());
        }

        @Test
        public void testCorrectPassword() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertTrue(login.checkPasswordComplexity());
        }

        @Test
        public void testIncorrectPassword() {
            Login login = new Login("kyl_1", "password", "+27838968976", "Kyle", "Smith");
            assertFalse(login.checkPasswordComplexity());
        }

        @Test
        public void testCorrectCellNumber() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertTrue(login.checkCellPhoneNumber());
        }

        @Test
        public void testIncorrectCellNumber() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "08966553", "Kyle", "Smith");
            assertFalse(login.checkCellPhoneNumber());
        }

        @Test
        public void testLoginSuccessful() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
        }

        @Test
        public void testLoginFailed() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            assertFalse(login.loginUser("wrong", "wrong"));
        }
    }
