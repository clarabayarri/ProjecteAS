package DataControllers;

import DataInterfaces.ICtrlPoblacio;
import DomainModel.Poblacio;
import Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


/**
 * Controlador de cada de gestió de dades encarregat de recuperar 
 * instancies de poblacions.
 * @author elena
 */
public class CtrlPoblacio implements ICtrlPoblacio{

    @Override
    public Poblacio get(String nom) throws Exception{
        //throw new UnsupportedOperationException("Not supported yet.");
        Session session = null; 
        Poblacio p = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            p = (Poblacio) session.get(Poblacio.class, nom);
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw new Exception("poblacioNoExisteix");
        }
        return p;
    }

    public List<Poblacio> tots() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<Poblacio> resultat = new ArrayList<Poblacio>();
        Session session = null; 
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            resultat = session.createQuery("from Poblacio").list();
            
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw new Exception("noHiHaPoblacions");
        }
        return resultat;
    }
        
}
