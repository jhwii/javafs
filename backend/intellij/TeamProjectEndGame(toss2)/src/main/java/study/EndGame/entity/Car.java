package study.EndGame.entity;

import lombok.*;
import study.EndGame.constant.CarSellStatus;
import study.EndGame.dto.CarRegistrationDto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "car")
public class Car extends BaseTimeEntity {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "브랜드명을 입력해주세요.")
    private String carBrand;

    @Column(nullable = false)
    @NotBlank(message = "차량명을 입력해주세요.")
    private String carName;

    @Column(nullable = false)
    @NotBlank(message = "차종을 입력해주세요.")
    private String carType;

    @Column(nullable = false)
    @NotBlank(message = "색깔을 입력해주세요.")
    private String carColor;

    @Column(nullable = false)
    @NotNull(message = "연식을 입력해주세요.")
    @Max(value = 2023, message = "연식은 2023년 보다 작은 값이어야 합니다.")
    @Min(value = 2005, message = "연식은 2005년 보다 큰 값이어야 합니다.")
    private int carManufacturingDate;

    @Column(name = "price", nullable = false)
    @NotNull(message = "금액을 입력해주세요.")
    @Max(value = 999999999, message = "가격은 999999999 보다 작은 값이어야 합니다.")
    @Min(value = 0, message = "가격은 0보다 큰 값이어야 합니다.")
    private int carPrice;

    @Lob  //Large Object-큰데이터 저장
    @Column(nullable = false)
    @NotBlank(message = "장착된 옵션을 입력해주세요.")
    private String carOption;

    @Column(nullable = false)
    private int carStockNumber = 1;

    @Enumerated(EnumType.STRING)
    private CarSellStatus carSellStatus;

/*
    // 다대일 관계 설정
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarImg> carImgs = new ArrayList<>();
*/

    public void updateCar(CarRegistrationDto carRegistrationDto){
        this.carBrand = carRegistrationDto.getCarBrand();
        this.carName = carRegistrationDto.getCarName();
        this.carType = carRegistrationDto.getCarType();
        this.carColor = carRegistrationDto.getCarColor();
        this.carManufacturingDate = carRegistrationDto.getCarManufacturingDate();
        this.carPrice = carRegistrationDto.getCarPrice();
        this.carOption = carRegistrationDto.getCarOption();
        this.carStockNumber = carRegistrationDto.getCarStockNumber();
        this.carSellStatus = carRegistrationDto.createCar().getCarSellStatus();
    }


    // 스톡 넘버에 따라 carSellStatus 값을 설정하는 메서드
/*    public void updateCarSellStatus() {
        if (this.carStockNumber == 1) {
            this.carSellStatus = CarSellStatus.SELL;
        } else if (this.carStockNumber == 0) {
            this.carSellStatus = CarSellStatus.SOLD_OUT;
        }
    }*/
}