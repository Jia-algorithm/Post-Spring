package com.sap.cc.library.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class DataDurabilityTest {
//
//    @Autowired
//    private PostRepository repository;
//
//    private final List<Post> posts =
//        Arrays.asList(BookFixtures.cleanCode(), BookFixtures.designPatterns());
//
//    @Test
//    void populateDb() {
//        repository.saveAll(posts);
//        assertThat(repository.findAll().size()).isGreaterThanOrEqualTo(posts.size());
//    }
//
//    @Test
//    void isDbPopulated() {
//        assertThat(repository.findAll().size()).isGreaterThanOrEqualTo(posts.size());
//    }
}
