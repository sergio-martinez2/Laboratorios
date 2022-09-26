/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unipiloto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Sergio
 */

public class NameHandler {

    private String nombre;
    private String fechaNacimiento;
    private String edadStr;
    int tiempoahora = LocalDateTime.now().getHour();
    LocalDate fecha;
      
    
    public NameHandler() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = "" + nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = LocalDate.parse(getFechaNacimiento());
    }

    public String getEdadStr() {
        return edadStr;
    }

    public void setEdadStr(String edadStr) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(getFechaNacimiento(), fmt);
        LocalDate tiempoahora = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, tiempoahora);
        this.edadStr = "" + periodo.getYears() + " años";
    }

    public int getTiempoahora() {
        return tiempoahora;
    }

    public void setTiempoahora(int tiempoahora) {
        this.tiempoahora = tiempoahora;
    }
}