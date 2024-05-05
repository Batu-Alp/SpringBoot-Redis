package com.redisexample.SpringBootRedis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("User")

public class User implements Serializable {

    private int id;
    private int age;
    private String name;
    private String surname;
    private String email;

}
