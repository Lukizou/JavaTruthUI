public class Main {
    public static void main(String args[]){
        Operands operandsButtons = new Operands();

        AuxiliarFields auxiliarComponents = new AuxiliarFields();

        Variables variablesButtons = new Variables(auxiliarComponents);

        TablePanel mainPanel = new TablePanel();

        mainPanel.addVarsButtons(variablesButtons);
        mainPanel.addOperandsButtons(operandsButtons);
        mainPanel.addAuxiliarFields(auxiliarComponents);

        TableFrame mainFrame = new TableFrame();
        
        mainFrame.add(mainPanel);
    }   
}
