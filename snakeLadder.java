class SnakeLadder{

	void play(){
		int if_Ladder = 4;
		int if_Snake = 5;
		int if_noPlay = 0;
		int player_Position=0;
		int dice_num = (int) (Math.floor(Math.random() *10) % 7);
		if(dice_num == if_noPlay){
			System.out.println("player no play and get  number="+player_Position);
		}else if(dice_num == if_Ladder){
			player_Position = player_Position + dice_num;
			System.out.println("Player at Ladder and get number="+player_Position);
		}else if(dice_num == if_Snake){
			if(player_Position == 0){
				player_Position = player_Position;
			}else{
				player_Position = player_Position - dice_num;
			}
			System.out.println("player at Snake and get number="+player_Position);
		}else{
			player_Position = player_Position + dice_num;
			System.out.println("player play at number="+player_Position);
		}

	}
	public static void main(String[] argv){
	SnakeLadder obj = new SnakeLadder();
	obj.play();
	}
}
