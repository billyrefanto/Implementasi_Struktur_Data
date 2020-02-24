package modul03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan : ");
        Stack<Character> stak = new Stack<>();
        String dalamK = sc.next();
        for (int i = 0; i < dalamK.length() ; i++) {
            char kurung = dalamK.charAt(i);
            switch (kurung) {
                case '(':
                    stak.push(kurung);
                    break;
                case '[':
                    stak.push(kurung);
                    break;
                case '{':
                    stak.push(kurung);
                    break;
                case ')':
                    if (!stak.isEmpty() && stak.peek().equals('(')) {
                        stak.pop();
                    } else {
                        stak.push(kurung);
                    }
                    break;
                case ']':
                    if (!stak.isEmpty() && stak.peek().equals('[')) {
                        stak.pop();
                    } else {
                        stak.push(kurung);
                    }
                    break;
                case '}' :
                    if (!stak.isEmpty() && stak.peek().equals('{')) {
                        stak.pop();
                    }else {
                        stak.push(kurung);
                    }
                    break;
                default:
                    stak.push('x');
                    break;
            }
        }
        if (stak.empty()) {

            System.out.println("True");
        }else {
            System.out.println("False");
            stak.clear();
        }
    }
}
