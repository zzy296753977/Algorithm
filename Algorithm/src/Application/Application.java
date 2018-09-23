package Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import String.StringEditDistance;




public class Application {
	
	public static void main(String[] args) {
		StringEditDistance s = new StringEditDistance();
		s.function();
		
	}
	
	
	private static class Desk
	{
		int max;
		boolean isEmpty;		
		public Desk(boolean isEmpty, int max) {
			super();
			this.isEmpty = isEmpty;
			this.max = max;
		}
		public boolean isEmpty() {
			return isEmpty;
		}
		public void setEmpty(boolean isEmpty) {
			this.isEmpty = isEmpty;
		}
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		@Override
		public String toString() {
			return "Desk [isEmpty=" + isEmpty + ", max=" + max + "]";
		}
		
	}
	private static class Consumer
	{
		int peopleNum;
		int consumeNum;
		
		public Consumer(int peopleNum, int consumeNum) {
			super();
			this.peopleNum = peopleNum;
			this.consumeNum = consumeNum;
		}
		public int getPeopleNum() {
			return peopleNum;
		}
		public void setPeopleNum(int peopleNum) {
			this.peopleNum = peopleNum;
		}
		public int getConsumeNum() {
			return consumeNum;
		}
		public void setConsumeNum(int consumeNum) {
			this.consumeNum = consumeNum;
		}
		@Override
		public String toString() {
			return "Consumer [peopleNum=" + peopleNum + ", consumeNum="
					+ consumeNum + "]";
		}
		
	}
	
}


/*Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String [] inputs = input.split("\\s+");
int [] scores = new int[inputs.length];
String target = inputs[0];
String [] results = new String[3];
for(int i=1;i<inputs.length;i++)
{
	scores[i]=Math.abs(target.length()-inputs[i].length())*3;
	for(int j=0;j<target.length();j++)
	{
	if(inputs[i].length()<target.length())
		{
			for(int k=0;k<Math.abs(target.length()-inputs[i].length());k++)
			{
				inputs[i]=inputs[i]+" ";
			}
		}
		if(inputs[i].charAt(j)!=target.charAt(j))
		{
			scores[i]++;
		}
	}
}
for(Integer score:scores)
{
	System.out.println(score);
}
int [] score = new int[3];
for(int i=0;i<3;i++)
{
	score[i]=0;
}
for(int j=0;j<3;j++)
{
	int min = 1000000;
	int minIndex=1;
	for(int i=1;i<scores.length;i++)
    {
    	if(min>scores[i])
    	{
    		min = scores[i];
    		minIndex = i;
    	}
    }
	scores[minIndex]=10000000;
	score[j]=minIndex;
}
System.out.println(inputs[score[0]]+" "+inputs[score[1]]+" "+inputs[score[2]]);   */

