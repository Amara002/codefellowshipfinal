package com.example.codefellowship.InfraStructure;

import com.example.codefellowship.Model.AppUser;
import com.example.codefellowship.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByAppUserIn(Set<AppUser> appUserList);
}
