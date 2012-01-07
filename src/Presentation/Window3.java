/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Window3.java
 *
 * Created on 28-dic-2011, 16:39:03
 */
package Presentation;

import TupleTypes.DadesReserva;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author elena
 */
public class Window3 extends javax.swing.JFrame {

    /** Creates new form Window3 */
    public Window3() {
        initComponents();
    }
    
    
    public void mostraError(String m){
        Terror.setText(m);
    }
    
    /*public void mostraPreu(float preu){
        Tpreu.setText(Float.toString(preu));
    }*/
    
    public void mostraDades(DadesReserva r){
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Tpoblacio.setText(r.pob);
        TdIni.setText(s.format(r.dIni));
        TdFi.setText(s.format(r.dFi));
        TnOcup.setText(r.numOc.toString());
        Thotel.setText(r.nomHotel);
        Thabitacio.setText(r.nomTipusHab);
        
    }
    
    public String setDni(){
        return Tdni.getText();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poblacio = new javax.swing.JLabel();
        dIni = new javax.swing.JLabel();
        dFI = new javax.swing.JLabel();
        numOc = new javax.swing.JLabel();
        hotel = new javax.swing.JLabel();
        habitacio = new javax.swing.JLabel();
        preuTotal = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        Tdni = new javax.swing.JTextField();
        dacord = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        Tpoblacio = new javax.swing.JTextField();
        TdIni = new javax.swing.JTextField();
        TdFi = new javax.swing.JTextField();
        TnOcup = new javax.swing.JTextField();
        Thotel = new javax.swing.JTextField();
        Thabitacio = new javax.swing.JTextField();
        Tpreu = new javax.swing.JTextField();
        Terror = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        poblacio.setText("Població");

        dIni.setText("Data d'inici");

        dFI.setText("Data de finalització");

        numOc.setText("Número d'ocupants");

        hotel.setText("Hotel");

        habitacio.setText("Habitació");

        preuTotal.setText("Preu total");

        dni.setText("DNI");

        Tdni.setText("jTextField8");

        dacord.setText("D'acord");

        cancela.setText("Cancel·la");

        Tpoblacio.setText("jTextField1");

        TdIni.setText("jTextField2");
        TdIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdIniActionPerformed(evt);
            }
        });

        TdFi.setText("jTextField3");

        TnOcup.setText("jTextField4");

        Thotel.setText("jTextField5");

        Thabitacio.setText("jTextField6");

        Tpreu.setText("jTextField7");

        Terror.setText("jTextField8");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Terror, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(poblacio)
                            .add(dIni)
                            .add(preuTotal)
                            .add(dFI)
                            .add(habitacio)
                            .add(dni)
                            .add(numOc)
                            .add(hotel))
                        .add(48, 48, 48)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Tdni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Tpoblacio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TdIni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TdFi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TnOcup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Thotel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Thabitacio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Tpreu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(dacord)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 322, Short.MAX_VALUE)
                        .add(cancela)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(poblacio)
                    .add(Tpoblacio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(dIni)
                    .add(TdIni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(dFI)
                    .add(TdFi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(TnOcup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(numOc))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Thotel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hotel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(habitacio)
                    .add(Thabitacio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(preuTotal)
                    .add(Tpreu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dni)
                    .add(Tdni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Terror, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 17, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dacord)
                    .add(cancela))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TdIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdIniActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Window3().setVisible(true);
            }
        });
       
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TdFi;
    private javax.swing.JTextField TdIni;
    private javax.swing.JTextField Tdni;
    private javax.swing.JTextField Terror;
    private javax.swing.JTextField Thabitacio;
    private javax.swing.JTextField Thotel;
    private javax.swing.JTextField TnOcup;
    private javax.swing.JTextField Tpoblacio;
    private javax.swing.JTextField Tpreu;
    private javax.swing.JButton cancela;
    private javax.swing.JLabel dFI;
    private javax.swing.JLabel dIni;
    private javax.swing.JButton dacord;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel habitacio;
    private javax.swing.JLabel hotel;
    private javax.swing.JLabel numOc;
    private javax.swing.JLabel poblacio;
    private javax.swing.JLabel preuTotal;
    // End of variables declaration//GEN-END:variables
}
