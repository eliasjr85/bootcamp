package com.example.bootcamp.bootcamp.excepion;

import com.example.bootcamp.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
