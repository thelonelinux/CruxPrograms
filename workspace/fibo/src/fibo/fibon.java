package fibo;

import java.util.Scanner;

public class fibon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		int col=1;
		int i=1;
		int sum=0;
		while (row<=4){
			col=1;
			while(col<=row)
			{
				System.out.print(i);
				sum=sum+i;
				i=sum;
				i++;
				col++;
				
				}
			}row++;

}}