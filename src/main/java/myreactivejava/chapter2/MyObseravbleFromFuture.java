package myreactivejava.chapter2;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.reactivex.Observable;

public class MyObseravbleFromFuture {

	public static void main(String[] args) {
		
		Future<String> future = Executors.newSingleThreadExecutor().submit(() ->{
			Thread.sleep(1000);
			return "Hello Future";
		});
		
		Observable.fromFuture(future).subscribe(System.out::println);
	}

}
