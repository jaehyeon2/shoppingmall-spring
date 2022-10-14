package com.example.shoppingmallspring.domain.items;

import lombok.*;

import javax.persistence.*;


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;//상품코드

    @Column(nullable = false, length = 50)
    private String itemNm;//상품명

    @Column(name = "price", nullable = false)
    private int price;//가격

    @Column(nullable = false)
    private int stockNumber;//재고

//    @Lob
    @Column(nullable = false)
    private String itemDetail;//상품 상세설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;//상품 판매 상태

    @Builder
    public Item(String itemNm, int price, int stockNumber, String itemDetail, ItemSellStatus itemSellStatus){
        this.itemNm = itemNm;
        this.price = price;
        this.stockNumber = stockNumber;
        this.itemDetail = itemDetail;
        this.itemSellStatus = itemSellStatus;
    }
}
