package ru.dylev.filestorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dylev.filestorage.entity.User;

import java.util.Optional;

/**
 * Interface used to perform CRUD operations with {@link User} in database.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String username);
}
