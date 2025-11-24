package com.crud.crudusuario.repository;

import com.crud.crudusuario.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
