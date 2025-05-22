/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luke
 */

public class MessageTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCorrectMessageID() {
        Message msg = new Message("+27834567891", "Hi there", 1);
        assertTrue(msg.checkMessagesID());
    }

    @Test
    public void testCorrectRecipient() {
        Message msg = new Message("+27834567891", "Hello friend", 1);
        assertEquals(1, msg.checkRecipientCell());
    }

    @Test
    public void testIncorrectRecipient() {
        Message msg = new Message("089111234", "Hello", 1);
        assertEquals(0, msg.checkRecipientCell());
    }

    @Test
    public void testMessageWithinLimit() {
        Message msg = new Message("+27834567891", "Short message", 1);
        assertEquals("Message sent", msg.sentMessage());
    }

    @Test
    public void testMessageTooLong() {
        String longMessage = "a".repeat(251);
        Message msg = new Message("+27834567891", longMessage, 1);
        assertEquals("Please enter a message of less than 250 characters.", msg.sentMessage());
    }

    @Test
    public void testCreateMessageHash() {
        Message msg = new Message("+27834567891", "Hi and thanks", 1);
        String hash = msg.createMessageHash();
        assertTrue(hash.matches("^\\d{2}:1:HI.+"));
    }

    /**
     * Test of checkMessagesID method, of class Message.
     */
    @Test
    public void testCheckMessagesID() {
        System.out.println("checkMessagesID");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.checkMessagesID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = null;
        int expResult = 0;
        int result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessage method, of class Message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        Message instance = null;
        String expResult = "";
        String result = instance.sentMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessage method, of class Message.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        Message instance = null;
        String expResult = "";
        String result = instance.printMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = null;
        instance.storeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Message instance = null;
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMessagesToJson method, of class Message.
     */
    @Test
    public void testSaveMessagesToJson() {
        System.out.println("saveMessagesToJson");
        List<Message> messages = null;
        String filename = "";
        Message.saveMessagesToJson(messages, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Message.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Message.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
