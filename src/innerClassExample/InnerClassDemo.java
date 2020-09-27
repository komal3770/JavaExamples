package innerClassExample;

/**
 * 
NESTED INNER CLASS : 
Declared as an instance member of another class.
They can have all types of access modifiers in their declaration
They have access to all members of the enclosing class, regardless of whether they are static or non-static
They can only define instance members

 */
public class InnerClassDemo {

	private int privateVar;
	private static int privateStaticVar;
	protected int protectedVar;
	private final int privateFinalVar=1;
	
	//Inner Class
	class InnerClass{
		private int innerClassPrivateVar;
		protected static final int innerStaticPrivate=8;
		
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
	public static void setZ(int z) {
		InnerClassDemo.privateStaticVar = z;
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
		InnerClassDemo outer = new InnerClassDemo();
		InnerClassDemo.InnerClass obj = outer.new InnerClass();
		System.out.println(outer.privateFinalVar);
		System.out.println(outer.privateVar);
		System.out.println(outer.protectedVar);
		System.out.println(InnerClassDemo.privateStaticVar);
		System.out.println(obj.innerClassPrivateVar);
	}

}
