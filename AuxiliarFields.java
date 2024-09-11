import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AuxiliarFields extends Panel{
    TextField text_Line;
    ActionButton help_Button;

    void auxFieldsCreator(){
        Font button_Font = new Font("Serif", Font.BOLD, 18);

        this.help_Button = new ActionButton("Ajuda", button_Font, Color.BLACK, Color.RED);
        this.help_Button.setSizePosition(180, 8, 100, 40);

        this.text_Line = new TextField();

        this.text_Line.setSize(260,40);
        this.text_Line.setLocation(20,250);

        this.text_Line.setBackground(Color.BLACK);
        this.text_Line.setForeground(Color.WHITE);
    }

    void auxButtonsActions(){
        this.help_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //transição para a tela de ajuda
            }
        });
    }

    AuxiliarFields(){
        this.auxFieldsCreator();
    }
}
