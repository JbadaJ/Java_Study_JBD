package basic;

import java.io.*;
import java.util.Scanner;

public class File_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "C:\\Users\\eric5\\Desktop\\Java_Study\\Java_Study_03\\src\\basic\\example.txt";

        System.out.println("Choose an option:");
        System.out.println("1. Read from file");
        System.out.println("2. Write to file");
        int choice = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        if (choice == 1) {
            // 파일 읽기
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                System.out.println("File Contents:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            }
        } else if (choice == 2) {
            // 파일 쓰기
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                System.out.println("Enter text to write to file:");
                String text = scanner.nextLine();
                writer.write(text);
                writer.newLine();
                System.out.println("파일에 텍스트가 성공적으로 저장되었습니다.");
            } catch (IOException e) {
                System.out.println("파일을 쓰는 중 오류가 발생했습니다: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid choice. Exiting program.");
        }

        scanner.close();
    }
}
