package ENDGAME.ENDCAR.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderCar extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "order_car_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    private int orderPrice;  //주문가격



//    public static OrderCar createOrderCar(Car car){
//        OrderCar orderCar = new OrderCar();
//        orderCar.setCar(car);
//        orderCar.setOrderPrice(car.getPrice());
//        car.removeStock(count);
//        return orderCar;
//    }
//
//    public int getTotalPrice() {
//        return orderPrice * count;
//    }
//    public void cancel(){
//        this.getCar().addStock(count);
//    }
//    // 주문 취소시 재고를 늘려줌(원복)

}
