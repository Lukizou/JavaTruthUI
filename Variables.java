import java.awt.*;
import java.awt.event.*;
public class Variables extends Container{
    ActionButton var_A_Button;
    ActionButton var_B_Button;
    ActionButton var_C_Button;
    ActionButton var_D_Button;
    ActionButton var_E_Button;
    Button confirm_Button;

    //essa função utiliza o construtor ActionButton para editar fontes, labels e cores dos botões
    void varButtonCreator(){
        Font button_Font = new Font("Serif", Font.BOLD, 26);

        this.var_A_Button = new ActionButton("A", button_Font, Color.WHITE, Color.BLACK);
        this.var_B_Button = new ActionButton("B", button_Font, Color.WHITE, Color.BLACK);
        this.var_C_Button = new ActionButton("C", button_Font, Color.WHITE, Color.BLACK);

        this.var_D_Button = new ActionButton("D", button_Font, Color.WHITE, Color.BLACK);
        this.var_E_Button = new ActionButton("E", button_Font, Color.WHITE, Color.BLACK);

        this.confirm_Button = new Button("Gerar Tabela");
        this.confirm_Button.setFont(button_Font);
    }

    //essa função utiliza uma função da classe ActionButton
    //para editar visibilidade, tamanho e posição dos botões
    void varButtonVisibility(){
        this.var_A_Button.setSizePosition(30,390, 40, 40);
        this.var_B_Button.setSizePosition(80,390, 40, 40);
        this.var_C_Button.setSizePosition(130,390, 40, 40);

        this.var_D_Button.setSizePosition(180,390, 40, 40);
        this.var_E_Button.setSizePosition(230,390, 40, 40);

        this.confirm_Button.setSize(220,30);
        this.confirm_Button.setLocation(40,460);

        this.confirm_Button.setBackground(Color.RED);
        
        this.confirm_Button.setVisible(true);
    }

    //essa função permite que clicar nos botões escreva as variáveis no textLine
    void varButtonsActions(TextField textLine){
        this.var_A_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "A ";
                textLine.setText(field_String);
            }
        });

        this.var_B_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "B ";
                textLine.setText(field_String);
            }
        });

        this.var_C_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "C ";
                textLine.setText(field_String);
            }
        });

        this.var_D_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "D ";
                textLine.setText(field_String);
            }
        });

        this.var_E_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String field_String = textLine.getText() + "E ";
                textLine.setText(field_String);
            }
        });

        this.confirm_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //transição para painel que exibe a tabela verdade
            }
        });
    } 

    Variables(AuxiliarFields auxField){
        this.varButtonCreator();
        this.varButtonVisibility();
        this.varButtonsActions(null);
    }
}