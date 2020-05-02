import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class serv2 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String n=req.getParameter("count");
int a=Integer.parseInt(n);
++a;
pw.println("Hit count:"+a);  
pw.print("<form action='hello3'>");  
pw.print("<input type='hidden' name='count' value='"+a+"'>");  
pw.print("<input type='submit' value='go'>");  
pw.print("</form>"); 


}}
