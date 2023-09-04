package study.EndGame.dto;

import lombok.Getter;
import lombok.Setter;
import study.EndGame.constant.CarSellStatus;

@Getter
@Setter
public class CarSearchDto {

    private String searchDateType;

    private CarSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";
}