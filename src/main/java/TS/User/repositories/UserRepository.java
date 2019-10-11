package TS.User.repositories;

import TS.User.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,String> {
    User findByEmail(String email);
}
