package abstraction;

public class Wiring {
	public static void main(String[] args) {
		//wiring
		ISwitchBoardListener sListener = new HavellsAppliances();
		//HavellsAppliances(); //connecting switches to havells sockets
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(12);
		sListener.swithcFour();
	}


}
