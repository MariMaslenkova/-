package com.company;

import javax.imageio.IIOException;
import java.io.*;
import java.util.List;

public class HTML<T> implements Exportable<T> {
    private File exportFile;



    public HTML(File f) {
        this.exportFile=f;
    }


    public HTML(String path) {
        this.exportFile=new File((path));
    }


    @Override
    public void expotr(List<T> documents) {
        String content = "";
        try {
            FileReader fr  = new FileReader("template.html"); // читаем файл шаблона
            while (true){
                int c =fr.read();
                if (c ==-1){
                    break;
                }
                content+=(char)c;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }

        content=content.replace("{{?}}",documents.toString());

        try {
            FileWriter fw = new FileWriter(this.exportFile);
            fw.write(content);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
