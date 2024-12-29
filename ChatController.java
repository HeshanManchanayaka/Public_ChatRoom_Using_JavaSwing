package com.mycompany.publicchatroom;

import java.util.ArrayList;
public class ChatController {
     private ArrayList<ChatWindow>chatWindowList;

    public ChatController() {
        chatWindowList=new ArrayList<>();
    }
    public void addChatWindow (ChatWindow chatWindow){
     chatWindowList.add(chatWindow);
    
    }
    public void sendMessage(String name,String message){
    
        for (ChatWindow chatWindow : chatWindowList ) {
            if(chatWindow.getName().equals(name)){
            chatWindow.setMessage("Me :"+message);
            }else{
            chatWindow.setMessage(name+" : "+message);
            
            }
            
        }
    
    }
     
     
}
