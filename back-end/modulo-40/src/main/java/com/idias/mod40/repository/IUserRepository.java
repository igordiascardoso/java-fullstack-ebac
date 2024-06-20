package com.idias.mod40.repository;

import com.idias.mod40.model.User;
import com.idias.mod40.model.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
}
