
package com.example.notificationservice.config;
import org.springframework.context.annotation.*;
import org.springframework.amqp.core.*;

@Configuration
public class RabbitConfig {
  @Bean
  Queue queue(){return new Queue("notification.queue");}
  @Bean
  TopicExchange exchange(){return new TopicExchange("social.exchange");}
  @Bean
  Binding binding(Queue q, TopicExchange e){
    return BindingBuilder.bind(q).to(e).with("post.created");
  }
}
