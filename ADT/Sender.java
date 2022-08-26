/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author nguye
 */
public class Sender {
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
    
}
