package myreactivejava.chapter2;

import io.reactivex.Observable;

public class MyObservableFromArray {

	public static void main(String[] args) {
		Integer[] arr = {100, 200, 300};
		Observable.fromArray(arr).subscribe(System.out::println);
	}

}
