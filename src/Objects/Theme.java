package Objects;

import Mechanic.MechanicEventsAndGUI;
import Mechanic.MainVariables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Theme {
    public ArrayList<ArrayList<Question>> listOfQuestionsOfTheTheme;
    public String theme;
    public JButton buttonOfTheme = new JButton();

    public Theme(String th) {
        theme = th;
        buttonOfTheme.setText(theme);
        buttonOfTheme.addActionListener(new ChosenTheme());
        buttonOfTheme.setFont(new Font("", Font.BOLD, 25));
    }
    private void selectTheme() {
        for (Theme themeL : MainVariables.listOfThemes) {
            if (themeL.theme.equals(this.theme)) {
                MainVariables.selectedTheme = themeL;
                System.out.println("Выбранная тема: " + themeL.theme);
                break;
            }
        }
    }

    private class ChosenTheme implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainVariables.buttonChooseThemes.setText(theme);
            selectTheme();
            MechanicEventsAndGUI.menu();
        }
    }
}
