import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		//GameModel gameModel = new GameModel(20);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//GameController gameController = new GameController(10);
		
	}

}
