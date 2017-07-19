package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//重写方法还是alt+/ok
//demo2.html的位置是在/webcontent
//form action地址是web.xml中的配置地址
//url-pattern是设置project启动优先级的。
public class servletdemo2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7275180036235337762L;

	public servletdemo2() {
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("geting!!!!!!");
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("posting!!!!!");
}
}
