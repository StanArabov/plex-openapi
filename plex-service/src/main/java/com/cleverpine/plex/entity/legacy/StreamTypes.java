package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stream_types")
public class StreamTypes {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    protected StreamTypes(){}
    public StreamTypes(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
