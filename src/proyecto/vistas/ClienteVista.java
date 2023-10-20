/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vistas;

import javax.swing.JOptionPane;
import proyecto.conexion.ClienteData;
import proyecto.entidades.Cliente;

/**
 *
 * @author Matìas Fernàndez
 */

public class ClienteVista extends javax.swing.JInternalFrame {

       ClienteData cliendata= new ClienteData();
 Cliente clien= new Cliente();

    /**
     * Creates new form Cliente
     */
    public ClienteVista() {
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

        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtNombreAlt = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jpBuscar = new javax.swing.JPanel();
        imgBuscar = new javax.swing.JLabel();
        jpNuevo = new javax.swing.JPanel();
        jlNuevo = new javax.swing.JLabel();
        jpBorrar = new javax.swing.JPanel();
        jlBorrar = new javax.swing.JLabel();
        jpEditar = new javax.swing.JPanel();
        jlEditar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(437, 440));
        setMinimumSize(new java.awt.Dimension(437, 440));
        setPreferredSize(new java.awt.Dimension(437, 440));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("GESTOR DE CLIENTES");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Documento");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellido");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre Alternativo");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Direccion");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefono");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jtDocumento.setForeground(new java.awt.Color(153, 153, 153));
        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });
        bg.add(jtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));

        jtApellido.setForeground(new java.awt.Color(153, 153, 153));
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });
        bg.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, -1));

        jtNombre.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, -1));

        jtNombreAlt.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(jtNombreAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, -1));

        jtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });
        bg.add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 120, -1));

        jtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });
        bg.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 130, -1));

        jpBuscar.setBackground(new java.awt.Color(54, 169, 213));
        jpBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBuscarMouseClicked(evt);
            }
        });

        imgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/icons8-search-32.png"))); // NOI18N
        imgBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBuscarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgBuscarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imgBuscar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addComponent(imgBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, 30));

        jpNuevo.setBackground(new java.awt.Color(54, 169, 213));
        jpNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpNuevoMouseClicked(evt);
            }
        });

        jlNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/icons8-add-32.png"))); // NOI18N
        jlNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpNuevoLayout = new javax.swing.GroupLayout(jpNuevo);
        jpNuevo.setLayout(jpNuevoLayout);
        jpNuevoLayout.setHorizontalGroup(
            jpNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlNuevo)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpNuevoLayout.setVerticalGroup(
            jpNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoLayout.createSequentialGroup()
                .addComponent(jlNuevo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 30));

        jpBorrar.setBackground(new java.awt.Color(54, 169, 213));
        jpBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBorrarMouseClicked(evt);
            }
        });

        jlBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/icons8-delete-32.png"))); // NOI18N
        jlBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBorrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpBorrarLayout = new javax.swing.GroupLayout(jpBorrar);
        jpBorrar.setLayout(jpBorrarLayout);
        jpBorrarLayout.setHorizontalGroup(
            jpBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlBorrar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpBorrarLayout.setVerticalGroup(
            jpBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarLayout.createSequentialGroup()
                .addComponent(jlBorrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 30));

        jpEditar.setBackground(new java.awt.Color(54, 169, 213));
        jpEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEditarMouseClicked(evt);
            }
        });

        jlEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/icons8-edit-32.png"))); // NOI18N
        jlEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpEditarLayout = new javax.swing.GroupLayout(jpEditar);
        jpEditar.setLayout(jpEditarLayout);
        jpEditarLayout.setHorizontalGroup(
            jpEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlEditar)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpEditarLayout.setVerticalGroup(
            jpEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarLayout.createSequentialGroup()
                .addComponent(jlEditar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jpEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/istockphoto-1296848705-612x612.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void imgBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBuscarMouseReleased
    
        
        
    }//GEN-LAST:event_imgBuscarMouseReleased

    private void imgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBuscarMouseClicked
 
int dni = Integer.parseInt(jtDocumento.getText());

Cliente cliente = cliendata.buscarClientePorDNI(dni);

if (cliente != null) {
    jtDocumento.setText(String.valueOf(dni));
    jtApellido.setText(cliente.getApellido());
    jtNombre.setText(cliente.getNombre());
    jtNombreAlt.setText(cliente.getNombreAlt());
    jtDireccion.setText(cliente.getDireccion());

    jtTelefono.setText(String.valueOf(cliente.getTelefono()));
}
           
   
        
    }//GEN-LAST:event_imgBuscarMouseClicked

    private void jpBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarMouseClicked

    }//GEN-LAST:event_jpBuscarMouseClicked

    private void jlNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNuevoMouseClicked

 
clien.setDocumento(Integer.parseInt(jtDocumento.getText()));
clien.setApellido(jtApellido.getText());
clien.setNombre(jtNombre.getText());
clien.setNombreAlt(jtNombreAlt.getText());
clien.setDireccion(jtDireccion.getText());
clien.setTelefono(Long.parseLong(jtTelefono.getText()));
cliendata.guardarCliente(clien);

        
      jtDocumento.setText("");
    jtApellido.setText("");
    jtNombre.setText("");
    jtNombreAlt.setText("");
    jtDireccion.setText("");
       jtTelefono.setText("");   
        
        
    }//GEN-LAST:event_jlNuevoMouseClicked

    private void jpNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevoMouseClicked
    
    }//GEN-LAST:event_jpNuevoMouseClicked

    private void jlEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEditarMouseClicked
//        try {

                Cliente clien1=cliendata.buscarClientePorDNI(Integer.parseInt(jtDocumento.getText()));
                System.out.println(clien1);
      clien1.setDocumento(Integer.parseInt(jtDocumento.getText()));
clien1.setApellido(jtApellido.getText());
clien1.setNombre(jtNombre.getText());
clien1.setNombreAlt(jtNombreAlt.getText());
clien1.setDireccion(jtDireccion.getText());
clien1.setTelefono(Long.parseLong(jtTelefono.getText()));
cliendata.modificarCliente(clien1);
//        } catch (java.lang.NullPointerException ex) {
//            JOptionPane.showMessageDialog(null, "Error al modificar cliente, revise que los datos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    
       
    }//GEN-LAST:event_jlEditarMouseClicked

    private void jpEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEditarMouseClicked

    }//GEN-LAST:event_jpEditarMouseClicked

    private void jlBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBorrarMouseClicked
try{
int dni= Integer.parseInt(jtDocumento.getText());
  
   int id=  cliendata.buscarClientePorDNI(dni).getIdCliente();
   cliendata.borrarCliente(id);
}catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente, revise que los datos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
}
  jtDocumento.setText("");
    jtApellido.setText("");
    jtNombre.setText("");
    jtNombreAlt.setText("");
    jtDireccion.setText("");
       jtTelefono.setText("");  
    }//GEN-LAST:event_jlBorrarMouseClicked

    private void jpBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBorrarMouseClicked


    }//GEN-LAST:event_jpBorrarMouseClicked


 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel imgBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlBorrar;
    private javax.swing.JLabel jlEditar;
    private javax.swing.JLabel jlNuevo;
    private javax.swing.JPanel jpBorrar;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JPanel jpEditar;
    private javax.swing.JPanel jpNuevo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreAlt;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
