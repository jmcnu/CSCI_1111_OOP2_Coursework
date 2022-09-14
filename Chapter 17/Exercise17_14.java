import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 Author:Jan McNulty
 Date:
 */
public class Exercise17_14  {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an input file name:");
		File inputFile =new File(input.nextLine());

		System.out.println("Enter an output file name:");
		File outputFile = new File(input.nextLine());

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFile));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile))) {

			int buffer;
			while ((buffer = in.read()) != -1) {
				out.write(buffer + 5);
			}
			System.out.println("Encrypted file saved.");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

