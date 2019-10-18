package com.zk.io.bio.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilePractice {

    public void readByName() {
        FileInputStream fis = null;
        String name = "G:\\coding\\java\\practice\\resource\\test.txt";
        try {
            fis = new FileInputStream(name);
            byte[] buf = new byte[1024];
            int hasRead = 0;
            while((hasRead = fis.read(buf)) > 0) {
                System.out.println(new String(buf, 0, hasRead));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        FilePractice filePractice = new FilePractice();
        filePractice.readByName();
    }

}
