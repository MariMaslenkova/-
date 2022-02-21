package Davy.Jones;

import java.io.Serializable;
import java.util.ArrayList;

public class Array implements Serializable {

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    private Status status;
    private String description;
    private int number;


    public Array(String description, Status status, int number) {
        super();
        this.description = description;
        this.status=status;
        this.number=number;
    }
 public Array(){

 }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(String description) {
    }

    @Override
    public String toString() {
        return
                " \n Номер: " + number+ "\n Oписание: " + description +
                        " \n Статус: " + status+"\n";
    }
}



