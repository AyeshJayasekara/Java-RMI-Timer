/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi_timeServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ayeshjayasekara1
 */
public interface Timer extends Remote{
    public String ShowTime()throws RemoteException;
}
