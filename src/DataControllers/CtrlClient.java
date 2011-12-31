package DataControllers;

import DataInterfaces.ICtrlClient;
import DomainModel.Client;

/**
 * Contrlador de cada de gestió de dades encarregat de recuperar 
 * instancies de clients.
 * @author clara
 */
public class CtrlClient implements ICtrlClient{

    @Override
    public Client get(String dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
