package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "vegetable", schema = "s18d2")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Vegetable extends Plant {

    @Column(name = "grown_on_tree")
    private Boolean isGrownOnTree;
}
