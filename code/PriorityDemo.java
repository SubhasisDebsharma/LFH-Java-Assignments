class GameThread extends Thread{
	String threadName;
	
	public GameThread(String name){
		threadName = name;
	}
	
	public void run(){
		System.out.println(threadName);
	}
}

class PriorityDemo{
	public static void main(String[] agrs){
		GameThread t1 = new GameThread("Thread 1");
		GameThread t2 = new GameThread("Thread 2");
		Thread r1 = new Thread(t1);
		Thread r2 = new Thread(t2);
		
		r1.setPriority(Thread.MIN_PRIORITY);
		r2.setPriority(Thread.MAX_PRIORITY);
		
		r1.start();
		r2.start();
	}
}