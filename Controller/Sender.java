/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Queue;
import java.util.Scanner;
import Interface.ActionSender;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author nguye
 */
public class Sender implements ActionSender<Queue> {
    

    @Override
    public void send(Queue items) {
        boolean check = true;
        String mess = null;
        Scanner s = new Scanner(System.in);
        while(check){
            System.out.print("Enter a message : ");
            mess = s.nextLine();
            if(mess.equals("")){
                System.out.println("You have not entered anything! Please re-enter.");
            }
            else if(mess.length() <= 50){
                    if(mess.equalsIgnoreCase("Send")){
                        check = false;
                    }else{
                        LocalDateTime current = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
                        String formatted = current.format(formatter);
                        items.enqueue(mess+" Sent at "+formatted);
                    } 
            }else{
                System.out.println("Your message is over 250 character!! Please re-enter!!");
            }
        }
    }
    
}
