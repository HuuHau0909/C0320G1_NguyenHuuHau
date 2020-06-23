package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;

@Entity
@Table(name = "villa")
public class Villa extends Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String roomStandard;

    public Villa() {
    }

}
