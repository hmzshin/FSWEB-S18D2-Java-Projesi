package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Fruit;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type FROM fsweb.fruit as f " +
            "ORDER BY f.price DESC",
            nativeQuery = true)
    List<Fruit> getByPriceDesc();

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type FROM fsweb.fruit as f " +
            "ORDER BY f.price ASC",
            nativeQuery = true)
    List<Fruit> getByPriceAsc();

    @Query("SELECT f FROM Fruit f WHERE f.name ILIKE %:name%")
    List<Fruit> searchByName(String name);

    @Modifying
    @Query("UPDATE Fruit f SET f.name = :#{#fruit.name}, f.price = :#{#fruit.price}, f.fruitType = :#{#fruit.fruitType} WHERE f.id = :id")
    void update(@Param("id") Integer id, @Param("fruit") Fruit fruit);


}
