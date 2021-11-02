package Reto3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * representa una finca
 * @author FELIX CESPEDES
 */
@Entity
@Table(name = "farm")
public class Finca implements Serializable {
    /**
     * anotaciones id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * identificador de finca
     */
    private Integer id;
    /**
     * nombre finca
     */
    private String name;
    /**
     * direccion finca
     */
    private String address;
    /**
     * extencion finca
     */
    private Integer extension;
    /**
     * descripcion finca
     */
    private String description;
    /**
     * relaciones
     */
    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonIgnoreProperties("farms")
    /**
     * categoria finca
     */
    private Categoria category;
    /**
     * relaciones
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm", "client"})
    /**
     * listado mensajes finca
     */
    private List<Mensaje> messages;
    /**
     * relaciones
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm", "message"})
    /**
     * listado reservaciones
     */
    public List<Reservacion> reservations;
    /**
     * identificacion
     * @return 
     */
    public Integer getId() {
        return id;
    }
    /**
     * identificacion
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * nombre
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * nombre
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * direccion
     * @return 
     */
    public String getAddress() {
        return address;
    }
    /**
     * direccion
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * extension
     * @return 
     */
    public Integer getExtension() {
        return extension;
    }
   /**
    * descripcion
    * @param extension 
    */
    public void setExtension(Integer extension) {
        this.extension = extension;
    }
    /**
     * descripcion
     * @return 
     */
    public String getDescription() {
        return description;
    }
    /**descripcion
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * categoria
     * @return 
     */
    public Categoria getCategory() {
        return category;
    }
    /**
     * categoria
     * @param category 
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }
    /**
     * mensajes
     * @return 
     */
    public List<Mensaje> getMessages() {
        return messages;
    }
    /**
     * mensajes
     * @param messages 
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
    /**
     * reservaciones
     * @return 
     */
    public List<Reservacion> getReservations() {
        return reservations;
    }
    /**
     * reservaciones
     * @param reservations 
     */
    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }

}
