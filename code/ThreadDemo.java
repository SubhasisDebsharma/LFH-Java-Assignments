class HelloThread extends Thread{
	public void run(){
		System.out.println("Hello Thread");
	}
}

class ThreadDemo{
	public static void main(String[] args){
		Thread t1 = new Thread(new HelloThread());
		t1.start();
	}
}