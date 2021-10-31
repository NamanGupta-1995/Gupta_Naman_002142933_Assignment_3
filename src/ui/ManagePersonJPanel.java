/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author namangupta
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonJPanel
     */
    
    PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public ManagePersonJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        populatePersonsTable(this.personDirectory.getPersonDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonJTable = new javax.swing.JTable();
        btnUpdatePerson = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        btnSearchPerson = new javax.swing.JButton();
        txtSearchPerson = new javax.swing.JTextField();
        lblEditPerson = new javax.swing.JLabel();
        lblEditName = new javax.swing.JLabel();
        lblEditAge = new javax.swing.JLabel();
        lblEditAddress = new javax.swing.JLabel();
        txtEditName = new javax.swing.JTextField();
        txtEditAge = new javax.swing.JTextField();
        txtEditAddress = new javax.swing.JTextField();
        btnEditPerson = new javax.swing.JButton();

        lblTitle.setText("PERSON");

        viewPersonJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "AGE", "HOUSE ADDRESS", "PATIENT ID"
            }
        ));
        jScrollPane1.setViewportView(viewPersonJTable);

        btnUpdatePerson.setText("UPDATE PERSON");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });

        btnDeletePerson.setText("DELETE PERSON");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        btnSearchPerson.setText("SEARCH PERSON");

        txtSearchPerson.setText("jTextField1");

        lblEditPerson.setText("Update Person");

        lblEditName.setText("NAME");

        lblEditAge.setText("AGE");

        lblEditAddress.setText("HOUSE ADDRESS");

        txtEditName.setText("jTextField1");

        txtEditAge.setText("jTextField2");

        txtEditAddress.setText("jTextField3");

        btnEditPerson.setText("UPDATE");
        btnEditPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditPerson)
                        .addGap(343, 343, 343)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditAge)
                    .addComponent(lblEditAddress)
                    .addComponent(lblEditName))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSearchPerson)
                .addGap(79, 79, 79)
                .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnUpdatePerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletePerson)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditPerson)
                .addGap(367, 367, 367))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchPerson)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePerson)
                    .addComponent(btnDeletePerson))
                .addGap(18, 18, 18)
                .addComponent(lblEditPerson)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditName)
                    .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditAge)
                    .addComponent(txtEditAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditAddress)
                    .addComponent(txtEditAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnEditPerson)
                .addGap(88, 88, 88))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow= viewPersonJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) viewPersonJTable.getModel();
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);
                
            txtEditName.setText(selectedPerson.getName());
            txtEditAge.setText(String.valueOf(selectedPerson.getAge()));
            txtEditAddress.setText(selectedPerson.getHouseAddress());
        }
        
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void btnEditPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPersonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonJTable.getSelectedRow();
        
        String updatedName = txtEditName.getText();
        int updatedAge = Integer.parseInt(txtEditAge.getText());
        String updatedAddress = txtEditAddress.getText();
        
        Person updatedPerson = personDirectory.createPerson();
        updatedPerson.setName(updatedName);
        updatedPerson.setAge(updatedAge);
        updatedPerson.setHouseAddress(updatedAddress);
        
        JOptionPane.showMessageDialog(this, "Person UPDATED.");
        DefaultTableModel model = (DefaultTableModel) viewPersonJTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);
        personDirectory.deletePerson(selectedPerson);
        
        populatePersonsTable(personDirectory.getPersonDirectory());
        
        txtEditName.setText("");
        txtEditAge.setText("");
        txtEditAddress.setText("");
        
    }//GEN-LAST:event_btnEditPersonActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = viewPersonJTable.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) viewPersonJTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        personDirectory.deletePerson(selectedPerson);
        
        JOptionPane.showMessageDialog(this, "Selected Person Deleted.");
        populatePersonsTable(personDirectory.getPersonDirectory());
        
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    
    private void populatePersonsTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonJTable.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[4];
            row[0] = person;
            row[1] = person.getAge();
            row[2] = person.getHouseAddress();
            
            if(person.getPatient()!=null)
            {
                row[3] = person.getPatient().getId();
            }
            else
            {
                row[3] = "Patient Not Created";
            }
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnEditPerson;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditAddress;
    private javax.swing.JLabel lblEditAge;
    private javax.swing.JLabel lblEditName;
    private javax.swing.JLabel lblEditPerson;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEditAddress;
    private javax.swing.JTextField txtEditAge;
    private javax.swing.JTextField txtEditName;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTable viewPersonJTable;
    // End of variables declaration//GEN-END:variables
}
