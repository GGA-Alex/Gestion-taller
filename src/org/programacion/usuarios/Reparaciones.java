
package org.programacion.usuarios;


public class Reparaciones {
    private int reparacion_id, cantidad;
    private String fecha_entrada, fecha_salida, falla, veh_id, pieza_id;
    Boolean estado = false;

    public int getReparacion_id() {
        return reparacion_id;
    }

    public void setReparacion_id(int reparacion_id) {
        this.reparacion_id = reparacion_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }

    public String getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(String veh_id) {
        this.veh_id = veh_id;
    }

    public String getPieza_id() {
        return pieza_id;
    }

    public void setPieza_id(String pieza_id) {
        this.pieza_id = pieza_id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }    
}
