package kadai_015;

public class Car_Chapter15 {
	private int gear;
	private int speed;
	private int afterGear;
	
	 // コンストラクタ（初期化処理）
        public Car_Chapter15 ( int gear ,int speed) {
        this.gear  = gear;
        this.speed = speed;

    }
	public void gearchange(int afterGear) {
		switch(afterGear) {
	    case 1  -> this.speed = 10;
	    case 2  -> this.speed = 20;
	    case 3  -> this.speed = 30;
	    case 4  -> this.speed = 40;
	    case 5  -> this.speed = 50;
	    default -> this.speed = 10;
		}
		this.afterGear= afterGear;
		System.out.println("ギア" + this.gear +  "から"+ this.afterGear + 
				           "に切り替えました");
	}
	public void run( ) {
	System.out.println("時速は"+ this.speed + "kmです");

	}
}