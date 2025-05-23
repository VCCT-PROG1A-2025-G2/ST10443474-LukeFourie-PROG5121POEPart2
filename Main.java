/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

/**
 *
 * @author luke
 */
public class Main {
    public static void main(String[] args) {
        // Example usage
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

        System.out.println(login.registerUser());
        System.out.println(login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"));
    }  

}
