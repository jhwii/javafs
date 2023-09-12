package ENDGAME.ENDCAR.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="cart_car")
public class CartCar extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "cart_car_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cart_id")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="car_id")
    private Car car;


    public static CartCar createCartCar(Cart cart, Car car){
        CartCar cartCar = new CartCar();
        cartCar.setCart(cart);
        cartCar.setCar(car);
        return cartCar;
    }
    //장바구니에 담을 상품엔티티를 생성하는 메소드와 장바구니에 담을 수량을 증가시켜주는 메소드 추가

//    public void addCount(int count){
//        this.count += count;
//    }
//
//    public void updateCount(int count){
//        this.count = count;
//    }


}