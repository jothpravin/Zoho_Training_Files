import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileEncryptDecrypt
{
	public static void encrypt(String inputFile, String outputFile, int key)
	{
		try(FileInputStream fis = new FileInputStream(inputFile);
		    FileOutputStream fos = new FileOutputStream(outputFile))
		{
			int line;

			while((line = fis.read()) != -1)
			{
				int encrypted = line ^ key;
				fos.write(encrypted);
			}
		}
		catch(IOException e)
		{
			System.out.print("Exception in file reading :"+e.getMessage());
		}
	}

	public static void decrypt(String inputFile, String outputFile, int key)
	{
		encrypt(inputFile, outputFile, key);
	}

	public static void main(String []args)
	{
		int key = 143;
		String fileName = "Input.txt";
		String encryptFile = "encrypt.txt";
		String decryptFile = "decrypt.txt";

		encrypt(fileName, encryptFile, key);
		System.out.println("File is encrypted!!");

		decrypt(encryptFile, decryptFile, key);
		System.out.println("File is Decrypted!!");
	}
}
