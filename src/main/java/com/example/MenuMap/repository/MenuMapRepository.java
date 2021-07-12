package com.example.MenuMap.repository;

import com.example.MenuMap.model.MenuMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapRepository extends JpaRepository<MenuMap, Integer> {
}
