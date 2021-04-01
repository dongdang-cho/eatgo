package kr.co.dongdang.eatgo.interfaces;

import kr.co.dongdang.eatgo.domain.Restaurant;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1004L,"Bob zip","seoul"));
        return restaurants;
    }
    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul")) ;
        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul")) ;

        Restaurant restaurant = restaurants.stream().filter(r -> r.getId().equals(id)).findFirst().get();
        return restaurant;
    }

}
