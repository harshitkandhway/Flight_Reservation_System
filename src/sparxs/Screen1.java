/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparxs;
import java.io.*;
/**
 *
 * @author harshit
 */
public class Screen1 extends javax.swing.JFrame {

    DisplayManager dis;

    /**
     * Creates new form F2
     */
    public Screen1(DisplayManager d) {
        this();
        dis = d;
        
    }

    public Screen1() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jsp2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jsp1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FROM");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(240, 270, 53, 22);

        combo1.setBackground(new java.awt.Color(204, 0, 0));
        combo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo1.setForeground(new java.awt.Color(204, 204, 204));
        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DELHI", "MUMBAI", "PUNE" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(combo1);
        combo1.setBounds(380, 260, 190, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TO");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(690, 260, 25, 22);

        jComboBox2.setBackground(new java.awt.Color(204, 0, 0));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGAPORE", " " }));
        jDesktopPane1.add(jComboBox2);
        jComboBox2.setBounds(780, 260, 200, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(240, 350, 48, 22);

        jsp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jsp2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jDesktopPane1.add(jsp2);
        jsp2.setBounds(930, 350, 50, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NUMBER OF SEATS");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(690, 350, 169, 22);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("SEARCH ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(860, 420, 121, 33);

        jsp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jsp1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        jsp1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jsp1.setMinimumSize(new java.awt.Dimension(2, 1));
        jDesktopPane1.add(jsp1);
        jsp1.setBounds(380, 340, 48, 27);

        jButton2.setText("jButton2");
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(380, 511, 0, 1);

        jSpinner3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerListModel(new String[] {"Oct"}));
        jSpinner3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner3.setMinimumSize(new java.awt.Dimension(2, 1));
        jDesktopPane1.add(jSpinner3);
        jSpinner3.setBounds(460, 340, 57, 27);

        jSpinner4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(15, 15, 15, 1));
        jSpinner4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner4.setMinimumSize(new java.awt.Dimension(2, 1));
        jDesktopPane1.add(jSpinner4);
        jSpinner4.setBounds(530, 340, 40, 27);
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(0, 0, 0, 510);

        jLabel6.setFont(new java.awt.Font("Sitka Subheading", 1, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Air");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(330, 60, 100, 80);

        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 70)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Silk");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(200, 60, 140, 80);

        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Spread your wings and let the fairy in you fly! ");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(370, 120, 630, 50);
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1170, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\javalab\\Blackcrab\\Sparxs\\src\\screen2.1.jpg")); // NOI18N
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(-4, -4, 1170, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{ dis.screen1();}
        catch(IOException e){}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    public javax.swing.JSpinner jsp1;
    public javax.swing.JSpinner jsp2;
    // End of variables declaration//GEN-END:variables
}
