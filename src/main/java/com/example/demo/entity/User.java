package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@Document(indexName = "user")
public class User implements Serializable {

    @Id
    private String uId;

    private String name;

    private Integer age;

    private String address;

}
