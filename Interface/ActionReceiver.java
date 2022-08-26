/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author H
 */
public interface ActionReceiver<T1,T2> {
    public void read(T1 a);
    public void save(T1 a,T2 b);
}
