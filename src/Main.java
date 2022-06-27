import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your text here : ");

        Scanner scan = new Scanner(System.in);
        String keyInput = scan.nextLine();

        System.out.println(" ");
        System.out.println("---------------------------------");
        System.out.println(" ");

        // create the object to be able to call the functions
        TextInput textInput = new TextInput(keyInput);

        System.out.println("Keyboard input is : " + textInput.getText());

        System.out.println("Vowels frequency in ascending order : ");
        textInput.printVowels();

        System.out.println(" ");

        System.out.println("Consonant frequency in descending order : ");
        textInput.printConsonant();

        System.out.println("Total number of Characters : " + textInput.getLength());
        System.out.println("Total number of Vowels : " + textInput.getVowelsTotal());
        System.out.println("Total number of Consonant : " + textInput.getConsonantTotal());
    }
}