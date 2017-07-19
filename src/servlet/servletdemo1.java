package servlet;

//模拟servlet
//1,servletdemo1 继承自 javax servlet.
//2,重写方法
//3,配置srervlet,ps：servlet-class是class的全路径
//4,tomcat 启动，http://localhost:8080/servlet/demo1
//ps:url-pattern是基于servlet的，不是servletdemo1.
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servletdemo1 implements Servlet{

	@Override
	public void destroy() {
		System.out.println("ok,it's fine,bye!!!!!!");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		System.out.println("first time tos see you,initing!!!!!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("like a spring to your mind,serviceing!!!!!");
		
	}

}
