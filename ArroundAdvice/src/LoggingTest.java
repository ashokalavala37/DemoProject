import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAspect;

public class LoggingTest {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvice(new LoggingAspect());
		Calculator proxy = (Calculator) proxyFactory.getProxy();
		System.out.println("sum is" + proxy.add(10, 20));
	}

}
