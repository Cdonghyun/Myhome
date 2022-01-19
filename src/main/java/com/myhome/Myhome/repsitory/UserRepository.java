package com.myhome.Myhome.repsitory;

import com.myhome.Myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
