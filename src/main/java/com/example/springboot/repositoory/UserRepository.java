package com.example.springboot.repositoory;

import com.example.springboot.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, String> {
    @Query(nativeQuery = true, value = "select * from user WHERE USER_NAME = :name")
    List<UserEntity> getinfos(@Param("name") String name);
}
