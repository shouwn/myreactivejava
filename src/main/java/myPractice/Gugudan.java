package myPractice;

import java.util.Scanner;

import io.reactivex.Observable;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int input;
		input = Integer.valueOf(scan.nextInt());

		scan.close();
		System.out.println("start");
		
		Observable.just(input)
		.flatMap(num -> Observable.range(1,  9)
			.map(row -> num + " X " + row + " = " + row * num))
		.subscribe(System.out::println);
	}

}
