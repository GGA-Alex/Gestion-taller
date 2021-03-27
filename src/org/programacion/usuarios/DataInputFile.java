
package org.programacion.usuarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class DataInputFile {
    private DataInputStream archivo; 
    private int id,id_usuario, id_cliente, id_vehiculo, id_pieza, id_reparacion, telefono,stock, cant;
    private String nombre,ap,am,direccion, idUsuario_cliente, idCliente_vehiculo,matricula,marca,modelo,fecha,descripcion, fecha_e, fecha_s, falla, veh_id, pieza_id;
    boolean estado, estadou, estador;
    
    private ArrayList<Usuarios> usuarios = new ArrayList();
    private ArrayList<Clientes> clientes = new ArrayList();
    private ArrayList<Vehiculos> vehiculos = new ArrayList();
    private ArrayList<Piezas> piezas = new ArrayList();
    private ArrayList<Reparaciones> reparaciones = new ArrayList();
    
    public Usuarios buscarUsuario(int idBuscado,String url) throws IOException {
        try {
            archivo = new DataInputStream( new FileInputStream(url));
            Usuarios usuario = new Usuarios();
            while (true){
                id=archivo.readInt();
                nombre=archivo.readUTF();
                ap=archivo.readUTF();
                am=archivo.readUTF();
                direccion=archivo.readUTF();
                telefono=archivo.readInt();
                estadou=archivo.readBoolean();
                
                if (id == idBuscado){
                    usuario.setId(id);
                    usuario.setNombre(nombre);
                    usuario.setApellidoPaterno(ap);
                    usuario.setApellidoMaterno(am);
                    usuario.setDireccion(direccion);
                    usuario.setTelefono(telefono);
                    usuario.setEstado(estadou);
                    return usuario;
                }
            }
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(DataInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Clientes buscarCliente(int idBuscado,String url) throws IOException {
        try {
            archivo = new DataInputStream( new FileInputStream(url));
            Clientes cli = new Clientes();
            while (true){
                id=archivo.readInt();
                idUsuario_cliente=archivo.readUTF();
                nombre=archivo.readUTF();
                ap=archivo.readUTF();
                am=archivo.readUTF();  
                estado=archivo.readBoolean();
                if(id == idBuscado){
                    cli.setId(id);
                    cli.setId_usuario(idUsuario_cliente);
                    cli.setNombre(nombre);
                    cli.setApellidoPaterno(ap);
                    cli.setApellidoMaterno(am);
                    cli.setEstado(estado);
                    return cli;
                }
            }
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(DataInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Vehiculos buscarVehiculo(int idBuscado,String url) throws IOException {
        try {
            archivo = new DataInputStream( new FileInputStream(url));
            Vehiculos v = new Vehiculos();
            while (true){
                id = archivo.readInt();
                idCliente_vehiculo = archivo.readUTF();
                matricula = archivo.readUTF();
                marca = archivo.readUTF();
                modelo = archivo.readUTF();
                fecha = archivo.readUTF();
                estado = archivo.readBoolean();
                if(id == idBuscado){
                    v.setId(id);
                    v.setId_cliente(idCliente_vehiculo);
                    v.setMatricula(matricula);
                    v.setMarca(marca);
                    v.setModelo(modelo);
                    v.setFecha(fecha);
                    v.setEstado(estado);
                    return v;
                }
            }
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(DataInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Piezas buscarPieza(int idBuscado,String url) throws IOException {
        try {
            archivo = new DataInputStream( new FileInputStream(url));
            Piezas p = new Piezas();
            while (true){
                id = archivo.readInt();
                stock = archivo.readInt();
                descripcion = archivo.readUTF();
                estado = archivo.readBoolean();
                if(id == idBuscado){
                    p.setId(id);
                    p.setStock(stock);
                    p.setDescripcion(descripcion);
                    p.setEstado(estado);
                    return p;
                }
            }
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(DataInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Reparaciones buscarReparacion(int idBuscado,String url) throws IOException {
        try {
            archivo = new DataInputStream( new FileInputStream(url));
            Reparaciones rep = new Reparaciones();
            while (true){                
                id=archivo.readInt();
                veh_id=archivo.readUTF();
                fecha_e=archivo.readUTF();
                fecha_s=archivo.readUTF();
                pieza_id=archivo.readUTF();
                cant=archivo.readInt();
                falla=archivo.readUTF();
                estado=archivo.readBoolean();
                if(id == idBuscado){
                    rep.setReparacion_id(id);
                    rep.setVeh_id(veh_id);
                    rep.setFecha_entrada(fecha_e);
                    rep.setFecha_salida(fecha_s);
                    rep.setPieza_id(pieza_id);
                    rep.setCantidad(cant);
                    rep.setFalla(falla);   
                    rep.setEstado(estado);
                    
                    return rep;
                }
            }
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(DataInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void obtenerIndiceUsuario(String url) throws IOException {
        archivo = new DataInputStream(new FileInputStream(url));
        while (true) {
            id_usuario = archivo.readInt();
            nombre = archivo.readUTF();
            ap = archivo.readUTF();
            am = archivo.readUTF();
            direccion = archivo.readUTF();
            telefono = archivo.readInt();
            estado = archivo.readBoolean();
        }
    }
    
    public void obtenerIndiceCliente(String url) throws IOException {
        archivo = new DataInputStream(new FileInputStream(url));
        while (true) {
            id_cliente = archivo.readInt();
            idUsuario_cliente = archivo.readUTF();
            nombre = archivo.readUTF();
            ap = archivo.readUTF();
            am = archivo.readUTF();
            estado = archivo.readBoolean();
        }
    }

    public void obtenerIndiceVehiculos(String url) throws IOException {
        archivo = new DataInputStream(new FileInputStream(url));
        while (true) {
            id_vehiculo = archivo.readInt();
            idCliente_vehiculo = archivo.readUTF();
            matricula = archivo.readUTF();
            marca = archivo.readUTF();
            modelo = archivo.readUTF();
            fecha = archivo.readUTF();
            estado = archivo.readBoolean();
        }
    }
    
    public void obtenerIndicePiezas(String url) throws IOException {
        archivo = new DataInputStream(new FileInputStream(url));
        while (true) {
            id_pieza = archivo.readInt();
            stock = archivo.readInt();
            descripcion = archivo.readUTF();
            estado = archivo.readBoolean();
        }
    }
    
    public void obtenerIndiceReparacion(String url) throws IOException {
        archivo = new DataInputStream(new FileInputStream(url));
        while (true) {
            id_reparacion = archivo.readInt();
            veh_id = archivo.readUTF();
            fecha_e = archivo.readUTF();
            fecha_s = archivo.readUTF();
            pieza_id = archivo.readUTF();
            cant = archivo.readInt();
            falla = archivo.readUTF();
            estador = archivo.readBoolean();
        }
    }
    
    public void ObtenerTodosUsuarios(String url) throws IOException{
        archivo = new DataInputStream(new FileInputStream(url));
        Usuarios usuario;
        usuarios.clear();
        while (true) {
            usuario = new Usuarios();
            usuario.setId(archivo.readInt());
            usuario.setNombre(archivo.readUTF());
            usuario.setApellidoPaterno(archivo.readUTF());
            usuario.setApellidoMaterno(archivo.readUTF());
            usuario.setDireccion(archivo.readUTF());
            usuario.setTelefono(archivo.readInt());
            usuario.setEstado(archivo.readBoolean());
            usuarios.add(usuario);
        }
    }
    
    public void ObtenerTodosClientes(String url) throws IOException{
        archivo = new DataInputStream(new FileInputStream(url));
        Clientes cliente;
        clientes.clear();
        while (true) {
            cliente = new Clientes();
            cliente.setId(archivo.readInt());
            cliente.setId_usuario(archivo.readUTF());
            cliente.setNombre(archivo.readUTF());
            cliente.setApellidoPaterno(archivo.readUTF());
            cliente.setApellidoMaterno(archivo.readUTF());
            cliente.setEstado(archivo.readBoolean());
            clientes.add(cliente);
        }
    }
    
    public void ObtenerTodosVehiculos(String url) throws IOException{
        archivo = new DataInputStream(new FileInputStream(url));
        Vehiculos vehiculo;
        vehiculos.clear();
        while (true){
            vehiculo = new Vehiculos();
            vehiculo.setId(archivo.readInt());
            vehiculo.setId_cliente(archivo.readUTF());
            vehiculo.setMatricula(archivo.readUTF());
            vehiculo.setMarca(archivo.readUTF());
            vehiculo.setModelo(archivo.readUTF());
            vehiculo.setFecha(archivo.readUTF());
            vehiculo.setEstado(archivo.readBoolean());
            vehiculos.add(vehiculo);
        }
     }
    
     public void ObtenerTodasPiezas(String url) throws IOException{
        archivo = new DataInputStream(new FileInputStream(url));
        Piezas pieza;
        piezas.clear();
        while (true){
            pieza = new Piezas();
            pieza.setId(archivo.readInt());
            pieza.setStock(archivo.readInt());
            pieza.setDescripcion(archivo.readUTF());
            pieza.setEstado(archivo.readBoolean());
            piezas.add(pieza);            
        }
     }
     
    public void ObtenerTodasReparaciones(String url) throws IOException{
        archivo = new DataInputStream(new FileInputStream(url));
        Reparaciones reparacion;
        reparaciones.clear();
        while (true){
            reparacion = new Reparaciones();
            reparacion.setReparacion_id(archivo.readInt());
            reparacion.setVeh_id(archivo.readUTF());
            reparacion.setFecha_entrada(archivo.readUTF());
            reparacion.setFecha_salida(archivo.readUTF());
            reparacion.setPieza_id(archivo.readUTF());
            reparacion.setCantidad(archivo.readInt());
            reparacion.setFalla(archivo.readUTF());
            reparacion.setEstado(archivo.readBoolean());
            reparaciones.add(reparacion);
        }
     }
    
    public ArrayList<Usuarios> ArregloUsuarios(){
        return usuarios;
    }
    
    public ArrayList<Clientes> ArregloClientes(){
        return clientes;
    }
    
    public ArrayList<Vehiculos> ArregloVehiculos(){
        return vehiculos;
    }
    
    public ArrayList<Piezas> ArregloPiezas(){
        return piezas;
    }
    
    public ArrayList<Reparaciones> ArregloReparaciones(){
        return reparaciones;
    }
    
    public int IndiceUsuario(){
        return id_usuario + 1;
    }
    
    public int IndiceCliente(){
        return id_cliente + 1;
    }
    
    public int IndiceVehiculo(){
        return id_vehiculo + 1;
    }
    
    public int IndicePieza(){
        return id_pieza + 1;
    }
    
    public int IndiceReparacion(){
        return id_reparacion + 1;
    }
}
