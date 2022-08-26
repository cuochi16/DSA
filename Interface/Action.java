/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author H
 */
public interface Action<T>  {
    public void send(T items);
    public void read(T items);
}
