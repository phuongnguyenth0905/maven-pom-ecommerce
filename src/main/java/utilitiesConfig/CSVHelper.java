package utilitiesConfig;

import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;

public class CSVHelper {
	public static List<String[]> readCSV(String filePath) {
		try {
			InputStream is = Objects.requireNonNull(CSVHelper.class.getClassLoader().getResourceAsStream(filePath),
					"❌ File CSV không tồn tại trong resources!");

			CSVReader reader = new CSVReader(new InputStreamReader(is));
			return reader.readAll();

		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}