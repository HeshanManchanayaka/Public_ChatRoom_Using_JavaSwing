
package com.mycompany.publicchatroom;

public class PublicChatRoom {
   public static ChatController chatController;
   public static void main(String args[]) {
        chatController=new ChatController();
        chatController.addChatWindow(new ChatWindow("Sender 01",chatController));
        chatController.addChatWindow(new ChatWindow("Sender 02",chatController));        
    }
   public static void addSender(String name){
        chatController.addChatWindow(new ChatWindow(name,chatController));
   }
}
