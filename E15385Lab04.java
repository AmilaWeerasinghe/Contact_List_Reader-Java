

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E15385Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner keyboard=new Scanner(System.in);
		String Name=keyboard.nextLine();
		String NamePart=Name.substring(2);
		//System.out.println(Name.charAt(0));
		keyboard.close();
String fileName="contactsNew.csv";
File file= new File(fileName);

try {
	Scanner inputStream = new Scanner(file);
	while(inputStream.hasNext()){
		String data=inputStream.nextLine();//gets the whole line
		String[] words=data.split(",");
		//System.out.println(data+"**");
		if(Name.charAt(0)=='F'){
		//System.out.println(words[1]+"**");
		//String word1=words[1].substring(2);
		if(NamePart.equals(words[1])){System.out.println(words[0]+" "+words[30]);
		flag++;}
		//else{System.out.println("No such Contact Name");}
		}
		else if(Name.charAt(0)=='L'){
			//String word3=words[3].substring(2);
		//System.out.println(word3+"***");
			if(NamePart.equals(words[3])){System.out.println(words[0]+" "+words[30]); 
			flag++;
			}
			//else{System.out.println("No such Contact Name");}
			
			}
		
	}
	if(flag==0){System.out.println("No such Contact");}
	inputStream.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
