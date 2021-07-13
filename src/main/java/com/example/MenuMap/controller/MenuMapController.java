package com.example.MenuMap.controller;

import com.example.MenuMap.model.MenuMap;
import com.example.MenuMap.repository.MenuMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MenuMapController {

    @Autowired
    MenuMapRepository menuMapRepository;


    //Show CodercellarMenu
    @GetMapping("/CoderCellarsMenu")
    @ResponseStatus(HttpStatus.OK)
    public List<MenuMap> getCoderCellarsMenu(){
        return menuMapRepository.findAll();
    }

    //Menu Content
    @GetMapping("/menuMapContent/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<MenuMap> getMenuMapContent (@PathVariable Integer id){
        return menuMapRepository.findById(id);
    }


    @PostMapping(value= "/addNewMenuContent", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void addContent (@RequestBody MenuMap menuMapContent){
        menuMapRepository.save(menuMapContent);
    }

    @DeleteMapping("/deleteMenuContent/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteMenuContent(@PathVariable Integer id){
        menuMapRepository.delete(menuMapRepository.findById(id).get());
    }




}
