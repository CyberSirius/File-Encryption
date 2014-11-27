package fileEncryption;

import fileEncryption.FileEncoder61702;

import java.util.LinkedList;

public class Start {
	public static void main(String[] args) {
		FileEncoder61702 fileEncoder = new FileEncoder61702();
		LinkedList<Character> key = new LinkedList<Character>();
		for (int i = 255; i > -1; i--) {
			key.add((char) i);
		}
		long time;
		time = System.currentTimeMillis();
		fileEncoder.encode("C:\\Users\\Strashimir\\Desktop\\test.txt",
				"C:\\Users\\Strashimir\\Desktop\\testEnc.enc", key);
		fileEncoder.decode("C:\\Users\\Strashimir\\Desktop\\testEnc.enc",
				"C:\\Users\\Strashimir\\Desktop\\testDec.txt", key);
		time = System.currentTimeMillis() - time;
		System.out.println(time + " miliseconds");
	}
}