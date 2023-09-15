package study.EndGame.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCarDto {

    private  Long id;

    private String carName;

    private String carOption;

    private String imgUrl;

    private Integer price;



    @QueryProjection
    public SearchCarDto(Long id, String carName, String carOption, String imgUrl, Integer price) {
        this.id = id;
        this.carName = carName;
        this.carOption = carOption;
        this.imgUrl = imgUrl;
        this.price = price;
    }
    //Querydsl 과 같은 쿼리 프레임 워크와 함께 사용 - 쿼리에 특화된 프로젝션 생성자를 생성

}