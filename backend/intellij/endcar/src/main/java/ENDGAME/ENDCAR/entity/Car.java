package ENDGAME.ENDCAR.entity;

import ENDGAME.ENDCAR.constant.CarSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="car")
@Getter
@Setter
@ToString
public class Car {
    @Id
    @Column(name = "car_id")
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String carBrand;

    @Column(nullable = false)
    private String carName;

    @Column(nullable = false)
    private String carType;

    @Column(nullable = false)
    private String carColor;

    @Column(nullable = false)
    private int carManufacturingDate;

    @Column(name = "price", nullable = false)
    private int carPrice;

    @Lob  //Large Object-큰데이터 저장
    @Column(nullable = false)
    private String carOption;

    @Column(nullable = false)
    private int carStockNumber = 1;

    @Enumerated(EnumType.STRING)
    private CarSellStatus carSellStatus;


    @ManyToMany
    @JoinTable(
            name = "user_car",
            joinColumns = @JoinColumn(name= "login_id"),
            inverseJoinColumns = @JoinColumn(name="car_id")
    )
    private List<User> user;
}
