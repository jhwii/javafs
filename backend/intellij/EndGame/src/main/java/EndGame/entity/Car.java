package EndGame.entity;

import EndGame.constant.CarSellStatus;
import EndGame.exception.exception.OutOfStockException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Getter
@Setter
@ToString
public class Car extends BaseEntity{

    @Id
    @Column(name = "car_id")
    /*@GeneratedValue(strategy = GenerationType.AUTO)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String carNm;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String color;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer manufacture;

    @Lob
    @Column(nullable = false)
    private String carDetail;

    @Column(nullable = false, length = 1)
    private int stockNumber;

    @Column(nullable = false)
    private CarSellStatus carSellStatus;


    public void removeStock(int stockNumber) {
        int restStock = this.stockNumber - stockNumber;
        if (restStock < 0) {
            throw new OutOfStockException("상품의 재고가 부족합니다. " +
                    "(현재 재고 수량: " + this.stockNumber + ")");
        }
        this.stockNumber = restStock;
    }

    public void addStock(int stockNumber) {
        this.stockNumber += stockNumber;
    }
}
