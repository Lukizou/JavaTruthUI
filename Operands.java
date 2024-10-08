import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//essa classe deve conter os botões de variáveis
public class Operands extends Panel{
    ActionButton operand_And_Button;
    ActionButton operand_Or_Button;
    ActionButton operand_Imply_Button;
    ActionButton operand_Deny_Button;
    ActionButton parenthesis_open_Button;
    ActionButton parenthesis_close_Button;
    ActionButton delete_Button;
    
    void oprButtonCreator(){
        Font button_Font = new Font("Serif", Font.BOLD, 18);

        this.operand_And_Button = new ActionButton("*", button_Font, Color.WHITE, Color.BLACK);

        this.operand_Or_Button = new ActionButton("+", button_Font, Color.WHITE, Color.BLACK);

        this.operand_Imply_Button = new ActionButton(">", button_Font, Color.WHITE, Color.BLACK);
        
        this.operand_Deny_Button = new ActionButton("~", button_Font, Color.WHITE, Color.BLACK);

        this.parenthesis_open_Button = new ActionButton("(", button_Font, Color.BLACK, Color.RED);

        this.parenthesis_close_Button = new ActionButton(")", button_Font, Color.BLACK, Color.RED);

        this.delete_Button = new ActionButton("DEL", button_Font, Color.BLACK, Color.RED);
    }
    
    //função que edita tamanho e posição
    //dos botões usando a função setSizePosition da classe ActionButton
    void oprButtonVisibility(){
        this.operand_And_Button.setSizePosition(30, 320, 40, 40);

        this.operand_Or_Button.setSizePosition(80, 320, 40, 40);

        this.operand_Imply_Button.setSizePosition(130, 320, 40, 40);

        this.operand_Deny_Button.setSizePosition(180, 320, 40, 40);

        this.parenthesis_open_Button.setSizePosition(230, 320, 40, 40);

        this.parenthesis_close_Button.setSizePosition(280, 320, 40, 40);

        this.delete_Button.setSizePosition(280, 390, 40, 40);
    }

    //função que define as ações de cada botão
    void oprButtonsActions(TextField textLine){
        this.operand_And_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "*";

                textLine.setText(field_String);
            }
        });

        this.operand_Or_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "+";

                textLine.setText(field_String);
            }
        });

        this.operand_Imply_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + ">";

                textLine.setText(field_String);
            }
        });

        this.operand_Deny_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "~";

                textLine.setText(field_String);
            }
        });

        this.parenthesis_open_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "(";

                textLine.setText(field_String);
            }
        });

        this.parenthesis_close_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + ")";

                textLine.setText(field_String);
            }
        });

        this.delete_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText();
                if(field_String.length() > 0){
                    field_String = field_String.substring(0, field_String.length() - 1);
                    textLine.setText(field_String);
                }
            }
        });
        
    }

    Operands(AuxiliarFields auxiliarComponents){
        this.oprButtonCreator();
        this.oprButtonVisibility();
        this.oprButtonsActions(auxiliarComponents.text_Line);
    }
}