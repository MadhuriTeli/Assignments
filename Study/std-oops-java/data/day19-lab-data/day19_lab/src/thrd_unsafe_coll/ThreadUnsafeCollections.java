package thrd_unsafe_coll;

import java.util.*;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>(10000);
		for (int i = 0; i < 10000; i++)
			list.add(i);
		// Thread(Runnable instance,String name)
		Thread reader = new Thread(() -> {

			synchronized (list) {

				list.forEach(i -> {
					System.out.println(i);
					try {
						Thread.sleep(13);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			}

		});

		Thread writer = new Thread(() -> {
			try {
				for (int i = 10000; i < 20000; i++) {
					synchronized (list) {
						list.add(i);
					}

					Thread.sleep(17);
				}
			} catch (Exception e) {
				System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);

			}
		}, "t2");
		reader.start();
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}