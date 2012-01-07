/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataControllers;

import DataInterfaces.ICtrlBonsHotels;
import DomainModel.BonsHotels;
import Hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author clara
 */
public class CtrlBonsHotels implements ICtrlBonsHotels {

    @Override
    public BonsHotels get() {
        Session session = null; 
        BonsHotels bh = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            bh = (BonsHotels) session.get(BonsHotels.class, 1);
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            bh = new BonsHotels();
        }
        return bh;
    }
    
}
