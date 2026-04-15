package com.designpattern.singleresponsibilityprinciple;

public class SingleResponsibilityPrincipe {
    public static void main(String[] args) {
        IMesssageService messageService = new MessageService();
        messageService.writeMessage("Hi Welcome to the World of Design Pattern");
        messageService.printMessage();
        messageService.replaceMessageContent("Hi", "Hello");
        messageService.printMessage();
        messageService.sendMessage();
    }

}

interface IMesssageService {
    void writeMessage(String msg);

    void replaceMessageContent(String source, String destination);

    void printMessage();

    void sendMessage();
}

class MessageService implements IMesssageService {
    private String content;

    @Override
    public void writeMessage(String msg) {
        content = msg;
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
    }

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
