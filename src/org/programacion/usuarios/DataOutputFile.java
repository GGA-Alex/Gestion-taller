package org.programacion.usuarios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DataOutputFile {

    private DataOutputStream archivo = null;

    public void SalvarUsuario(Usuarios user, String url) throws FileNotFoundException, IOException {
        archivo = new DataOutputStream(new FileOutputStream(url, true));
        archivo.writeInt(user.getId());
        archivo.writeUTF(user.getNombre());
        archivo.writeUTF(user.getApellidoPaterno());
        archivo.writeUTF(user.getApellidoMaterno());
        archivo.writeUTF(user.getDireccion());
        archivo.writeInt(user.getTelefono());
        archivo.writeBoolean(user.getEstado());
        archivo.close();
    }

    public void SalvarCliente(Clientes cliente, String url) throws FileNotFoundException, IOException {
        archivo = new DataOutputStream(new FileOutputStream(url, true));
        archivo.writeInt(cliente.getId());
        archivo.writeUTF(cliente.getId_usuario());
        archivo.writeUTF(cliente.getNombre());
        archivo.writeUTF(cliente.getApellidoPaterno());
        archivo.writeUTF(cliente.getApellidoMaterno());
        archivo.writeBoolean(cliente.getEstado());
        archivo.close();
    }

    public void SalvarVehiculo(Vehiculos vehiculo, String url) throws FileNotFoundException, IOException {
        archivo = new DataOutputStream(new FileOutputStream(url, true));
        archivo.writeInt(vehiculo.getId());
        archivo.writeUTF(vehiculo.getId_cliente());
        archivo.writeUTF(vehiculo.getMatricula());
        archivo.writeUTF(vehiculo.getMarca());
        archivo.writeUTF(vehiculo.getModelo());
        archivo.writeUTF(vehiculo.getFecha());
        archivo.writeBoolean(vehiculo.getEstado());
        archivo.close();
    }
    
    public void SalvarPieza(Piezas pieza, String url) throws FileNotFoundException, IOException {
        archivo = new DataOutputStream(new FileOutputStream(url, true));
        archivo.writeInt(pieza.getId());
        archivo.writeInt(pieza.getStock());
        archivo.writeUTF(pieza.getDescripcion());
        archivo.writeBoolean(pieza.getEstado());
        archivo.close();
    }
    
    public void SalvarReparacion(Reparaciones reparacion, String url) throws FileNotFoundException, IOException {
        archivo = new DataOutputStream(new FileOutputStream(url, true));
        archivo.writeInt(reparacion.getReparacion_id());
        archivo.writeUTF(reparacion.getVeh_id());
        archivo.writeUTF(reparacion.getFecha_entrada());
        archivo.writeUTF(reparacion.getFecha_salida());
        archivo.writeUTF(reparacion.getPieza_id());
        archivo.writeInt(reparacion.getCantidad());
        archivo.writeUTF(reparacion.getFalla());
        archivo.writeBoolean(reparacion.getEstado());
        archivo.close();
    }

    public void EliminarUsuario(ArrayList<Usuarios> usuarios, int idEliminar, String url) throws FileNotFoundException, IOException {
        DataInputFile read = new DataInputFile();
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < usuarios.size(); i++) {

                if (usuarios.get(i).getId() == idEliminar) {
                    usuarios.get(i).setEstado(false);
                }
                archivo_nuevo.writeInt(usuarios.get(i).getId());
                archivo_nuevo.writeUTF(usuarios.get(i).getNombre());
                archivo_nuevo.writeUTF(usuarios.get(i).getApellidoPaterno());
                archivo_nuevo.writeUTF(usuarios.get(i).getApellidoMaterno());
                archivo_nuevo.writeUTF(usuarios.get(i).getDireccion());
                archivo_nuevo.writeInt(usuarios.get(i).getTelefono());
                archivo_nuevo.writeBoolean(usuarios.get(i).getEstado());
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarCliente(ArrayList<Clientes> clientes, int idEliminar, String url,ArrayList<Vehiculos> vehiculos,  ArrayList<Reparaciones> reparaciones) throws FileNotFoundException, IOException {
        DataInputFile read = new DataInputFile();
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getId() == idEliminar) {
                    clientes.get(i).setEstado(false);
                }
                archivo_nuevo.writeInt(clientes.get(i).getId());
                archivo_nuevo.writeUTF(clientes.get(i).getId_usuario());
                archivo_nuevo.writeUTF(clientes.get(i).getNombre());
                archivo_nuevo.writeUTF(clientes.get(i).getApellidoPaterno());
                archivo_nuevo.writeUTF(clientes.get(i).getApellidoMaterno());
                archivo_nuevo.writeBoolean(clientes.get(i).getEstado());
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < vehiculos.size(); i++) {
            if (Integer.parseInt(vehiculos.get(i).getId_cliente()) == idEliminar)
                EliminarVehiculo(vehiculos, read.buscarVehiculo(vehiculos.get(i).getId(), "f:/vehiculo.txt").getId(), "f:/vehiculo.txt", reparaciones);
        }
    }

    public void EliminarVehiculo(ArrayList<Vehiculos> vehiculos, int idEliminar, String url,  ArrayList<Reparaciones> reparaciones) throws FileNotFoundException, IOException {
        DataInputFile read = new DataInputFile();
        try {            
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < vehiculos.size(); i++) {
                if (vehiculos.get(i).getId() == idEliminar) {
                    vehiculos.get(i).setEstado(false);
                }
                archivo_nuevo.writeInt(vehiculos.get(i).getId());
                archivo_nuevo.writeUTF(vehiculos.get(i).getId_cliente());
                archivo_nuevo.writeUTF(vehiculos.get(i).getMatricula());
                archivo_nuevo.writeUTF(vehiculos.get(i).getMarca());
                archivo_nuevo.writeUTF(vehiculos.get(i).getModelo());
                archivo_nuevo.writeUTF(vehiculos.get(i).getFecha());
                archivo_nuevo.writeBoolean(vehiculos.get(i).getEstado());
            }
            archivo_nuevo.close();            

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < reparaciones.size(); i++ ){
            if(Integer.parseInt(reparaciones.get(i).getVeh_id()) == idEliminar){
                EliminarReparacion(reparaciones, read.buscarReparacion(reparaciones.get(i).getReparacion_id(), "f:/reparaciones.txt").getReparacion_id() , "f:/reparaciones.txt");
            }
        }
    }

    public void EliminarPieza(ArrayList<Piezas> piezas, int idEliminar, String url, ArrayList<Reparaciones> reparaciones) throws FileNotFoundException, IOException {
        DataInputFile read = new DataInputFile();
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < piezas.size(); i++) {
                if (piezas.get(i).getId() == idEliminar) {
                    piezas.get(i).setEstado(false);
                }
                archivo_nuevo.writeInt(piezas.get(i).getId());
                archivo_nuevo.writeInt(piezas.get(i).getStock());
                archivo_nuevo.writeUTF(piezas.get(i).getDescripcion());
                archivo_nuevo.writeBoolean(piezas.get(i).getEstado());
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i = 0; i < reparaciones.size(); i++ ){
            if(Integer.parseInt(reparaciones.get(i).getPieza_id()) == idEliminar){
                EliminarReparacion(reparaciones, read.buscarReparacion(reparaciones.get(i).getReparacion_id(),"f:/reparaciones.txt" ).getReparacion_id() , "f:/reparaciones.txt");
            }
        }
    }
    
    public void EliminarReparacion(ArrayList<Reparaciones> reparaciones, int idEliminar, String url) throws FileNotFoundException, IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < reparaciones.size(); i++) {
                if (reparaciones.get(i).getReparacion_id() == idEliminar) {
                    reparaciones.get(i).setEstado(false);
                }
                archivo_nuevo.writeInt(reparaciones.get(i).getReparacion_id());
                archivo_nuevo.writeUTF(reparaciones.get(i).getVeh_id());
                archivo_nuevo.writeUTF(reparaciones.get(i).getFecha_entrada());
                archivo_nuevo.writeUTF(reparaciones.get(i).getFecha_salida());
                archivo_nuevo.writeUTF(reparaciones.get(i).getPieza_id());
                archivo_nuevo.writeInt(reparaciones.get(i).getCantidad());
                archivo_nuevo.writeUTF(reparaciones.get(i).getFalla());
                archivo_nuevo.writeBoolean(reparaciones.get(i).getEstado());
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ModificarUsuario(Usuarios usuarioModificado, ArrayList<Usuarios> usuarios, int idModificar, String url) throws IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId() != idModificar) {
                    archivo_nuevo.writeInt(usuarios.get(i).getId());
                    archivo_nuevo.writeUTF(usuarios.get(i).getNombre());
                    archivo_nuevo.writeUTF(usuarios.get(i).getApellidoPaterno());
                    archivo_nuevo.writeUTF(usuarios.get(i).getApellidoMaterno());
                    archivo_nuevo.writeUTF(usuarios.get(i).getDireccion());
                    archivo_nuevo.writeInt(usuarios.get(i).getTelefono());
                    archivo_nuevo.writeBoolean(usuarios.get(i).getEstado());
                } else {
                    archivo_nuevo.writeInt(usuarioModificado.getId());
                    archivo_nuevo.writeUTF(usuarioModificado.getNombre());
                    archivo_nuevo.writeUTF(usuarioModificado.getApellidoPaterno());
                    archivo_nuevo.writeUTF(usuarioModificado.getApellidoMaterno());
                    archivo_nuevo.writeUTF(usuarioModificado.getDireccion());
                    archivo_nuevo.writeInt(usuarioModificado.getTelefono());
                    archivo_nuevo.writeBoolean(usuarioModificado.getEstado());
                }
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModificarCliente(Clientes clienteModificado, ArrayList<Clientes> clientes, int idModificar, String url) throws IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getId() != idModificar) {
                    archivo_nuevo.writeInt(clientes.get(i).getId());
                    archivo_nuevo.writeUTF(clientes.get(i).getId_usuario());
                    archivo_nuevo.writeUTF(clientes.get(i).getNombre());
                    archivo_nuevo.writeUTF(clientes.get(i).getApellidoPaterno());
                    archivo_nuevo.writeUTF(clientes.get(i).getApellidoMaterno());
                    archivo_nuevo.writeBoolean(clientes.get(i).getEstado());
                } else {
                    archivo_nuevo.writeInt(clienteModificado.getId());
                    archivo_nuevo.writeUTF(clienteModificado.getId_usuario());
                    archivo_nuevo.writeUTF(clienteModificado.getNombre());
                    archivo_nuevo.writeUTF(clienteModificado.getApellidoPaterno());
                    archivo_nuevo.writeUTF(clienteModificado.getApellidoMaterno());
                    archivo_nuevo.writeBoolean(clienteModificado.getEstado());
                }
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModificarVehiculo(Vehiculos vehiculoModificado, ArrayList<Vehiculos> vehiculos, int idModificar, String url) throws IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < vehiculos.size(); i++) {
                if (vehiculos.get(i).getId() != idModificar) {
                    archivo_nuevo.writeInt(vehiculos.get(i).getId());
                    archivo_nuevo.writeUTF(vehiculos.get(i).getId_cliente());
                    archivo_nuevo.writeUTF(vehiculos.get(i).getMatricula());
                    archivo_nuevo.writeUTF(vehiculos.get(i).getMarca());
                    archivo_nuevo.writeUTF(vehiculos.get(i).getModelo());
                    archivo_nuevo.writeUTF(vehiculos.get(i).getFecha());
                    archivo_nuevo.writeBoolean(vehiculos.get(i).getEstado());
                } else {
                    archivo_nuevo.writeInt(vehiculoModificado.getId());
                    archivo_nuevo.writeUTF(vehiculoModificado.getId_cliente());
                    archivo_nuevo.writeUTF(vehiculoModificado.getMatricula());
                    archivo_nuevo.writeUTF(vehiculoModificado.getMarca());
                    archivo_nuevo.writeUTF(vehiculoModificado.getModelo());
                    archivo_nuevo.writeUTF(vehiculoModificado.getFecha());
                    archivo_nuevo.writeBoolean(vehiculoModificado.getEstado());
                }
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModificarPieza(Piezas piezaModificada, ArrayList<Piezas> piezas, int idModificar, String url) throws IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < piezas.size(); i++) {
                if (piezas.get(i).getId() != idModificar) {
                    archivo_nuevo.writeInt(piezas.get(i).getId());
                    archivo_nuevo.writeInt(piezas.get(i).getStock());
                    archivo_nuevo.writeUTF(piezas.get(i).getDescripcion());
                    archivo_nuevo.writeBoolean(piezas.get(i).getEstado());
                } else {
                   archivo_nuevo.writeInt(piezaModificada.getId());
                    archivo_nuevo.writeInt(piezaModificada.getStock());
                    archivo_nuevo.writeUTF(piezaModificada.getDescripcion());
                    archivo_nuevo.writeBoolean(piezaModificada.getEstado());
                }
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ModificarReparacion(Reparaciones reparacionModificada, ArrayList<Reparaciones> reparaciones, int idModificar, String url) throws IOException {
        try {
            DataOutputStream archivo_nuevo = new DataOutputStream((new FileOutputStream(url)));
            archivo_nuevo = new DataOutputStream(new FileOutputStream(url, true));

            for (int i = 0; i < reparaciones.size(); i++) {
                if (reparaciones.get(i).getReparacion_id() != idModificar) {
                    archivo_nuevo.writeInt(reparaciones.get(i).getReparacion_id());
                    archivo_nuevo.writeUTF(reparaciones.get(i).getVeh_id());
                    archivo_nuevo.writeUTF(reparaciones.get(i).getFecha_entrada());
                    archivo_nuevo.writeUTF(reparaciones.get(i).getFecha_salida());
                    archivo_nuevo.writeUTF(reparaciones.get(i).getPieza_id());
                    archivo_nuevo.writeInt(reparaciones.get(i).getCantidad());
                    archivo_nuevo.writeUTF(reparaciones.get(i).getFalla());
                    archivo_nuevo.writeBoolean(reparaciones.get(i).getEstado());                       
                } else {
                    archivo_nuevo.writeInt(reparacionModificada.getReparacion_id());
                    archivo_nuevo.writeUTF(reparacionModificada.getVeh_id());
                    archivo_nuevo.writeUTF(reparacionModificada.getFecha_entrada());
                    archivo_nuevo.writeUTF(reparacionModificada.getFecha_salida());
                    archivo_nuevo.writeUTF(reparacionModificada.getPieza_id());
                    archivo_nuevo.writeInt(reparacionModificada.getCantidad());
                    archivo_nuevo.writeUTF(reparacionModificada.getFalla());
                    archivo_nuevo.writeBoolean(reparacionModificada.getEstado());
                }
            }
            archivo_nuevo.close();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
