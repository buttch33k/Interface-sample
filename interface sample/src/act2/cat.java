package act2;

public class cat extends bone {
	public void bone() {
		System.out.println("jump on the bone");
	}
	
	public void play() {
		System.out.println("tacle play");
	}

	public static void main(String args[]) {
		cat animal = new cat();
		animal.bone();
		animal.play();
	}
}
