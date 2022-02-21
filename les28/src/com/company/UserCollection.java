package com.company;

import java.util.ArrayList;


public class UserCollection {
    private ArrayList<User> users;

    public UserCollection() {
        this.users = new ArrayList<>();

    }

    public void add(User... u) {
        for (User user : u) {
            this.users.add(user);
        }

    }

    public String[][] generateReport() {
        String[][] report = new String[this.users.size() + 2][4];
        // шапка
        report[0][0] = "NAME";
        report[0][1] = "SALARY";
        report[0][2] = "BONUS";
        report[0][3] = "TOTAL";

        // футер
        int l = this.users.size() + 1;

        report[l][0] = "TOTAL";
        report[l][1]= "";
        report[l][2]= "";
        report[l][3] = String.format("=СУММ(D1:D%d)", this.users.size());

        for (int i = 1; i <= users.size(); i++) {
            User user = this.users.get(i - 1);
            report[i][0] = user.getName();
            report[i][1] = String.valueOf(user.getSalary());
            report[i][2] = String.valueOf(user.getBonus());
            report[i][3] = String.format("=B%d+C%d", i + 1, i + 1);
        }
        return report;
    }
}
