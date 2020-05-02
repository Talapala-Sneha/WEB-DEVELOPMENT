
<html>
    <%
        out.println("Welcome "+request.getParameter("username"));
        String items[] = request.getParameterValues("items");
        String names[] = {"Bag" , "Hand Bag"};
        int j =0;
        for(int i=0;i<2; i++){
                session.setAttribute(names[i],j);
               j++;
            
        }
        session.setAttribute("Count",j);
    %>
   <label> <a href="cart.jsp">Click here </a>to view the Cart</label>
</html>