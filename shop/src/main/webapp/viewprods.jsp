<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "store";
String userId = "root";
String password = "root";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

%>
<h2 align="center"><font><strong>Products</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>
<body bgcolor="grey">
</tr>
<tr bgcolor="#0439a3">
<td><b>ID</b></td>
<td><b>Title</b></td>
<td><b>Manfactuer</b></td>
<td><b>Price</b></td>
<td><b>Category</b></td>
<td><b>Image</b></td>
<td><b>Stock</b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM product";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<% 
for(int i=0; i<1; i++){
	%>
<tr bgcolor="#DEB887">
<form method="post" action="cart.jsp">
<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("title") %></td>
<td><%=resultSet.getString("manafactuer") %></td>
<td><%=resultSet.getString("price") %></td>
<td><%=resultSet.getString("category") %></td>
<td><%=resultSet.getString("image") %></td>
<td><%=resultSet.getString("stock") %></td>

<%String name;
session.setAttribute("name",resultSet.getString("title"));%>
<%String price;
session.setAttribute("pri",resultSet.getString("price"));%>


<td> <input type="submit" value="Add To Cart" /> </td>
<%}%>
</tr>
</form>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
<a href="success.jsp">Home</a>
<a href="purchases.jsp">Buy</a>
<a href="viewcart.jsp">View Cart</a>
</table>
                    