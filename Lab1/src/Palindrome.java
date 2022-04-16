import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        for (int i=0;i<args.length;i++)
        {
            String s = args[i];
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово");
        String s = scan.next();
        isPalindrome(s);
    }
    public static String reverseString(String s) {
        String s1 = ""; //Объявление переменной для записи задом наперёд
        for (int length = s.length()-1;length>=0;length--)
            s1 += s.charAt(length);
        return s1;
    }
    public static boolean isPalindrome(String s){
        if (s.equals(reverseString(s))) //Проверка, является ли слово палиндромом
            System.out.println(s + " Палиндром");
        else
            System.out.println((s + " Не палиндром"));
        return s.equals(reverseString(s));
    }
}