 
package org.programacion.usuarios;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    
    DataInputFile read;
    DataOutputFile write;
    Usuarios usuario;
    Clientes cliente;
    Vehiculos vehiculo;
    Piezas pieza;
    Reparaciones reparacion;
    String url_usuario = "f:/usuarios.txt", url_cliente = "f:/cliente.txt",url_vehiculo = "f:/vehiculo.txt", url_piezas = "f:/pieza.txt", url_reparacion = "f:/reparaciones.txt";
    int indice_usuario,indice_cliente,indice_vehiculo,indice_pieza,indice_reparacion, cant;
    Boolean editar_usuario = false, editar_cliente = false, editar_vehiculo = false, editar_pieza = false, editar_reparacion = false;
    
    public NewJFrame() {
        initComponents();
        usuario = new Usuarios();
        cliente = new Clientes();
        vehiculo = new Vehiculos();
        pieza = new Piezas();
        reparacion = new Reparaciones();
        read = new DataInputFile();
        write = new DataOutputFile();
        try {
            read.obtenerIndiceUsuario(url_usuario);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read.obtenerIndiceCliente(url_cliente);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read.obtenerIndiceVehiculos(url_vehiculo);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read.obtenerIndicePiezas(url_piezas);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read.obtenerIndiceReparacion(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        indice_usuario = read.IndiceUsuario();
        indice_cliente = read.IndiceCliente();
        indice_vehiculo = read.IndiceVehiculo();
        indice_pieza = read.IndicePieza();
        indice_reparacion = read.IndiceReparacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAPUser = new javax.swing.JTextField();
        txtAMUser = new javax.swing.JTextField();
        txtTelefonoUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccionUser = new javax.swing.JTextField();
        btnNuevoUser = new javax.swing.JButton();
        btnSalvarUser = new javax.swing.JButton();
        btnCancelarUser = new javax.swing.JButton();
        btnEditarUser = new javax.swing.JButton();
        btnRemoverUser = new javax.swing.JButton();
        btnBuscarUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDatosUser = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        combo_cli_IdUsuario = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_cli_ClienteId = new javax.swing.JTextField();
        txt_cli_AP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cli_AM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_cli_Nuevo = new javax.swing.JButton();
        btn_cli_Salvar = new javax.swing.JButton();
        btn_cli_Cancelar = new javax.swing.JButton();
        btn_cli_Editar = new javax.swing.JButton();
        btn_cli_Remover = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_cli_IdBuscar = new javax.swing.JTextField();
        btn_cli_Buscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_cli_NombreCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        combo_veh_SelectCliente = new javax.swing.JComboBox();
        txt_veh_VehiculoId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_veh_Matricula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_veh_Marca = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_veh_Modelo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_veh_Fecha = new javax.swing.JTextField();
        btn_veh_Nuevo = new javax.swing.JButton();
        btn_veh_Salvar = new javax.swing.JButton();
        btn_veh_Cancelar = new javax.swing.JButton();
        btn_veh_Editar = new javax.swing.JButton();
        btn_veh_Remover = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_veh_IdBuscar = new javax.swing.JTextField();
        btn_veh_buscar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_pieza_Nuevo = new javax.swing.JButton();
        btn_pieza_Salvar = new javax.swing.JButton();
        btn_pieza_Cancelar = new javax.swing.JButton();
        btn_pieza_Editar = new javax.swing.JButton();
        btn_pieza_Remover = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txt_pieza_IdBuscar = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_pieza_PiezaId = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_pieza_Descripcion = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_pieza_Stock = new javax.swing.JTextField();
        btn_pieza_Buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        CbReparaciones_IdVehiculo = new javax.swing.JComboBox();
        txtReparaciones_ID = new javax.swing.JTextField();
        btnReparaciones_Nuevo = new javax.swing.JButton();
        btnReparaciones_Salvar = new javax.swing.JButton();
        btnReparaciones_Cancelar = new javax.swing.JButton();
        btnReparaciones_Editar = new javax.swing.JButton();
        btnReparaciones_Remover = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtReparaciones_idBuscar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtReparaciones_FE = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtReparaciones_FS = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtReparaciones_Falla = new javax.swing.JTextField();
        btnReparaciones_Buscar = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtReparacion_cantidad = new javax.swing.JTextField();
        cbPieza_ID = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        txtIDUser.setEnabled(false);

        jLabel2.setText("Nombre:");

        txtNombreUser.setEnabled(false);

        jLabel3.setText("Apellido Paterno:");

        txtAPUser.setEnabled(false);

        txtAMUser.setEnabled(false);

        txtTelefonoUser.setEnabled(false);

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Telefono");

        jLabel6.setText("Direccion");

        txtDireccionUser.setEnabled(false);

        btnNuevoUser.setText("Nuevo");
        btnNuevoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUserActionPerformed(evt);
            }
        });

        btnSalvarUser.setText("Salvar");
        btnSalvarUser.setEnabled(false);
        btnSalvarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUserActionPerformed(evt);
            }
        });

        btnCancelarUser.setText("Cancelar");
        btnCancelarUser.setEnabled(false);
        btnCancelarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUserActionPerformed(evt);
            }
        });

        btnEditarUser.setText("Editar");
        btnEditarUser.setEnabled(false);
        btnEditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUserActionPerformed(evt);
            }
        });

        btnRemoverUser.setText("Remover");
        btnRemoverUser.setEnabled(false);
        btnRemoverUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUserActionPerformed(evt);
            }
        });

        btnBuscarUser.setText("Buscar");
        btnBuscarUser.setActionCommand("");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese ID a Buscar");

        jLabel13.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDatosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarUser))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAPUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAMUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(txtTelefonoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addComponent(txtDireccionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSalvarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCancelarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEditarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRemoverUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDatosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAPUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAMUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccionUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Usuarios", jPanel1);

        combo_cli_IdUsuario.setEnabled(false);

        jLabel8.setText("Selecione ID Usuario:");

        jLabel9.setText("Cliente ID");

        txt_cli_ClienteId.setEditable(false);
        txt_cli_ClienteId.setEnabled(false);

        txt_cli_AP.setEnabled(false);

        jLabel10.setText("Apellido Paterno");

        txt_cli_AM.setEnabled(false);

        jLabel11.setText("Apellido Materno");

        btn_cli_Nuevo.setText("Nuevo");
        btn_cli_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_NuevoActionPerformed(evt);
            }
        });

        btn_cli_Salvar.setText("Salvar");
        btn_cli_Salvar.setEnabled(false);
        btn_cli_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_SalvarActionPerformed(evt);
            }
        });

        btn_cli_Cancelar.setText("Cancelar");
        btn_cli_Cancelar.setEnabled(false);
        btn_cli_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_CancelarActionPerformed(evt);
            }
        });

        btn_cli_Editar.setText("Editar");
        btn_cli_Editar.setEnabled(false);
        btn_cli_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_EditarActionPerformed(evt);
            }
        });

        btn_cli_Remover.setText("Remover");
        btn_cli_Remover.setEnabled(false);
        btn_cli_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_RemoverActionPerformed(evt);
            }
        });

        jLabel12.setText("Ingrese ID a Buscar");

        btn_cli_Buscar.setText("Buscar");
        btn_cli_Buscar.setActionCommand("");
        btn_cli_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_BuscarActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre:");

        txt_cli_NombreCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_cli_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_cli_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_cli_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_cli_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_cli_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cli_AM, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_cli_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_cli_Buscar))
                                    .addComponent(combo_cli_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(35, 35, 35)
                                .addComponent(txt_cli_ClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cli_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cli_AP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cli_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cli_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cli_ClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_cli_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cli_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cli_AP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_cli_AM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cli_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cli_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cli_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cli_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cli_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Clientes", jPanel2);

        jLabel15.setText("Vehiculo ID");

        combo_veh_SelectCliente.setEnabled(false);

        txt_veh_VehiculoId.setEnabled(false);

        jLabel16.setText("Matricula");

        txt_veh_Matricula.setEnabled(false);

        jLabel17.setText("Seleccione Cliente");

        txt_veh_Marca.setEnabled(false);

        jLabel18.setText("Marca");

        jLabel19.setText("Modelo");

        txt_veh_Modelo.setEnabled(false);

        jLabel20.setText("Fecha");

        txt_veh_Fecha.setEnabled(false);

        btn_veh_Nuevo.setText("Nuevo");
        btn_veh_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_NuevoActionPerformed(evt);
            }
        });

        btn_veh_Salvar.setText("Salvar");
        btn_veh_Salvar.setEnabled(false);
        btn_veh_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_SalvarActionPerformed(evt);
            }
        });

        btn_veh_Cancelar.setText("Cancelar");
        btn_veh_Cancelar.setEnabled(false);
        btn_veh_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_CancelarActionPerformed(evt);
            }
        });

        btn_veh_Editar.setText("Editar");
        btn_veh_Editar.setEnabled(false);
        btn_veh_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_EditarActionPerformed(evt);
            }
        });

        btn_veh_Remover.setText("Remover");
        btn_veh_Remover.setEnabled(false);
        btn_veh_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_RemoverActionPerformed(evt);
            }
        });

        jLabel21.setText("Ingrese ID a Buscar");

        btn_veh_buscar.setText("Buscar");
        btn_veh_buscar.setActionCommand("");
        btn_veh_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veh_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(txt_veh_VehiculoId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_veh_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_veh_buscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_veh_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(10, 10, 10)
                                            .addComponent(txt_veh_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(10, 10, 10)
                                            .addComponent(txt_veh_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btn_veh_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_veh_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_veh_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_veh_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btn_veh_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(btn_veh_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(combo_veh_SelectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(txt_veh_VehiculoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txt_veh_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_veh_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(combo_veh_SelectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_veh_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_veh_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(txt_veh_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(txt_veh_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_veh_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_veh_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_veh_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_veh_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_veh_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Vehiculos", jPanel3);

        btn_pieza_Nuevo.setText("Nuevo");
        btn_pieza_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_NuevoActionPerformed(evt);
            }
        });

        btn_pieza_Salvar.setText("Salvar");
        btn_pieza_Salvar.setEnabled(false);
        btn_pieza_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_SalvarActionPerformed(evt);
            }
        });

        btn_pieza_Cancelar.setText("Cancelar");
        btn_pieza_Cancelar.setEnabled(false);
        btn_pieza_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_CancelarActionPerformed(evt);
            }
        });

        btn_pieza_Editar.setText("Editar");
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_EditarActionPerformed(evt);
            }
        });

        btn_pieza_Remover.setText("Remover");
        btn_pieza_Remover.setEnabled(false);
        btn_pieza_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_RemoverActionPerformed(evt);
            }
        });

        jLabel29.setText("Ingrese ID a Buscar");

        jLabel30.setText("Pieza ID");

        txt_pieza_PiezaId.setEnabled(false);

        jLabel31.setText("Descripcion");

        txt_pieza_Descripcion.setEnabled(false);

        jLabel32.setText("Stock");

        txt_pieza_Stock.setEnabled(false);

        btn_pieza_Buscar.setText("Buscar");
        btn_pieza_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pieza_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_pieza_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pieza_Buscar))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_pieza_PiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_pieza_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txt_pieza_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_pieza_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_pieza_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_pieza_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_pieza_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_pieza_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_pieza_IdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_pieza_Buscar)))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pieza_PiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(txt_pieza_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txt_pieza_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pieza_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pieza_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pieza_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pieza_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pieza_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Piezas", jPanel6);

        jLabel22.setText("Vehiculo ID");

        CbReparaciones_IdVehiculo.setEnabled(false);

        txtReparaciones_ID.setEnabled(false);
        txtReparaciones_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReparaciones_IDActionPerformed(evt);
            }
        });

        btnReparaciones_Nuevo.setText("Nuevo");
        btnReparaciones_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_NuevoActionPerformed(evt);
            }
        });

        btnReparaciones_Salvar.setText("Salvar");
        btnReparaciones_Salvar.setEnabled(false);
        btnReparaciones_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_SalvarActionPerformed(evt);
            }
        });

        btnReparaciones_Cancelar.setText("Cancelar");
        btnReparaciones_Cancelar.setEnabled(false);
        btnReparaciones_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_CancelarActionPerformed(evt);
            }
        });

        btnReparaciones_Editar.setText("Editar");
        btnReparaciones_Editar.setEnabled(false);
        btnReparaciones_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_EditarActionPerformed(evt);
            }
        });

        btnReparaciones_Remover.setText("Remover");
        btnReparaciones_Remover.setEnabled(false);
        btnReparaciones_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_RemoverActionPerformed(evt);
            }
        });

        jLabel23.setText("Ingrese ID a Buscar");

        jLabel24.setText("Reparacion ID");

        txtReparaciones_FE.setEnabled(false);

        jLabel25.setText("Fecha Entrada");

        jLabel26.setText("Fecha Salida");

        txtReparaciones_FS.setEnabled(false);

        jLabel27.setText("Pieza ID");

        jLabel28.setText("Falla");

        txtReparaciones_Falla.setEnabled(false);

        btnReparaciones_Buscar.setText("Buscar");
        btnReparaciones_Buscar.setActionCommand("");
        btnReparaciones_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparaciones_BuscarActionPerformed(evt);
            }
        });

        jLabel33.setText("Cantidad:");

        txtReparacion_cantidad.setEnabled(false);

        cbPieza_ID.setEnabled(false);
        cbPieza_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPieza_IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(txtReparaciones_Falla)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtReparaciones_FE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtReparaciones_ID)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(24, 24, 24)
                                .addComponent(CbReparaciones_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtReparaciones_FS, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(txtReparacion_cantidad))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbPieza_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(566, 566, 566))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnReparaciones_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnReparaciones_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnReparaciones_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnReparaciones_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnReparaciones_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtReparaciones_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReparaciones_Buscar)))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtReparaciones_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtReparaciones_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(CbReparaciones_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReparaciones_FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(txtReparaciones_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel33)
                    .addComponent(txtReparacion_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPieza_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtReparaciones_Falla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReparaciones_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reparaciones", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //ZONA USUARIO
    
    public void HabilitarTextFieldUser(){
        
        txtNombreUser.setEnabled(true);
        txtAPUser.setEnabled(true);
        txtAMUser.setEnabled(true);
        txtTelefonoUser.setEnabled(true);
        txtDireccionUser.setEnabled(true);
    }
    
    public void DesHabilitarTextFieldUser(){
        txtNombreUser.setEnabled(false);
        txtAPUser.setEnabled(false);
        txtAMUser.setEnabled(false);
        txtTelefonoUser.setEnabled(false);
        txtDireccionUser.setEnabled(false);  
    }
    
    public void HabilitarBotonesOp1Usuario(){
        btnNuevoUser.setEnabled(false);
        btnSalvarUser.setEnabled(true);
        btnCancelarUser.setEnabled(true);
        btnEditarUser.setEnabled(false);
        btnRemoverUser.setEnabled(false);
    }
    
    public void HabilitarBotonesOp2Usuario(){
        btnNuevoUser.setEnabled(true);
        btnSalvarUser.setEnabled(false);
        btnCancelarUser.setEnabled(false);
        btnEditarUser.setEnabled(false);
        btnRemoverUser.setEnabled(false);
    }
    
    public void HabilitarBotonesOp3Usuario(){
        btnNuevoUser.setEnabled(false);
        btnSalvarUser.setEnabled(false);
        btnCancelarUser.setEnabled(false);
        btnEditarUser.setEnabled(true);
        btnRemoverUser.setEnabled(true);
    }
    
    public void LimpiarTextFieldUser(){
         txtIDUser.setText("");
         txtNombreUser.setText("");
         txtAPUser.setText("");
         txtAMUser.setText("");
         txtTelefonoUser.setText("");
         txtDireccionUser.setText("");
    }
    
    public void GuardarUsuarios(){
        DesHabilitarTextFieldUser();
        LimpiarTextFieldUser();
        HabilitarBotonesOp2Usuario();
    }
    
     public void Guardarclientes(){
        DeshabilitarTextFieldCliente();
        LimpiarTextFieldCliente();
        HabilitarBotonesClienteSalvar();
    }
    
    //ZONA CLIENTE 
    
    public void HabilitarTextFieldCliente(){        
        txt_cli_NombreCliente.setEnabled(true);
        txt_cli_AP.setEnabled(true);
        txt_cli_AM.setEnabled(true);
        combo_cli_IdUsuario.setEnabled(true);
    }
    
    public void DeshabilitarTextFieldCliente(){        
        txt_cli_NombreCliente.setEnabled(false);
        txt_cli_AP.setEnabled(false);
        txt_cli_AM.setEnabled(false);
        combo_cli_IdUsuario.setEnabled(false);
    }
    
    public void LimpiarTextFieldCliente(){
        txt_cli_NombreCliente.setText("");
        txt_cli_AP.setText("");
        txt_cli_AM.setText("");     
    }
    
    public void HabilitarBotonesClienteNuevo(){
        btn_cli_Nuevo.setEnabled(false);
        btn_cli_Salvar.setEnabled(true);
        btn_cli_Cancelar.setEnabled(true);
        btn_cli_Editar.setEnabled(false);
        btn_cli_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesClienteSalvar(){
        btn_cli_Nuevo.setEnabled(true);
        btn_cli_Salvar.setEnabled(false);
        btn_cli_Cancelar.setEnabled(false);
        btn_cli_Editar.setEnabled(false);
        btn_cli_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesClienteCancelar(){        
        btn_cli_Nuevo.setEnabled(true);
        btn_cli_Salvar.setEnabled(false);
        btn_cli_Cancelar.setEnabled(false);
        btn_cli_Editar.setEnabled(false);
        btn_cli_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesClienteEditar(){        
        btn_cli_Nuevo.setEnabled(false);
        btn_cli_Salvar.setEnabled(true);
        btn_cli_Cancelar.setEnabled(true);
        btn_cli_Editar.setEnabled(false);
        btn_cli_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesClienteRemover(){        
        btn_cli_Nuevo.setEnabled(true);
        btn_cli_Salvar.setEnabled(false);
        btn_cli_Cancelar.setEnabled(false);
        btn_cli_Editar.setEnabled(false);
        btn_cli_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesClienteBuscar(){        
        btn_cli_Nuevo.setEnabled(false);
        btn_cli_Salvar.setEnabled(false);
        btn_cli_Cancelar.setEnabled(false);
        btn_cli_Editar.setEnabled(true);
        btn_cli_Remover.setEnabled(true);
    }
    
    //ZONA VEHICULO
    
    public void HabilitarTextFieldVehiculo(){        
        txt_veh_Matricula.setEnabled(true);
        txt_veh_Modelo.setEnabled(true);
        txt_veh_Marca.setEnabled(true);
        txt_veh_Fecha.setEnabled(true);
        combo_veh_SelectCliente.setEnabled(true);
    }
    
    public void DeshabilitarTextFieldVehiculo(){        
        txt_veh_Matricula.setEnabled(false);
        txt_veh_Modelo.setEnabled(false);
        txt_veh_Marca.setEnabled(false);
        txt_veh_Fecha.setEnabled(false);
        combo_veh_SelectCliente.setEnabled(false);
    }
    
    public void LimpiarTextFieldVehiculo(){
        txt_veh_Matricula.setText("");
        txt_veh_Modelo.setText("");
        txt_veh_Marca.setText("");
        txt_veh_Fecha.setText("");
    }
    
    public void HabilitarBotonesVehiculoNuevo(){
        btn_veh_Nuevo.setEnabled(false);
        btn_veh_Salvar.setEnabled(true);
        btn_veh_Cancelar.setEnabled(true);
        btn_veh_Editar.setEnabled(false);
        btn_veh_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesVehiculoSalvar(){
        btn_veh_Nuevo.setEnabled(true);
        btn_veh_Salvar.setEnabled(false);
        btn_veh_Cancelar.setEnabled(false);
        btn_veh_Editar.setEnabled(false);
        btn_veh_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesVehiculoCancelar(){
        btn_veh_Nuevo.setEnabled(true);
        btn_veh_Salvar.setEnabled(false);
        btn_veh_Cancelar.setEnabled(false);
        btn_veh_Editar.setEnabled(false);
        btn_veh_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesVehiculoEditar(){
        btn_veh_Nuevo.setEnabled(false);
        btn_veh_Salvar.setEnabled(true);
        btn_veh_Cancelar.setEnabled(true);
        btn_veh_Editar.setEnabled(false);
        btn_veh_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesVehiculoRemover(){
        btn_veh_Nuevo.setEnabled(true);
        btn_veh_Salvar.setEnabled(false);
        btn_veh_Cancelar.setEnabled(false);
        btn_veh_Editar.setEnabled(false);
        btn_veh_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesVehiculoBuscar(){
        btn_veh_Nuevo.setEnabled(false);
        btn_veh_Salvar.setEnabled(false);
        btn_veh_Cancelar.setEnabled(false);
        btn_veh_Editar.setEnabled(true);
        btn_veh_Remover.setEnabled(true);        
    }
    
    //ZONA REPARACIÓN
    
    public void HabilitarTextFieldReparaciones(){
        CbReparaciones_IdVehiculo.setEnabled(true);
        txtReparaciones_FE.setEnabled(true);
        txtReparaciones_FS.setEnabled(true);
        txtReparaciones_Falla.setEnabled(true);        
        txtReparacion_cantidad.setEnabled(true);
        cbPieza_ID.setEnabled(true);
    }
    
    public void DeshabilitarTextFieldReparaciones(){
        CbReparaciones_IdVehiculo.setEnabled(false);
        cbPieza_ID.setEnabled(false);
        txtReparaciones_FE.setEnabled(false);
        txtReparaciones_FS.setEnabled(false);
        txtReparaciones_Falla.setEnabled(false);        
        txtReparacion_cantidad.setEnabled(false);
    }
    
    public void LimpiarTextFieldReparaciones(){
        txtReparaciones_FE.setText("");
        txtReparaciones_FS.setText("");
        txtReparaciones_Falla.setText("");        
        txtReparacion_cantidad.setText("");
    }
    
    public void HabilitarBotonesReparacionOp1(){
        btnReparaciones_Nuevo.setEnabled(false);
        btnReparaciones_Salvar.setEnabled(true);
        btnReparaciones_Cancelar.setEnabled(true);
        btnReparaciones_Editar.setEnabled(false);
        btnReparaciones_Remover.setEnabled(false);        
    }
    
    public void HabilitarBotonesReparacionOp2(){
        btnReparaciones_Nuevo.setEnabled(true);
        btnReparaciones_Salvar.setEnabled(false);
        btnReparaciones_Cancelar.setEnabled(false);
        btnReparaciones_Editar.setEnabled(false);
        btnReparaciones_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesReparacionOp3(){
        btnReparaciones_Nuevo.setEnabled(false);
        btnReparaciones_Salvar.setEnabled(false);
        btnReparaciones_Cancelar.setEnabled(false);
        btnReparaciones_Editar.setEnabled(true);
        btnReparaciones_Remover.setEnabled(true);
    }
    
    //ZONA PIEZAS
    
    public void HabilitarTextFieldPiezas(){        
        txt_pieza_Descripcion.setEnabled(true);
        txt_pieza_Stock.setEnabled(true);
    }
    
    public void DeshabilitarTextFieldPiezas(){        
        txt_pieza_Descripcion.setEnabled(false);
        txt_pieza_Stock.setEnabled(false);
    }
    
    public void LimpiarTextFieldPiezas(){
        txt_pieza_Descripcion.setText("");
        txt_pieza_Stock.setText("");
    }
    
    public void HabilitarBotonesPiezasNuevo(){
        btn_pieza_Nuevo.setEnabled(false);
        btn_pieza_Salvar.setEnabled(true);
        btn_pieza_Cancelar.setEnabled(true);
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesPiezasSalvar(){
        btn_pieza_Nuevo.setEnabled(true);
        btn_pieza_Salvar.setEnabled(false);
        btn_pieza_Cancelar.setEnabled(false);
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesPiezasCancelar(){
        btn_pieza_Nuevo.setEnabled(true);
        btn_pieza_Salvar.setEnabled(false);
        btn_pieza_Cancelar.setEnabled(false);
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesPiezasEditar(){
        btn_pieza_Nuevo.setEnabled(false);
        btn_pieza_Salvar.setEnabled(true);
        btn_pieza_Cancelar.setEnabled(true);
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesPiezasRemover(){
        btn_pieza_Nuevo.setEnabled(true);
        btn_pieza_Salvar.setEnabled(false);
        btn_pieza_Cancelar.setEnabled(false);
        btn_pieza_Editar.setEnabled(false);
        btn_pieza_Remover.setEnabled(false);
    }
    
    public void HabilitarBotonesPiezasBuscar(){
        btn_pieza_Nuevo.setEnabled(false);
        btn_pieza_Salvar.setEnabled(false);
        btn_pieza_Cancelar.setEnabled(false);
        btn_pieza_Editar.setEnabled(true);
        btn_pieza_Remover.setEnabled(true);
    }

    //MÉTODOS SECUNDARIOS
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
    //NUEVO, SALVAR, EDITAR, CANCELAR, REMOVER "VEHICULOS"
    
    private void btn_veh_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_NuevoActionPerformed
        try {
            read.ObtenerTodosClientes(url_cliente);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        combo_veh_SelectCliente.removeAllItems();
        for(int i = 0 ; i < read.ArregloClientes().size(); i++){    
            if(read.ArregloClientes().get(i).getEstado() == true){
                combo_veh_SelectCliente.addItem(String.valueOf(read.ArregloClientes().get(i).getId()));
            }            
        }
        txt_veh_VehiculoId.setText(String.valueOf(indice_vehiculo));
        HabilitarTextFieldVehiculo();
        LimpiarTextFieldVehiculo();
        HabilitarBotonesVehiculoNuevo();
    }//GEN-LAST:event_btn_veh_NuevoActionPerformed

    private void btn_veh_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_SalvarActionPerformed
        try {
            read.ObtenerTodosVehiculos(url_vehiculo);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(txt_veh_VehiculoId.getText().isEmpty() || txt_veh_Matricula.getText().isEmpty() || txt_veh_Marca.getText().isEmpty() || txt_veh_Modelo.getText().isEmpty() || txt_veh_Fecha.getText().isEmpty())
               JOptionPane.showMessageDialog(this, "Faltan datos.");
            else{
                vehiculo.setMatricula(txt_veh_Matricula.getText());
                vehiculo.setMarca(txt_veh_Marca.getText());
                vehiculo.setModelo(txt_veh_Modelo.getText());                
                vehiculo.setEstado(true);
                if (editar_vehiculo) {
                    vehiculo.setFecha(txt_veh_Fecha.getText());
                    vehiculo.setId(Integer.parseInt(txt_veh_VehiculoId.getText()));
                    vehiculo.setId_cliente(String.valueOf(combo_veh_SelectCliente.getSelectedItem()));
                    write.ModificarVehiculo(vehiculo, read.ArregloVehiculos(), vehiculo.getId(), url_vehiculo);                
                    editar_cliente = false;               
                }else{                    
                    vehiculo.setId(Integer.parseInt(txt_veh_VehiculoId.getText()));
                    vehiculo.setId_cliente(String.valueOf(combo_veh_SelectCliente.getSelectedItem()));                
                    vehiculo.setFecha(txt_veh_Fecha.getText());
                    write.SalvarVehiculo(vehiculo, url_vehiculo);
                    indice_vehiculo++;
                }
            }     
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DeshabilitarTextFieldVehiculo();
        LimpiarTextFieldVehiculo();
        HabilitarBotonesVehiculoSalvar();
        txt_veh_VehiculoId.setText("");
        combo_veh_SelectCliente.removeAllItems();
    }//GEN-LAST:event_btn_veh_SalvarActionPerformed

    private void btn_veh_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_CancelarActionPerformed
        txt_veh_VehiculoId.setText("");
        combo_veh_SelectCliente.removeAllItems();
        DeshabilitarTextFieldVehiculo();
        LimpiarTextFieldVehiculo();
        HabilitarBotonesVehiculoCancelar();
    }//GEN-LAST:event_btn_veh_CancelarActionPerformed

    private void btn_veh_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_EditarActionPerformed
        editar_vehiculo = true;
        HabilitarTextFieldVehiculo();
        combo_veh_SelectCliente.setEnabled(false);
        HabilitarBotonesVehiculoEditar();
        txt_veh_Fecha.setEnabled(false);
    }//GEN-LAST:event_btn_veh_EditarActionPerformed

    private void btn_veh_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_RemoverActionPerformed
        DataInputFile read2 = new DataInputFile();
        try {
            read.ObtenerTodosVehiculos(url_vehiculo);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read2.ObtenerTodasReparaciones(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            write.EliminarVehiculo(read.ArregloVehiculos(), Integer.parseInt(txt_veh_VehiculoId.getText()), url_vehiculo, read2.ArregloReparaciones());
            DeshabilitarTextFieldVehiculo();
            HabilitarBotonesVehiculoSalvar();
            LimpiarTextFieldVehiculo();
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_veh_VehiculoId.setText("");
        combo_veh_SelectCliente.removeAllItems();
    }//GEN-LAST:event_btn_veh_RemoverActionPerformed

    private void btn_veh_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veh_buscarActionPerformed
        try {
            txt_veh_VehiculoId.setText("");
            LimpiarTextFieldVehiculo();
            combo_veh_SelectCliente.removeAllItems();
            
            Vehiculos vehi_b = new Vehiculos();
            if(txt_veh_IdBuscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Tngrese el id del vehiculo");
                return;
            }
            try{
                vehi_b = read.buscarVehiculo(Integer.parseInt(txt_veh_IdBuscar.getText()), url_vehiculo);
            } catch (IOException ex) {
                //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (vehi_b.getId() == Integer.parseInt(txt_veh_IdBuscar.getText())){
                if(vehi_b.getEstado() == false){
                    JOptionPane.showMessageDialog(this, "Vehiculo Inactivo");
                    txt_veh_IdBuscar.setText("");
                    txt_veh_VehiculoId.setText("");
                    LimpiarTextFieldVehiculo();
                    HabilitarBotonesVehiculoSalvar();
                } else {
                    txt_veh_VehiculoId.setText(String.valueOf(vehi_b.getId()));
                    combo_veh_SelectCliente.addItem(vehi_b.getId_cliente());
                    txt_veh_Matricula.setText(vehi_b.getMatricula());
                    txt_veh_Marca.setText(vehi_b.getMarca());
                    txt_veh_Modelo.setText(vehi_b.getModelo());
                    txt_veh_Fecha.setText(vehi_b.getFecha());
                    
                    txt_veh_IdBuscar.setText("");
                    DeshabilitarTextFieldVehiculo();
                    HabilitarBotonesVehiculoBuscar();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe el Vehiculo");
                txt_veh_IdBuscar.setText("");
                txt_veh_VehiculoId.setText("");
                LimpiarTextFieldVehiculo();
                HabilitarBotonesVehiculoSalvar();
                combo_veh_SelectCliente.removeAllItems();
            }
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Datos no vslidos");
            txt_veh_IdBuscar.setText("");
            txt_veh_VehiculoId.setText("");
            LimpiarTextFieldVehiculo();
            HabilitarBotonesVehiculoSalvar();
            combo_veh_SelectCliente.removeAllItems();
        }
        
    }//GEN-LAST:event_btn_veh_buscarActionPerformed

     //NUEVO, SALVAR, EDITAR, CANCELAR, REMOVER "PIEZAS"
    
    private void btn_pieza_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_NuevoActionPerformed
        HabilitarTextFieldPiezas();
        LimpiarTextFieldPiezas();
        HabilitarBotonesPiezasNuevo();
        txt_pieza_PiezaId.setText(String.valueOf(indice_pieza));
    }//GEN-LAST:event_btn_pieza_NuevoActionPerformed

    private void btn_pieza_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_SalvarActionPerformed
        try {
            read.ObtenerTodasPiezas(url_piezas);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(txt_pieza_PiezaId.getText().isEmpty() || txt_pieza_Stock.getText().isEmpty() || txt_pieza_Descripcion.getText().isEmpty())
               JOptionPane.showMessageDialog(this, "Faltan datos.");
            
            else if(!isNumeric(txt_pieza_Stock.getText())){
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros en stock.");
            }
            else{
                pieza.setStock(Integer.parseInt(txt_pieza_Stock.getText()));
                pieza.setDescripcion(txt_pieza_Descripcion.getText());
                pieza.setEstado(true);
                if (editar_pieza) {
                    pieza.setId(Integer.parseInt(txt_pieza_PiezaId.getText()));
                    write.ModificarPieza(pieza, read.ArregloPiezas(), pieza.getId(), url_piezas);                
                    editar_cliente = false;               
                }else{
                    pieza.setId(Integer.parseInt(txt_pieza_PiezaId.getText()));
                    write.SalvarPieza(pieza, url_piezas);
                    indice_pieza++;
                } 
            }     
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DeshabilitarTextFieldPiezas();
        LimpiarTextFieldPiezas();
        HabilitarBotonesPiezasSalvar();
        txt_pieza_PiezaId.setText("");
    }//GEN-LAST:event_btn_pieza_SalvarActionPerformed

    private void btn_pieza_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_CancelarActionPerformed
        txt_pieza_PiezaId.setText("");
        DeshabilitarTextFieldPiezas();
        LimpiarTextFieldPiezas();
        HabilitarBotonesPiezasCancelar();
    }//GEN-LAST:event_btn_pieza_CancelarActionPerformed

    private void btn_pieza_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_EditarActionPerformed
        editar_pieza = true;
        HabilitarTextFieldPiezas();
        HabilitarBotonesPiezasEditar();
    }//GEN-LAST:event_btn_pieza_EditarActionPerformed

    private void btn_pieza_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_RemoverActionPerformed
        DataInputFile read2 = new DataInputFile();
        try {
            read.ObtenerTodasPiezas(url_piezas);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read2.ObtenerTodasReparaciones(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            write.EliminarPieza(read.ArregloPiezas(), Integer.parseInt(txt_pieza_PiezaId.getText()), url_piezas, read2.ArregloReparaciones());
            DeshabilitarTextFieldPiezas();
            HabilitarBotonesPiezasRemover();;
            LimpiarTextFieldPiezas();
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_pieza_PiezaId.setText("");
    }//GEN-LAST:event_btn_pieza_RemoverActionPerformed

    private void btn_pieza_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pieza_BuscarActionPerformed
    try{
        Piezas buscado = new Piezas();
        if(txt_pieza_IdBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el id de la pieza.");
            return;
        }
        
        try {
            buscado = read.buscarPieza(Integer.parseInt(txt_pieza_IdBuscar.getText()), url_piezas);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(buscado.getId() == Integer.parseInt(txt_pieza_IdBuscar.getText())){
            if(buscado.getEstado() == false){
                    JOptionPane.showMessageDialog(this, "Pieza Inactivo");
                    txt_pieza_IdBuscar.setText("");
                    txt_pieza_PiezaId.setText("");
                    DeshabilitarTextFieldPiezas();
                    HabilitarBotonesPiezasBuscar();
                    LimpiarTextFieldPiezas();
            }else{
                txt_pieza_PiezaId.setText(String.valueOf(buscado.getId()));
                txt_pieza_Stock.setText(String.valueOf(buscado.getStock()));
                txt_pieza_Descripcion.setText(buscado.getDescripcion());
                txt_pieza_IdBuscar.setText("");
                DeshabilitarTextFieldPiezas();
                HabilitarBotonesPiezasBuscar();
            }            
        } else{
            JOptionPane.showMessageDialog(this, "No existe la pieza");
            txt_pieza_IdBuscar.setText("");
            txt_pieza_PiezaId.setText("");
            LimpiarTextFieldPiezas();
            HabilitarBotonesPiezasSalvar();
        }
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Datos no validos");
        txt_pieza_IdBuscar.setText("");
        LimpiarTextFieldPiezas();
        HabilitarBotonesPiezasSalvar();
    }
    }//GEN-LAST:event_btn_pieza_BuscarActionPerformed

    
    //NUEVO, SALVAR, EDITAR, CANCELAR, REMOVER "REPARACIONES"
    
    private void btnReparaciones_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_BuscarActionPerformed
        try {
            txtReparaciones_ID.setText("");
            LimpiarTextFieldReparaciones();
            CbReparaciones_IdVehiculo.removeAllItems();
            cbPieza_ID.removeAllItems();
            Reparaciones rep = new Reparaciones();
            if(txtReparaciones_idBuscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese el id de la reparacion.");
                return;
            }
            
            try {
                rep = read.buscarReparacion(Integer.parseInt(txtReparaciones_idBuscar.getText()), url_reparacion);
            } catch (IOException ex) {
                //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(rep.getReparacion_id() == Integer.parseInt(txtReparaciones_idBuscar.getText())){
                if(rep.getEstado() == false){
                    JOptionPane.showMessageDialog(this, "Reparacion Inactiva");
                    txtReparaciones_idBuscar.setText("");
                    txtReparaciones_ID.setText("");
                    LimpiarTextFieldReparaciones();
                    HabilitarBotonesReparacionOp2();
                    CbReparaciones_IdVehiculo.removeAllItems();
                    cbPieza_ID.removeAllItems();
                }else{
                    CbReparaciones_IdVehiculo.removeAllItems();
                    cbPieza_ID.removeAllItems();
                    CbReparaciones_IdVehiculo.addItem(rep.getVeh_id());
                    cbPieza_ID.addItem(rep.getPieza_id());
                    txtReparaciones_ID.setText(String.valueOf(rep.getReparacion_id()));                    
                    txtReparaciones_FE.setText(rep.getFecha_entrada());
                    txtReparaciones_FS.setText(rep.getFecha_salida());                                                           
                    txtReparacion_cantidad.setText(String.valueOf(rep.getCantidad()));
                    txtReparaciones_Falla.setText(rep.getFalla());
                    
                    txtReparaciones_idBuscar.setText("");                       
                    DeshabilitarTextFieldReparaciones();
                    HabilitarBotonesReparacionOp3();
                }                                
            }else{
                JOptionPane.showMessageDialog(this, "No existe la reparacion");
                txtReparaciones_idBuscar.setText("");
                txtReparaciones_ID.setText("");
                LimpiarTextFieldReparaciones();
                HabilitarBotonesReparacionOp2();
                CbReparaciones_IdVehiculo.removeAllItems();
                cbPieza_ID.removeAllItems();
            } 
        }catch (NumberFormatException ex) {    
           JOptionPane.showMessageDialog(null, "Datos no validos");  
           txtReparaciones_idBuscar.setText("");  
           txtReparaciones_ID.setText("");
           LimpiarTextFieldReparaciones();
           HabilitarBotonesReparacionOp2();
           CbReparaciones_IdVehiculo.removeAllItems();
           cbPieza_ID.removeAllItems();
        } 
        
        DeshabilitarTextFieldReparaciones();
        //HabilitarBotonesReparacionOp3();
    }//GEN-LAST:event_btnReparaciones_BuscarActionPerformed

    private void btnReparaciones_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_RemoverActionPerformed
        try {
            read.ObtenerTodasReparaciones(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }       
        try {
            write.EliminarReparacion(read.ArregloReparaciones(), Integer.parseInt(txtReparaciones_ID.getText()), url_reparacion);
        } catch (IOException ex) {
           // Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DeshabilitarTextFieldReparaciones();
        HabilitarBotonesReparacionOp2();
        LimpiarTextFieldReparaciones();
    }//GEN-LAST:event_btnReparaciones_RemoverActionPerformed

    private void btnReparaciones_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_EditarActionPerformed
        editar_reparacion = true;        
        cant = Integer.parseInt(txtReparacion_cantidad.getText());                                    
        HabilitarTextFieldReparaciones();
        CbReparaciones_IdVehiculo.setEnabled(false);                        
        cbPieza_ID.setEnabled(false);                        
        HabilitarBotonesReparacionOp1();
    }//GEN-LAST:event_btnReparaciones_EditarActionPerformed

    private void btnReparaciones_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_CancelarActionPerformed
        CbReparaciones_IdVehiculo.removeAllItems();
        cbPieza_ID.removeAllItems();
        txtReparaciones_ID.setText("");
        DeshabilitarTextFieldReparaciones();
        LimpiarTextFieldReparaciones();
        HabilitarBotonesReparacionOp2();      
    }//GEN-LAST:event_btnReparaciones_CancelarActionPerformed

    private void btnReparaciones_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_SalvarActionPerformed
        DataInputFile read2 = new DataInputFile();        
        try {
            read.ObtenerTodasReparaciones(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read2.ObtenerTodasPiezas(url_piezas);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(txtReparaciones_FE.getText().isEmpty() || txtReparaciones_FS.getText().isEmpty() || txtReparacion_cantidad.getText().isEmpty() || txtReparaciones_Falla.getText().isEmpty())
                JOptionPane.showMessageDialog(this, "Faltan datos.");
            else{          
//                cant = Integer.parseInt(txtReparacion_cantidad.getText());                                    
                reparacion.setFecha_entrada(txtReparaciones_FE.getText());
                reparacion.setFecha_salida(txtReparaciones_FS.getText());                                  
                reparacion.setFalla(txtReparaciones_Falla.getText());
                reparacion.setEstado(true);
                if (editar_reparacion) {                                                      
                    reparacion.setCantidad(Integer.parseInt(txtReparacion_cantidad.getText()));
                    reparacion.setReparacion_id(Integer.parseInt(txtReparaciones_ID.getText()));                    
                    reparacion.setVeh_id(String.valueOf(CbReparaciones_IdVehiculo.getSelectedItem()));
                    reparacion.setPieza_id(String.valueOf(cbPieza_ID.getSelectedItem()));                                      
                    
                    if(reparacion.getCantidad() > cant){
                        cant = reparacion.getCantidad() - cant;
                        
                        pieza = read2.buscarPieza(Integer.parseInt(reparacion.getPieza_id()), url_piezas);
                    
                        if(pieza.getStock() < cant){
                            JOptionPane.showMessageDialog(this, "Solo hay: "+pieza.getStock()+" en stock");
                        }else{
                            pieza.setStock(pieza.getStock()-cant);
                            System.out.println(pieza.getStock());
                            System.out.println(pieza.getId());
                            write.ModificarPieza(pieza, read2.ArregloPiezas(), pieza.getId(), url_piezas);
                            write.ModificarReparacion(reparacion, read.ArregloReparaciones(), reparacion.getReparacion_id(), url_reparacion);                     
                            editar_reparacion = false;                                                             
                        }                        
                    }else if(reparacion.getCantidad() < cant){
                        cant = cant - reparacion.getCantidad();
                        
                        pieza = read2.buscarPieza(Integer.parseInt(reparacion.getPieza_id()), url_piezas);
                    
                        pieza.setStock(pieza.getStock()+cant);
                        System.out.println(pieza.getStock());
                        System.out.println(pieza.getId());
                        write.ModificarPieza(pieza, read2.ArregloPiezas(), pieza.getId(), url_piezas);
                        write.ModificarReparacion(reparacion, read.ArregloReparaciones(), reparacion.getReparacion_id(), url_reparacion);                     
                        editar_reparacion = false;                        
                    }else{
                        write.ModificarReparacion(reparacion, read.ArregloReparaciones(), reparacion.getReparacion_id(), url_reparacion);                     
                        editar_reparacion = false;
                    }                                                                     
                }else{
                    reparacion.setCantidad(Integer.parseInt(txtReparacion_cantidad.getText()));
                    reparacion.setReparacion_id(indice_reparacion);                    
                    reparacion.setVeh_id(String.valueOf(CbReparaciones_IdVehiculo.getSelectedItem()));                    
                    reparacion.setPieza_id(String.valueOf(cbPieza_ID.getSelectedItem()));             
                                                            
                    pieza = read2.buscarPieza(Integer.parseInt(reparacion.getPieza_id()), url_piezas);                                                           
                    
                    if(pieza.getStock() < reparacion.getCantidad()){
                        JOptionPane.showMessageDialog(this, "Solo hay: "+pieza.getStock()+" piezas en stock");
                    }else{
                        pieza.setStock(pieza.getStock()-reparacion.getCantidad());
                        System.out.println(pieza.getStock());
                        System.out.println(pieza.getId());
                        write.ModificarPieza(pieza, read2.ArregloPiezas(), pieza.getId(), url_piezas);
                        write.SalvarReparacion(reparacion, url_reparacion);
                        indice_reparacion++;                                                  
                    }                                                                              
                }                
            }     
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DeshabilitarTextFieldReparaciones();
        LimpiarTextFieldReparaciones();
        HabilitarBotonesReparacionOp2();         
        txtReparaciones_ID.setText("");
        CbReparaciones_IdVehiculo.removeAllItems();
        cbPieza_ID.removeAllItems();
    }//GEN-LAST:event_btnReparaciones_SalvarActionPerformed

    private void btnReparaciones_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparaciones_NuevoActionPerformed
        DataInputFile read2 = new DataInputFile();
        try {
            read.ObtenerTodosVehiculos(url_vehiculo);
            read2.ObtenerTodasPiezas(url_piezas);            
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        try {            
            read2.ObtenerTodasPiezas(url_piezas);            
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CbReparaciones_IdVehiculo.removeAllItems();
        cbPieza_ID.removeAllItems(); 
        
        for(int i = 0 ; i < read.ArregloVehiculos().size(); i++){    
            if(read.ArregloVehiculos().get(i).getEstado() == true){
                CbReparaciones_IdVehiculo.addItem(String.valueOf(read.ArregloVehiculos().get(i).getId()));                
            }            
        }
        System.out.println(read2.ArregloPiezas().size());
        for(int i = 0 ; i < read2.ArregloPiezas().size(); i++){    
            if(read2.ArregloPiezas().get(i).getEstado() == true){                
                cbPieza_ID.addItem(String.valueOf(read2.ArregloPiezas().get(i).getId()));                
            }            
        }
        txtReparaciones_ID.setText(String.valueOf(indice_reparacion));        
        HabilitarTextFieldReparaciones();
        LimpiarTextFieldReparaciones();
        HabilitarBotonesReparacionOp1();              
    }//GEN-LAST:event_btnReparaciones_NuevoActionPerformed

    
    //NUEVO, SALVAR, EDITAR, CANCELAR, REMOVER "CLIENTES"
    
    private void btn_cli_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_BuscarActionPerformed
        try {
            txt_cli_ClienteId.setText("");
            LimpiarTextFieldCliente();
            combo_cli_IdUsuario.removeAllItems();
            Clientes cli_b = new Clientes();         
            if(txt_cli_IdBuscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese el id del cliente.");
                return;
            }         

            try {
                cli_b = read.buscarCliente(Integer.parseInt(txt_cli_IdBuscar.getText()), url_cliente);
            } catch (IOException ex) {
                //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(cli_b.getId() == Integer.parseInt(txt_cli_IdBuscar.getText())){
                if(cli_b.getEstado() == false){
                    JOptionPane.showMessageDialog(this, "Cliente Inactivo");
                    txt_cli_IdBuscar.setText("");
                    txt_cli_ClienteId.setText("");
                    LimpiarTextFieldCliente();  
                    HabilitarBotonesClienteSalvar();
                }else{
                    combo_cli_IdUsuario.removeAllItems();
                    txt_cli_ClienteId.setText(String.valueOf(cli_b.getId()));
                    combo_cli_IdUsuario.addItem(cli_b.getId_usuario());            
                    txt_cli_NombreCliente.setText(cli_b.getNombre());
                    txt_cli_AP.setText(cli_b.getApellidoPaterno());
                    txt_cli_AM.setText(cli_b.getApellidoMaterno()); 
                    
                    txt_cli_IdBuscar.setText("");                       
                    DeshabilitarTextFieldCliente();
                    HabilitarBotonesClienteBuscar();
                }                                
            }else{
                JOptionPane.showMessageDialog(this, "No existe el Cliente");
                txt_cli_IdBuscar.setText("");
                txt_cli_ClienteId.setText("");
                LimpiarTextFieldCliente();
                HabilitarBotonesClienteSalvar();    
                combo_cli_IdUsuario.removeAllItems();
            } 
        }catch (NumberFormatException ex) {    
           JOptionPane.showMessageDialog(null, "Datos no validos");  
           txt_cli_IdBuscar.setText("");  
           txt_cli_ClienteId.setText("");
           LimpiarTextFieldCliente();
           HabilitarBotonesClienteSalvar();
           combo_cli_IdUsuario.removeAllItems();
        } 
    }//GEN-LAST:event_btn_cli_BuscarActionPerformed

    private void btn_cli_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_RemoverActionPerformed
        DataInputFile read2 = new DataInputFile();
        DataInputFile read3 = new DataInputFile();
        try {
            read.ObtenerTodosClientes(url_cliente);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read2.ObtenerTodosVehiculos(url_vehiculo);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            read3.ObtenerTodasReparaciones(url_reparacion);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            write.EliminarCliente(read.ArregloClientes(), Integer.parseInt(txt_cli_ClienteId.getText()), url_cliente,read2.ArregloVehiculos(),read3.ArregloReparaciones());
            DeshabilitarTextFieldCliente();
            HabilitarBotonesClienteSalvar();
            LimpiarTextFieldCliente();
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_cli_ClienteId.setText("");
        combo_cli_IdUsuario.removeAllItems();
    }//GEN-LAST:event_btn_cli_RemoverActionPerformed

    private void btn_cli_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_EditarActionPerformed
        editar_cliente = true;              
        HabilitarTextFieldCliente();
        combo_cli_IdUsuario.setEnabled(false);
        HabilitarBotonesClienteEditar();         
    }//GEN-LAST:event_btn_cli_EditarActionPerformed

    private void btn_cli_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_CancelarActionPerformed
        DeshabilitarTextFieldCliente();
        LimpiarTextFieldCliente();
        HabilitarBotonesClienteCancelar();
        combo_cli_IdUsuario.removeAllItems();
        txt_cli_ClienteId.setText("");
    }//GEN-LAST:event_btn_cli_CancelarActionPerformed

    private void btn_cli_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_SalvarActionPerformed
        try {
            read.ObtenerTodosClientes(url_cliente);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(txt_cli_NombreCliente.getText().isEmpty() || txt_cli_AP.getText().isEmpty() || txt_cli_AM.getText().isEmpty())
                JOptionPane.showMessageDialog(this, "Faltan datos.");
            else{
                cliente.setNombre(txt_cli_NombreCliente.getText());
                cliente.setApellidoPaterno(txt_cli_AP.getText());
                cliente.setApellidoMaterno(txt_cli_AM.getText()); 
                cliente.setEstado(true);
                if (editar_cliente) {                
                    cliente.setId(Integer.parseInt(txt_cli_ClienteId.getText()));
                    cliente.setId_usuario(String.valueOf(combo_cli_IdUsuario.getSelectedItem()));
                    write.ModificarCliente(cliente, read.ArregloClientes(), cliente.getId(), url_cliente);                
                    editar_cliente = false;               
                }else{
                    cliente.setId(indice_cliente);
                    cliente.setId_usuario(String.valueOf(combo_cli_IdUsuario.getSelectedItem()));                
                    write.SalvarCliente(cliente, url_cliente);
                    indice_cliente++;
                } 
                Guardarclientes();
            }     
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DeshabilitarTextFieldCliente();
        LimpiarTextFieldCliente();
        HabilitarBotonesClienteSalvar();  
        txt_cli_ClienteId.setText("");
        combo_cli_IdUsuario.removeAllItems();
    }//GEN-LAST:event_btn_cli_SalvarActionPerformed

    private void btn_cli_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_NuevoActionPerformed
        try {
            read.ObtenerTodosUsuarios(url_usuario);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        combo_cli_IdUsuario.removeAllItems();
        for(int i = 0 ; i < read.ArregloUsuarios().size(); i++){    
            if(read.ArregloUsuarios().get(i).getEstado() == true){
                combo_cli_IdUsuario.addItem(String.valueOf(read.ArregloUsuarios().get(i).getId()));
            }            
        }
        txt_cli_ClienteId.setText(String.valueOf(indice_cliente));
        HabilitarTextFieldCliente();
        LimpiarTextFieldCliente();
        HabilitarBotonesClienteNuevo();
    }//GEN-LAST:event_btn_cli_NuevoActionPerformed

    
    //NUEVO, SALVAR, EDITAR, CANCELAR, REMOVER "USUARIOS"
    
    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
    try{
        Usuarios buscado = new Usuarios();
        if(txtDatosUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el id del usuario.");
            return;
        }
        
        try {
            buscado = read.buscarUsuario(Integer.parseInt(txtDatosUser.getText()), url_usuario);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(buscado.getId() == Integer.parseInt(txtDatosUser.getText())){
            if(buscado.getEstado() == false){
                    JOptionPane.showMessageDialog(this, "Usuario Inactivo");
                    txtDatosUser.setText("");
                    DesHabilitarTextFieldUser();
                    HabilitarBotonesOp2Usuario();
                    LimpiarTextFieldUser();
            }else{
                txtIDUser.setText(String.valueOf(buscado.getId()));
                txtNombreUser.setText(buscado.getNombre());
                txtAPUser.setText(buscado.getApellidoPaterno());
                txtAMUser.setText(buscado.getApellidoMaterno());
                txtTelefonoUser.setText(String.valueOf(buscado.getTelefono()));
                txtDireccionUser.setText(buscado.getDireccion());
                txtDatosUser.setText("");
                DesHabilitarTextFieldUser();
                HabilitarBotonesOp3Usuario();
            }            
        } else{
            JOptionPane.showMessageDialog(this, "No existe el Usuario");
            txtDatosUser.setText("");
            LimpiarTextFieldUser();
            HabilitarBotonesOp2Usuario();
        }
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Datos no validos");
        txtDatosUser.setText("");
        LimpiarTextFieldUser();
        HabilitarBotonesOp2Usuario();
    }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void btnRemoverUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUserActionPerformed
        try {
            read.ObtenerTodosUsuarios(url_usuario);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            write.EliminarUsuario(read.ArregloUsuarios(), Integer.parseInt(txtIDUser.getText()), url_usuario);
            DesHabilitarTextFieldUser();
            HabilitarBotonesOp2Usuario();
            LimpiarTextFieldUser();            
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoverUserActionPerformed

    private void btnEditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUserActionPerformed
        editar_usuario = true;
        HabilitarTextFieldUser();
        HabilitarBotonesOp1Usuario();
    }//GEN-LAST:event_btnEditarUserActionPerformed

    private void btnCancelarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUserActionPerformed
        DesHabilitarTextFieldUser();
        LimpiarTextFieldUser();
        HabilitarBotonesOp2Usuario();
    }//GEN-LAST:event_btnCancelarUserActionPerformed

    private void btnSalvarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUserActionPerformed
        try {
            read.ObtenerTodosUsuarios(url_usuario);
        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (txtNombreUser.getText().isEmpty() || txtAPUser.getText().isEmpty() || txtAMUser.getText().isEmpty() || txtTelefonoUser.getText().isEmpty() || txtDireccionUser.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Faltan datos.");
                GuardarUsuarios();
            }
            else if(!isNumeric(txtTelefonoUser.getText())){
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros en telefono.");
                GuardarUsuarios();
            }
            else{
                usuario.setNombre(txtNombreUser.getText());
                usuario.setApellidoPaterno(txtAPUser.getText());
                usuario.setApellidoMaterno(txtAMUser.getText());
                usuario.setDireccion(txtDireccionUser.getText());
                usuario.setTelefono(Integer.parseInt(txtTelefonoUser.getText()));
                usuario.setEstado(true);
                if(editar_usuario){
                    usuario.setId(Integer.parseInt(txtIDUser.getText()));
                    write.ModificarUsuario(usuario, read.ArregloUsuarios(), Integer.parseInt(txtIDUser.getText()), url_usuario);
                    editar_usuario = false;
                }
                else{
                    usuario.setId(indice_usuario);
                    write.SalvarUsuario(usuario, url_usuario);
                    indice_usuario++;
                }
                GuardarUsuarios();
            }

        } catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalvarUserActionPerformed

    private void btnNuevoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUserActionPerformed
        HabilitarTextFieldUser();
        HabilitarBotonesOp1Usuario();
        txtIDUser.setText(String.valueOf(indice_usuario));
    }//GEN-LAST:event_btnNuevoUserActionPerformed

    private void txtReparaciones_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReparaciones_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReparaciones_IDActionPerformed

    private void cbPieza_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPieza_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPieza_IDActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbReparaciones_IdVehiculo;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnCancelarUser;
    private javax.swing.JButton btnEditarUser;
    private javax.swing.JButton btnNuevoUser;
    private javax.swing.JButton btnRemoverUser;
    private javax.swing.JButton btnReparaciones_Buscar;
    private javax.swing.JButton btnReparaciones_Cancelar;
    private javax.swing.JButton btnReparaciones_Editar;
    private javax.swing.JButton btnReparaciones_Nuevo;
    private javax.swing.JButton btnReparaciones_Remover;
    private javax.swing.JButton btnReparaciones_Salvar;
    private javax.swing.JButton btnSalvarUser;
    private javax.swing.JButton btn_cli_Buscar;
    private javax.swing.JButton btn_cli_Cancelar;
    private javax.swing.JButton btn_cli_Editar;
    private javax.swing.JButton btn_cli_Nuevo;
    private javax.swing.JButton btn_cli_Remover;
    private javax.swing.JButton btn_cli_Salvar;
    private javax.swing.JButton btn_pieza_Buscar;
    private javax.swing.JButton btn_pieza_Cancelar;
    private javax.swing.JButton btn_pieza_Editar;
    private javax.swing.JButton btn_pieza_Nuevo;
    private javax.swing.JButton btn_pieza_Remover;
    private javax.swing.JButton btn_pieza_Salvar;
    private javax.swing.JButton btn_veh_Cancelar;
    private javax.swing.JButton btn_veh_Editar;
    private javax.swing.JButton btn_veh_Nuevo;
    private javax.swing.JButton btn_veh_Remover;
    private javax.swing.JButton btn_veh_Salvar;
    private javax.swing.JButton btn_veh_buscar;
    private javax.swing.JComboBox cbPieza_ID;
    private javax.swing.JComboBox combo_cli_IdUsuario;
    private javax.swing.JComboBox combo_veh_SelectCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAMUser;
    private javax.swing.JTextField txtAPUser;
    private javax.swing.JTextField txtDatosUser;
    private javax.swing.JTextField txtDireccionUser;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtReparacion_cantidad;
    private javax.swing.JTextField txtReparaciones_FE;
    private javax.swing.JTextField txtReparaciones_FS;
    private javax.swing.JTextField txtReparaciones_Falla;
    private javax.swing.JTextField txtReparaciones_ID;
    private javax.swing.JTextField txtReparaciones_idBuscar;
    private javax.swing.JTextField txtTelefonoUser;
    private javax.swing.JTextField txt_cli_AM;
    private javax.swing.JTextField txt_cli_AP;
    private javax.swing.JTextField txt_cli_ClienteId;
    private javax.swing.JTextField txt_cli_IdBuscar;
    private javax.swing.JTextField txt_cli_NombreCliente;
    private javax.swing.JTextField txt_pieza_Descripcion;
    private javax.swing.JTextField txt_pieza_IdBuscar;
    private javax.swing.JTextField txt_pieza_PiezaId;
    private javax.swing.JTextField txt_pieza_Stock;
    private javax.swing.JTextField txt_veh_Fecha;
    private javax.swing.JTextField txt_veh_IdBuscar;
    private javax.swing.JTextField txt_veh_Marca;
    private javax.swing.JTextField txt_veh_Matricula;
    private javax.swing.JTextField txt_veh_Modelo;
    private javax.swing.JTextField txt_veh_VehiculoId;
    // End of variables declaration//GEN-END:variables
}

