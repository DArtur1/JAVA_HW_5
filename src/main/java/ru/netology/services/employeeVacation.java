package ru.netology.services;

public class employeeVacation {
    public int calculate(int income, int expenses, int threshold) {
        int money  = 0;
        int count = 0; // счётчик месяцев отдыха
        for (int month = 1; month <= 12; month++) {
            int moneyBeg = 0;
            int moneyEnd = 0;
            if (money >= threshold) {
                count++;
                moneyBeg = money;
                money = (money - expenses) / 3;
                moneyEnd = moneyBeg - money - expenses;
               //System.out.println("Месяц " + month + ". Денег " + moneyBeg + ".Буду отдыхать. Потратил -" + expenses + ", затем еще -" + moneyEnd);
            } else {
                moneyBeg = money;
                money = (money + income) - expenses;
                //System.out.println("Месяц " + month + ". Денег " + moneyBeg + ".Придется работать. Заработал +" + income + ", потратил -" + expenses);
            }
        }
        return count;
    }
}
