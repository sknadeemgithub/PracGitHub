package ArrayAssignment;

import java.util.Scanner;

public class Thirteen {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.print("Enter the number which you want to reverse: ");
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			System.out.print("The reverse of the entered number is:");
			revNum(num);
			
		}

		public static void revNum(int num) {
			
			{
				if(num<10)
				{
					System.out.print(num);
				}
				else
				{
					System.out.print(num%10);
					revNum(num/10);
				}
			}

		}
		
	}
