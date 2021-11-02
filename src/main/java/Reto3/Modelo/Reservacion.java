package Reto3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * representa una reservacion
 * @author FELIX CESPEDES
 */
@Entity
@Table(name = "reservation")
public class Reservacion implements Serializable {
    /**
     * anotaciones id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * identificador reservacion
     */
    private Integer idReservation;
    /**
     * fecha inicio
     */
    private Date startDate;
    /*
    fecha devolucio
    */
    private Date devolutionDate;
    /**
     * estado
     */
    private String status = "created";
    /**
     * relaciones
     */
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    /**
     * identificador finca
     */
    private Finca farm;
    /**
     * relaciones
     */
    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonIgnoreProperties({"reservations", "messages"})
    /**
     * identificador cliente
     */
    private Cliente client;
    /**
     * identificador score
     */
    private String score;
    /**
     * reservacion
     * @return 
     */
    public Integer getIdReservation() {
        return idReservation;
    }
    /**
     * reservacion
     * @param idReservation 
     */
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    /**
     * fecha inicio
     * @return 
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * fecha inicio
     * @param startDate 
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /**
     * fecha devolucion
     * @return 
     */
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    /**
     * fecha devolucion
     * @param devolutionDate 
     */
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    /**
     * estado
     * @return 
     */
    public String getStatus() {
        return status;
    }
    /**
     * estado
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * finca
     * @return 
     */
    public Finca getFarm() {
        return farm;
    }
    /**
     * finca
     * @param farm 
     */
    public void setFarm(Finca farm) {
        this.farm = farm;
    }
    /**
     * cliente
     * @return 
     */
    public Cliente getClient() {
        return client;
    }
    /**
     * cliente
     * @param client 
     */
    public void setClient(Cliente client) {
        this.client = client;
    }
    /**
     * score
     * @return 
     */
    public String getScore() {
        return score;
    }
    /**
     * score
     * @param score 
     */
    public void setScore(String score) {
        this.score = score;
    }
    
}
