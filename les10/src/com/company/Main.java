package com.company;

public class Main { // определяющий класс внутри файла ( те у которых имя класса совпадает с именем файла)
    // должен иметь мд паблик
    // private использовать нельзя
    // работают как и мд свойств
    // мд private для классов можно использовать только для вложенных классов

    public static void main(String[] args) {
        // Вложенные(внутренние) классы nested classes)
        // мд перред классом не тоже самое что мд свойств
        //public или private

        User user = new User();
        user.setPassportData("2020-10-25", "jkljkl.png");
        System.out.println(user.getPassport().date);
        System.out.println(user.getPassport().photo);

        //   u.children[0].name="Василий"; // изза того что класс Child private мы не имеем доступа к полям обьекта этого класса вне класса User
        // макс инфо можно извлеч ссылку на область памяти и все.


        User.Cat kitty = new User.Cat();// создание кота и вложенного класса кот в юзере через точку
        kitty.color = "red"; // только если статические и публичные

        final float PI = 3.1415f; // ключ слово final задает константу чтобы определенное значение нельзя было поменять


       // final User user = new User(); // если файнол указан прерд ссылкой на обьект(область памяти) то эту ссылку невозможно изменить
        // нельзя ей присвоить новую область памяти

        final int[] arr= new int[2]; // нелья присвоить новую область памяти
        // arr=new int[5]; недопустимо при final



        Solution s = new Solution();
        int []nums = {2,7,11,15};
        int target = 9;

        int[]result= s.twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);

        /////////////////////////////////////////////


    }


    final private String language = "Java"; // свойство которое нельзя поменять

}

