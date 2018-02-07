
public class StringUtils {
	public static boolean included(String word, String searched) {
		boolean flag = false;
		if (word == null || searched == null) {
			flag = false;
		}
		else if (word.toUpperCase().contains(searched.trim().toUpperCase())) {
			flag = true;
		}
		else {
			flag = false;
		}
	return flag;
	}
}
