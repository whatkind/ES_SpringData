package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    long count();
    User save(User user);
    void delete(User user);
    Iterable<User> getAll();
    List<User> getByName(String name);
    Page<User> pageQuery(Integer pageNo, Integer pageSize, String kw);
}
