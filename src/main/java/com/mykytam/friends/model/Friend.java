package com.mykytam.friends.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;

}
