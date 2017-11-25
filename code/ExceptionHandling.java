class ExceptionHandling{
	public static void main(String[] args){
		String name = null;
		try{
			try{
				System.out.println(10/0);
			}finally{}
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}finally{
			System.out.println("finally bloack");
		}
	}
}
