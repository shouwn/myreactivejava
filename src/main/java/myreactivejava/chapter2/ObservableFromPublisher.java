package myreactivejava.chapter2;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import io.reactivex.Observable;

public class ObservableFromPublisher {

	public static void main(String[] args) {
		Publisher<String> publisher = (Subscriber<? super String> s) -> {
			s.onNext("Hello Observable.fromPublisher()");
			s.onComplete();
		};
		
		Observable.fromPublisher(publisher).subscribe(System.out::println);
	}

}
