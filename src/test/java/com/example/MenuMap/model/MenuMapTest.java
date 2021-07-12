package com.example.MenuMap.model;

import com.example.MenuMap.repository.MenuMapRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuMapTest {

    @Autowired
    MenuMapRepository menuMapRepository;

    @BeforeEach
    void setMenuContent(){
        MenuMap food1 = new MenuMap("Pizza 1", BigDecimal.valueOf(7.00));
        menuMapRepository.save(food1);
        MenuMap food2 = new MenuMap("Pizza 2", BigDecimal.valueOf(8.50));
        menuMapRepository.save(food2);
        MenuMap food3 = new MenuMap("Pizza 3", BigDecimal.valueOf(9.00));
        menuMapRepository.save(food3);
        MenuMap food4 = new MenuMap("Pizza 4", BigDecimal.valueOf(8.50));
        menuMapRepository.save(food4);
        MenuMap drink1 = new MenuMap("Beer", BigDecimal.valueOf(3.50));
        menuMapRepository.save(drink1);
        MenuMap drink2 = new MenuMap("Wine", BigDecimal.valueOf(4.50));
        menuMapRepository.save(drink2);
        MenuMap drink3 = new MenuMap("Cola", BigDecimal.valueOf(2.50));
        menuMapRepository.save(drink3);
        MenuMap drink4 = new MenuMap("Fanta", BigDecimal.valueOf(2.50));
        menuMapRepository.save(drink4);
        MenuMap drink5 = new MenuMap("Schnapps", BigDecimal.valueOf(2.00));
        menuMapRepository.save(drink5);
    }

    @Test
    void findMenuContent(){
        List<MenuMap>menuMapList = menuMapRepository.findAll();
        assertEquals(9,9);
    }

//    @Test
//    void findById(){
//        Optional<MenuMap>menuMap = menuMapRepository.findById(1);
//        assertEquals(1,1);
//    }



}