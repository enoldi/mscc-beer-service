package com.prim4s.msccbeerservice.web.model;

import com.prim4s.msccbeerservice.web.model.enumeration.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by CHAMGOUE on 23/07/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private Integer version;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BigDecimal price;

    private BeerStyleEnum beerStyle;

    private Long upc;

    private Integer quantityOnHand;
}
