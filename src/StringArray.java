import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

 //       Задача 2: Условие: Напишите программу, которая используя Stream API
 //       выводит строки из массива, длинна которых больше 5.

        String[] strings = { "red" , "white", "blue", "yellow", " black"};
        Arrays.stream(strings)
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
