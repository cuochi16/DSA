/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.ActionReceiver;
import Entity.Queue;
import Entity.Stack;

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
}