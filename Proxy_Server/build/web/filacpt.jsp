<%@page import="java.sql.*"%>
<%
  String id=request.getParameter("id");
  String user=request.getParameter("user");
          
    Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/proxy","root","");
   PreparedStatement ps=con.prepareStatement("Update urequest SET status='Accept' Where id='"+id+"' ");
   System.out.println(ps);
   ps.executeUpdate();

   out.println("<script>"); 			
   out.println("alert(\"Accept File Request\")");
   out.println("</script>");
        RequestDispatcher rd=request.getRequestDispatcher("/rereq.jsp");  
        rd.include(request, response);  
  

%>
