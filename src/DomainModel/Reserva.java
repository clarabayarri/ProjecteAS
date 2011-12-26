/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author lluisgh28
 */
public class Reserva {
    Date dataInici;
    Date dataReserva;
    Date dataFi;
    String idReserva;
    Float preuTotal;
    
    public boolean esSolapa(Date dIni, Date dFi) {        
        return dIni.before(dataFi) && dFi.after(dataInici); 
    }
}
