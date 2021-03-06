/*
 * HotelView.java
 *
 * Created on 28/12/2011, 16:40:17
 */
package Presentation;

import TupleTypes.DadesHabitacio;
import TupleTypes.DadesHotel;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 * Classe que representa la informació d'un hotel, per ser inclosa al scroll
 * @author clara
 */
public class HotelView extends javax.swing.JPanel {

    private ArrayList<String> nomsTipus = new ArrayList<String>();
    /** Creates new form HotelView */
    public HotelView() {
        initComponents();
    }
    
    public void loadData(DadesHotel hotel) {
        hotelNameLabel.setText(hotel.nom);
        hotelDescriptionLabel.setText(hotel.desc);
        DefaultListModel model = new DefaultListModel();
        for(DadesHabitacio hab : hotel.habs){
            String dada = hab.tipusHab + " (" + hab.preu + "€) - " + 
                    hab.numeroDisp + " disponibles";
            model.addElement(dada);
            nomsTipus.add(hab.tipusHab);
        }
        tipusHabitacionsList.setModel(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hotelNameLabel = new javax.swing.JLabel();
        hotelDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tipusHabitacionsList = new javax.swing.JList();

        hotelNameLabel.setText("Hotel");

        hotelDescriptionLabel.setText("Description");

        tipusHabitacionsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tipusHabitacionsList);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, hotelDescriptionLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, hotelNameLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(hotelNameLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(hotelDescriptionLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .add(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hotelDescriptionLabel;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList tipusHabitacionsList;
    // End of variables declaration//GEN-END:variables
}
