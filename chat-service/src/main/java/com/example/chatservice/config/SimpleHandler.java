
package com.example.chatservice.config;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SimpleHandler extends TextWebSocketHandler {
  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    session.sendMessage(new TextMessage("Echo: "+message.getPayload()));
  }
}
