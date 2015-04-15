/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import Backend.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author jusji_000
 */
public class RegistrationSearch extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationSearch
     */
    public RegistrationSearch() {
        initComponents();
        jButton2.addActionListener(new Handler());
        jButton1.addActionListener(new Handler());
        jButton4.addActionListener(new Handler());
        jButton3.addActionListener(new Handler());
        jMenuItem1.addActionListener(new Handler());
        jMenuItem2.addActionListener(new Handler());
        buildTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SSN", "Name","First Name","Last Name","DOB" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search Patient");

        jTable1.setModel(new NonEditableTable());
        String[] columns = {"SSN","First Name","Last Name","Address","Medical Insurance", "DOB","ZIP", "Gender","Next Visit"};
        ((NonEditableTable) jTable1.getModel()).setColumnIdentifiers(columns);
        jTable1.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("New Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit Patient");

        jButton4.setText("Delete Patient");

        jMenu1.setText("File");

        jMenuItem1.setText("Log out");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel2)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
 // <editor-fold defaultstate="collapsed" desc="ActionListener NEEDS COMMENTS"> 
    public class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==jMenuItem1){
                new Login().setVisible(true);
                dispose();
            }
            if(e.getSource()==jMenuItem2){
                System.exit(0);
            }
            if(e.getSource()==jButton4){
                 try {
                     System.out.println("here");
                    // Creates a connection to the database
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
                    Statement stmt = con.createStatement();
                    String sql="DELETE FROM patients WHERE SSN = "+jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0 )+"";
                    stmt.executeUpdate(sql);
                    buildTable();
                    con.close();
                    stmt.close();
                 }
                 catch (ClassNotFoundException ex) {
            ex.printStackTrace();
                 } catch (SQLException ex) {
            ex.printStackTrace();
        }
            }
            if(e.getSource()==jButton2){
                new Registration().setVisible(true);
            }
            if(e.getSource()==jButton3){
                new Registration((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0 )
                        ,(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7 ),
                        (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 8 )).setVisible(true);
            }
            if(e.getSource()==jButton1){
                buildTable();
            }
        }
    }
    
    public void buildTable() {
                  int rows = jTable1.getRowCount();
        for (int i = 0; i < rows; i++) {
            ((javax.swing.table.DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
        
        // Gets the username from the text field
        String query = jTextField1.getText();
        
        // Strings for the password and section from the database
        String firstN = "";
        String lastN = "";
        String add = "";
        String medInsur = "";
        String dob = "";
        String zip = "";
        String gender = "";
        String nextV = "";
        
        try {
            
            // Creates a connection to the database
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
            Statement stmt = con.createStatement();
            String sql="";
            // SQL statement that returns all of the usernames that match the username entered in the text field
            switch(jComboBox1.getSelectedIndex()){
                case 0:
                    sql = "SELECT * FROM Patients WHERE SSN LIKE '" + query + "%'";
                    break;
                case 1:
                    String[] temp = query.split(" ");
                    sql = "SELECT * FROM Patients WHERE (FirstName LIKE '" + temp[0] + "%' AND LastName LIKE '"+temp[1]+"%')";
                    break;
                case 2:
                    sql = "SELECT * FROM Patients WHERE FirstName LIKE '" + query + "%'";
                    break;
                case 3:
                    sql = "SELECT * FROM Patients WHERE LastName LIKE '" + query + "%'";
                    break;
                default:
                    sql = "SELECT * FROM Patients WHERE DOB LIKE '%" + query + "%'";
                    break;
            }
            
            
            
            
            
            
            
            
            ResultSet rs = stmt.executeQuery(sql);
            
            // Loop through all the results and add each to the table model
            while (rs.next()) {
                
                // Data from the database for that result
                query = rs.getString("SSN");
                firstN = rs.getString("FirstName");
                lastN = rs.getString("LastName");
                add = rs.getString("Address");
                medInsur = rs.getString("MedicalInsurance");
                dob = rs.getString("DOB");
                zip = rs.getString("zip");
                gender = rs.getString("gender");
                nextV =rs.getString("NextVisit");
                
                // Adds the data to the table model
                ((javax.swing.table.DefaultTableModel) jTable1.getModel()).addRow(new Object[]{query, firstN, lastN, add, medInsur, dob, zip, gender, nextV});

            }
            
            // Closes the connection to the database
            rs.close();
            stmt.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    // </editor-fold>  
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
            java.util.logging.Logger.getLogger(RegistrationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    }
