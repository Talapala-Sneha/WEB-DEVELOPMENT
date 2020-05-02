<html>
    <%
        out.println("Your Cart Details are : ");
        out.println("<br/>");
        String j = session.getAttribute("Count");
        for(int i=0;i<j; i++){
            out.print("\n"+ i +". "+session.getAttribute(i));
        }
    %>
</html>