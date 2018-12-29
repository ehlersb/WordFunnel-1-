import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/29/2018.
 */
public class main {

    public static void main(String[] args) {
        String inputWord;
        String inputFunnelWord;
        WordFunnel wordFunnel;
        System.out.println("Enter a word. Then enter another to see if the second word can be made by removing one character of the first word.");
        System.out.println("Enter '!' for the first word to quit.");
        while(true) {
            Scanner scan = new Scanner(System.in);
            inputWord = scan.nextLine();
            if(inputWord.equals("!")) break;
            inputFunnelWord = scan.nextLine();
            wordFunnel = new WordFunnel(inputWord, inputFunnelWord);
            System.out.println(inputWord + ", " + inputFunnelWord + " => " + wordFunnel.funnel());
        }
    }
}
