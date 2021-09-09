package Bai16_io_text_file.exercise.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ListOfCountries {
    public static void readFile(String list)  {
        BufferedReader bufferedReader = null;
      try{
          bufferedReader =new BufferedReader(new FileReader(list));
          String line = "";
          while ((line = bufferedReader.readLine())!= null) {
              System.out.println(line);
          }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
          System.err.println("File không tồn tại or nội dung có lỗi!");
      }
    }
    public static void main(String[] args) {
        readFile("src\\Bai16_io_text_file\\exercise\\read_file\\List");
    }
}
