/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Receiver;
import Controller.Sender;
import Entity.Queue;
import Entity.Stack;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        Queue message = new Queue(50);
        Stack memory = new Stack(50);
        
        Scanner s = new Scanner(System.in);
        System.out.println("-----Write message-----");
        sender.send(message);
        System.out.println("-----Read message-----");
        receiver.read(message);
        receiver.save(message, memory);
        
    }
    
}
