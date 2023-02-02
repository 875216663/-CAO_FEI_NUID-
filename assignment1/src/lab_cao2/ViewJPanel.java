/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lab_cao2;

import Model.Contact;
import Model.Person;
import Model.Recipe;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author caofei
 */
public class ViewJPanel extends javax.swing.JPanel {
   private Contact delPackage;
    private Recipe recipeViewed;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
    }
    ViewJPanel(Contact delPackage) {
        initComponents();
        
        this.delPackage = delPackage;
        display();
        displayProductList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldFname = new javax.swing.JTextField();
        fieldLname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldUname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldpersonPhone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fieldpersonEmail = new javax.swing.JTextField();
        productComboBox = new javax.swing.JComboBox();
        btnShow = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonBrowseImage = new javax.swing.JButton();
        fielddeS = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fieldrecT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldnoS = new javax.swing.JTextField();
        fieldigF = new javax.swing.JTextField();
        fielddL = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fieldnoI = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fieldcoF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        recipePath = new javax.swing.JTextField();

        jLabel8.setText("Username - Unique");

        jLabel9.setText("Chef’s First Name");

        jLabel10.setText("Chef’s Last Name");

        jLabel21.setText("person phone");

        jLabel22.setText("person email");

        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel20.setText("Picture");

        jButtonBrowseImage.setText("Browser");
        jButtonBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseImageActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel17.setText("Recipe ");

        jLabel11.setText("Recipe title");

        jLabel12.setText("No. of Servings");

        jLabel13.setText("Is Gluten Free ");

        jLabel14.setText("Difficulty level ");

        jLabel15.setText("No. of Ingredients");

        fieldnoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnoIActionPerformed(evt);
            }
        });

        jLabel16.setText("Category of food");

        jLabel18.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(15, 15, 15)
                                .addComponent(fieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel21)
                                .addGap(30, 30, 30)
                                .addComponent(fieldpersonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(15, 15, 15)
                                .addComponent(fieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(fieldUname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel22)
                                .addGap(35, 35, 35)
                                .addComponent(fieldpersonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel15)))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldrecT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldnoS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldigF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fielddL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldnoI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel16)
                                        .addGap(43, 43, 43)
                                        .addComponent(fieldcoF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel18)
                                        .addGap(84, 84, 84)
                                        .addComponent(fielddeS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(recipePath, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20)
                                            .addComponent(jButtonBrowseImage))))))))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21))
                    .addComponent(fieldpersonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(fieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(fieldUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(fieldpersonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel12)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel14)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldrecT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(fieldnoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(fieldigF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(fielddL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(fieldnoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(fieldcoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(fielddeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonBrowseImage)
                        .addGap(50, 50, 50)
                        .addComponent(recipePath, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productComboBoxActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:

       fieldrecT.setEnabled(false);

        String pidd = (String) productComboBox.getSelectedItem();
        Recipe rec = this.delPackage.findRecipe(pidd);
        this.recipeViewed = rec;
        if (!rec.equals(null)) {

            fieldrecT.setText(rec.getRecT());
            fieldnoS.setText(String.valueOf(rec.getNoS()));
            fieldigF.setText(rec.getIgF());
            fielddL.setText(String.valueOf(rec.getdL()));
            fieldnoI.setText(String.valueOf(rec.getNoI()));
            fieldcoF.setText(rec.getCoF());
            fielddeS.setText(rec.getDeS());

        } else {
            JOptionPane.showMessageDialog(null, "Product not found");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void jButtonBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile=new JFileChooser();

        FileNameExtensionFilter fnef=new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue=browseImageFile.showOpenDialog(null);

        if(showOpenDialogue==JFileChooser.APPROVE_OPTION){
            File selectedImageFile=browseImageFile.getSelectedFile();
            String selectedImagePath=selectedImageFile.getAbsolutePath();
            recipePath.setText(selectedImagePath);

            ImageIcon ii=new ImageIcon(selectedImagePath);
            Image image=ii.getImage().getScaledInstance(jLabelImage.getWidth(),jLabelImage.getHeight(),Image.SCALE_SMOOTH);
            jLabelImage.setIcon(new ImageIcon(image));

        }
    }//GEN-LAST:event_jButtonBrowseImageActionPerformed

    private void fieldnoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldnoIActionPerformed
    public void display() {
        fieldpersonPhone.setText(String.valueOf(this.delPackage.getPhoneNumber()));
        fieldpersonEmail.setText(this.delPackage.getEmailID());
        
        Person customer=this.delPackage.getCustomer();
        fieldFname.setText(customer.getfName());
        fieldLname.setText(customer.getlName());
        fieldUname.setText(customer.getuName());


    }
    public void displayProductList() {

        for (Recipe p : this.delPackage.getProductList()) {
            productComboBox.addItem(p.getRecT());
        }

    }

    public void displayPackageDetails() {
        fieldpersonPhone.setText(String.valueOf(this.delPackage.getPhoneNumber()));
        fieldpersonEmail.setText(String.valueOf(this.delPackage.getEmailID()));
        

        Person customer = this.delPackage.getCustomer();
        
        fieldFname.setText(customer.getfName());
        fieldLname.setText(customer.getlName());
        fieldUname.setText(customer.getuName());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JTextField fieldFname;
    private javax.swing.JTextField fieldLname;
    private javax.swing.JTextField fieldUname;
    private javax.swing.JTextField fieldcoF;
    private javax.swing.JTextField fielddL;
    private javax.swing.JTextField fielddeS;
    private javax.swing.JTextField fieldigF;
    private javax.swing.JTextField fieldnoI;
    private javax.swing.JTextField fieldnoS;
    private javax.swing.JTextField fieldpersonEmail;
    private javax.swing.JTextField fieldpersonPhone;
    private javax.swing.JTextField fieldrecT;
    private javax.swing.JButton jButtonBrowseImage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JTextField recipePath;
    // End of variables declaration//GEN-END:variables
}
