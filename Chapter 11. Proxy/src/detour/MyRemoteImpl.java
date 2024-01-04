package detour;

import java.io.Serial;
import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Serial
    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {}

    public String sayHello() throws RemoteException {
        return "Server says 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
