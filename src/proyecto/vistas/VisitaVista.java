/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyecto.vistas;

import java.sql.Date;
import javax.swing.JOptionPane;
import proyecto.conexion.VisitaData;
import proyecto.entidades.Cliente;
import proyecto.entidades.Visita;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import proyecto.conexion.ClienteData;
import proyecto.conexion.MascotaData;
import proyecto.entidades.Mascota;
import proyecto.entidades.ServiciosAdicionales;
import proyecto.entidades.Sintomas;
import proyecto.entidades.Tratamiento;
import proyecto.vistas.MenuVeterinaria;

/**
 *
 * @author piry
 */
public class VisitaVista extends javax.swing.JInternalFrame {
    private List<ServiciosAdicionales> serviciosAdicionales1;
    private double importe, importeAnteriorTratamiento;
    /**
     * Creates new form VisitaVista
     */
    public VisitaVista() {
        importe = 0;
        importeAnteriorTratamiento = 0;
        serviciosAdicionales1 = new ArrayList<>();
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

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        codigoTratamiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codigoMascota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        sintomas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        buscarTratamiento = new javax.swing.JButton();
        buscarMascota = new javax.swing.JButton();
        buscarSintomas = new javax.swing.JButton();
        serviciosA = new javax.swing.JButton();
        serviciosCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        importeTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Codigo de Tratamiento:");

        codigoTratamiento.setEditable(false);

        jLabel2.setText("Codigo de Mascota:");

        codigoMascota.setEditable(false);

        jLabel3.setText("Fecha:");

        jLabel4.setText("Sintomas:");

        sintomas.setEditable(false);

        jLabel5.setText("Peso: ");

        peso.setEditable(false);

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buscarTratamiento.setText("BUSCAR");
        buscarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTratamientoActionPerformed(evt);
            }
        });

        buscarMascota.setText("BUSCAR");
        buscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMascotaActionPerformed(evt);
            }
        });

        buscarSintomas.setText("BUSCAR");
        buscarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSintomasActionPerformed(evt);
            }
        });

        serviciosA.setText("SERVICIOS ADICIONALES");
        serviciosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosAActionPerformed(evt);
            }
        });

        jLabel6.setText("Servicios Adicionales:");

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Importe Total:");

        importeTotal.setEditable(false);

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(codigoTratamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(codigoMascota, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(fecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(sintomas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(peso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(buscarTratamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(buscarMascota, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(buscarSintomas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(serviciosA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(serviciosCombo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(guardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(importeTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel7))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serviciosA)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(importeTotal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviciosCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoTratamiento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoMascota, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sintomas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscarTratamiento)
                                    .addComponent(buscarMascota)
                                    .addComponent(buscarSintomas))))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar)
                        .addGap(72, 72, 72))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTratamiento))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarMascota))
                .addGap(20, 20, 20)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(buscarSintomas))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviciosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(serviciosA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(guardar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        Visita visita = new Visita();
        ClienteData clienteData = new ClienteData();
        VisitaData visitaData = new VisitaData();
        MascotaData mascotaData = new MascotaData();
        Mascota mascota = new Mascota();
        Cliente cliente = new Cliente();
        visita.setCodigoTratamiento(Integer.parseInt(codigoTratamiento.getText()));
        visita.setCodigoMascota(Integer.parseInt(codigoMascota.getText()));
        java.util.Date utilDate = (java.util.Date) fecha.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        visita.setFecha(sqlDate);
        visita.setSintomas(Sintomas.buscarSintomas(sintomas.getText()));
        visita.setPeso(Double.parseDouble(peso.getText()));
        visita.setImporteTotal(Double.parseDouble(importeTotal.getText()));
        Visita visitaEncontrada = visitaData.buscarVisita2(visita);
        
        if(visitaEncontrada == null){
            visitaData.guardarVisita(visita);
        }else{
            JOptionPane.showMessageDialog(null, "La visita ya existe");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        VisitaData visitaData = new VisitaData();
        String input = JOptionPane.showInputDialog("Por favor, ingrese el idVisita entero:");
        int numero;
        try {
            numero = Integer.parseInt(input);
            visitaData.eliminarVisita(numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número entero.");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTratamientoActionPerformed
        // TODO add your handling code here:
        importe -= importeAnteriorTratamiento;
        ListaDeTratamientosVista lt = new ListaDeTratamientosVista();
        lt.setVisible(true);
        MenuVeterinaria.obtenerEscritorio().add(lt);
        lt.toFront();
        lt.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Este método se llama cuando se abre el JInternalFrame
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // Este método se llama cuando se cierra el JInternalFrame
                Tratamiento tratamiento1 = lt.obtenerTratamiento();
                if(tratamiento1 != null){
                    codigoTratamiento.setText(tratamiento1.getCodigo()+"");
                    importe += tratamiento1.getImporte();
                    importeAnteriorTratamiento = tratamiento1.getImporte();
                    importeTotal.setText(importe+"");
                }
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // Este método se llama después de que el JInternalFrame se haya cerrado
                Tratamiento tratamiento1 = lt.obtenerTratamiento();
                if(tratamiento1 != null){
                    codigoTratamiento.setText(tratamiento1.getCodigo()+"");
                    importe += tratamiento1.getImporte();
                    importeAnteriorTratamiento = tratamiento1.getImporte();
                    importeTotal.setText(importe+"");
                }
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se minimiza
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se restaura desde la minimización
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se activa (gana el foco)
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se desactiva (pierde el foco)
            }
        });
    }//GEN-LAST:event_buscarTratamientoActionPerformed

    private void buscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMascotaActionPerformed
        // TODO add your handling code here:
        MascotasDelClienteVista mascotas1 = new MascotasDelClienteVista();
        mascotas1.setVisible(true);
        MenuVeterinaria.obtenerEscritorio().add(mascotas1);
        mascotas1.toFront();
        mascotas1.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Este método se llama cuando se abre el JInternalFrame
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // Este método se llama cuando se cierra el JInternalFrame
                // Realiza aquí las acciones que deseas cuando se cierra
                Mascota mascota1 = mascotas1.obtenerMascota();
                if(mascota1 != null){
                    codigoMascota.setText(mascota1.getCodigo()+"");
                    peso.setText(mascota1.getPeso()+"");
                }
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // Este método se llama después de que el JInternalFrame se haya cerrado
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se minimiza
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se restaura desde la minimización
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se activa (gana el foco)
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se desactiva (pierde el foco)
            }
        });
    }//GEN-LAST:event_buscarMascotaActionPerformed

    private void buscarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSintomasActionPerformed
        // TODO add your handling code here:
        SintomasVista sv = new SintomasVista();
        sv.setVisible(true);
        MenuVeterinaria.obtenerEscritorio().add(sv);
        sv.toFront();
        sv.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Este método se llama cuando se abre el JInternalFrame
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // Este método se llama cuando se cierra el JInternalFrame
                // Realiza aquí las acciones que deseas cuando se cierra
                Sintomas sintoma1 = sv.obtenerSintoma();
                if(sintoma1 != null){
                    sintomas.setText(sintoma1.getDescripcion());
                }
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // Este método se llama después de que el JInternalFrame se haya cerrado
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se minimiza
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se restaura desde la minimización
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se activa (gana el foco)
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se desactiva (pierde el foco)
            }
        });
    }//GEN-LAST:event_buscarSintomasActionPerformed

    private void serviciosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosAActionPerformed
        // TODO add your handling code here:
        ServiciosAdicionalesVista sa = new ServiciosAdicionalesVista();
        sa.setVisible(true);
        MenuVeterinaria.obtenerEscritorio().add(sa);
        sa.toFront();
        sa.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Este método se llama cuando se abre el JInternalFrame
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // Este método se llama cuando se cierra el JInternalFrame
                if(sa.obtenerServiciosAdicionales()!=null){
                    serviciosAdicionales1 = sa.obtenerServiciosAdicionales();
                    cargarComboServicios();
                }
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // Este método se llama después de que el JInternalFrame se haya cerrado
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se minimiza
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se restaura desde la minimización
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se activa (gana el foco)
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Este método se llama cuando el JInternalFrame se desactiva (pierde el foco)
            }
        });
    }//GEN-LAST:event_serviciosAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarMascota;
    private javax.swing.JButton buscarSintomas;
    private javax.swing.JButton buscarTratamiento;
    private javax.swing.JTextField codigoMascota;
    private javax.swing.JTextField codigoTratamiento;
    private javax.swing.JButton eliminar;
    private javax.swing.JDesktopPane escritorio;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField importeTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField peso;
    private javax.swing.JButton serviciosA;
    private javax.swing.JComboBox<ServiciosAdicionales> serviciosCombo;
    private javax.swing.JTextField sintomas;
    // End of variables declaration//GEN-END:variables

    private void cargarComboServicios(){
        double importeAuxiliar = 0;
        for (ServiciosAdicionales servicioAdicional : serviciosAdicionales1) {
            serviciosCombo.addItem(servicioAdicional);
            importe += servicioAdicional.getImporte();
            importeTotal.setText(importe+"");
        }
    }
}
