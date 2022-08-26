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
public class Receiver implements ActionReceiver<Queue,Stack>  {

    @Override
    public void read(Queue a) {
        a.show();
    }

    @Override
    public void save(Queue a, Stack b) {
        b.push(a.dequeue());
    }

    @Override
    public void send(Queue items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}