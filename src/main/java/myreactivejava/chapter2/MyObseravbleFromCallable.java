package myreactivejava.chapter2;

import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class MyObseravbleFromCallable {

	public static void main(String[] args) {
		Callable<String> callable = () ->{
			Thread.sleep(1000);
			return "Hello Callable";
		};
		
		Observable.fromCallable(callable).subscribe(System.out::println);
	}

}
