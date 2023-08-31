package study.EndGame.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CarRegistrationDto {


    @NotBlank(message = "차량명을 입력해주세요.")
    private String carName;

    @NotBlank(message = "차종을 입력해주세요.")
    private String carType;

    @NotBlank(message = "색깔을 입력해주세요.")
    private String carColor;

    @NotNull(message = "가격을 입력해주세요.")
    @Min(value = 0, message = "가격은 0보다 큰 값이어야 합니다.")
    private int carPrice;

    private String registeredBy;
    // Getter와 Setter 메서드
}
