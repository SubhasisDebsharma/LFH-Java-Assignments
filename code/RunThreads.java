class PrintNumbersThread extends Thread{
	String name;
	public PrintNumbersThread(String threadName){
		name = threadName;
	}
	
	public void run(){
		int i;
		for(i = 0; i<10; i++){
			System.out.println(name+":"+i);
			try{
				sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class RunThreads{
	public static void main(String[] args){
		PrintNumbersThread t1 = new PrintNumbersThread("Thread A");
		PrintNumbersThread t2 = new PrintNumbersThread("Thread B");
		t1.start();
		t2.start();
	}
}