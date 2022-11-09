package com.sap.cc.library.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post save(Post post);

    Optional<Post> findById(Long id);

    List<Post> findAll();

    List<Post> findAllByTitle(String title);
}
