package testJava;

public class method_overloading {

	public static void main(String[] args) {
		method_overloading m=new method_overloading();
		System.out.println(m.add(10,20));
		System.out.println(m.add(5, 6, 12));
		m.add(10.5, 20.5, 15.5);
		System.out.println(m.sub(5, 10, 20));
		m.mul(4, 5, 2);
		System.out.println("This is an example of method overloading");
		
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
    public int add(int i,int j,int k) {
    	int K=i+j+k;
    	return K;
    }
    public void  add(double i,double j, double k) {
    	double g=i+j+k;
    	System.out.println(g);
    }
    public int sub(int x,int y, int z) {
    	int K=x-y-z;
    	return K;
    }
    public void mul(int x,int y,int z) {
    	int w=x*y*z;
    	System.out.println(w);
    }
    
}
