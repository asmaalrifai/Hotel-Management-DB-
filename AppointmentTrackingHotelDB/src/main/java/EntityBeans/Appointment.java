/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityBeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asmz
 */
@Entity
@Table(name = "APPOINTMENT")
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a"),
    @NamedQuery(name = "Appointment.findById", query = "SELECT a FROM Appointment a WHERE a.id = :id"),
    @NamedQuery(name = "Appointment.findByCustomername", query = "SELECT a FROM Appointment a WHERE a.customername = :customername"),
    @NamedQuery(name = "Appointment.findByCheckin", query = "SELECT a FROM Appointment a WHERE a.checkin = :checkin"),
    @NamedQuery(name = "Appointment.findByCheckout", query = "SELECT a FROM Appointment a WHERE a.checkout = :checkout"),
    @NamedQuery(name = "Appointment.findByPriceperday", query = "SELECT a FROM Appointment a WHERE a.priceperday = :priceperday"),
    @NamedQuery(name = "Appointment.findByTotalprice", query = "SELECT a FROM Appointment a WHERE a.totalprice = :totalprice"),
    @NamedQuery(name = "Appointment.findByRoomno", query = "SELECT a FROM Appointment a WHERE a.roomno = :roomno")})
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CUSTOMERNAME")
    private String customername;
    @Column(name = "CHECKIN")
    @Temporal(TemporalType.DATE)
    private Date checkin;
    @Column(name = "CHECKOUT")
    @Temporal(TemporalType.DATE)
    private Date checkout;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICEPERDAY")
    private Double priceperday;
    @Column(name = "TOTALPRICE")
    private Double totalprice;
    @Column(name = "ROOMNO")
    private Integer roomno;

    public Appointment() {
    }

    public Appointment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Double getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(Double priceperday) {
        this.priceperday = priceperday;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getRoomno() {
        return roomno;
    }

    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityBeans.Appointment[ id=" + id + " ]";
    }
    
}
