import java.awt.*;
public class ActionButton extends Button{

    void newSetFont(Font button_Font, Color foreColor){
        this.setFont(button_Font);
        this.setForeground(foreColor);
    }

    ActionButton(String button_Label, Font button_Font, Color foreColor, Color backColor){
        this.setLabel(button_Label);

        this.setBackground(backColor);

        this.newSetFont(button_Font, foreColor);

        this.setVisible(true);
    }

    void setSizePosition(int x, int y, int width, int height){
        this.setLocation(x, y);

        this.setSize(width,height);
    }
}
