interface P{
	int pvar = 5;
	public void displayP();
}

interface P1 extends P{
	int p1var = 10;
	public void displayP1();
}

interface P2 extends P{
	int p2var = 15;
	public void displayP2();
}

interface P12 extends P1,P2{
	int p12var = 20;
	public void displayP12();
}

class Q implements P12{
	public void displayP12(){
		System.out.println(P12.p12var);
	}
	public void displayP1(){
		System.out.println(P1.p1var);
	}
	public void displayP2(){
		System.out.println(P2.p2var);
	}
	public void displayP(){
		System.out.println(P.pvar);
	}
}

class MultipleInheritanceDemo{
	public static void main(String args[]){
		Q q = new Q();
		q.displayP12();
		q.displayP1();
		q.displayP2();
		q.displayP();
	}
}