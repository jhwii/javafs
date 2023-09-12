package ENDGAME.ENDCAR.repository;

import ENDGAME.ENDCAR.entity.Order;
import ENDGAME.ENDCAR.entity.OrderCar;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private List<OrderCar> orderCars = new ArrayList<>();
}
