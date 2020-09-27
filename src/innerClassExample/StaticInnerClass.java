package innerClassExample;

public class StaticInnerClass {
	private int privateVar;
	private static int privateStaticVar;
	protected int protectedVar;
	private final int privateFinalVar=1;
	
	//Inner Class
	static class InnerClass{
			private int innerClassPrivateVar;
			
			public int getInnerClassPrivateVar() {
				return innerClassPrivateVar;
			}


			public void setInnerClassPrivateVar(int innerClassPrivateVar) {
				this.innerClassPrivateVar = innerClassPrivateVar;
			}



			public InnerClass() {
				this.innerClassPrivateVar = privateStaticVar;
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
		StaticInnerClass.InnerClass obj = new StaticInnerClass.InnerClass();
		System.out.println(obj.innerClassPrivateVar);
	}

}
