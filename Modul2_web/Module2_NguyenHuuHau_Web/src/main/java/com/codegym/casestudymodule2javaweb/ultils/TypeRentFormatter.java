package com.codegym.casestudymodule2javaweb.ultils;

import com.codegym.casestudymodule2javaweb.Entity.TypeRent;
import com.codegym.casestudymodule2javaweb.Service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class TypeRentFormatter implements Formatter<TypeRent> {
    @Autowired
    private TypeRentService typeRentService;

    public TypeRentFormatter() {
    }

    @Override
    public TypeRent parse(String s, Locale locale) throws ParseException {
        return typeRentService.findTypeRentById(Long.parseLong(s));
    }

    @Override
    public String print(TypeRent object, Locale locale) {
        return null;
    }
}
