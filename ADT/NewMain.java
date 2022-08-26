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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sender sender = new Sender();
        Scanner s = new Scanner(System.in);
        Queue queue = new Queue(50);
        Stack stack = new Stack(50);
        
        boolean check = true;
        while(check){
            System.out.print("Enter a message : ");
            String mess = s.nextLine();
            queue.enqueue(mess);
            if(mess.equals("Exit")){
                check = false;
            }
        }
        System.out.println("-----Show message-----");
        queue.show();
        stack.push(queue.dequeue());  
        
    }
    
}
