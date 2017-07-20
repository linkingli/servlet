package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletdemo4
 */
public class servletdemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, String[]> map = request.getParameterMap();
	   Set<String> keyset = map.keySet();
	   for(String string :keyset)
	   {
		   System.out.println(string);
		   System.out.println(map.get(string));
	   }
	   //获取属性
	   Enumeration<String> names = request.getParameterNames();
	   while(names.hasMoreElements())
	   {
		   String element=names.nextElement();
		   System.out.println(element);
	   }
	   //获取节点的值
	   String[] values = request.getParameterValues("username");
	   for(String s:values)
	   {
		   System.out.println(s);
	   }
	   //username可以在get请求的情况下在url里添加。
	   request.setCharacterEncoding("utf-8");
	   //设置字符编码
	   PrintWriter writer = response.getWriter();
	   writer.write("mmp");
	   //response打印流
	   
	   
	   
	   
	   
	   
	   
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
