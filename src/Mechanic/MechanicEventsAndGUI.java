package Mechanic;

import Objects.FireproofAmount;
import Objects.Question;
import Objects.Theme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MechanicEventsAndGUI extends MainVariables { //Класс MechanicEventsAndGUI - основной класс в программе, в котором большая часть всего функционала.
    void preparationProgram() { //Метод, вызывающийся методом main. Он готовит GUI, события нажатий
        startFrame.setSize(widthOfFrame, heightOfFrame);
        startFrame.setResizable(isResizable);
        startFrame.setLocationRelativeTo(locationRelativeTo);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.getContentPane().add(new DrawPanel());
        startFrame.repaint();
        startFrame.setLayout(nullLayout);

        buttonChooseThemes.setFont(font25);
        buttonChooseFireproofAmount.setFont(font22);
        buttonPlay.setFont(font30);
        labelName.setFont(font26);
        labelChooseTheme.setFont(font30);
        labelChooseFireproofAmount.setFont(font25);
        labelMoney.setFont(font20);
        labelQuestion.setFont(font20);
        buttonAnswerA.setFont(font15);
        buttonAnswerB.setFont(font15);
        buttonAnswerC.setFont(font15);
        buttonAnswerD.setFont(font15);
        labelNumberOfQuestion.setFont(font45);

        buttonChooseThemes.addActionListener(new ChooseThemes());
        buttonPlay.addActionListener(new Play());
        buttonChooseFireproofAmount.addActionListener(new ChooseFireproofAmount());

        buttonOver.addActionListener(new GameOver());
        buttonAnswerA.addActionListener(new AnswerA());
        buttonAnswerB.addActionListener(new AnswerB());
        buttonAnswerC.addActionListener(new AnswerC());
        buttonAnswerD.addActionListener(new AnswerD());
        buttonHelperHelpFromTheHall.addActionListener(new HelpFromTheHall());
        buttonHelper50on50.addActionListener(new Helper50on50());
        buttonHelperRightToMakeMistake.addActionListener(new RightToMakeMistake());
        buttonHelperReplacingAQuestion.addActionListener(new ReplacingAQuestion());

        ThemesFireproofAmountsQuestionsAndAnswers.preparationThemesFireproofAmountsQuestionsAndAnswers();
        menu();
        startFrame.setVisible(true);
    }

    public static void menu() {
        startFrame.remove(labelQuestion);
        startFrame.remove(buttonAnswerA);
        startFrame.remove(buttonAnswerB);
        startFrame.remove(buttonAnswerC);
        startFrame.remove(buttonAnswerD);
        startFrame.remove(buttonOver);
        startFrame.remove(buttonHelperHelpFromTheHall);
        startFrame.remove(buttonHelper50on50);
        startFrame.remove(buttonHelperRightToMakeMistake);
        startFrame.remove(buttonHelperReplacingAQuestion);
        startFrame.remove(labelNumberOfQuestion);

        for (Theme theme : listOfThemes) {
            startFrame.remove(theme.buttonOfTheme);
        }
        for (FireproofAmount fireproofAmount : listOfFireproofAmounts) {
            startFrame.remove(fireproofAmount.buttonСhooseFireproofAmount);
        }
        startFrame.remove(labelChooseTheme);
        startFrame.remove(labelChooseFireproofAmount);

        startFrame.add(buttonChooseThemes);
        startFrame.add(buttonChooseFireproofAmount);
        startFrame.add(buttonPlay);
        startFrame.add(labelName);
        startFrame.add(labelMoney);
        buttonChooseThemes.setBounds(130, 150, 240, 50);
        buttonChooseFireproofAmount.setBounds(50, 230, 400, 45);
        buttonPlay.setBounds(120, 350, 260, 50);
        labelName.setBounds(55, 20, 390, 60);
        labelMoney.setBounds(5, 435, 495, 30);

        startFrame.repaint();
    }
    private void menuChooseThemes() {
        startFrame.remove(buttonChooseThemes);
        startFrame.remove(buttonChooseFireproofAmount);
        startFrame.remove(buttonPlay);
        startFrame.remove(labelName);
        startFrame.remove(labelMoney);

        startFrame.add(labelChooseTheme);
        labelChooseTheme.setBounds(125, 10, 250, 50);

        int x = 100;
        int y = 100;
        for (Theme theme : listOfThemes) {
            startFrame.add(theme.buttonOfTheme);
            theme.buttonOfTheme.setBounds(x, y, 300, 50);
            y += 100;
        }

        startFrame.repaint();
    }


    private void menuChooseFireproofAmount() {
        startFrame.remove(buttonChooseThemes);
        startFrame.remove(buttonChooseFireproofAmount);
        startFrame.remove(buttonPlay);
        startFrame.remove(labelName);
        startFrame.remove(labelMoney);

        startFrame.add(labelChooseFireproofAmount);
        labelChooseFireproofAmount.setBounds(55, 10, 390, 50);

        int x = 10;
        int y = 80;
        for (FireproofAmount fireproofAmount : listOfFireproofAmounts) {
            startFrame.add(fireproofAmount.buttonСhooseFireproofAmount);
            fireproofAmount.buttonСhooseFireproofAmount.setBounds(x, y, 230, 25);
            y += 30;
            if (y > 350) {
                y = 80;
                x += 240;
            }
        }
        startFrame.repaint();
    }

    private class ChooseThemes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuChooseThemes();
        }
    }

    private class Play implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (amountOfMoney >= needMoneyToPlay) {
                if (selectedTheme != null && selectedFireproofAmount != null) {
                    amountOfMoney -= needMoneyToPlay;
                    System.out.println("С вас списано " + needMoneyToPlay + " рублей.");
                    System.out.println("Игра началась! Ваша тема: " + selectedTheme.theme + ". Ваша несгораемая сумма: " + selectedFireproofAmount.amount);
                    startGame();
                } else if (selectedTheme == null) {
                    System.out.println("Выберите тему!");
                } else {
                    System.out.println("Выберите несгораемую сумму!");
                }
            } else {
                System.out.println("У вас не достаточно денег.");
                System.out.println("Вы проиграли.");
                System.exit(0);
            }
            labelMoney.setText("Баланс: " + amountOfMoney);
        }
    }

    private class ChooseFireproofAmount implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuChooseFireproofAmount();
        }
    }

    private void startGame() {
        numberOfQuestion = 1;
        startFrame.remove(buttonChooseThemes);
        startFrame.remove(buttonChooseFireproofAmount);
        startFrame.remove(buttonPlay);
        startFrame.remove(labelName);
        startFrame.remove(labelMoney);

        startFrame.add(labelQuestion);
        startFrame.add(buttonAnswerA);
        startFrame.add(buttonAnswerB);
        startFrame.add(buttonAnswerC);
        startFrame.add(buttonAnswerD);
        startFrame.add(buttonOver);
        startFrame.add(buttonHelperHelpFromTheHall);
        startFrame.add(buttonHelper50on50);
        startFrame.add(buttonHelperRightToMakeMistake);
        startFrame.add(buttonHelperReplacingAQuestion);
        startFrame.add(labelNumberOfQuestion);

        labelQuestion.setBounds(50, 110, 480, 40);
        buttonAnswerA.setBounds(30, 200, 200, 40);
        buttonAnswerB.setBounds(260, 200, 200, 40);
        buttonAnswerC.setBounds(30, 280, 200, 40);
        buttonAnswerD.setBounds(260, 280, 200, 40);
        buttonOver.setBounds(10, 10, 160, 35);
        buttonHelperHelpFromTheHall.setBounds(220, 10, 120, 30);
        buttonHelper50on50.setBounds(340, 10, 120, 30);
        buttonHelperRightToMakeMistake.setBounds(190, 40, 150, 30);
        buttonHelperReplacingAQuestion.setBounds(340, 40, 140, 30);
        labelNumberOfQuestion.setBounds(110, 60, 100, 40);

        nextQuestion();

        startFrame.repaint();
    }
    private void nextQuestion() {
        startFrame.add(buttonAnswerA);
        startFrame.add(buttonAnswerB);
        startFrame.add(buttonAnswerC);
        startFrame.add(buttonAnswerD);
        buttonAnswerA.setBounds(30, 200, 200, 40);
        buttonAnswerB.setBounds(260, 200, 200, 40);
        buttonAnswerC.setBounds(30, 280, 200, 40);
        buttonAnswerD.setBounds(260, 280, 200, 40);

        Question questionNow = null;
        boolean isNotUsedID;
        int iterations = 0;
        do {
            if (iterations > 1000) {
                System.out.println("\nНе нашлось нового вопроса, поэтому выдан старый или нулевой.");
                break;
            }
            isNotUsedID = true;
            int randQuestion = (int) (Math.random() * selectedTheme.listOfQuestionsOfTheTheme.get(numberOfQuestion - 1).size());
            questionNow = selectedTheme.listOfQuestionsOfTheTheme.get(numberOfQuestion - 1).get(randQuestion);
            for (Integer i : listOfUsedID) {
                System.out.println("Элемент массива: " + i + ", ID текущего вопроса: " + questionNow.ID);
                if (i.equals(questionNow.ID)) {
                    isNotUsedID = false;
                } else {
                    System.out.println("false");
                }
            }
            iterations++;
        } while (MainVariables.questionNow == questionNow || !isNotUsedID || questionNow.ID.equals(-1));
        MainVariables.questionNow = questionNow;
        labelQuestion.setText(questionNow.question);
        buttonAnswerA.setText(questionNow.listOfAnswers.get(0));
        buttonAnswerB.setText(questionNow.listOfAnswers.get(1));
        buttonAnswerC.setText(questionNow.listOfAnswers.get(2));
        buttonAnswerD.setText(questionNow.listOfAnswers.get(3));
        labelNumberOfQuestion.setText(numberOfQuestion+".");
        indexOfRightAnswer = questionNow.indexOfRightAnswer;

        listOfUsedID.add(questionNow.ID);
        System.out.println(listOfUsedID);

        startFrame.repaint();
    }

    private class GameOver implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numberOfQuestion = 1;
            indexOfRightAnswer = -1;
            selectedFireproofAmount = null;

            buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");

            amountOfMoney += amountOfWinMoney;
            System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
            System.out.println("Ваш баланс: " + amountOfMoney);

            amountOfWinMoney = 0;
            fireproofAmount = 0;
            labelMoney.setText("Баланс: " + amountOfMoney);
            menu();
        }
    }

    private class AnswerA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indexOfRightAnswer == 0) {
                System.out.println("Верно!");
                amountOfWinMoney = listOfFireproofAmounts.get(numberOfQuestion - 1).amount;
                System.out.println("Ваш выигрыш уже стал: " + amountOfWinMoney);
                numberOfQuestion++;
                if (numberOfQuestion <= 20) {
                    nextQuestion();
                } else {
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");

                    amountOfMoney += amountOfWinMoney;
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);

                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            } else {
                if (isRightToMakeMistake) {
                    System.out.println("Неверно, попробуйте ещё.");
                    startFrame.remove(buttonAnswerA);
                    isRightToMakeMistake = false;
                    startFrame.repaint();
                } else {
                    System.out.println("Ой, это неверно.");

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");
                    if (selectedFireproofAmount.questionNumber < numberOfQuestion) {
                        amountOfMoney += selectedFireproofAmount.amount;
                        amountOfWinMoney = selectedFireproofAmount.amount;
                    } else {
                        amountOfWinMoney = 0;
                    }
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);
                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            }
            if (isRightToMakeMistake) {
                System.out.println("Вы закончили использовать подсказку Право на ошибку.");
            }
            isRightToMakeMistake = false;
        }
    }

    private class AnswerB implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indexOfRightAnswer == 1) {
                System.out.println("Верно!");
                amountOfWinMoney = listOfFireproofAmounts.get(numberOfQuestion - 1).amount;
                System.out.println("Ваш выигрыш уже стал: " + amountOfWinMoney);
                numberOfQuestion++;
                if (numberOfQuestion <= 20) {
                    nextQuestion();
                } else {
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");

                    amountOfMoney += amountOfWinMoney;
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);

                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            } else {
                if (isRightToMakeMistake) {
                    System.out.println("Неверно, попробуйте ещё.");
                    startFrame.remove(buttonAnswerB);
                    isRightToMakeMistake = false;
                    startFrame.repaint();
                } else {
                    System.out.println("Ой, это неверно.");

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");
                    if (selectedFireproofAmount.questionNumber < numberOfQuestion) {
                        amountOfMoney += selectedFireproofAmount.amount;
                        amountOfWinMoney = selectedFireproofAmount.amount;
                    } else {
                        amountOfWinMoney = 0;
                    }
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);
                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            }
            if (isRightToMakeMistake) {
                System.out.println("Вы закончили использовать подсказку Право на ошибку.");
            }
            isRightToMakeMistake = false;
        }
    }

    private class AnswerC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indexOfRightAnswer == 2) {
                System.out.println("Верно!");
                amountOfWinMoney = listOfFireproofAmounts.get(numberOfQuestion - 1).amount;
                System.out.println("Ваш выигрыш уже стал: " + amountOfWinMoney);
                numberOfQuestion++;
                if (numberOfQuestion <= 20) {
                    nextQuestion();
                } else {
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");

                    amountOfMoney += amountOfWinMoney;
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);

                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            } else {
                if (isRightToMakeMistake) {
                    System.out.println("Неверно, попробуйте ещё.");
                    startFrame.remove(buttonAnswerC);
                    isRightToMakeMistake = false;
                    startFrame.repaint();
                } else {
                    System.out.println("Ой, это неверно.");

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");
                    if (selectedFireproofAmount.questionNumber < numberOfQuestion) {
                        amountOfMoney += selectedFireproofAmount.amount;
                        amountOfWinMoney = selectedFireproofAmount.amount;
                    } else {
                        amountOfWinMoney = 0;
                    }
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);
                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            }
            if (isRightToMakeMistake) {
                System.out.println("Вы закончили использовать подсказку Право на ошибку.");
            }
            isRightToMakeMistake = false;
        }
    }

    private class AnswerD implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (indexOfRightAnswer == 3) {
                System.out.println("Верно!");
                amountOfWinMoney = listOfFireproofAmounts.get(numberOfQuestion - 1).amount;
                System.out.println("Ваш выигрыш уже стал: " + amountOfWinMoney);
                numberOfQuestion++;
                if (numberOfQuestion <= 20) {
                    nextQuestion();
                } else {
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");

                    amountOfMoney += amountOfWinMoney;
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);

                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            } else {
                if (isRightToMakeMistake) {
                    System.out.println("Неверно, попробуйте ещё.");
                    startFrame.remove(buttonAnswerD);
                    startFrame.repaint();
                } else {
                    System.out.println("Ой, это неверно.");

                    buttonChooseFireproofAmount.setText("Выбрать несгораемую сумму");
                    if (selectedFireproofAmount.questionNumber < numberOfQuestion) {
                        amountOfMoney += selectedFireproofAmount.amount;
                        amountOfWinMoney = selectedFireproofAmount.amount;
                    } else {
                        amountOfWinMoney = 0;
                    }
                    System.out.println("Ваш выигрыш составил: " + amountOfWinMoney);
                    System.out.println("Ваш баланс: " + amountOfMoney);
                    amountOfWinMoney = 0;
                    fireproofAmount = 0;
                    numberOfQuestion = 1;
                    indexOfRightAnswer = -1;
                    selectedFireproofAmount = null;
                    labelMoney.setText("Баланс: " + amountOfMoney);
                    menu();
                }
            }
            if (isRightToMakeMistake) {
                System.out.println("Вы закончили использовать подсказку Право на ошибку.");
            }
            isRightToMakeMistake = false;
        }
    }

    private class HelpFromTheHall implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startFrame.remove(buttonHelperHelpFromTheHall);
            System.out.println("Была использована подсказка Помощь зала.");
            startFrame.repaint();
        }
    }

    private class Helper50on50 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startFrame.remove(buttonHelper50on50);
            System.out.println("Была использована подсказка 50:50.");
            int removeButtons = 0;
            JButton removeButton = null;
            while (removeButtons < 2) {
                int randomButton = (int) (Math.random() * 4);
                if (randomButton != indexOfRightAnswer) {
                    switch (randomButton) {
                        case 0:
                            if (removeButton != buttonAnswerA) {
                                startFrame.remove(buttonAnswerA);
                                removeButton = buttonAnswerA;
                                removeButtons++;
                            }
                            break;
                        case 1:
                            if (removeButton != buttonAnswerB) {
                                startFrame.remove(buttonAnswerB);
                                removeButton = buttonAnswerB;
                                removeButtons++;
                            }
                            break;
                        case 2:
                            if (removeButton != buttonAnswerC) {
                                startFrame.remove(buttonAnswerC);
                                removeButton = buttonAnswerC;
                                removeButtons++;
                            }
                            break;
                        case 3:
                            if (removeButton != buttonAnswerD) {
                                startFrame.remove(buttonAnswerD);
                                removeButton = buttonAnswerD;
                                removeButtons++;
                            }
                            break;
                    }
                }
            }
            startFrame.repaint();
        }
    }

    private class RightToMakeMistake implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startFrame.remove(buttonHelperRightToMakeMistake);
            System.out.println("Была использована подсказка Право на ошибку.");
            isRightToMakeMistake = true;
            startFrame.repaint();
        }
    }

    private class ReplacingAQuestion implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startFrame.remove(buttonHelperReplacingAQuestion);
            System.out.println("Была использована подсказка Замена вопроса.");
            nextQuestion();
            startFrame.repaint();
        }
    }
}
