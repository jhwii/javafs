package study.EndGame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="car_img")
@Getter
@Setter
public class CarImg {
    @Id
    @Column(name = "car_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imgName; //  이미지 파일명

    private String oriImgName;  // 원본 이미지 파일명

    private String imgUrl;  // 이미지 조회 경로

    private String repimgYn;    // 대표 이미지 여부

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    public void updateItemImg(String oriImgName, String imgName, String imgUrl){

        this.oriImgName = oriImgName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;

    }
}
