import java.io.*;
import java.util.Scanner;
public class NameSearch{

public static void main(String [] args)throws IOException{

Scanner scanner =new Scanner(System.in);


File myFile	= new File("BoyNames.txt");//links the BoyName.txt file and stores the link with a reference
Scanner input =new Scanner(myFile);//checks through the file to view what it contains

File file = new File("GirlNames.txt");//links the GirlName.txt file and stores the link with a reference
Scanner inputFile =new Scanner(file);//checks through the file to view what it contains

String name;//string variable that holds the name the user searched for

System.out.println("Enter the name you want to check");//prints out a message asking the user to enter the name to be searched
name = scanner.nextLine();//allows the user to enter the name

if(myFile.exists() | file.exists()){//condition that must be followed before others can be executed
FileReader fr = new FileReader(myFile);//reades the Boy.txtfile
FileReader fa = new FileReader(file);//reades the Girl.txt file
LineNumberReader lnr = new LineNumberReader(fr);//gets the total amount of lines in the BoyName.txt file
LineNumberReader rem = new LineNumberReader(fa);//gets the total amount of lines in the GirlName.txt file
int num=0;//int variable that holds the number of lines in the BoyName.txt file
int keg=0;//int variable that holds the number of lines in the GirlName.txt file
while(lnr.readLine() !=null){//a condition if there are lines ion the BoyName.txt file
	num++;//keeps track of the total amount of lines in the BoyName.txt file
}
lnr.close();//closes the method
while(rem.readLine() !=null){//a condition if there are lines in the BoyName.txt file
	keg++;//keeps track of the total amount of lines in the GirlName.txt file
}
rem.close();//closes the method

String[] boy = new String[num];//an array with a string variable that holds all names with the total size of the array in the BoyName.txt file
String[] girl = new String[keg];//an array with a string variable that holds the total number of names with the size of the array in the GirlName.txt file
int i=0;//int variable that holds a value
int x=0;//int variable that holds a value
while (input.hasNext() && i < boy.length){//a loop that states a condition which must be followed and done
	boy[i]= input.nextLine();//allocates a number each name on each line ine theBoyName.txt file
i++;//increases the number of i by one each time the loop iterates
}
input.close();//ends the method
while (inputFile.hasNext() && x < girl.length){//a loop that states a condition which must be followed and done
	girl[x]= inputFile.nextLine();//allocates a number each name on each line ine theBoyName.txt file
	x++;//increases the number of x by one each time the loop iterates
}
inputFile.close();//closes and nds the method
boolean found =false;//contains a boolean value
for(int index = 0;index< boy.length; index++){//a loop that states a condition which must be followed and done
	if(boy[index].equalsIgnoreCase(name)){//states a condition if the name the user typed in is found in the BoyName.txt file
	found = true;//sets the boolean expression to true
	System.out.println("Yes the name " + name + " was found among the most popular during that year");//prints ou a message to the user saying the name was foud among the most popular that year
}
}
for(int index = 0;index< girl.length; index++){//a loop that states a condition which must be followed and done
	if(girl[index].equalsIgnoreCase(name)){//states a condition if the name the user typed in is found in the GirlName.txt file
	found = true;//sets the boolean expression to true
	System.out.println("Yes the name " + name + " was found among the most popular during that year");//prints ou a message to the user saying the name was foud among the most popular that year
}
}
	if (found != true){//a condition to be followed if the boolean expression is not true
	System.out.println("The name " + name + " was not found among the most popular that year");//prints out a message to the user saying thst the name wasnt found among the most popular that year
}
}
}
}