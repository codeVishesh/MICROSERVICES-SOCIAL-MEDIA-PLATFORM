
package com.example.postservice.config;
import org.springframework.context.annotation.*;
import org.springframework.amqp.core.*;

@Configuration
public class RabbitConfig {
  @Bean
  public TopicExchange exchange(){return new TopicExchange("social.exchange");}
}
