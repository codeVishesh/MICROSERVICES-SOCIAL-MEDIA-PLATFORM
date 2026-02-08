
package com.example.userservice.controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
  @GetMapping
  public List<String> users(){
    return List.of("alice","bob","charlie");
  }
}
