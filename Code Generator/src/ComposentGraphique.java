
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;

import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author GameOver
 */
public class ComposentGraphique {

    public int id = 0;
    public String Type;
    public JPanel conteneur;
    public String name;
    public String contenue;
    public int hight;
    public int width = 0;
    public int locationX;
    public int locationY;

    public ComposentGraphique() {
    }

    public ComposentGraphique(int id, String Type, JPanel conteneur, String name, String contenue, int hight, int width, int locationX, int locationY) {
        this.id = id;
        this.Type = Type;
        this.conteneur = conteneur;
        this.name = name;
        this.contenue = contenue;
        this.hight = hight;
        this.width = width;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public Object getcomposent() {
        switch (this.Type) {
            case "Panel":
                JPanel Panel = new JPanel(null);
                Panel.setName("Panel" + id);
                Panel.setSize(width, hight);
                Panel.setLocation(locationX, locationY);
                Panel.setBackground(new java.awt.Color(200, 255, 255));
//                       Panel.setOpaque(false);
                Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                conteneur.add(Panel);
                conteneur.setEnabled(false);
                conteneur.setEnabled(true);
                return Panel;
            case "Button":
                JButton Button = new JButton(contenue);
                Button.setName("Button" + id);
                Button.setSize(width, hight);
                Button.setLocation(locationX, locationY);
                conteneur.add(Button);
                conteneur.setEnabled(false);
                conteneur.setEnabled(true);
                return Button;
            case "Label":
                JLabel Label = new JLabel(contenue);
                Label.setName("Label" + id);
                Label.setSize(width, hight);
                Label.setLocation(locationX, locationY);
                Label.setFont(new java.awt.Font("Arial", 1, 18));
                conteneur.add(Label);
                conteneur.setEnabled(false);
                conteneur.setEnabled(true);
                return Label;
            case "TextField":
                JTextField TextField = new JTextField(contenue);
                TextField.setName("TextField" + id);
                TextField.setSize(width, hight);
                TextField.setLocation(locationX, locationY);
                conteneur.add(TextField);
                return TextField;

        }
        return null;
    }

}
