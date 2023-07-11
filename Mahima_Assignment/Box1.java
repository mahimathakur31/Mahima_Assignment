package pack1;


public class Box1 {

	public static void main(String[] args) {
        Box myBox = new Box(10.0, 5.0, 3.0);
        double volume = myBox.volume();
        System.out.println("Volume of the box: " + volume);
    }

}
