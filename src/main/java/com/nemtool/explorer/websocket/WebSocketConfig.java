package com.nemtool.explorer.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
*
* @author Masker
* @date 2020.10.30
*/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /*
     * 
     * @see org.springframework.web.socket.config.annotation.
     * WebSocketMessageBrokerConfigurer#registerStompEndpoints(org.
     * springframework.web.socket.config.annotation.StompEndpointRegistry)
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/endpointWisely").withSockJS();
    }

    /*
     * 
     * @see org.springframework.web.socket.config.annotation.
     * AbstractWebSocketMessageBrokerConfigurer#configureMessageBroker(org.
     * springframework.messaging.simp.config.MessageBrokerRegistry)
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/ws");
    }

}

