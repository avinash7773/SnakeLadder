class SnakeLadder{

	void play(){
		int dice_num = (int) (Math.floor(Math.random() *10) % 6) +1;
		System.out.println(dice_num);
	}
	public static void main(String[] argv){
	SnakeLadder obj = new SnakeLadder();
	obj.play();
	}
}
