package com.kjh.boardback.dto.object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    public enum MessageType{
        ENTER,REENTER,TALK,QUIT
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;

    public ChatMessage(ChatMessage message, String newMessage) {
        this.type = message.getType();
        this.roomId = message.getRoomId();
        this.sender = message.getSender();
        this.message = newMessage;
    }
}
