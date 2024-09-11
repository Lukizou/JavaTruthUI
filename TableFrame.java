import java.awt.*;
public class TableFrame extends Frame {
    int width = 400;
    int height = 550;

    
    TableFrame(){
        TablePanel mainPanel = new TablePanel();
        AuxiliarFields auxiliarComponents = new AuxiliarFields(mainPanel);
        Operands operandsButtons = new Operands(auxiliarComponents);
        Variables variablesButtons = new Variables(auxiliarComponents);
        mainPanel.addVarsButtons(variablesButtons);
        mainPanel.addOperandsButtons(operandsButtons);
        mainPanel.addAuxiliarFields(auxiliarComponents);
        this.add(mainPanel);
        this.setBackground(Color.BLACK);

        this.setSize(width,height);
        this.setLocation(100,100);

        this.setVisible(true);
        this.setResizable(false);

        this.setLayout(null);
    }
    
    

    
    
 
}
