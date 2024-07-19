package VIEW;

import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import MODEL.ConeccionDB;
import MODEL.CustomTableModel;
import java.awt.Dimension;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FormTestEstudiante extends javax.swing.JFrame {

    public Connection concDB;
    CustomTableModel modelo;
    ArrayList<Estudiante> lstEst = new ArrayList<>();
    ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);

    public FormTestEstudiante() {
        initComponents();
        lstEst = procesarEstudiantes.getLstEstudiantes();

        Object[][] initialData = new Object[lstEst.size()][6];
        for (int i = 0; i < lstEst.size(); i++) {
            Estudiante est = lstEst.get(i);
            initialData[i][0] = est.nombreEst;
            initialData[i][1] = est.nota1;
            initialData[i][2] = est.nota2;
            initialData[i][3] = est.promedio;
            initialData[i][4] = est.estado;
            initialData[i][5] = est.id;
        }

        Object[] columnNames = {"Nombre", "Nota 1", "Nota 2", "Promedio", "Estado", "ID"};
        modelo = new CustomTableModel(initialData, columnNames, initialData.length);
        jTable1.setModel(modelo);

    }

    private void showPanel(JPanel p) {
        p.setPreferredSize(new Dimension(460, 420)); 
        p.setBounds(0, 0, 460, 420); 
        jPanel1.removeAll(); 
        jPanel1.add(p); 
        jPanel1.revalidate(); 
        jPanel1.repaint(); 
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTN_Conectar = new javax.swing.JButton();
        BTN_Actualizar = new javax.swing.JButton();
        BTN_Created = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTN_Guardar = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BTN_Editar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_Conectar.setText("Conectar");
        BTN_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ConectarActionPerformed(evt);
            }
        });

        BTN_Actualizar.setText("Actualizar");
        BTN_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ActualizarActionPerformed(evt);
            }
        });

        BTN_Created.setText("Añadir");
        BTN_Created.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CreatedActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nota1", "Nota2", "Promedio", "Estado", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        BTN_Guardar.setText("Guardar");
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Base de Datos");
        jLabel1.setToolTipText("");

        BTN_Editar.setText("Editar");
        BTN_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Conectar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_Created)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(BTN_Editar)
                        .addGap(64, 64, 64)
                        .addComponent(BTN_Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Actualizar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Created)
                    .addComponent(BTN_Conectar)
                    .addComponent(BTN_Eliminar)
                    .addComponent(BTN_Actualizar)
                    .addComponent(BTN_Editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(BTN_Guardar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ConectarActionPerformed
        ConeccionDB coneccion = new ConeccionDB();
        coneccion.establecerConexion();
    }//GEN-LAST:event_BTN_ConectarActionPerformed

    private void BTN_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ActualizarActionPerformed
        // TODO add your handling code here:
        while (modelo.getRowCount() > 0) {
            this.modelo.removeRow(0);
        }
        lstEst = procesarEstudiantes.getLstEstudiantes();
        for (Estudiante est : lstEst) {
            this.modelo.addRow(new Object[]{est.nombreEst, est.nota1, est.nota2, est.promedio, est.estado, est.id});
        }
    }//GEN-LAST:event_BTN_ActualizarActionPerformed

    private void BTN_CreatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CreatedActionPerformed
        modelo.addEditableRow();
    }//GEN-LAST:event_BTN_CreatedActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
        int rowCount = modelo.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String nombre = (String) modelo.getValueAt(i, 0);
            double nota1 = Double.parseDouble(modelo.getValueAt(i, 1).toString());
            double nota2 = Double.parseDouble(modelo.getValueAt(i, 2).toString());
            String id = (String) modelo.getValueAt(i, 5);

            Estudiante estudiante = new Estudiante(nombre, nota1, nota2, id);
            procesarEstudiantes.setLstEstudiantes(estudiante);
            procesarEstudiantes.insertarEstudiante(estudiante);
        }

    }//GEN-LAST:event_BTN_GuardarActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            String id = (String) modelo.getValueAt(selectedRow, 5);
            procesarEstudiantes.deletedEstudiante(id);
            ((DefaultTableModel) jTable1.getModel()).removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void BTN_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EditarActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow >= 0) {
            FromTestUpdate ventana2 = new FromTestUpdate();
            
            String nombre = (String) modelo.getValueAt(selectedRow, 0);
            double nota1 = Double.parseDouble(modelo.getValueAt(selectedRow, 1).toString());
            double nota2 = Double.parseDouble(modelo.getValueAt(selectedRow, 2).toString());
            String id = (String) modelo.getValueAt(selectedRow, 5);
            JPanel panelToUpdate = ventana2.getFondo();
            showPanel(panelToUpdate);
            
            ventana2.setName(nombre);
            ventana2.setNot1(nota1);
            ventana2.setNot2(nota2);
            ventana2.setID(id);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar.");
        }

    }//GEN-LAST:event_BTN_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTestEstudiante().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Actualizar;
    private javax.swing.JButton BTN_Conectar;
    private javax.swing.JButton BTN_Created;
    private javax.swing.JButton BTN_Editar;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
