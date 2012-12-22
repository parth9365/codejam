/*

Problem

Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.

Input

The first line of input gives the number of cases, N.
N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.

Output

For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.

Limits

Small dataset

N = 5
1 ≤ L ≤ 25

Large dataset

N = 100
1 ≤ L ≤ 1000

Sample


Input 

3
this is a test
foobar
all your base

Output

Case #1: test a is this
Case #2: foobar
Case #3: base your all

*/

package code.google;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWords {
  public static void main(String ar[]){
		
		try {
			BufferedReader read=new BufferedReader(new FileReader("B-large-practice.in"));
			int N=Integer.parseInt(read.readLine());
			String s="";
			BufferedWriter writer = new BufferedWriter(new FileWriter("B-large-practice.txt", true));
			for(int i=0;i<N;i++){
				s=read.readLine();
				StringTokenizer tokenizer=new StringTokenizer(s," ");
				String[] word=new String[tokenizer.countTokens()];
				int j=0;
				while(tokenizer.hasMoreTokens()){
					word[j++]=tokenizer.nextToken();
				}
				StringBuffer st=new StringBuffer(word[j-1]);
				for(int k=(j-2);k>=0;k--){
					st.append(" "+word[k]);
				}
				writer.write("Case #"+(i+1)+": "+st.toString());
				writer.newLine();
				
			}
			writer.close();
			
		} catch (Exception e) {
			
		}
	}
}
