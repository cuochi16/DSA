/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Sender implements Action<Queue> {
    private String message;

    public Sender(String message) {
        this.message = message;
    }
    
    public Sender() {
        
    }

    public String getSMessage() {
        return message;
    }

    public void setSMessage(String message) {
        this.message = message;
    }

    @Override
    public void send(Queue items) {
        boolean check = true;
        Scanner s = new Scanner(System.in);
        while(check){
            System.out.print("Enter a message : ");
            String mess = s.nextLine();
            if(mess.equalsIgnoreCase("Exit")|| mess.length()>12){
                check = false;
            }else{
                items.enqueue(mess);
            }
        }
    }

    @Override
    public void read(Queue items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
