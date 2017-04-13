<%@ page import ="java.sql.*" %>
<%
    String title = session.getAttribute("name").toString();    
    String price1 = session.getAttribute("pri").toString();
    double price = Double.parseDouble(price1);
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store",
            "root", "root");
    Statement st = con.createStatement();
    
    int i = st.executeUpdate("insert into cart(title, price ) values ('" + title + "','" + price + "')");
    if (i > 0) {
       
        response.sendRedirect("viewprods.jsp");
   
    }
%>