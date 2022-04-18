package sec1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello siri");
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("이름은 무엇입니까 ? ");
		name = sc.next();
		System.out.println("이름은 : " + name + "입니다.");

	}

}
