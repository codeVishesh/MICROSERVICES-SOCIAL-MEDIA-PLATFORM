
package com.example.analyticsservice.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {
  @GetMapping
  public String stats(){return "Analytics OK";}
}
