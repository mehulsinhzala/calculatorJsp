import javax.servlet.*;
import java.io.*;

public class operation extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			double a =Double.parseDouble(req.getParameter("a"));
			double b =Double.parseDouble(req.getParameter("b"));
			char op=req.getParameter("opr").charAt(0);
			
			switch(op)
			{
				case '+':
					pw.println("<html><head><title>Arithmetic Operations</title></head>");
					pw.println("<link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
					pw.println("<script src='bootstrap/js/jquery.min.js'></script>");
					pw.println("<script src='bootstrap/js/bootstrap.min.js'></script>");
					pw.println("<body background='g.jpg'>");
					pw.println("<table style='border:solid 3px #000; width:28em;height:25em; margin-top:10em; margin-left:30em;'>");
					pw.println("<tr style='border:solid 3px #000;'><td><b style='font-size:32px;color:#000; margin-left:5em; '>Answer</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>First value = </b>" +a+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Operation =  </b>"+" + "+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Second value = </b>" +b+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Answer = </b>" +(a+b)+"</td></tr>");
					pw.println("<td><a href='index.html' style='margin-left:12em; width:100px; height:38px;' class='btn btn-primary'>Back</a></td></tr>");
					pw.println("</table>");
					pw.println("</body>");
					pw.println("</html>");
					break;
					
				case '-':
					pw.println("<html><head><title>Arithmetic Operations</title></head>");
					pw.println("<link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
					pw.println("<script src='bootstrap/js/jquery.min.js'></script>");
					pw.println("<script src='bootstrap/js/bootstrap.min.js'></script>");
					pw.println("<body background='g.jpg'>");
					pw.println("<table style='border:solid 3px #000; width:28em;height:25em; margin-top:9em; margin-left:30em;'>");
					pw.println("<tr style='border:solid 3px #000;'><td><b style='font-size:32px;color:#000; margin-left:5em; '>Answer</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>First value = </b>" +a+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Operation =  </b>"+" - "+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Second value = </b>" +b+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Answer = </b>" +(a-b)+"</td></tr>");
					pw.println("<td><a href='index.html' style='margin-left:12em; width:100px; height:38px;' class='btn btn-primary'>Back</a></td></tr>");
					pw.println("</table>");
					pw.println("</body>");
					pw.println("</html>");
					break;
					
				case '*':
					pw.println("<html><head><title>Arithmetic Operations</title></head>");
					pw.println("<link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
					pw.println("<script src='bootstrap/js/jquery.min.js'></script>");
					pw.println("<script src='bootstrap/js/bootstrap.min.js'></script>");
					pw.println("<body background='g.jpg'>");
					pw.println("<table style='border:solid 3px #000; width:28em;height:25em; margin-top:9em; margin-left:30em;'>");
					pw.println("<tr style='border:solid 3px #000;'><td><b style='font-size:32px;color:#000; margin-left:5em; '>Answer</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>First value = </b>" +a+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Operation =  </b>"+" * "+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Second value = </b>" +b+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Answer = </b>" +(a*b)+"</td></tr>");
					pw.println("<td><a href='index.html' style='margin-left:12em; width:100px; height:38px;' class='btn btn-primary'>Back</a></td></tr>");
					pw.println("</table>");
					pw.println("</body>");
					pw.println("</html>");
					break;
		
				case '/':
					pw.println("<html><head><title>Arithmetic Operations</title></head>");
					pw.println("<link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
					pw.println("<script src='bootstrap/js/jquery.min.js'></script>");
					pw.println("<script src='bootstrap/js/bootstrap.min.js'></script>");
					pw.println("<body background='g.jpg'>");
					pw.println("<table style='border:solid 3px #000; width:28em;height:25em; margin-top:9em; margin-left:30em;'>");
					pw.println("<tr style='border:solid 3px #000;'><td><b style='font-size:32px;color:#000; margin-left:5em; '>Answer</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>First value = </b>" +a+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Operation =  </b>"+" / "+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Second value = </b>" +b+"</td></tr>");
					pw.println("<tr><td><b style='margin-left:2em; '>Answer = </b>" +(a/b)+"</td></tr>");
					pw.println("<td><a href='index.html' style='margin-left:12em; width:100px; height:38px;' class='btn btn-primary'>Back</a></td></tr>");
					pw.println("</table>");
					pw.println("</body>");
					pw.println("</html>");
					break;
			}
		
	}
}