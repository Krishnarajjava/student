package prepertion5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInter {
	public static void main(String[] args) {
		Supplier<String> a=()->"Krish";
		System.out.println(a.get());
	
	Consumer<Integer> b=x-> {
		if(x>18) {
			System.out.println("Voter");
		}
		else {
			System.out.println("Not a Voter");
		}
	};
	b.accept(18);
	
	Function<String, Integer> c=y->y.length();
	System.out.println(c.apply("Ajith"));
	
	Predicate<String> d=z->z.contains("a");
	System.out.println(d.test("ajith"));
}

}
