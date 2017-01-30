/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hector Erazo
 */
@Entity
@Table(name = "concesionarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "concesionario.findAll", query = "SELECT c FROM concesionario c"),
    @NamedQuery(name = "concesionario.findByNit", query = "SELECT c FROM concesionario c WHERE c.nit = :nit"),
    @NamedQuery(name = "concesionario.findByNombre", query = "SELECT c FROM concesionario c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "concesionario.findByTelefono", query = "SELECT c FROM concesionario c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "concesionario.findByDireccion", query = "SELECT c FROM concesionario c WHERE c.direccion = :direccion")})
public class concesionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nit")
    private Integer nit;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 25)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 25)
    @Column(name = "direccion")
    private String direccion;

    public concesionario() {
    }

    public concesionario(Integer nit) {
        this.nit = nit;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof concesionario)) {
            return false;
        }
        concesionario other = (concesionario) object;
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.concesionario[ nit=" + nit + " ]";
    }
    
}
