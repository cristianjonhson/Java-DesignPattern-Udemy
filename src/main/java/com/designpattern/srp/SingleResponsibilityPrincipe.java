package com.designpattern.srp;

public class SingleResponsibilityPrincipe {
    public static void main(String[] args) {
        IContentService contentService = new ContentService();
        IMessageService messageService = new MessageImpl();
        contentService.writeMessage("Hi Welcome to the World of Design Pattern");
        messageService.printMessage();
        contentService.replaceMessageContent("Hi", "Hello");
        messageService.printMessage();
        messageService.sendMessage();
    }

}

interface IContentService {
    void writeMessage(String msg);

    void replaceMessageContent(String source, String destination);
}

interface IMessageService {

    void printMessage();

    void sendMessage();
}

class MessageImpl implements IMessageService {
    private String content;

    @Override
    public void printMessage() {
        System.out.println("Message is: " + content);
    }

    @Override
    public void sendMessage() {
        // code to send message
        System.out.println("Message sent and the content is: " + content);
    }
}

class ContentService implements IContentService {
    private String content;

    @Override
    public void writeMessage(String msg) {
        content = msg;
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
    }
}
