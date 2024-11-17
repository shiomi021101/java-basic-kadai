package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車オブジェクトを作成
        Car_Chapter15 car = new Car_Chapter15();
        
        // ギアチェンジと走行
        car.gearChange(3); // ギアを3に変更
        car.run(); // 速度を表示
	}

}
