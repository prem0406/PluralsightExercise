import java.util.ArrayList;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MyClass> list = new ArrayList<>();
		MyClass v1 = new MyClass("a", "aaa");
		MyClass v2 = new MyClass("b", "bbb");
		MyClass v3 = new MyClass("c", "aaa");
		MyClass v4 = new MyClass("d", "ddd");
		MyClass v5 = new MyClass("e", "eee");
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		
		/*		
 		list.removeIf(new Predicate<MyClass>() {

			@Override
			public boolean test(MyClass m) {
				return m.getValue().equals("aaa");
			}		
		});
		*/
		
		/* Lamda Expression for above statement */
		
/*		list.removeIf(m -> {
			return m.getValue().equals("aaa");
		});*/
		
		/* Futher more short form */
		
		list.removeIf(m -> m.getValue().equals("aaa"));
		
		list.forEach(m -> System.out.println(m.getValue()));
	}

}

class MyClass {
	String key;
	String value;
	
	MyClass(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	String getValue() {
		return value;
	}
	
	String getLabel() {
		return key;
	}
}
