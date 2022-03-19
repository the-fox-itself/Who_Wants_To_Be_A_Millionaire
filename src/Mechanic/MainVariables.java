package Mechanic;

import Objects.FireproofAmount;
import Objects.Question;
import Objects.Theme;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class MainVariables {
    public static ArrayList<Theme> listOfThemes = new ArrayList<>();
    public static Theme selectedTheme = null;
    public static ArrayList<FireproofAmount> listOfFireproofAmounts = new ArrayList<>();
    public static FireproofAmount selectedFireproofAmount = null;

    ArrayList<Integer> listOfUsedID = new ArrayList<>();

    public static Question questionNow;

    static int numberOfQuestion = 1;
    static int indexOfRightAnswer = -1;
    static int amountOfWinMoney = 0;

    static boolean isRightToMakeMistake = false;

    public static int fireproofAmount = 0;

    static int amountOfMoney = 1000;
    static int needMoneyToPlay = 500;

    static JFrame startFrame = new JFrame("MegaQuiz");

    public static JButton buttonChooseThemes = new JButton("Выбрать тему");
    public static JButton buttonChooseFireproofAmount = new JButton("Выбрать несгораемую сумму");
    static JButton buttonPlay = new JButton("Играть (-"+needMoneyToPlay+")");

    static JButton buttonOver = new JButton("Забрать деньги");

    static JButton buttonHelperHelpFromTheHall = new JButton("Помощь зала");
    static JButton buttonHelper50on50 = new JButton("50:50");
    static JButton buttonHelperRightToMakeMistake = new JButton("Право на ошибку");
    static JButton buttonHelperReplacingAQuestion = new JButton("Замена вопроса");

    static JButton buttonAnswerA = new JButton();
    static JButton buttonAnswerB = new JButton();
    static JButton buttonAnswerC = new JButton();
    static JButton buttonAnswerD = new JButton();

    static JLabel labelQuestion = new JLabel();

    static JLabel labelName = new JLabel("Хочешь стать миллионером?");
    static JLabel labelChooseTheme = new JLabel("Выберите тему:");
    static JLabel labelChooseFireproofAmount = new JLabel("Выберите незгораемую сумму:");
    static JLabel labelMoney = new JLabel("Баланс: " + amountOfMoney);
    static JLabel labelNumberOfQuestion = new JLabel();

    static int widthOfFrame = 500;
    static int heightOfFrame = 500;
    static boolean isResizable = false;
    static Component locationRelativeTo = null;

    static LayoutManager nullLayout = null;
    static LayoutManager borderLayout = new BorderLayout();

    static Font font15 = new Font("", Font.BOLD, 15);
    static Font font20 = new Font("", Font.BOLD, 20);
    static Font font22 = new Font("", Font.BOLD, 22);
    static Font font25 = new Font("", Font.BOLD, 25);
    static Font font26 = new Font("", Font.BOLD, 26);
    static Font font30 = new Font("", Font.BOLD, 30);
    static Font font45 = new Font("", Font.BOLD, 45);
}
