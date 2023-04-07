<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
        
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
         crossorigin="anonymous">
        
        
    </head>
    <body>
        <h1>Order Page</h1>
        
        
        
        <%
            try {
            
        //STEP 1- use the database driver to get a connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/ClassicModels", "root", 
                "Adminadmin"
                        + "");
                        
         //STEP 2- Create a new SQL statement using the connection               
             Statement stmt = con.createStatement();
             
              //STEP 3- Execute the SQL statement to retrieve a result set of records 
        //from the database.    
        ResultSet rs = stmt.executeQuery("select PriceEach from orderDetails where OrderNumber="
+request.getParameter("OrderNumber") + "; "); 
%>
             
             <table border="1">

<tr>
<th>Order Number</th>
<th>Product Code</th>
<th>Quantity Order</th>
<th>Price per unit</th>
<th>Order Line Number</th>
</tr>


<%
while (rs.next ()) {
%>
            
</thead>

<tr>

<td><%out.println(rs.getString(1)); %></td>
<td><%out.println(rs.getString(2)); %></td>
<td><%out.println(rs.getString(3)); %></td>
<td><%out.println(rs.getString(4)); %></td>
<td><%out.println(rs.getString(5)); %></td>
</tr>

}

</table>

             
       <%
           }
        
      //STEP 5- Close the connection to the database   
        con.close();

    } catch(Exception e){
        System.out.println(e);
}
        %>
        
    </body>
</html>
