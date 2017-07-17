import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleChatBot extends JFrame {

    final String TITLE_OF_PROGRAM = "Chatter: simple chatbot";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    JTextPane dialogue; // area for dialog
    JCheckBox ai;       // enable/disable AI
    JTextField message; // field for entering messages
   // SimpleBot sbot;     // chat-bot class (in bot package)


    public static void main(String[] args) {
        new SimpleChatBot();
    }
    
    SimpleChatBot(){

    }
}
