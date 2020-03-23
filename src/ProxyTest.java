import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @Description 动态代理的距离
 * @author  Boogie
 * @date 2020年3月16日下午4:21:15 
 *
 */
interface human{
	public void getBelief();
	public void eat(String food);
}
class Superman implements human{

	@Override
	public void getBelief() {
		System.out.println("I believe I can fly");
		
	}

	@Override
	public void  eat(String food) {
		System.out.println("I eat"+food);
		
	}
	
	
}
class ProxyFactory{

	
	public static Object getProxyInstance(Object obj) {
		MyInvocationHandler handler= new MyInvocationHandler();
		handler.bind(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
		
	}
	
}
class MyInvocationHandler implements InvocationHandler{

	private Object obj;//需要使用被代理类的对象进行赋值
	public void bind(Object obj) {
		this.obj=obj;
	}
	
	//当我们通过哟代理类的对象，调用方法时就会自动调用如下的方法
	//被代理类要执行的方法a的功能声明在invoke中
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		method 即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
		Object invoke = method.invoke(obj, args);
		return invoke ;
	}
	
}
public class ProxyTest {
	public static void main(String[] args) {
		Superman superMan= new Superman();
		human proxyInstance = (human) ProxyFactory.getProxyInstance(superMan);
		 proxyInstance.getBelief();
		 proxyInstance.eat("火锅");
		
	}
}
