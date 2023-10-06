package com.habbatul.challange4.model;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class ProductPaginationResponse {
    List<ProductResponse> productsResponse;
    Integer productCurrentPage;
    Integer productTotalPage;
}
