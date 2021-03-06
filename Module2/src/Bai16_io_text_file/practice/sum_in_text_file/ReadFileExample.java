package Bai16_io_text_file.practice.sum_in_text_file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            int sum=0;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = "+ sum);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }
    public static  void main(String[] args) {
        System.out.println("Nhập đường dẫn file: " );
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);


    }
}
