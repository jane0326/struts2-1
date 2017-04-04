package com.atguigu.struts2.helloworld;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
public class FilterDispatcher implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//父接口ServletRequest，子接口HttpServletRequest
		HttpServletRequest req = (HttpServletRequest) request;
		
		//1.获取servletPath
		String servletPath = req.getServletPath();
		System.out.println(servletPath);
		
		String path = null;
		
		//2. 判断servletPath, 若其等于"/product-input.action", 转发到
		///WEB-INF/pages/input.jsp
		if("/product-input.action".equals(servletPath)){
			path = "/WEB-INF/pages/input.jsp";
		}
		
		//3. 若其等于 "/product-save.action", 则
		if("/product-save.action".equals(servletPath)){
			//1).获取请求参数 
			String productName = request.getParameter("productName");
			String productDesc = request.getParameter("productDesc");
			String productPrice = request.getParameter("productPrice");
			
			//2).把请求信息封装的一个 Product 对象
			Product product = new Product(null, productName, productDesc, Double.parseDouble(productPrice));
			
			//3). 执行保存操作
			System.out.println("Save Product: " + product);
			product.setProductId(1001);
			
			//4).把Product对象保存到request(请求域)中，希望EL表达式的形式：${param.productName}-->${requestScope.param.productName}
			request.setAttribute("product", product);
			
			path = "/WEB-INF/pages/details.jsp";
		}
		
		//转发重定向
		if(path != null){
			request.getRequestDispatcher(path).forward(request, response);
			//注意：return一定要写上，下面有chain.doFilter(),否则没有结束,还会继续执行
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
