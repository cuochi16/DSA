/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import Entity.Queue;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Sender implements Action<Queue> {
    

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
}
