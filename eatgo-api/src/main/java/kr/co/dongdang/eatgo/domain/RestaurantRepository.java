package kr.co.dongdang.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {
    List<Restaurant> restaurants = new ArrayList<>();
    public RestaurantRepository() {
        restaurants.add(new Restaurant(1004L,"Bob zip","seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food","seoul"));
    }

    public List<Restaurant> findAll() {
        return restaurants;
    }

    public Restaurant findById(Long id) {
        Restaurant restaurant = restaurants.stream().filter(r -> r.getId().equals(id)).findFirst().get();
        return restaurant;
    }
}

