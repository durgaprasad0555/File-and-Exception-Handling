import java.util.*;
import java.io.*;
class File2{
	
	public static void main(String[] args)
	{
        try
        {
            File f=new File("Herovired.txt");
            FileWriter writer=new FileWriter("Herovired.txt");

            writer.write("Hero Vired |A Hero Group Company Hero Vired is a premium LearnTech company offering industry-relevant programs in partnership with world-class institutions to create the change-makers of tomorrow. Part of the rich legacy of the Hero Group, we aim to transform education in India by creating programs delivered by leading industry practitioners that help professionals and students enhance their skills.");
            
            int cnt=0;

            writer.close();
            Scanner reader =new Scanner(f);

            while(reader.hasNextLine())
            {
                String str=reader.nextLine();
                cnt+=str.length();
            }
            System.out.println(cnt+" "+f.getAbsolutePath());
        }

        catch (IOException e) 
        {
            System.out.println("An error occurred.");
        }
        
	}
}