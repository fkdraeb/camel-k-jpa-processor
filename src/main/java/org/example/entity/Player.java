package org.example.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "HIP_PLAYERS")
//public class Player extends PanacheEntity {
public class Player extends PanacheEntity {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLAYER")
    private Integer idPlayer;

    @Column(name = "DESC_PLAYER")
    private String descPlayer;

    @Column(name = "ENTITY")
    private String entity;

    @Column(name = "ID_USER_APL")
    private Integer idUserApl;

    @Column(name = "TYPE_INTERFACE", length = 1)
    private Character typeInterface;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "DATE_INSERT")
    @Temporal(TemporalType.DATE)
    private Date dateInsert;

    @Column(name = "DATE_UPDATE")
    @Temporal(TemporalType.DATE)
    private Date dateUpdate;

    @Column(name = "ID_USER")
    private Integer idUser;

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getDescPlayer() {
        return descPlayer;
    }

    public void setDescPlayer(String descPlayer) {
        this.descPlayer = descPlayer;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Integer getIdUserApl() {
        return idUserApl;
    }

    public void setIdUserApl(Integer idUserApl) {
        this.idUserApl = idUserApl;
    }

    public Character getTypeInterface() {
        return typeInterface;
    }

    public void setTypeInterface(Character typeInterface) {
        this.typeInterface = typeInterface;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getDateInsert() {
        return dateInsert;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public static Player findByDescPlayer(String descPlayer){
        return find("descPlayer", descPlayer).firstResult();
    }
}
