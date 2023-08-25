package EndGame.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainCarDto {
    private Long id;
    private String type;
    private String brand;
    private String manufacture;
    /*private String imgUrl;*/
    private String color;
    @QueryProjection
    public MainCarDto(Long id, String type, String brand, /*String imgUrl,*/String manufacture, String color) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        /*this.imgUrl = imgUrl;*/
        this.manufacture = manufacture;
        this.color = color;
    }
}
