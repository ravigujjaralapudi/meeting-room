package com.sagar.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "reservations")
@Data
public class Reservations extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "date_begin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBegin;

    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;

    private String employeeId;

    @Transient
    private String name;

    @Transient
    private Integer capacity;

    /*public Reservations() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Reservations(Integer id, Integer roomId, String purpose, Date dateBegin, Date dateEnd) {
        super();
        this.reservationId = id;
        this.roomId = roomId;
        this.purpose = purpose;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public Reservations(Integer roomId, String purpose, Date dateBegin, Date dateEnd) {
        super();
        this.roomId = roomId;
        this.purpose = purpose;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer id) {
        this.reservationId = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Reservations [id=" + reservationId + ", roomId=" + roomId + ", purpose=" + purpose + ", dateBegin=" + dateBegin
                + ", dateEnd=" + dateEnd + "]";
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }*/
}
