import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class serv3 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String n=req.getParameter("count");
int a=Integer.parseInt(n);
++a;
pw.println("Hit count:"+a); 
}}