package com.my.jackson.subTypes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.ToString;

@ToString
@JsonTypeName("cat")
public class Cat extends Animal {
    private boolean likesCream;
    private int lives;
}
