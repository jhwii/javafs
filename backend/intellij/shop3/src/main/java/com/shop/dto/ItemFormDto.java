package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemFormDto {
    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String itemNm;

    @NotBlank(message = "차종은 필수 입력 값입니다.")
    private String type;

    @NotBlank(message = "브랜드는 필수 입력 값입니다.")
    private String brand;

    @NotBlank(message = "색상은 필수 입력 값입니다.")
    private String color;

    @NotNull(message = "연식은 필수 입력 값입니다.")
    private Integer year;

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private Integer price;

    @NotBlank(message = "상품 상세는 필수 입력 값입니다.")
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }
    // ItemFormDto 객체를 기반으로 새로운 Item 객체를 생성
    // this 는 ItemFormDto 객체 자체를 나타냅니다.
    // ItemFormDto 객체의 필드값을 가지고 item 객체를 생성

    public static ItemFormDto of(Item item){
        return modelMapper.map(item,ItemFormDto.class);
    }
    // Item 객체에서 ItemFormDto 객체로 매핑
}
