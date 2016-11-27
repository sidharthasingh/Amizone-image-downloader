import java.nio.*;
import java.nio.file.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;
class download
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter path of saved image :");
		String pt=sc.nextLine();
		System.out.print("Enter start login number : ");
		int ll=sc.nextInt();
		System.out.print("Enter end login number   : ");
		int ul=sc.nextInt();
		String s=new String("https://amizone.net//Amizone//Images//Signatures//");
		Path target;
		URL website;
		for(int roll_number=ll;roll_number<=ul;roll_number++)
		{
			try{
				website = new URL(s+roll_number+"_P.png");
				target=Paths.get(pt+roll_number+"_P.png");
				try (InputStream in = website.openStream()) {
				    Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
				    System.out.println(roll_number+" done");
				}
				catch(Exception e)
				{
					System.out.println(roll_number+"_P.png"+" Error in opening the stream");
				}
			}
			catch(Exception e)
			{
				System.out.println(roll_number+"_P.png"+" Error in opening the link");
			}
			// try{
			// 	website = new URL(s+roll_number+"_S.png");
			// 	target=Paths.get("C:\\Users\\SIDHARTHA\\mywork\\java\\Amizone_hack\\"+roll_number+"_S.png");
			// 	try (InputStream in = website.openStream()) {
			// 	    Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
			// 	    System.out.println(roll_number+" done");
			// 	}
			// 	catch(Exception e)
			// 	{
			// 		System.out.println(roll_number+"_S.png"+" Error in opening the stream");
			// 	}
			// }
			// catch(Exception e)
			// {
			// 	System.out.println(roll_number+"_S.png"+" Error in opening the link");
			// }
		}
	}
}