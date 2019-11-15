package act3;

public class test3 {
	public String name(String a) {
		return a;
	}
	public String name(String a,String b) {
		return a + b;
	}
	public String name(String a,String b,String c) {
		return a + b +c;
	}
	public static void main(String args[]) {
		test3 test = new test3();
		System.out.println(test.name("yeah"));
		System.out.println(test.name("yeah"," ","tapos"));
		System.out.println(test.name("yeah"));
	}
}
