/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vistas;

import javax.swing.table.DefaultTableModel;
import proyecto.conexion.ClienteData;
import proyecto.entidades.Cliente;
import proyecto.entidades.Mascota;

/**
 *
 * @author Matìas Fernàndez
 */
public class ListaMascotasDeClienteview extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form ListaMascotasDeClienteview
     */
    public ListaMascotasDeClienteview() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMascota = new javax.swing.JTable();
        jcCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        bgList.setBackground(new java.awt.Color(255, 255, 255));
        bgList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMascota);

        bgList.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 680, 90));

        jcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteActionPerformed(evt);
            }
        });
        bgList.add(jcCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");
        bgList.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Mascota por Cliente");
        bgList.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 270, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("MASCOTAS");
        bgList.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 80, 20));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/mascotamenuchico.jpg"))); // NOI18N
        bgList.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgList, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgList, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteActionPerformed
borrarFilas();
ClienteData cliendata= new ClienteData();
Cliente clienteseleccionado= (Cliente) jcCliente.getSelectedItem();

        for (Mascota mascota : cliendata.MascotasdeCliente(clienteseleccionado.getIdCliente())) {
            modelo.addRow(new Object[]{
            mascota.getCodigo(),
            mascota.getAlias(),
            mascota.getSexo(),
            mascota.getEspecie(),
            mascota.getColorPelo(),
            mascota.getFechaNacimiento(),
            mascota.getPeso(),
            mascota.getIdCliente()
             
            });
  
        }


     
    }//GEN-LAST:event_jcClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Cliente> jcCliente;
    private javax.swing.JTable jtMascota;
    // End of variables declaration//GEN-END:variables
 public void cargarCombo(){
        ClienteData cliendata = new ClienteData();
        for (Cliente cliente : cliendata.ClientesTodos()) {
            jcCliente.addItem(cliente);
        }
 }
   public void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Alias");
        modelo.addColumn("sexo");
        modelo.addColumn("especie");
        modelo.addColumn("Color del pelo");
         modelo.addColumn("Fecha de nacimiento");

          modelo.addColumn("peso actual");
          modelo.addColumn("idDueño");
        jtMascota.setModel(modelo);
    }
  private void borrarFilas() {
        DefaultTableModel model = (DefaultTableModel) jtMascota.getModel();
        model.setRowCount(0);
    }

  
}
