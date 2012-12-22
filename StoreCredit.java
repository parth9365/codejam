/*
Problem : Store Credit

Problem

You receive a credit C at a local store and would like to buy two items. You first walk through the store and create a list L of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).

Input

The first line of input gives the number of cases, N. N test cases follow. For each test case there will be:

One line containing the value C, the amount of credit you have at the store.
One line containing the value I, the number of items in the store.
One line containing a space separated list of I integers. Each integer P indicates the price of an item in the store.
Each test case will have exactly one solution.
Output

For each test case, output one line containing "Case #x: " followed by the indices of the two items whose price adds up to the store credit. The lower index should be output first.

Limits

5 ≤ C ≤ 1000
1 ≤ P ≤ 1000

Small dataset

N = 10
3 ≤ I ≤ 100

Large dataset

N = 50
3 ≤ I ≤ 2000

Sample


Input:
3
100
3
5 75 25
200
7
150 24 79 50 88 345 3
8
8
2 1 9 4 4 56 90 3

Output :
Case #1: 2 3
Case #2: 1 4
Case #3: 4 5


Solution:
*/
package code.google;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StoreCredit {
  public static void main(String ar[]){
		try {
			BufferedReader read=new BufferedReader(new FileReader("A-large-practice.in"));
			BufferedWriter writer=new BufferedWriter(new FileWriter("A-large-practice.out",true));
			int N=Integer.parseInt(read.readLine());
			System.out.println(N);
			int C, I;
			int[] p;
			for(int n=0;n<N;n++){
				C=Integer.parseInt(read.readLine());
				I=Integer.parseInt(read.readLine());
				p=new int[I];
				String st=read.readLine();
				StringTokenizer tokenizer=new StringTokenizer(st," ");
				int i=0;
				while(tokenizer.hasMoreTokens()){
					p[i]=Integer.parseInt(tokenizer.nextToken());
					i++;
				}
				StoreCredit sc=new StoreCredit();
				String ans=sc.solve(C,I,p);
				
				writer.write("Case #"+(n+1)+": "+ans);
				writer.newLine();
			}
			writer.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String solve(int c, int i, int[] p) {
		String nums = "";
		for(int m=0;m<i;m++){
			for(int j=0;j<i && j!=m;j++){
				int l=p[j]+p[m];

				if(l==c){
					nums=(j+1)+" "+(m+1);
				}
			}
		}
		return nums.toString();
	}
}
