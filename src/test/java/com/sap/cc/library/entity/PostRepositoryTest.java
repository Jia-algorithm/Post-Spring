package com.sap.cc.library.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class PostRepositoryTest {
//
//    @Autowired
//    private PostRepository repository;
//    private final Logger logger = LoggerFactory.getLogger(getClass());
//
//    @BeforeEach
//    public void beforeEach() {
//        repository.deleteAll();
//    }
//
//    @Test
//    void findAllBooks_should_be_empty() {
//        List<Post> posts = repository.findAll();
//        assertThat(posts).isEmpty();
//    }
//
//    @Test
//    void saveOneBookAndRetrieveAll() {
//        Post cleanCode = BookFixtures.cleanCode();
//        repository.save(cleanCode);
//        List<Post> posts = repository.findAll();
//        assertThat(posts).hasSize(1);
//        assertThat(posts.get(0).getTitle()).isEqualTo(cleanCode.getTitle());
//        assertThat(posts.get(0).getAuthor().getName()).isEqualTo(cleanCode.getAuthor().getName());
//    }
//
//    @Test
//    void findBookByTitleTest() {
//        Post cleanCode = BookFixtures.cleanCode();
//        Post designPatterns = BookFixtures.designPatterns();
//        repository.saveAll(Arrays.asList(cleanCode, designPatterns));
//        assertThat(repository.findByTitle("Clean Code").getTitle()).isEqualTo(cleanCode.getTitle());
//    }
}
