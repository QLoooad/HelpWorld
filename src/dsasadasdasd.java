import java.util.Scanner;

public class dsasadasdasd { //단어의 수, 글자의 수
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            int words = 0, letters = 0;
            int i = 0;
            while (i < s.length()) {
                if ((i == 0 && s.charAt(i) != ' ') ||
                    (i > 0 && s.charAt(i-1) == ' ' && s.charAt(i) != ' '))
                    words++;
                if (s.charAt(i) != ' ') letters++;
                i++;
            }
            System.out.println(words + " " + letters);
        }
    }
}