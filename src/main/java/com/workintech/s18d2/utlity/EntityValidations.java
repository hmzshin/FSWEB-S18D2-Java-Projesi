package com.workintech.s18d2.utlity;

import com.workintech.s18d2.exception.FruitException;
import org.springframework.http.HttpStatus;

public class EntityValidations {

    public static void isIdValid(Long id) {

        if (id == null) {
            throw new FruitException("id can not be  null", HttpStatus.BAD_REQUEST);
        }
        if (id == 0) {
            throw new FruitException("Id can not be zero", HttpStatus.BAD_REQUEST);
        }

    }
}
