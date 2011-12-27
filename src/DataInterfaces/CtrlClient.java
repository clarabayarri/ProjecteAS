/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterfaces;

import DomainModel.Client;

/**
 *
 * @author clara
 */
public interface CtrlClient {
    
    /**
     * Recupera un client a partir del seu dni
     * @param dni
     * @return 
     */
    public Client get(String dni);
}
