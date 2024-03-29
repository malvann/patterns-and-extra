package com.my.jackson.ignoreType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Item {
    private String name;
    @JsonIgnore
    private String id;
    private User owner;
}
