package Mechanic;

import Objects.FireproofAmount;
import Objects.Question;
import Objects.Theme;

import java.util.ArrayList;

class ThemesFireproofAmountsQuestionsAndAnswers extends MainVariables {
    static void preparationThemesFireproofAmountsQuestionsAndAnswers() {
        //Создание несгораемых сумм.
        FireproofAmount fireproofAmount500 = new FireproofAmount(1, 500);
        FireproofAmount fireproofAmount1000 = new FireproofAmount(2, 1000);
        FireproofAmount fireproofAmount2000 = new FireproofAmount(3, 2000);
        FireproofAmount fireproofAmount3000 = new FireproofAmount(4, 3000);
        FireproofAmount fireproofAmount5000 = new FireproofAmount(5, 5000);
        FireproofAmount fireproofAmount10000 = new FireproofAmount(6, 10000);
        FireproofAmount fireproofAmount15000 = new FireproofAmount(7, 15000);
        FireproofAmount fireproofAmount25000 = new FireproofAmount(8, 25000);
        FireproofAmount fireproofAmount50000 = new FireproofAmount(9, 50000);
        FireproofAmount fireproofAmount100000 = new FireproofAmount(10, 100000);
        FireproofAmount fireproofAmount200000 = new FireproofAmount(11, 200000);
        FireproofAmount fireproofAmount400000 = new FireproofAmount(12, 400000);
        FireproofAmount fireproofAmount800000 = new FireproofAmount(13, 800000);
        FireproofAmount fireproofAmount1500000 = new FireproofAmount(14, 1500000);
        FireproofAmount fireproofAmount3000000 = new FireproofAmount(15, 3000000);
        FireproofAmount fireproofAmount4500000 = new FireproofAmount(16, 4500000);
        FireproofAmount fireproofAmount6000000 = new FireproofAmount(17, 6000000);
        FireproofAmount fireproofAmount8500000 = new FireproofAmount(18, 8500000);
        FireproofAmount fireproofAmount10000000 = new FireproofAmount(19, 10000000);
        FireproofAmount fireproofAmount15000000 = new FireproofAmount(20, 15000000);
        listOfFireproofAmounts.add(0, fireproofAmount500);
        listOfFireproofAmounts.add(1, fireproofAmount1000);
        listOfFireproofAmounts.add(2, fireproofAmount2000);
        listOfFireproofAmounts.add(3, fireproofAmount3000);
        listOfFireproofAmounts.add(4, fireproofAmount5000);
        listOfFireproofAmounts.add(5, fireproofAmount10000);
        listOfFireproofAmounts.add(6, fireproofAmount15000);
        listOfFireproofAmounts.add(7, fireproofAmount25000);
        listOfFireproofAmounts.add(8, fireproofAmount50000);
        listOfFireproofAmounts.add(9, fireproofAmount100000);
        listOfFireproofAmounts.add(10, fireproofAmount200000);
        listOfFireproofAmounts.add(11, fireproofAmount400000);
        listOfFireproofAmounts.add(12, fireproofAmount800000);
        listOfFireproofAmounts.add(13, fireproofAmount1500000);
        listOfFireproofAmounts.add(14, fireproofAmount3000000);
        listOfFireproofAmounts.add(15, fireproofAmount4500000);
        listOfFireproofAmounts.add(16, fireproofAmount6000000);
        listOfFireproofAmounts.add(17, fireproofAmount8500000);
        listOfFireproofAmounts.add(18, fireproofAmount10000000);
        listOfFireproofAmounts.add(19, fireproofAmount15000000);

        //Создание тем.
        Theme themeMinecraft = new Theme("Minecraft");
        listOfThemes.add(themeMinecraft);
//        Theme themeTerraria = new Theme("Terraria");
//        listOfThemes.add(themeTerraria);

        //Создание списка списков вопросов для темы "Minecraft".
        ArrayList<ArrayList<Question>> listOfQuestions = new ArrayList<>();

        //Создание списков вопросов для Вопросов 1-20 темы "Minecraft".
        ArrayList<Question> listOfQuestions1 = new ArrayList<>();
        ArrayList<Question> listOfQuestions2 = new ArrayList<>();
        ArrayList<Question> listOfQuestions3 = new ArrayList<>();
        ArrayList<Question> listOfQuestions4 = new ArrayList<>();
        ArrayList<Question> listOfQuestions5 = new ArrayList<>();
        ArrayList<Question> listOfQuestions6 = new ArrayList<>();
        ArrayList<Question> listOfQuestions7 = new ArrayList<>();
        ArrayList<Question> listOfQuestions8 = new ArrayList<>();
        ArrayList<Question> listOfQuestions9 = new ArrayList<>();
        ArrayList<Question> listOfQuestions10 = new ArrayList<>();
        ArrayList<Question> listOfQuestions11 = new ArrayList<>();
        ArrayList<Question> listOfQuestions12 = new ArrayList<>();
        ArrayList<Question> listOfQuestions13 = new ArrayList<>();
        ArrayList<Question> listOfQuestions14 = new ArrayList<>();
        ArrayList<Question> listOfQuestions15 = new ArrayList<>();
        ArrayList<Question> listOfQuestions16 = new ArrayList<>();
        ArrayList<Question> listOfQuestions17 = new ArrayList<>();
        ArrayList<Question> listOfQuestions18 = new ArrayList<>();
        ArrayList<Question> listOfQuestions19 = new ArrayList<>();
        ArrayList<Question> listOfQuestions20 = new ArrayList<>();

        creatingAQuestion("Какой киркой добываются алмазы?", "А: Деревянной", "B: Каменной", "C: Железной", "D: Золотой",
                3, 111111, listOfQuestions1);
        creatingAQuestion("Какой киркой добываются алмазы?", "А: Деревянной", "B: Каменной", "C: Железной", "D: Золотой",
                3, 111111, listOfQuestions2);
        creatingAQuestion("Какой киркой добываются алмазы?", "А: Деревянной", "B: Каменной", "C: Железной", "D: Золотой",
                3, 111111, listOfQuestions3);
        creatingAQuestion("Какой киркой добываются алмазы?", "А: Деревянной", "B: Каменной", "C: Железной", "D: Золотой",
                3, 111111, listOfQuestions4);
        creatingAQuestion("Какой киркой добываются алмазы?", "А: Деревянной", "B: Каменной", "C: Железной", "D: Золотой",
                3, 111111, listOfQuestions5);

        creatingAQuestion("Какой киркой добывается обсидиан?", "A: Каменной", "B: Железной", "C: Золотой", "D: Алмазной",
                4, 111112, listOfQuestions1);
        creatingAQuestion("Какой киркой добывается обсидиан?", "A: Каменной", "B: Железной", "C: Золотой", "D: Алмазной",
                4, 111112, listOfQuestions2);
        creatingAQuestion("Какой киркой добывается обсидиан?", "A: Каменной", "B: Железной", "C: Золотой", "D: Алмазной",
                4, 111112, listOfQuestions3);
        creatingAQuestion("Какой киркой добывается обсидиан?", "A: Каменной", "B: Железной", "C: Золотой", "D: Алмазной",
                4, 111112, listOfQuestions4);
        creatingAQuestion("Какой киркой добывается обсидиан?", "A: Каменной", "B: Железной", "C: Золотой", "D: Алмазной",
                4, 111112, listOfQuestions5);


        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions1);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions2);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions3);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions4);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions5);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions6);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions7);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions8);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions9);
        creatingAQuestion("Какой блок НЕ существует в Майнкрафте?", "A: Голова зомби", "B: Голова скелета", "C: Голова крийпера", "Г: Голова паука",
                4, 111113, listOfQuestions10);

        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions11);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions12);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions13);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions14);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions15);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions16);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions17);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions18);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions19);
        creatingAQuestion("Какой блок существует в Майнкрафте?", "A: Блок атмосферы", "B: Блок воздуха", "C: Блок пустоты", "D: Блок края мира",
                2, 111114, listOfQuestions20);


        creatingAQuestion("null", "A: true", "B: false", "C: false", "D: false",
                1, -1, listOfQuestions1);


        //Добавление списка вопросов для Вопроса 1 темы "Minecraft" в список списков вопросов для темы "Minecraft".
        listOfQuestions.add(0, listOfQuestions1);
        listOfQuestions.add(2 - 1, listOfQuestions2);
        listOfQuestions.add(3 - 1, listOfQuestions3);
        listOfQuestions.add(4 - 1, listOfQuestions4);
        listOfQuestions.add(5 - 1, listOfQuestions5);
        listOfQuestions.add(6 - 1, listOfQuestions6);
        listOfQuestions.add(7 - 1, listOfQuestions7);
        listOfQuestions.add(8 - 1, listOfQuestions8);
        listOfQuestions.add(9 - 1, listOfQuestions9);
        listOfQuestions.add(10 - 1, listOfQuestions10);
        listOfQuestions.add(11 - 1, listOfQuestions11);
        listOfQuestions.add(12 - 1, listOfQuestions12);
        listOfQuestions.add(13 - 1, listOfQuestions13);
        listOfQuestions.add(14 - 1, listOfQuestions14);
        listOfQuestions.add(15 - 1, listOfQuestions15);
        listOfQuestions.add(16 - 1, listOfQuestions16);
        listOfQuestions.add(17 - 1, listOfQuestions17);
        listOfQuestions.add(18 - 1, listOfQuestions18);
        listOfQuestions.add(19 - 1, listOfQuestions19);
        listOfQuestions.add(20 - 1, listOfQuestions20);

        //Добавление списка списков вопросов для темы "Minecraft" в тему "Minecraft".
        themeMinecraft.listOfQuestionsOfTheTheme = listOfQuestions;
    }
     private static void creatingAQuestion(String questionS, String answerAs, String answerBs, String answerCs, String answerDs, int rightIndex, int ID, ArrayList<Question> listOfQuestions) {
        ArrayList<String> listOfAnswers = new ArrayList<>();
        listOfAnswers.add(answerAs);
        listOfAnswers.add(answerBs);
        listOfAnswers.add(answerCs);
        listOfAnswers.add(answerDs);
        Question question = new Question(questionS, listOfAnswers, rightIndex - 1, ID);
        listOfQuestions.add(question);
    }
}
