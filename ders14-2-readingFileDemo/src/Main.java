import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader("C:\\java2022\\ders14-2-readingFileDemo\\src\\numara.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			reader.close();
		}
		
	}

}
