/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityBeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Asmz
 */
@Entity
@Table(name = "ROOM")
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r"),
    @NamedQuery(name = "Room.findByRoomno", query = "SELECT r FROM Room r WHERE r.roomno = :roomno"),
    @NamedQuery(name = "Room.findByRoomtype", query = "SELECT r FROM Room r WHERE r.roomtype = :roomtype"),
    @NamedQuery(name = "Room.findByBed", query = "SELECT r FROM Room r WHERE r.bed = :bed"),
    @NamedQuery(name = "Room.findByPrice", query = "SELECT r FROM Room r WHERE r.price = :price"),
    @NamedQuery(name = "Room.findByStatus", query = "SELECT r FROM Room r WHERE r.status = :status")})
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROOMNO")
    private String roomno;
    @Column(name = "ROOMTYPE")
    private String roomtype;
    @Column(name = "BED")
    private String bed;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "STATUS")
    private String status;

    public Room() {
    }

    public Room(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomno != null ? roomno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomno == null && other.roomno != null) || (this.roomno != null && !this.roomno.equals(other.roomno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityBeans.Room[ roomno=" + roomno + " ]";
    }
    
}
