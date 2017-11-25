class RunnaleThread implements Runnable{
	public void run(){
		System.out.println("Run method overriden");
	}
}

class RunnableDemo{
	public static void main(String[] args){
		RunnaleThread rt = new RunnaleThread();
		Thread t1 = new Thread(rt);
		rt.();
	}
}