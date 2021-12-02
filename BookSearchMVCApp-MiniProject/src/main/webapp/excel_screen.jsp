<%@page isELIgnored="false" import="java.util.*, com.nt.dto.BookDetailsDTO"%>

<%
	response.setContentType("application/vnd.ms-excel");
	response.addHeader("Content-Disposition","attatchment;fileName=books_index.xls");
	
	List<BookDetailsDTO>list=(List<BookDetailsDTO>)request.getAttribute("booksList");
	String category=request.getParameter("category");
	
	if(list!=null&&list.size()!=0){%>
		<h1 style="color:red;text-align:center">Books beloning to <%=category %> category</h1>
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>BookId</th><th>BookName</th><th>Category</th><th>Author</th><th>price</th><th>status</th>
			</tr>
			<%
				for(BookDetailsDTO dto:list){%>
					<tr>
						<td><%=dto.getBookId() %></td>
						<td><%=dto.getBookName() %></td>
						<td><%=dto.getCategory() %></td>
						<td><%=dto.getAuthor() %></td>
						<td><%=dto.getPrice() %></td>
						<td><%=dto.getStatus() %></td>
					</tr>
				<%} %>
		</table>
		<br>
		<%}
	else{%>
			<h1 style="color:red;text-align:center">records not found</h1>
		<%
		}
		%>
		
		