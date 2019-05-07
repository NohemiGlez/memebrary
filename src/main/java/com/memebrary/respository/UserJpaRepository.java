package com.memebrary.respository;

import com.memebrary.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
