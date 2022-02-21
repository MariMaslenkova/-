package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
// контрольная бляяять
        // 4 задания
        //1 работа со строками. символы чар хранит число код символа в както кодировке
        // c типом чар можно работать как с целочисленным типом,

        char c = 'f'; // узнать номер символа
        System.out.println(c);
        int cc = (int) c; // преобразовать к инту
        System.out.println(cc);

        // символы алфавита в большинстве случаев в кодировке идут друг за другом
        // буквы  в верхнем регистре тоже идут по порядку
        c += 1; // след символ после ф

        System.out.println(c);
        c -= 2;
        System.out.println(c);// предыдущий сивыол перед f

        int count = 'Я' - 'А';
        System.out.println(count + 1);

        String s = "hello !$^";
        // найти на каком расстоянии находиться 'A''a' от
        int distanse = ('A' - 'a');
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x >= 'a' && x <= 'z') {
                x += distanse;
            }
            System.out.print(x);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
/**********************************************************************************************************************/
//2 задача
        //отсортировать массив

        int[] arr = {12, 58, -98, 452, 47, 2, -65};
        //Arrays.sort(arr); // сортирует по возрастанию

        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }


        Arrays.<Integer>sort(arr2, (o1, o2) -> { // сортировка по убыванию
            if (o1 == o2) {
                return 0;
            }
            if (o1 < o2) {
                return 1;
            }
            return -1;
        });
        for (int i : arr2)
            System.out.println(i);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");


        // сортировка пузырьком
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.println(i);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3 про матрицы
        char[][] m = new char[5][5];
        m[0][0] = 'a';
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // a-z
                int v = r.nextInt('z' + 1 - 'a');
                v += 'a';
                m[i][j] = (char) v;
            }
        }
        HashMap<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                char key = m[i][j];

                int v = symbols.getOrDefault(key, 0);
                symbols.put(key, ++v);
            }
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (!symbols.containsKey(i)) {
                symbols.put(i, 0);
            }
        }
        System.out.println(symbols);
        System.out.println("//////////////////////////////////");
/**********************************************************************************************************************/
//4 потоки и чтение и запись(ридер райтер)
        FileWriter fw = new FileWriter("numbers.txt");
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                int v = r.nextInt(200);
                try {
                    synchronized (fw) {
                        fw.write(v + " ");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 5; i < 10; i++) {
                int v = r.nextInt(200);
                try {
                    synchronized (fw) {
                        fw.write(v + " ");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();



        fw.flush();
        fw.close();

        FileReader fr = new FileReader("numbers.txt");
        String str = "";
        int sum=0;
        while (true) {
            int ch = fr.read();
            if (ch == -1) {
                break;
            }
            char digit = (char) ch;
            if (digit!=' '){
                str+=digit;
            }else {
                int v = Integer.parseInt(str);
                sum+=v;
                str = "";
            }
        }
        System.out.println(sum);
    }
}
