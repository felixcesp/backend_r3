package Reto3.Interface;

import Reto3.Modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer> {

}
