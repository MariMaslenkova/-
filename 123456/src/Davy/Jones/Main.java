package Davy.Jones;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {

        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Array array = new Array();
        ArrayList<Array> arList = new ArrayList<>();
        HashMap<Date, ArrayList<Array>> todoList = new HashMap<>();


        File file = new File("TodoList1.txt");

/**********************************************************************************************************************/
        int input = 0;
        while (input < 4) {
            HashMap<Date, ArrayList<Array>> todoListFromFile = new HashMap<>();// читаю то что в файле
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                    Array listFromFile = (Array) ois.readObject();
                    todoListFromFile = (HashMap<Date, ArrayList<Array>>) ois.readObject();
                    todoList.putAll(todoListFromFile);
                }

            }

            if (todoListFromFile.isEmpty()) {
                System.out.println("Список пуст");
            }


            ArrayList<Array> arrayListFromFile;
            // То что прочитали добовляем в туду лист




            System.out.println("1. Добавить задание");//
            System.out.println("2. Выбрать задание");//
            System.out.println("3. Показать список дел");
            System.out.println("4. Завершить работу");

            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

/**********************************************************************************************************************/

            if (input == 1) {
                System.out.println("Введите дату в формате “dd/MM/yyyy”");

                Scanner sc1 = new Scanner(System.in);
                String d = sc1.nextLine();
                try {
                    date = df.parse(d);
                } catch (ParseException e) {
                    System.out.println("Неверный формат");
                }

                int index = 1;
                System.out.println("Введите описание задания");
                Scanner sc2 = new Scanner(System.in);
                String des = sc2.nextLine();

                if (!todoList.containsKey(date)) {
                    Status status = Status.NOTDONE;
                    todoList.put(date, new ArrayList<Array>());
                    todoList.get(date).add(new Array(des, Status.NOTDONE, index));
                    System.out.println("Добавлено");

                } else {
                    ArrayList<Array> listExam = todoList.get(date);// по дате достала аррей лист
                    for (int e = 0; e < listExam.size(); e++) {
                        if (des.equals(listExam.get(e).getDescription())) {
                            System.out.println("Запланированное дело уже есть в списке. ");
                            break;
                        } else {
                            if ((!des.equals(listExam.get(e).getDescription())) && (e == listExam.size() - 1)) {
                                Status status = Status.NOTDONE;

                                index = listExam.size();

                                todoList.get(date).addAll(Arrays.asList(new Array(des, status.NOTDONE, index + 1)));
                                index = 1;
                                System.out.println("Добавлено");
                                break;
                            }
                        }
                    }
                }
            }

/**********************************************************************************************************************/

            if (input == 2) {
                System.out.println("Введите дату в формате “dd/MM/yyyy”");
                Scanner sc2 = new Scanner(System.in);
                String d = sc2.nextLine();
                try {
                    date = df.parse(d);
                    if (todoList.get(date) != null) {
                        System.out.println(todoList.get(date).toString());
                    } else {
                        System.out.println("Нет запланированных заданий");
                    }
                } catch (ParseException e) {
                    System.out.println("Неверный формат");
                }


                System.out.println("Введите номер задания: ");
                Scanner sc3 = new Scanner(System.in);
                int num = sc3.nextInt();
                ArrayList<Array> list2 = todoList.get(date);
                if (num <= list2.size() + 1 && num > 0) {
                    System.out.println(todoList.get(date).get(num - 1).toString());
                } else {
                    System.out.println("Заданий с таким номером нет");
                }


                System.out.println("1. Изменить описание");//
                System.out.println("2. Удалить");//
                System.out.println("3. Пометить как выполненное");//
                System.out.println("4. Пометить как невыполненное");//
                System.out.println("5. Отмена");//
                Scanner sc4 = new Scanner(System.in);
                int input4 = sc4.nextInt();

                switch (input4) {
                    case 1:
                        System.out.println("Изменить описание задания на: ");
                        Scanner sc5 = new Scanner(System.in);
                        String newDes = sc5.nextLine();
                        if (!todoList.get(date).get(num - 1).getDescription().equals(newDes)) {
                            todoList.get(date).get(num - 1).setDescription(newDes);
                            System.out.println("Описание успешно изменено");
                        } else {
                            System.out.println("Задание с таким описанием уже есть на эту дату");
                        }
                        break;

                    case 2:
                        System.out.println("Удалить задание Y/N?");
                        Scanner sc6 = new Scanner(System.in);
                        String yn = sc6.nextLine();
                        if (yn.equals("Y") || yn.equals("y")) {
                            todoList.get(date).remove(num - 1);
                            System.out.println("Задание удалено");
                            ArrayList<Array> listExam2 = todoList.get(date);
                            for (int e = 0; e < listExam2.size(); e++) {
                                listExam2.get(e).setNumber(e + 1);
                            }
                            input4 = 5;
                        } else {
                            System.out.println("Ну нет - так нет");
                            input4 = 5;
                        }
                        break;
                    case 3:
                        Status status = Status.DONE;
                        todoList.get(date).get(num - 1).setStatus(Status.DONE);
                        System.out.println("Статус задания помечен как (Выполнено)");
                        System.out.println(todoList.get(date).get(num - 1).toString());
                        break;
                    case 4:
                        todoList.get(date).get(num - 1).setStatus(Status.NOTDONE);
                        System.out.println("Статус задания помечен как (НЕ выполнено)");
                        System.out.println(todoList.get(date).get(num - 1).toString());
                        break;
                    case 5:
                        break;
                }
            }

/**********************************************************************************************************************/

            if (input == 3) {
                System.out.println("1. На сегодня");//
                System.out.println("2. На эту неделю");
                System.out.println("3. На выбранную дату");//
                System.out.println("4.  Весь список");//
                System.out.println("5. Назад");//
                int input3 = sc.nextInt();

                switch (input3) {
                    case 1:
                        Date dateNow = new Date();
                        String date1 = df.format(dateNow);
                        dateNow = df.parse(date1);
                        if (!todoList.containsKey(dateNow)) {
                            System.out.println("Нет запланированный задач");
                        } else {
                            System.out.println(todoList.get(dateNow).toString());
                        }
                        break;

                    case 2:
//                        Calendar calendar = new GregorianCalendar();
//                        calendar.add(Calendar.DAY_OF_MONTH,7);
//
//                        dateCal.add(Calendar.DATE, 7);
//                        System.out.println(todoList.get(dateCal).toString());
//                       // System.out.println(date2);
//
////                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
////                        String calendar1=sdf.format(calendar.getTime());
////                       // calendar=sdf.parse(calendar1);
////                        System.out.println(calendar.toString());
//                        break;


                    case 3:
                        System.out.println("Введите дату в формате “dd/MM/yyyy”");
                        Scanner sc2 = new Scanner(System.in);
                        String d = sc2.nextLine();
                        try {
                            date = df.parse(d);
                        } catch (ParseException e) {
                            System.out.println("Неверный формат");
                        }

                        if (todoList.get(date) != null) {
                            System.out.println(todoList.get(date).toString());
                        } else {
                            System.out.println("Нет запланированный задач");
                        }
                        break;

                    case 4:
                        System.out.println(todoList.toString());
                        if (todoList.size() == 0) {
                            System.out.println("Нет запланированный задач".toString());
                        }
                        break;

                }
                if (input == 4) {
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(todoList);
                    oos.close();
                    input = 5;
                    continue;
                }
            }
        }
    }
}


