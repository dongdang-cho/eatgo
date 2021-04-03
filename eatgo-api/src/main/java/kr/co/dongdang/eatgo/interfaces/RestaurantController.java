package kr.co.dongdang.eatgo.interfaces;

import kr.co.dongdang.eatgo.application.RestaurantService;
import kr.co.dongdang.eatgo.domain.MenuItem;
import kr.co.dongdang.eatgo.domain.MenuItemRepository;
import kr.co.dongdang.eatgo.domain.Restaurant;
import kr.co.dongdang.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

//    @Autowired
//    private RestaurantRepository restaurantRepository;
//
//    @Autowired
//    private MenuItemRepository menuItemRepository;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();
//        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }
    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
        Restaurant restaurant = restaurantService.getRestaurant(id);
//        Restaurant restaurant = restaurantRepository.findById(id);
//        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurantId(id);
//        restaurant.setMenuItem(menuItems);
        return restaurant;
    }

}
