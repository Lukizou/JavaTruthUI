import java.awt.*;
public class TablePanel extends Panel{

    TablePanel(){
        this.setBackground(Color.DARK_GRAY);

        this.setLocation(50,30);
        this.setSize(300,550);
    }

    void addVarsButtons(Variables variablesEx){
        this.add(variablesEx.var_A_Button);
        this.add(variablesEx.var_B_Button);
        this.add(variablesEx.var_C_Button);

        this.add(variablesEx.var_D_Button);
        this.add(variablesEx.var_E_Button);

        this.add(variablesEx.confirm_Button);

        this.setLayout(null);
    }

    void addOperandsButtons(Operands operandsEx){
        this.add(operandsEx.operand_And_Button);
        this.add(operandsEx.operand_Or_Button);

        this.add(operandsEx.operand_Imply_Button);
        this.add(operandsEx.operand_Deny_Button);

        this.add(operandsEx.parenthesis_Button);

        this.setLayout(null);
    }

    void addAuxiliarFields(AuxiliarFields auxFieldsEx){
        this.add(auxFieldsEx.text_Line);
        this.add(auxFieldsEx.help_Button);

        this.setLayout(null);
    }
}
