/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luke
 */

public class MessageTest {
    
    @Test
    public void testCorrectMessageID() {
        Message msg = new Message ("+27987654321", "Hello", 1);
        assertTrue(msg.checkMessageID(), "Message ID valid > 0");
    }
    
    @Test
    public void testCorrectRecipient() {
        Message msg = new Message ("+27123456789", "Hello my friend", 1);
        assertEquals(1, msg.checkRecipientCell(), "Valid South African number return 1");
    }
    
    @Test
    public void testIncorrectRecipient() {
        Message msg = new Message("123456789", "Hello", 1);
        assertEquals(0, msg.checkRecipientCell(), "Invailid number return 0");
    }
    
    @Test
    public void testMessageWithinLimit() {
        Message msg = new Message("+27987654321", "Short message", 1);
        assertEquals("Message sent", msg.sentMessage(), "Messages under 250characters send");
    }
    
    @Test
    public void testMessageTooLong() {
        String longMessage = "a".repeat(251);
        Message msg = new Message("+27987654321", longMessage, 1);
        assertEquals("Enter Message less than 250 characters.", msg.sentMessage(), "Message over 250 will be rehected.");
    }
    
    @Test
    public void testCreateMessageHashFormat() {
        Message msg = new Message("+27987654321", "Hi and thanks", 1);
        String hash = msg.createMessageHash();
        assertTrue(hash.matches("`^//d{2}:1:HI.*"), "Hash should match format XX:ID:HI...");
    }
    
    @Test
    public void testPrintMessageFormat() {
        Message msg = new Message("+27987654321", "Hello", 1);
        String output = msg.pritnMessage();
        assertTrue(output.contains("Recipient: +27987654321"), "Output should contain recipient");
        assertTrue(output.contains("Message: Hello!"), "Output should contain message text");
        assertTrue(output.contains("Message ID:"), "Output should contain message ID");
        assertTrue(output.contains("Hash:"), "Outpt should contain message hash");
    }
    
    @Test
    public void testReturnTotalMessagesIncrements() {
        Message msg2 = new Message("+27123456789", "Hi there", 2);
        assertEquals(2, msg2.returnTotalMessages(), "Total messages must reflect number of created massages");
    }
}