package com.sap.cc.library.controller;

import com.sap.cc.library.entity.Post;
import com.sap.cc.library.entity.PostRepository;
import com.sap.cc.library.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/posts")
public class PostController {
    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        post.setDate(new Date());
        Post created = postRepository.save(post);
        URI uri =
            MvcUriComponentsBuilder.fromController(getClass()).path("/" + created.getId()).build()
                .toUri();
        return ResponseEntity.created(uri).body(created);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") Long id) throws NotFoundException {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (!optionalPost.isPresent()) {
            throw new NotFoundException();
        } else {
            return optionalPost.get();
        }
    }

    @GetMapping("/title={title}")
    public ResponseEntity<List<Post>> getPostsByTitle(@PathVariable("title") String title) {
        return ResponseEntity.ok(postRepository.findAllByTitle(title));
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.ok(postRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable("id") Long id) {
        if (!postRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }
}
