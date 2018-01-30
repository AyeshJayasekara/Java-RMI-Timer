
package javarmi_timeClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



/**
 *
 * @author ayeshjayasekara1
 */
public class GetTime {
    public static void main(String[] args) {

        try{
           Registry reg = LocateRegistry.getRegistry("127.0.0.1",2022);
           Timer stub = (Timer) reg.lookup("Time");
            System.out.println(""+stub.ShowTime());
        }
        catch(Exception e){
            System.out.println("Error!");
        }
    }
}
