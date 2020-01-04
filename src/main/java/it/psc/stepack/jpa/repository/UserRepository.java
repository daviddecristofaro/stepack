package it.psc.stepack.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.psc.stepack.jpa.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}