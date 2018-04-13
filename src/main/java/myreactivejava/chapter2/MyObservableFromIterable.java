package myreactivejava.chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import io.reactivex.Observable;

public class MyObservableFromIterable {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Jerry");
		names.add("Bob");
		names.add("Lili");
		BlockingQueue<Order> orderQueue = new ArrayBlockingQueue<>(100);
		for(int i : new int[]{1, 2, 3})
			orderQueue.add(new Order("ORD-" + i));
		
		Observable.fromIterable(names).subscribe(System.out::println);
		Observable.fromIterable(orderQueue).subscribe(System.out::println);
	}
}

class Test{
	public static final Map<String, Integer> map;
	
	static {
		map = new HashMap<>();
		map.put("1", 1);
	}
	
	public static void print() {
		System.out.println(map.get("1"));
	}
}

class Order {
	private String mId;

	public Order(String mId) {
		super();
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "Order Id = " + mId;
	}
	
}