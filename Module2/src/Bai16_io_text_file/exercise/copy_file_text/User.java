package Bai16_io_text_file.exercise.copy_file_text;

import java.io.*;

public class User {
    public static void copyFile(String source, String target)  {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(source));
            bufferedWriter = new BufferedWriter(new FileWriter(target));
            String line = "";

            while( (line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file could not be found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("read and write error");
        }

    }

    public static void main(String[] args) {
        copyFile("src\\Bai16_io_text_file\\exercise\\copy_file_text\\source","src\\Bai16_io_text_file\\exercise\\copy_file_text\\target");
    }
}


