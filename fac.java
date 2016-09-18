//Takes allmotifs compares with available array of unique motifs and returns frequencies.
import java.io.*;
import java.util.*;
public class fac extends Start
{
 public static void main(String[] args)throws IOException
 {
	 String c=readFile("allfactors.txt");//forming string of unique motifs
	         String[] fa=c.split("\n");
	         int n=fa.length;
	         int m=26;//sample size
	 FileWriter pw = new FileWriter("mono.csv",true);//writing first row
	         pw.append(" ");pw.append(",");

	 int[][] a=new int[n][m];
	 for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=0;//initialize all frequencies to zero

 for(int p=97;p<123;p++)
 {
	 String s=""+(char)(p)+".txt";
	 pw.append((char)(p));pw.append(",");
     String b=readFile(s);
	 String[] fb=b.split("\n");//storing every mofif present
	 int t=0;//pointer for fb
	 for(int k=0;k<n;k++)
	 {
		 for(int j=0;j<fb.length;j++)//j=t and else {t=j;break;} if motifs are arranged
		 {
			 if(fa[k].equals(fb[j]))
			 a[k][p-97]=a[k][p-97]+1;
		 }
     }
}
pw.append("\n");

for(int i=0;i<n;i++)
 {
     pw.append(fa[i]);pw.append(",");
	 for(int j=0;j<m;j++){pw.append(String.valueOf(a[i][j]));pw.append(",");}
	 pw.append("\n");
 }
pw.flush();
pw.close();

}
}
