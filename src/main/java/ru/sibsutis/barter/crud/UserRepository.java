package ru.sibsutis.barter.crud;

import ru.sibsutis.barter.databases.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

