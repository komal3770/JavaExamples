package innerClassExample;

public class PrivateInnerClass {
	private int privateVar;
	private static int privateStaticVar;
	protected int protectedVar;
	private final int privateFinalVar=1;
	
	//Inner Class
	private class InnerClass{
			private int innerClassPrivateVar;
			
			public InnerClass() {
				this.innerClassPrivateVar = privateFinalVar;
				privateVar=13;
				privateStaticVar=6;
				protectedVar=5;
			}

			public int getInnerClassPrivateVar() {
				return innerClassPrivateVar;
			}

			public void setInnerClassPrivateVar(int innerClassPrivateVar) {
				this.innerClassPrivateVar = innerClassPrivateVar;
			}
			
		}
		
		public int getX() {
			return privateVar;
		}
		public void setX(int x) {
			this.privateVar = x;
		}
		public static int getZ() {
			return privateStaticVar;
		}
		public int getA() {
			return protectedVar;
		}
		public void setA(int a) {
			this.protectedVar = a;
		}
		public int getB() {
			return privateFinalVar;
		}
		
	public static void main(String[] args) {
		PrivateInnerClass outer = new PrivateInnerClass();
		PrivateInnerClass.InnerClass obj = outer.new InnerClass();
		obj.setInnerClassPrivateVar(566);
		System.out.println(obj.getInnerClassPrivateVar());
	}
	
}
