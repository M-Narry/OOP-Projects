package csci1082;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNameRankingYear {
	private int year;
	private NameRecord[] records;
	private int count;
	
	public BabyNameRankingYear(int year) {
		this.year = year;
		this.records = new NameRecord[100];
		this.count = 0;
		getData();
	}
	
	private void getData() {
		String fileName = "popularnames" + year + ".md";
		FileInputStream fileByteStream = null;
		Scanner inFS = null;
				
		try {
			fileByteStream = new FileInputStream(fileName);
			inFS = new Scanner(fileByteStream);
			
			// Skipping those pesky headers
			if (inFS.hasNextLine()) inFS.nextLine(); // Skips "Popularity in YEAR"
			if (inFS.hasNextLine()) inFS.nextLine(); // Skips that next line
			
			while (inFS.hasNextLine() && count < 100) {
				String line = inFS.nextLine().trim();
				if (line.isEmpty()) continue;
				
				Scanner lineScanner = new Scanner(line);
				
				int rank = lineScanner.nextInt(); //reads rank
				String maleName = lineScanner.next(); // reads male name
				int maleCount = loseComma(lineScanner.next()); //reads male count
				String femaleName = lineScanner.next();
				int femaleCount = loseComma(lineScanner.next());
				
				records[count] = new NameRecord(rank, maleName, maleCount, femaleName, femaleCount);
					count++;
					
					lineScanner.close();
			}
			
		} catch (FileNotFoundException excpt) {
			System.out.printf("File for %d not found", year);
		} finally {
			if (inFS != null) inFS.close();
			try {
				if (fileByteStream != null) fileByteStream.close();
			} catch (Exception excpt) {
				System.out.println("Error closing file stream");
			}
		}
	}
			private int loseComma(String numStr) {
				return Integer.parseInt(numStr.replace(",", ""));
			}
			
			public int findRank(String gender, String name) {
				for (int i = 0; i < count; i++) {
					if (gender.equalsIgnoreCase("M") && records[i].getMaleName().equalsIgnoreCase(name)) {
						return records[i].getRank();
					} else if (gender.equalsIgnoreCase("F") && records[i].getFemaleName().equalsIgnoreCase(name)) {
						return records[i].getRank();
					}
				}
				return -1;
			}
			
			public int getCount(String gender, String name) {
				for (int i = 0; i < count; i++) {
					if (gender.equalsIgnoreCase("M") && records[i].getMaleName().equalsIgnoreCase(name)) {
						return records[i].getMaleCount();
					} else if (gender.equalsIgnoreCase("F") && records[i].getFemaleName().equalsIgnoreCase(name)) {
						return records[i].getFemaleCount();
					}
				}
				return 0;
			}
			
			public int getYear() {
				return year;
			}
}
