package myreactivejava.chapter2.subject;

import io.reactivex.subjects.BehaviorSubject;

public class MyBehaviorSubjectExample {
	
	public static void main(String[] args) throws InterruptedException {
		BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
		subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
		subject.onNext("1");
		subject.onNext("3");
		Thread.sleep(3000);
		subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
		subject.onNext("5");
		subject.onComplete();
	}
}
