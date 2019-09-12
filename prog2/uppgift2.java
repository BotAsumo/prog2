import java.util.ArrayList;
public class uppgift2 {

	public static String rekursiv(String ord, int index, ArrayList<String> letters) {
		String result = "";
		String s = String.valueOf(ord.charAt(index));
		letters.add(s);
		
		if (index != 0) {
			rekursiv(ord, --index, letters);
		}
		
		for (String bokstav : letters)
			result += bokstav;
		return result;
	}
	
}

