public class TextInput {
    // text input from keyboard is stored in this
    private String mText;

    // the alphabets are used so that the arrays(arrVowels, arrConsonant) can know at which position the to store the counts
    private char[] strVowels = {'a', 'e', 'i', 'o', 'u'};
    private char[] strConsonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};


    // keeps the count of each vowels depending on the position
    private int[] arrVowels = new int[5];

    // keeps the count of each consonant depending on the position
    private int[] arrConsonant = new int[21];


    // Constructor
    public TextInput(String text) {
        mText = text;
    }


    /**
     * Returns the text entered from the Keyboard inputs.
     */
    public String getText() {
        return mText;
    }


    /**
     * Returns the length of Characters of the Keyboard inputs.
     * **/
    public int getLength() {
        return mText.length();
    }


    /**
     * Prints the vowels by looping in 2 arrays.
     * First loops in the text input by matching the characters with the @strVowels.
     *
     * Secondly if the characters from the text input matches the alphabet in @strVowels,
     * the count is added in the position in @arrVowels as it is found in @strVowels so
     * that we can retrieve later.
     */
    public void printVowels() {
        // convert the text to lowerCase so no errors are caused
        String text = mText.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < strVowels.length; j++) {
                if(text.charAt(i) == strVowels[j]) {
                    arrVowels[j] += 1;
                }
            }
        }

        // loop in correct order and print the characters.
        for (int i = 0; i < arrVowels.length; i++) {
            System.out.println(strVowels[i] + " : " + arrVowels[i]);
        }
    }


    /**
     * Prints the consonants by looping in 2 arrays.
     * First loops in the text input by matching the characters with the @strConsonant.
     *
     * Secondly if the characters from the text input matches the alphabet in @strConsonant,
     * the count is added in the position in @arrConsonant as it is found in @strConsonant so
     * that we can retrieve later.
     */
    public void printConsonant() {
        // convert the text to lowerCase so no errors are caused
        String text = mText.toLowerCase();


        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < strConsonant.length; j++) {
                if(text.charAt(i) == strConsonant[j]) {
                    arrConsonant[j] += 1;
                }
            }
        }

        // loop in reverse and print the characters.
        for (int i = arrConsonant.length - 1; i >= 0; i--) {
            System.out.println(strConsonant[i] + " : " + arrConsonant[i]);
        }
    }


    /**
     * Returns vowels total number by looping in
     * the @arrVowels array.
     */
    public int getVowelsTotal() {
        int totalVowels = 0;
        for (int i = 0; i < strVowels.length; i++) {
            totalVowels = totalVowels + arrVowels[i];
        }

        return totalVowels;
    }


    /**
     * Returns consonant total number by looping in
     * the @arrConsonant array.
     */
    public int getConsonantTotal() {
        int totalConsonant = 0;
        for (int i = 0; i < strConsonant.length; i++) {
            totalConsonant = totalConsonant + arrConsonant[i];
        }

        return totalConsonant;
    }
}
