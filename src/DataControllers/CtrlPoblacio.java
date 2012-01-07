package DataControllers;

import DataInterfaces.ICtrlPoblacio;
import DomainModel.Poblacio;
import Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.management.Query;
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

    @Override
    public ArrayList<Poblacio> tots() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<Poblacio> resultat = new ArrayList<Poblacio>();
        Session session = null; 
        Poblacio p = null;
        /*try {
            
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query q = (Query) session.createSQLQuery("SELECT NOM FROM POBLACIO").addEntity(Poblacio.class);
            List result = session;
            
            
                    
            //p = (Poblacio) session.get(Poblacio.class, nom);
          
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw new Exception("noHiHaPoblacions");
        }*/
        return resultat;
    }
        
}
