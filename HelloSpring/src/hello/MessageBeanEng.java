package hello;

public class MessageBeanEng implements MessageBean{

	@Override
	public void sayHello(String name) {
		System.out.println("hello"+name);
		
	}

}
