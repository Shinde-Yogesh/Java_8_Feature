package java_8_Feature;

@FunctionalInterface
interface Sample
{
//	public void zero();
	public void say();
}
public class Lambda_Example {
	public static void main(String[] args) {
		
//		// BiConsumer is the consume the data and nothing have return
////		BiConsumer is an functional interface
//		BiConsumer<Integer, Integer> mutiplication = (x,y)->System.out.println(x*y);
//		BiConsumer<Integer, Integer> consumer = (Integer a, Integer b)->System.out.println(a+b);
//		consumer.accept(40,50);
//		mutiplication.accept(40,50);
		Sample sample = () -> System.out.println("Hello");
		sample.say();
	
	}


}