
package com.example.notificationservice.consumer;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Component
public class NotificationConsumer {
  @RabbitListener(queues = "notification.queue")
  public void consume(Object msg){
    System.out.println("Notification received: "+msg);
  }
}
