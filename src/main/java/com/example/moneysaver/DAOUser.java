package com.example.moneysaver;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document("user")
public class DAOUser {

    @Id
    private String id;
    private String username;
    @JsonIgnore
    private String password;

}
