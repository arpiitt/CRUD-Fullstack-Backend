package com.arpit.fullstack_backend.repository;

import com.arpit.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be declared here if needed
}
