package study.EndGame.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import study.EndGame.entity.Car;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CarRegistrationDto {
    private Long id;

    @NotBlank(message = "브랜드명을 입력해주세요.")
    private String carBrand;

    @NotBlank(message = "차량명을 입력해주세요.")
    private String carName;

    @NotBlank(message = "차종을 입력해주세요.")
    private String carType;

    @NotBlank(message = "색상을 입력해주세요.")
    private String carColor;

    @NotNull(message = "연식을 입력해주세요.")
    @Max(value = 2023, message = "연식은 2023년 보다 작은 값이어야 합니다.")
    @Min(value = 2005, message = "연식은 2005년 보다 큰 값이어야 합니다.")
    private int carManufacturingDate;


    @NotNull(message = "가격을 입력해주세요.")
    @Max(value = 999999999, message = "가격은 999999999 보다 작은 값이어야 합니다.")
    @Min(value = 0, message = "가격은 0보다 큰 값이어야 합니다.")
    private int carPrice;

    @Lob
    @Column(nullable = false)
    @NotBlank(message = "장착된 옵션을 입력해주세요.")
    private String carOption;


    /* 추가 */
    private List<CarImgDto> carImgDtoList = new ArrayList<>();

    private List<Long> carImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();
    public Car createCar(){
        return modelMapper.map(this, Car.class);
    }
    public static CarRegistrationDto of(Car car){
        return modelMapper.map(car,CarRegistrationDto.class);
    }

    @Column(nullable = false)
    private int carStockNumber = 1;

    private String sellStatus;

    private String registeredBy;
    // Getter와 Setter 메서드
}
