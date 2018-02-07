import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
    private Random random;
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private int randomNumber;
    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword() {
      String buffer = "";
      for (int i = 0; i <= this.passwordLength; i++) {
    	  buffer += alphabet.charAt(random.nextInt(alphabet.length()-1));
      }
      return buffer;
    }
}
    