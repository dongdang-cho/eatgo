package kr.co.dongdang.eatgo.domain;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
@SpringBootTest
public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L,"Bob zip","seoul");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("seoul"));

    }
    @Test
    public void information() {
        Restaurant restaurant = new Restaurant("Bob zip","seoul");
        assertThat(restaurant.getInformation(),is("Bob zip in seoul"));
    }

}