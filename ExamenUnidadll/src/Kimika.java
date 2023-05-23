
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ElementoQuimico;
import models.ElementoQuimico;
import models.ElementoQuimico;
import static models.ElementoQuimico.elementos;


/**
 *
 * @author Jess
 */
public class Kimika extends javax.swing.JFrame {
    DefaultTableModel tablaPeriodica = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };

    public Kimika() {
        initComponents();
        this.campoRecNo.setText("-1");
        this.campoRecNo.setVisible(false);
        this.jLabelRecNo.setVisible(false);
        ElementoQuimico.llenarElementos();
        setModelo();
        setDatos();
    }
    public static void Jessica59640(){
        System.out.println("Jessica Zuvieta Tejeda");
        System.out.println("59640");
        System.out.println("al059640@uacam.mx");
    }
     private void setModelo(){
        String[] tblcabecera = {"ID","Masa Atomica°", "Numero Atomico", "Simbolo Atomico","Nombre","Color"};
        tablaPeriodica.setColumnIdentifiers(tblcabecera);
        tblPeriodica.setModel(tablaPeriodica);
    }
     private void setDatos(){
        Object[] datos = new Object[tablaPeriodica.getColumnCount()];
        int i = 0;
        tablaPeriodica.setRowCount(0);
        for (ElementoQuimico ElementoQuimico : elementos) {
            datos[0] = i;
            datos[1] = ElementoQuimico.getMasa();
            datos[2] = ElementoQuimico.getNumAtomico();
            datos[3] = ElementoQuimico.getSimboloAtomico();
            datos[4] = ElementoQuimico.getNombre();
            datos[5]= ElementoQuimico.getColor();
            i++;
            tablaPeriodica.addRow(datos);
        }
    }
     
    private void limpiarCampos(){
        this.campoNumeroAtomico.setText("");
        this.campoNombre.setText("");
        this.campoMasaAtomica.setText("");
        this.campoSimboloAtomico.setText("");
        this.campoColor.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRecNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttnCancelar = new javax.swing.JButton();
        bttnAceptar = new javax.swing.JButton();
        campoRecNo = new javax.swing.JTextField();
        campoNumeroAtomico = new javax.swing.JTextField();
        campoMasaAtomica = new javax.swing.JTextField();
        campoSimboloAtomico = new javax.swing.JTextField();
        campoColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeriodica = new javax.swing.JTable();
        bttnEliminar = new javax.swing.JButton();
        bttnActualizar = new javax.swing.JButton();
        bttnExportar = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRecNo.setText("RecNo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Numero atomico");

        jLabel4.setText("Masa atomica");

        jLabel5.setText("Simbolo quimico");

        jLabel6.setText("Color");

        bttnCancelar.setText("Cancelar");
        bttnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnCancelarMouseClicked(evt);
            }
        });

        bttnAceptar.setText("Añadir");
        bttnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnAceptarMouseClicked(evt);
            }
        });

        tblPeriodica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblPeriodica);

        bttnEliminar.setText("Eliminar");
        bttnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnEliminarMouseClicked(evt);
            }
        });

        bttnActualizar.setText("Actualizar");
        bttnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnActualizarMouseClicked(evt);
            }
        });
        bttnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnActualizarActionPerformed(evt);
            }
        });

        bttnExportar.setText("Exportar");
        bttnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelRecNo)
                                            .addGap(151, 151, 151)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(campoRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoNombre)
                                                    .addComponent(campoNumeroAtomico)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoSimboloAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoMasaAtomica, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(bttnCancelar)
                                .addGap(222, 222, 222)
                                .addComponent(bttnAceptar)))
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnEliminar)
                    .addComponent(bttnActualizar)
                    .addComponent(bttnExportar))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecNo)
                    .addComponent(campoRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNumeroAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoMasaAtomica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoSimboloAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCancelar)
                    .addComponent(bttnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnEliminar)
                        .addGap(32, 32, 32)
                        .addComponent(bttnActualizar)
                        .addGap(51, 51, 51)
                        .addComponent(bttnExportar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnActualizarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnActualizarMouseClicked

    private void bttnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnActualizarActionPerformed
        // TODO add your handling code here:                                             
        int filaActual = tblPeriodica.getSelectedRow();
    
        if (filaActual != -1) {
        String recNo = tablaPeriodica.getValueAt(filaActual, 0).toString();
        String nombre = tablaPeriodica.getValueAt(filaActual, 4).toString();
        String numAtomico = tablaPeriodica.getValueAt(filaActual, 2).toString();
        String masaAtomica = tablaPeriodica.getValueAt(filaActual, 1).toString();
        String simboloAtomico = tablaPeriodica.getValueAt(filaActual, 3).toString();
        String color = tablaPeriodica.getValueAt(filaActual, 5).toString();

        campoRecNo.setText(recNo);
        campoNombre.setText(nombre);
        campoNumeroAtomico.setText(numAtomico);
        campoMasaAtomica.setText(masaAtomica);
        campoSimboloAtomico.setText(simboloAtomico);
        campoColor.setText(color);
        } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila.", "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_bttnActualizarActionPerformed

    private void bttnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnAceptarMouseClicked
        // TODO add your handling code here:
        int recNo = Integer.parseInt(this.campoRecNo.getText().trim());
        int NumAtomico = Integer.parseInt(this.campoNumeroAtomico.getText().trim());
        int Masa = Integer.parseInt(this.campoMasaAtomica.getText().trim());
        String SimboloAtomico = this.campoSimboloAtomico.getText();
        String nombre = this.campoNombre.getText();
        String color = this.campoColor.getText();
        

        if (recNo == -1) {
            ElementoQuimico.insertarElemento( Masa, NumAtomico,SimboloAtomico,nombre, color);
        } else {
            
            ElementoQuimico.ActualizarElemento(recNo, Masa, NumAtomico,SimboloAtomico, nombre, color);
            this.bttnActualizar.setSelected(false);
            
        }
        setDatos();
        limpiarCampos();
    }//GEN-LAST:event_bttnAceptarMouseClicked

    private void bttnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnCancelarMouseClicked
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_bttnCancelarMouseClicked

    private void bttnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnEliminarMouseClicked
        // TODO add your handling code here:
        int filaActual = tblPeriodica.getSelectedRow();
        System.out.println(tblPeriodica.getSelectionModel().getClass());
        if (filaActual != -1){
            System.out.println(filaActual);
            //dtmMunicipios.removeRow(filaActual);
            System.out.println(elementos);
            ElementoQuimico.eliminarElemento(filaActual);
            setDatos();

        }
    }//GEN-LAST:event_bttnEliminarMouseClicked

    private void bttnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExportarActionPerformed
        // TODO add your handling code here:
        System.out.println("Inicio guardar archivo");
        File archivo = new File("C:C:\\Users\\Jess\\OneDrive\\Documentos\\NetBeansProjects\\Examen\\tblPeriodica.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for(ElementoQuimico ElementoQuimico : elementos){
            escribir.print(ElementoQuimico.toString()+"\n");
            }
            escribir.close();
        }   catch (FileNotFoundException ex){
                java.util.logging.Logger.getLogger(Kimika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bttnExportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Jessica59640();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kimika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kimika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kimika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kimika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Kimika().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAceptar;
    private javax.swing.JButton bttnActualizar;
    private javax.swing.JButton bttnCancelar;
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnExportar;
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoMasaAtomica;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumeroAtomico;
    private javax.swing.JTextField campoRecNo;
    private javax.swing.JTextField campoSimboloAtomico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelRecNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeriodica;
    // End of variables declaration//GEN-END:variables
    }
