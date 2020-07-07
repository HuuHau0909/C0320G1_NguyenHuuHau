package com.codegym.casestudymodule2javaweb.ultils;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CustomerFormater implements Formatter {
    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return null;
    }
}
