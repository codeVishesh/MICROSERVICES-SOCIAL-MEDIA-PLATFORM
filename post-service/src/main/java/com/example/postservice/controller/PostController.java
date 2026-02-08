
package com.example.postservice.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import java.util.*;

@RestController
@RequestMapping("/posts")
public class PostController {
  private final RabbitTemplate rabbitTemplate;
  public PostController(RabbitTemplate rabbitTemplate){this.rabbitTemplate=rabbitTemplate;}

  @GetMapping
  public List<Map<String,String>> posts(){
    return List.of(Map.of("author","alice","content","Hello World"));
  }

  @PostMapping
  public String create(@RequestBody Map<String,String> post){
    rabbitTemplate.convertAndSend("social.exchange","post.created",post);
    return "Post created";
  }
}
