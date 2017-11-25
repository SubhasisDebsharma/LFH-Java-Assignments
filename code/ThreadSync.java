class ThreadSync implements Runnable{
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		ThreadSync r = new ThreadSync();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();t2.start();t3.start();
	}
}