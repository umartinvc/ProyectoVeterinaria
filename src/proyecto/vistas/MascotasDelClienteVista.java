/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyecto.vistas;

import java.sql.Date;
import java.time.LocalDate;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import proyecto.conexion.ClienteData;
import proyecto.conexion.VisitaData;
import proyecto.entidades.Cliente;
import proyecto.entidades.Mascota;
import proyecto.entidades.Tratamiento;
import proyecto.entidades.Visita;

/**
 *
 * @author piry
 */
public class MascotasDelClienteVista extends javax.swing.JInternalFrame {
    private Cliente cliente1;
    private ClienteData clienteData = new ClienteData();
    private boolean existeCliente;
    private Mascota mascota1;

    /**
     * Creates new form MascotasDelClienteVista
     */
    public MascotasDelClienteVista(Cliente cliente) {
        cliente1 = cliente;
        initComponents();
        //cargarComboMascotas();
        cargarComboClientes();
        existeCliente = true;
    }
    public MascotasDelClienteVista(){
        initComponents();
        cargarComboClientes();
        existeCliente = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mascotas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        raza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        especie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        colorPelo = new javax.swing.JTextField();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        clientesCombo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Listado de mascotas del Cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Mascotas:");

        mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasActionPerformed(evt);
            }
        });

        jLabel3.setText("ALIAS:");

        nombre.setEditable(false);

        jLabel4.setText("RAZA:");

        raza.setEditable(false);

        jLabel5.setText("SEXO:");

        jLabel6.setText("ESPECIE:");

        peso.setEditable(false);

        jLabel7.setText("CODIGO:");

        sexo.setEditable(false);

        jLabel8.setText("COLOR:");

        especie.setEditable(false);

        jLabel9.setText("FECHA:");

        codigo.setEditable(false);

        jLabel10.setText("PESO:");

        colorPelo.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cliente:");

        clientesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesComboActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mascotas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(raza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(peso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(sexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(especie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(codigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(colorPelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(fechaNacimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(clientesCombo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(35, 35, 35)))
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mascotas, 0, 376, Short.MAX_VALUE)
                            .addComponent(clientesCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(clientesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(colorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasActionPerformed
        // TODO add your handling code here:
        Mascota mascotaSeleccionada = (Mascota)mascotas.getSelectedItem();
        if(mascotaSeleccionada != null){
            nombre.setText(mascotaSeleccionada.getAlias());
            raza.setText(mascotaSeleccionada.getRaza());
            codigo.setText(mascotaSeleccionada.getCodigo()+"");
            sexo.setText(mascotaSeleccionada.getSexo());
            especie.setText(mascotaSeleccionada.getEspecie());
            colorPelo.setText(mascotaSeleccionada.getColorPelo());
            fechaNacimiento.setDate(Date.valueOf(mascotaSeleccionada.getFechaNacimiento()));
            peso.setText(mascotaSeleccionada.getPeso()+"");
            mascota1 = mascotaSeleccionada;
        }else{
            
        }
        
    }//GEN-LAST:event_mascotasActionPerformed

    private void clientesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesComboActionPerformed
        // TODO add your handling code here:
        Cliente clienteSeleccionado = (Cliente)clientesCombo.getSelectedItem();
        mascotas.removeAllItems();
        cargarComboMascotas(clienteSeleccionado);
    }//GEN-LAST:event_clientesComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> clientesCombo;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField colorPelo;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JTextField especie;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Mascota> mascotas;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField raza;
    private javax.swing.JTextField sexo;
    // End of variables declaration//GEN-END:variables

    private void cargarComboMascotas(Cliente cliente){
        for (Mascota mascota : clienteData.MascotasdeCliente(cliente.getIdCliente())) {
            mascotas.addItem(mascota);
        }
    }
    private void cargarComboClientes(){
        if(!existeCliente){
            for (Cliente cliente : clienteData.ClientesTodos()) {
                clientesCombo.addItem(cliente);
            }
        }else{
            clientesCombo.addItem(cliente1);
        }
    }
    
    public Mascota obtenerMascota(){
        return this.mascota1;
    }


}
