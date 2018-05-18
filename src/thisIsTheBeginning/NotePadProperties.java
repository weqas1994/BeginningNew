package thisIsTheBeginning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotePadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//	Step 1 create a file
		File notepadd=new File("/Users/weqashaq/Desktop/eclipse/Beginnings/src/ThisIsForProperties/Hello.txt");
		notepadd.createNewFile();
		//Step 2 called a class to write inside the file which is FileWriter
		FileWriter fileWrite=new FileWriter("/Users/weqashaq/Desktop/eclipse/Beginnings/src/ThisIsForProperties/Hello.txt");
		//step 3 import bufferedwriter class
		BufferedWriter bWriter=new BufferedWriter(fileWrite);
		
	bWriter.write("Hello Worldss this is is freeza the greatest conquarer of all");
	bWriter.newLine();
		bWriter.write("whats up guys this is just me writing the notes in my files");
		bWriter.close();
		
		
		
		FileReader fReader =new FileReader("/Users/weqashaq/Desktop/eclipse/Beginnings/src/ThisIsForProperties/Hello.txt");
		BufferedReader bReader=new BufferedReader(fReader);
		System.out.println(bReader.readLine());
		System.out.println(bReader.readLine());
		
		String i = "";
		while((i=bReader.readLine())!=null){
			System.out.println(i);
		}
		
		
	}

}
