package Utils;

import java.util.Random;

public class Generator {

	public String generateString()
	{
		Random rng = new Random();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    char[] text = new char[7];
	    for (int i = 0; i < 7; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
}
