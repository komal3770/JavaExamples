package immutableClass;

import java.util.ArrayList;
import java.util.List;

final class ImmutableDemo {
	private final String a;
	private final int b;
	private final DemoClass d;
	private final List<String> list;
	
	public ImmutableDemo() {
		this.a = "test";
		this.b = 0;
		this.d = new DemoClass();
		this.list = new ArrayList<>();
	}
	
	public ImmutableDemo(String a, int b, DemoClass d, List<String> list) {
		super();
		this.a = a;
		this.b = b;
		this.d = new DemoClass();
		this.d.setC(d.getC());
		List<String> l2 = new ArrayList<>();
		for (String string : list) {
			l2.add(string);
		}
		this.list = l2;
	}

	//public getter
	public String getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public List<String> getList() {
		List<String> l2 = new ArrayList<>();
		for (String string : this.list) {
			l2.add(string);
		}
		return l2;
	}

	public DemoClass getD() {
		DemoClass d2 = new DemoClass();
		d2.setC(this.d.getC());
		return d2;
	}
}

class DemoClass{
	private String c;

	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		d.setC("demo1");
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		ImmutableDemo im1 = new ImmutableDemo("a",12,d,list);
		//List object modified by immutable methods
		im1.getList().add("C");
		im1.getList().add("D");
		for(String s : im1.getList()) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		ImmutableDemo im2 = new ImmutableDemo("b",14,d,list);
		for(String s : im2.getList()) {
			System.out.println(s);
		}
		
		//List object directly modified
		System.out.println("--------------------------------------------");
		list.add("E");
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
