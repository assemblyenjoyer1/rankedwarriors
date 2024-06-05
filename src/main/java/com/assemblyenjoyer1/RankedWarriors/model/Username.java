package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Component
public class Username implements Serializable {
    private String name;
    private String tag;
    private Date changeDate;
}
