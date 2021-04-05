class SnakeLadder{

	void play(){
		int if_Ladder = 4;
		int if_Snake = 5;
		int if_noPlay = 0;
		int player_Position=0;
		int winning_Position=100;
		int dice_played=0;
		while(player_Position < winning_Position){
			int dice_num = (int) (Math.floor(Math.random() *10) % 7);
			dice_played++;

			if(dice_num == if_noPlay){
				System.out.println("player no play and get  number="+player_Position);
			}else if(dice_num == if_Ladder){
					player_Position = player_Position + dice_num;
					if(player_Position > winning_Position){
						player_Position=player_Position - dice_num;
					}
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
				if(player_Position > winning_Position){
					player_Position=player_Position - dice_num;
				}
				System.out.println("player play at number="+player_Position);
			}
		}
		System.out.println("Player win");
		System.out.println("NUmber of time dice was used="+dice_played);

	}


	public static void main(String[] argv){
	SnakeLadder obj = new SnakeLadder();
	obj.play();
	}
}
