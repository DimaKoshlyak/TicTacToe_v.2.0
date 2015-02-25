package ua.dimakoshlyak;

public class TTTLogic {
	private boolean isWin = false;

	public void getWinner(int[] arr){
		if((arr[0]+arr[1]+arr[2]==3)||(arr[3]+arr[4]+arr[5]==3)||(arr[6]+arr[7]+arr[8]==3)||(arr[0]+arr[3]+arr[6]==3)||
				(arr[1]+arr[4]+arr[7]==3)||(arr[2]+arr[5]+arr[8]==3)||(arr[0]+arr[4]+arr[8]==3)||(arr[2]+arr[4]+arr[6]==3)){
			System.out.println("player 1 Win!");
			isWin=true;
		}else if((arr[0]+arr[1]+arr[2]==-3)||(arr[3]+arr[4]+arr[5]==-3)||(arr[6]+arr[7]+arr[8]==-3)||(arr[0]+arr[3]+arr[6]==-3)||
				(arr[1]+arr[4]+arr[7]==-3)||(arr[2]+arr[5]+arr[8]==-3)||(arr[0]+arr[4]+arr[8]==-3)||(arr[2]+arr[4]+arr[6]==-3)){
			System.out.println("Player 2 win!");
			isWin = true;
		}
	}
	
	public boolean isWin() {
		return isWin;
	}
}
