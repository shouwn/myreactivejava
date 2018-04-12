package myreactivejava;

import io.reactivex.Observable;

public class FirstExample {
	public void emit() {
		Observable.just("Hello", "RxJava 2!!") // "Hello" 와  "RxJava 2!!" 발행
		.subscribe(System.out::println); // 구독
		// just 만 하면 데이터를 발행하지 않음
		// 데이터를 수신할 구독자가 subscribe 메소드를 호출해야 Observable 에서 데이터가 발행
	}
	
	public static void main(String args[]) {
		FirstExample demo = new FirstExample();
		demo.emit();
	}
}
