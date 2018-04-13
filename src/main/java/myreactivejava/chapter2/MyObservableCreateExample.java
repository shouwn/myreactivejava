package myreactivejava.chapter2;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class MyObservableCreateExample {

	public static void main(String[] args) {
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter) -> {
					emitter.onNext(100); // 100 발행
					emitter.onNext(200); // 200 발행
					emitter.onNext(300); // 300 발행
					emitter.onComplete(); // 모든 발행이 끝났다고 알림
				});
		
		source.subscribe(
				data -> System.out.println("Data : " + data));
	}

}
