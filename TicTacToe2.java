package ua.dimakoshlyak;

import java.util.Scanner;

public class TicTacToe2 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		int move = 0;
		boolean isCorrect = false;
		for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					input(arr,"Player1 move!",1);
//					isCorrect = false;
//					while(!isCorrect){
//					move = keyboard("Player1 move!");
//					if (arr[move-1]==0){
//						arr[move - 1] = 1;
//						isCorrect = true;
//					} else {
//						System.out.println("Select the correct place!");
//					}
//					}
				} else {
					input(arr,"Player2 move!",-1);
//					isCorrect = false;
//					while(!isCorrect){
//					move = keyboard("Player2 move!");
//					if (arr[move-1]==0){
//						arr[move - 1] = -1;
//						isCorrect = true;
//					} else {
//						System.out.println("Select the correct place!");
//					}
//					}
				}
			
				showArray(arr);
				TTTLogic l = new TTTLogic();
				l.getWinner(arr);
				if (l.isWin() == true) {
					break;
				}
				if (i==8) {
					System.out.println("No one wins! Try again!");
				}
		}
		}
	public static void input(int[] arr, String playerN, int rez){
		boolean isCorrect = false;
		int move = 0;
		while(!isCorrect){
		move = keyboard(playerN);
		if (arr[move-1]==0){
			arr[move - 1] = rez;
			isCorrect = true;
		} else {
			System.out.println("Select the correct place!");
		}
		}

	}
	
	public static void showArray(int[] arr){
		for (int i=0; i<arr.length;){
			System.out.printf(" %s | %s | %s ",(arr[i]==1)? "X": (arr[i]== -1)?"0":"-",
								   (arr[i+1]==1)? "X": (arr[i+1]== -1)?"0":"-",
								   (arr[i+2]==1)? "X": (arr[i+2]== -1)?"0":"-");
			System.out.println("");
			if ((i==0)||(i==3)){
				System.out.println("-----------");
			}
			i+=3;
		}
	}
	
	public static int keyboard(String message){
		boolean isCorrect = false;
		int rez = 1;
		Scanner scanner = new Scanner(System.in);
		while(!isCorrect){
			System.out.println(message + " :");
			System.out.println("Please enter the number from 1 to 9");
			rez = scanner.nextInt();
			if ((rez >=1)&&(rez<=9)){
				isCorrect = true;
			}
		}
		
		return rez;
	}
}