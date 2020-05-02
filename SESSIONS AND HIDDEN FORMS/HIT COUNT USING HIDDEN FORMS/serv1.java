import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class serv1 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
int a=1;
pw.print("<form action='hello2'>");  
pw.print("<input type='hidden' name='count' value='"+a+"'>");  
pw.print("<input type='submit' value='go'>");  
pw.print("</form>"); 
pw.println("hit count:"+a);
}}
