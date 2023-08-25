package EndGame.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class CarDto {
    private Long id;
    private String carName;
    private String type;
    private String brand;
    private String color;
    private Integer price;
    private Integer manufacture;
    private String carDetail;
    private Integer stockNumber;
    private String sellStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
