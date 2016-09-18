//reads file, returns it as a String; deleting repeating spaces
import java.io.*;
public class Start
{
   static String readFile(String fileName) throws IOException
      {
       BufferedReader br = new BufferedReader(new FileReader(fileName));
       try {
           StringBuilder sb = new StringBuilder();
           String line = br.readLine();

           while (line != null)
              {
               sb.append(line);
               sb.append("\n");
               line = br.readLine();
              }
              for(int i=0;i<sb.length();i++)
			              {
			  				if((sb.charAt(i)==' ')&&(sb.charAt(i+1)==' '))
			  				  {sb.deleteCharAt(i+1);i--;}
		                  }
           return sb.toString();
            }
       finally{br.close();}
       }
}
