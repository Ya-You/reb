package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import dao.AttenceDao;
import dao.AttenceDaoimpl;

import entity.Attence;

/**
 * Servlet implementation class servletAdd
 */
@WebServlet("/servletAdd")
public class servletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getContextPath();
		
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String deth=request.getParameter("dept");
		String date=request.getParameter("date");
		String status=request.getParameter("status");
		
		Attence info=new Attence();
		info.setEmpname(name);
		info.setDept(deth);
		info.setChkdates(date);
		info.setStatus(status);
		String sun=null;
		
		AttenceDao dao=new AttenceDaoimpl();
		int i=dao.AttenceAdd(info);
		if(i>0){
			response.sendRedirect(path+"/do/select");
		}else{
			
			response.sendRedirect(path+"/view/AddList.jsp");
		}
		
	}

}
