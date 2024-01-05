package gumball;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
    State getState() throws RemoteException;
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
}
