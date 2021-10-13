package Task2;

public class Task2 {
    public static void main(final String[] args) {

        characterCount(new String[]{"Andrii", "Anastasia", "Ivan", "Sanya"}, 'n');
    }

    public static void characterCount(final String[] input, final char search) {
        final String str = String.join(",", input);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search)
                count++;
        }
        System.out.println("The Character '" + search + "' appears in string [" + str + "] : " + count + " times.");

    }
}
