import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
 * 22.2 (Displaying nonduplicate words in ascending order) Write a program that reads
words from a text file and displays all the nonduplicate words in ascending order.
The text file is passed as a command-line argument.
 */
public class Displaying_Nonduplicate_Words_In_Ascending_Order {

	public static void main(String[] args) {
		File file = new File(args[0]);
		TreeSet<String> setOfWordsInAscensingOrder = new TreeSet<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String str;
			StringTokenizer strToken = null;
			int count = 0;
			while ((str = br.readLine()) != null) {
				strToken = new StringTokenizer(str, ",");
				count++;
			}
			br.close();
			for (int x = 0; x <= count; x++) {
				String text = strToken.nextToken();
				if (strToken != null && !setOfWordsInAscensingOrder.contains(text)) {
					setOfWordsInAscensingOrder.add(text);
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String string : setOfWordsInAscensingOrder) {
			System.out.println(string);
		}
	}
}
