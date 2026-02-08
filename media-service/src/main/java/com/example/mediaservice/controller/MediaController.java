
package com.example.mediaservice.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
public class MediaController {
  @PostMapping
  public String upload(){return "Media uploaded";}
}
