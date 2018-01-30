/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi_timeServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import javarmi_timeClient.Timer;

/**
 *
 * @author ayeshjayasekara1
 */
public class TimeNow extends UnicastRemoteObject implements Timer{

    TimeNow() throws RemoteException{
        super();
    }
    @Override
    public String ShowTime(){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return LocalDateTime.now().toString();
    }
    
}
