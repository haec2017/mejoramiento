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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hector Erazo
 */
@Entity
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "cliente.findAll", query = "SELECT c FROM cliente c"),
    @NamedQuery(name = "cliente.findByIdVenta", query = "SELECT c FROM cliente c WHERE c.idVenta = :idVenta"),
    @NamedQuery(name = "cliente.findByIdCliente", query = "SELECT c FROM cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "cliente.findByIdVehiculo", query = "SELECT c FROM cliente c WHERE c.idVehiculo = :idVehiculo"),
    @NamedQuery(name = "cliente.findByFecha", query = "SELECT c FROM cliente c WHERE c.fecha = :fecha")})
public class cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVenta")
    private Integer idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente")
    private int idCliente;
    @Column(name = "idVehiculo")
    private Integer idVehiculo;
    @Column(name = "fecha")
    private Integer fecha;

    public cliente() {
    }

    public cliente(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public cliente(Integer idVenta, int idCliente) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof cliente)) {
            return false;
        }
        cliente other = (cliente) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.cliente[ idVenta=" + idVenta + " ]";
    }

    public void setnombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
