package com.course.startItProject.repo;

import com.course.startItProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findById(long id);

    User findByEmail(String email);

}
