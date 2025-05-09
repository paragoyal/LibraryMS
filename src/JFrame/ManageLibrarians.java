/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package JFrame;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dell
 */
public class ManageLibrarians extends javax.swing.JFrame {
    DefaultTableModel model;
    
    /**
     * Creates new form ManageBooks
     */    
    public ManageLibrarians() {
        initComponents();
        setLibrarianDetailsToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_librarianName = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_password = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_email = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_contact = new app.bolivia.swing.JCTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_librarianId = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_librarianCredentials = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle3.setText("Update");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 130, 70));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle4.setText("Delete");
        rSMaterialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 130, 70));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle5.setText("Add");
        rSMaterialButtonCircle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 130, 70));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 106, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Librarian Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 290, -1));

        txt_librarianName.setBackground(new java.awt.Color(102, 102, 255));
        txt_librarianName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_librarianName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_librarianName.setPlaceholder("Enter Librarian Name..");
        txt_librarianName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_librarianNameFocusLost(evt);
            }
        });
        txt_librarianName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_librarianNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_librarianName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 330, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 60, -1));

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 290, -1));

        txt_password.setBackground(new java.awt.Color(102, 102, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_password.setPlaceholder("Enter Password...");
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 330, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 60, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 290, -1));

        txt_email.setBackground(new java.awt.Color(102, 102, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_email.setPlaceholder("Enter Email...");
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 330, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 60, -1));

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contact");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 290, -1));

        txt_contact.setBackground(new java.awt.Color(102, 102, 255));
        txt_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_contact.setPlaceholder("Enter Contact..");
        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });
        jPanel1.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 330, -1));

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Librarian Id");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 290, -1));

        txt_librarianId.setBackground(new java.awt.Color(102, 102, 255));
        txt_librarianId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_librarianId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_librarianId.setPlaceholder("Enter Librarian Id...");
        txt_librarianId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_librarianIdFocusLost(evt);
            }
        });
        txt_librarianId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_librarianIdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_librarianId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 330, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 830));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        tbl_librarianCredentials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password", "Email", "Contact"
            }
        ));
        tbl_librarianCredentials.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_librarianCredentials.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_librarianCredentials.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_librarianCredentials.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_librarianCredentials.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        tbl_librarianCredentials.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_librarianCredentials.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        tbl_librarianCredentials.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tbl_librarianCredentials.setRowHeight(40);
        tbl_librarianCredentials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_librarianCredentialsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_librarianCredentials);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 760, 190));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Student_Male_100px.png"))); // NOI18N
        jLabel1.setText("Manage Librarians");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 310, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 410, 5));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 940, 830));

        setSize(new java.awt.Dimension(1522, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // To set the book details into the table
    public void setLibrarianDetailsToTable(){
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM librarian_credentials";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("txt_librarianId");
                String name = rs.getString("txt_librarianName");
                String password = rs.getString("txt_password");
                String email = rs.getString("txt_email");
                String contact = rs.getString("txt_contact");

                Object[] obj = {id, name, password, email, contact};
                model = (DefaultTableModel) tbl_librarianCredentials.getModel();
                model.addRow(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Method to add student to student_details table
    public boolean addLibrarian() {
        boolean isAdded = false;
        int id = Integer.parseInt(txt_librarianId.getText());
        String name = txt_librarianName.getText();
        String password = txt_password.getText();
        String email = txt_email.getText();
        String contact = txt_contact.getText();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO librarian_credentials(id, name, password, email, contact) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, password);
            pst.setString(4, email);
            pst.setString(5, contact);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isAdded = true;
            } else {
                isAdded = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }
    
    // Method tp update student details
    public boolean updateLibrarian() {
        boolean isUpdated = false;
        int id = Integer.parseInt(txt_librarianId.getText());
        String name = txt_librarianName.getText();
        String password = txt_password.getText();
        String email = txt_email.getText();
        String contact = txt_contact.getText();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE librarian_credentials SET name = ?, password = ?, email = ?, contact = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            pst.setString(3, email);
            pst.setString(4, contact);
            pst.setInt(5, id);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isUpdated = true;
            } else {
                isUpdated = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
    
    // Method to delete book detail
    public boolean deleteLibrarian() {
        boolean isDeleted = false;
        int id = Integer.parseInt(txt_librarianId.getText());

        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM librarian_credentials WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isDeleted = true;
                setLibrarianDetailsToTable();
            } else {
                isDeleted = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
    
    // Method to clear table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) tbl_librarianCredentials.getModel();
        model.setRowCount(0);
    }
    
    private void rSMaterialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4ActionPerformed
        if(deleteLibrarian() == true){
            JOptionPane.showMessageDialog(this, "Librarian Deleted.");
            clearTable();
            setLibrarianDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Librarian Deletion Failed.");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle4ActionPerformed

    private void rSMaterialButtonCircle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle5ActionPerformed
        if(addLibrarian() == true){
            JOptionPane.showMessageDialog(this, "Librarian Added.");
            clearTable();
            setLibrarianDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Librarian Addition Failed.");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        AdminDashboard adminDashboard= new AdminDashboard();
        adminDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tbl_librarianCredentialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_librarianCredentialsMouseClicked
        int rowNo = tbl_librarianCredentials.getSelectedRow();
        
        TableModel model = tbl_librarianCredentials.getModel();
        
        txt_librarianId.setText(model.getValueAt(rowNo, 0).toString());
        txt_librarianName.setText(model.getValueAt(rowNo, 1).toString());
        txt_password.setText(model.getValueAt(rowNo, 2).toString());
        txt_email.setText(model.getValueAt(rowNo, 1).toString());
        txt_contact.setText(model.getValueAt(rowNo, 1).toString());

    }//GEN-LAST:event_tbl_librarianCredentialsMouseClicked

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactActionPerformed

    private void txt_librarianNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_librarianNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_librarianNameActionPerformed

    private void txt_librarianNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_librarianNameFocusLost

    }//GEN-LAST:event_txt_librarianNameFocusLost

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        if(updateLibrarian()== true){
            JOptionPane.showMessageDialog(this, "Student Updated.");
            clearTable();
            setLibrarianDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Student Updation Failed.");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void txt_librarianIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_librarianIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_librarianIdFocusLost

    private void txt_librarianIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_librarianIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_librarianIdActionPerformed

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
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageLibrarians().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojeru_san.complementos.RSTableMetro tbl_librarianCredentials;
    private app.bolivia.swing.JCTextField txt_contact;
    private app.bolivia.swing.JCTextField txt_email;
    private app.bolivia.swing.JCTextField txt_librarianId;
    private app.bolivia.swing.JCTextField txt_librarianName;
    private app.bolivia.swing.JCTextField txt_password;
    // End of variables declaration//GEN-END:variables
}
