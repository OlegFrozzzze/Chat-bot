import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleChatBot extends JFrame {

    final String TITLE_OF_PROGRAM = "Chatter: simple chatbot";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    JTextArea dialogue; // area for dialog
    JCheckBox ai;       // enable/disable AI
    JTextField message; // field for entering messages
   // SimpleBot sbot;     // chat-bot class (in bot package)


    public static void main(String[] args) {
        new SimpleChatBot();
    }

    SimpleChatBot(){
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        //Диалоговое окно
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialogue);

        //Понель для ввода сообщений и кнопок
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        ai = new JCheckBox("AI");

        message = new JTextField();

        JButton enter = new JButton("Enter");
                //добавление кнопок
                bp.add(ai);
                bp.add(message);
                bp.add(enter);


        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }
}
