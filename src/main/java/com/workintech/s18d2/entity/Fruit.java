package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fruit", schema = "s18d2")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Fruit extends Plant {

    @Enumerated(EnumType.STRING)
    @Column(name = "fruit_type")
    @NotNull
    private FruitType fruitType;

}
