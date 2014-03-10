package cl.backapp.prueba.object.dto;

import java.util.Date;

/**
 * Created by xfce on 10-03-14.
 */
public class PersonaDTO extends BaseDTO {

    private Long edad;
    private String nombre;
    private Date fechaNacimiento;

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
