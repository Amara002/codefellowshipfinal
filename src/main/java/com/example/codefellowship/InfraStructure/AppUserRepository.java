package com.example.codefellowship.InfraStructure;

import com.example.codefellowship.Model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository  extends JpaRepository<AppUser,Long> {

    AppUser findByUsername(String username);
    AppUser findById(long id);
}
