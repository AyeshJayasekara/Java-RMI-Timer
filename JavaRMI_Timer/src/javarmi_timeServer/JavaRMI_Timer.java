/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi_timeServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ayeshjayasekara1
 */
public class JavaRMI_Timer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            TimeNow time = new TimeNow();
            Registry reg  = LocateRegistry.createRegistry(2022);
            reg.bind("Time", time);
            System.out.println("Server Started!");
        }
        catch(Exception e){
            System.out.println("Error! "+e.toString());
        }
    }
    
}
