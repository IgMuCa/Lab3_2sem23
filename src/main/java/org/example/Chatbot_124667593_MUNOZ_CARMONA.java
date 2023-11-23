package org.example;

public class Chatbot_124667593_MUNOZ_CARMONA {
    private int chatbotID;
    private String name:
    private String msgWelcome;
    private int startFlowID;


    public Chatbot_124667593_MUNOZ_CARMONA(int chatbotID, String name, String msgWelcome, int startFlowID) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.msgWelcome = msgWelcome;
        this.startFlowID = startFlowID;
    }

    public int getChatbotID() {
        return chatbotID;
    }

    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsgWelcome() {
        return msgWelcome;
    }

    public void setMsgWelcome(String msgWelcome) {
        this.msgWelcome = msgWelcome;
    }

    public int getStartFlowID() {
        return startFlowID;
    }

    public void setStartFlowID(int startFlowID) {
        this.startFlowID = startFlowID;
    }
}
