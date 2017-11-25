class ThrowsException{
	public static void main(String[] args){
		try{
			throw new Exception("Test Exception");
		}catch(Exception e){
			e.printStackTrace();
		}
		doStuff();
	}
	
	static void doStuff() throws Exception{
		doMoreStuff();
	}
	static void doMoreStuff() throws Exception{
		throw new Exception("Do more stuff");
	}
}  
