package myreactivejava.chapter2;

import io.reactivex.Observable;

public class FirstExample {
	public void emit() {
		Observable.just("Hello", "RxJava 2!!") // "Hello" 와  "RxJava 2!!" 발행
		.subscribe(System.out::println); // 구독
		// just 만 하면 데이터를 발행하지 않음
		// 데이터를 수신할 구독자가 subscribe 메소드를 호출해야 Observable 에서 데이터가 발행
		
		Observable.just(1, 2, 3, 4, 5, 6) // 1 ... 6 까지 총 6개의 인자를 1개씩 순서대로 발행
		.subscribe(System.out::println); // 구독
	}
	
	public static void main(String args[]) {
		FirstExample demo = new FirstExample();
		demo.emit();
	}
}
