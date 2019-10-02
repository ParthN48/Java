class TypeWriter extends Thread {
	String msg;

	TypeWriter(String msg) {
		this.msg = msg;
		Thread t = new Thread(this);
	}

	public void run() {
		try {
			int length = msg.length();
			for(int i = 0; i < length; i++) {
				System.out.print(msg.charAt(i));
				Thread.sleep(400);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		TypeWriter tw = new TypeWriter("Thread 1");
		try {
			tw.start();
			tw.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		TypeWriter tw1 = new TypeWriter("Thread 2");
		try {
			tw1.start();
			tw1.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		TypeWriter tw2 = new TypeWriter("Thread 3");
		try {
			tw2.start();
			tw2.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		TypeWriter tw3 = new TypeWriter("Thread 4");
		tw3.start();
	}
}