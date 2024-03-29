package chatapp.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInfoItf extends Remote {
    String getUsername() throws RemoteException;
    void receiveMessage(String message) throws RemoteException;
}
