package net.javaguides.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}

}


public static string reverseString(string input){
	string reverseString='';
	char[] charArray=input.toCharArry();
	int n=charArraynput.length;

	for(int i = n.length;i>-1;i--){
		reverseString+=charArray[i];
	}
	return reverseString();
}

public static int reverseNumber(int num){
	string s=num.tostring();
	int[] charArray= s.toCharArray();
	int n= charArray.length();
	string reverseString='';
	for(int i=n,i>-1,i++){
		reverseString+=charArray[i];
		s=int.parse(reverseString);
	}
	return s;
}

public static void reverseArray(int[] arr){
	int n=arr.length;
	int[] temp= new int[n];
	for(int i=0;i<n;i++){
		temp[i]=arr[n-1-i];
	}
	for(inti=0;i<n;i++){
		arr[i]=temp[i];
	}
}

public static int[] MergeArray(int[]array1, int[] array2)
{
	int[] array3=array2.concat(array1).toArray();
	Array.sort(array3);
}

public static int SecondlargestNumber(int[] arr){
	int largestNumber=-1;
	int secondtLargestNumber=-1;

	for(int i=0,i<arr.length;i++){
		if(largestNumber< arr[i])
			largestNumber=arr[i];

	}
	if(int i=0,i<arr.length;i++)
	{
			if(arr[i]>secondtLargestNumber&&arr[i]!=largestNumber


}
	public static void countVowelsandConsonate(){
		string inputString=louhnbergg;
		int vowelsCount=0;
		int constonentCount=0;
		int length=inputString.length;
		for(int i=0;i<length;i++){
			if(inputString[i]=="a")
		}
	}

	public static int findMatchingNumber(int[] arr)
	{
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1,j<length,j++)
			{
				if(arr[i]==arr(j))
					return arr[i];
			}
		}
	}
}

public static int numberOfcharacter(string input){
	char search="a";
	int count=0;
	for(int i=0;i<input.length;i++){
		if(input.CharAt[i]==search)
		{
			count++;
		}
	}

}
public static boolean anagrams(string input1,string input2)
{
	boolean anagrams=false;
	char[] charArray1=input1.toCharArray();
	char[] charArray2=input2.toCharArray();
	Array.sort(charArray1);
	Array.sort(charArray2);
	anagrams=Array.equals(charArray1,charArray1)


}