package com.example.swigggy_app.client;

import com.example.swigggy_app.dto.OrderResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RestaurantServiceClient {

    private final RestClient restClient;

    public RestaurantServiceClient(RestClient restClient){
        this.restClient = restClient;
    }

    public OrderResponseDTO fetchOrderStatus(String orderId) {
         return restClient.get()
                .uri("/v1/restaurant/orders/status/{orderId}", orderId)
                .retrieve()
                .body(OrderResponseDTO.class);
    }
}
