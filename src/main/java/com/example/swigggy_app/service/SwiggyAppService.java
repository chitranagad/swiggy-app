package com.example.swigggy_app.service;

import com.example.swigggy_app.client.RestaurantServiceClient;
import com.example.swigggy_app.dto.OrderResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class SwiggyAppService {

    private final RestaurantServiceClient restaurantServiceClient;

    public SwiggyAppService(RestaurantServiceClient restaurantServiceClient){
        this.restaurantServiceClient = restaurantServiceClient;
    }
    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
