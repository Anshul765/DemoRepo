package oops;

public class interface_extend implements oops_interface {

	@Override
	public void car() {
		System.out.println("inside implemented function 1");
	}

	@Override
	public void brand() {
		System.out.println("value of a is :"+a);
		System.out.println("inside implemented function 2");
		
	}

	@Override
	public void fuel() {
		System.out.println("value of b is :"+b);
		System.out.println("inside implemented function 3");		
	}

	public void myrange() {
		System.out.println("value of c is :"+c);
		System.out.println("Yes in range");
	}
}
