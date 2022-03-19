package Objects;

import Mechanic.MechanicEventsAndGUI;
import Mechanic.MainVariables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FireproofAmount {
    public int questionNumber;
    public int amount;
    public JButton buttonСhooseFireproofAmount = new JButton();

    public FireproofAmount(int qN, int am) {
        questionNumber = qN;
        amount = am;
        buttonСhooseFireproofAmount.setText("Вопрос " + questionNumber + ": " + amount + " денег.");
        buttonСhooseFireproofAmount.setFont(new Font("", Font.BOLD, 13));
        buttonСhooseFireproofAmount.addActionListener(new ChosenFireproofAmount());
    }
    private void selectFireproofAmount() {
        for (FireproofAmount fireproofAmount : MainVariables.listOfFireproofAmounts) {
            if (fireproofAmount.amount == this.amount) {
                MainVariables.selectedFireproofAmount = fireproofAmount;
                MainVariables.fireproofAmount = amount;
                System.out.println("Выбранная несгораемая сумма: " + fireproofAmount.amount + ", номер вопроса: " + fireproofAmount.questionNumber);
                break;
            }
        }
    }

    private class ChosenFireproofAmount implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainVariables.buttonChooseFireproofAmount.setText(amount + "");
            selectFireproofAmount();
            MechanicEventsAndGUI.menu();
        }
    }
}
