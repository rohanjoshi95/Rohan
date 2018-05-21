package study.reorganize;

import java.util.Scanner;

public class ReorganizeString {

	@SuppressWarnings("unused")
	public void reorganizeString()
	{
			System.out.println("Enter a String:");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int count = 0;
			String str = "";
			String string = scanner.next();
			char arr[] = string.toCharArray();
			for (int i = 0; i < arr.length - 1; i++) 
			{
				if (arr[i] != arr[i + 1]) 
				{
					System.out.println(string);
				}
					break;
				}

			for (int i = 0; i < arr.length - 1; i++)
			{

				if (arr[i] == arr[i + 1])
				{
					count++;
					continue;
				} 
				else 
				{
					char temp = arr[i];
					arr[i] = arr[i  + 1];
					arr[i + 1] = temp;
					str = String.valueOf(arr);
				}
			}
				if (count != 3) 
				{
					for (int i = 0; i < str.length() - 1; i++)
					{
						if (str.charAt(i) == str.charAt(i + 1)) 
						{
							System.out.println("null");
						} 
						else 
						{
							System.out.println("Organized String is " + str);
							break;
						}

					}

				}
				else 
				{
					System.out.println(str);
				}
			}

	}

	

