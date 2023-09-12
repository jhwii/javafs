package ENDGAME.ENDCAR.entity;

import ENDGAME.ENDCAR.constant.CarSellStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;




@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name="order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "login_id")
    private User user;

    private LocalDateTime orderDate; //주문일

    @Enumerated(EnumType.STRING)
    private CarSellStatus carSellStatus; //주문상태

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<OrderCar> orderCars = new ArrayList<>();
    private LocalDateTime regTime;
    private LocalDateTime updateTime;


    public void addOrderCar(OrderCar orderCar){
        orderCars.add(orderCar);
        orderCar.setOrder(this);
    }
    // addOrderItem(OrderItem orderItem) 주문 엔티티에 주문 상품(orderItem) 추가
    // 주문 상품 객체에도 주문정보를 연결해줍니다. 양방향 연관관계를 설정하는 역할


    public static Order createOrder(User user, List<OrderCar> orderCarList){
        Order order = new Order();
        order.setUser(user);
        for(OrderCar orderCar : orderCarList){
            order.addOrderCar(orderCar);
        }

        order.setCarSellStatus(CarSellStatus.SELL);
        order.setOrderDate(LocalDateTime.now());
        return order;
    }

//    public int getTotalPrice(){
//        int totalPrice = 0;
//        for(OrderCar orderCar : orderCars){
//            totalPrice += orderCar.getTotalPrice();
//        }
//        return totalPrice;
//    }
//
//    public void cancelOrder(){
//        this.carSellStatus = CarSellStatus.CANCEL;
//        for (OrderCar orderCar : orderCars) {
//            orderCar.cancel();
//        }
//    }
}

// select * from order o join orderItem ot on o.order_id = ot.order_id
// select * from orderItem ot join order o on ot.order_id = o.order_id

// Order findOrder = em.find(Order.class, order.getId());

// int OrderListSize = findOrder.getOrders().size();
