package javarmi_timeClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ayeshjayasekara1
 */
public interface Timer extends Remote{
    public String ShowTime()throws RemoteException;
}
