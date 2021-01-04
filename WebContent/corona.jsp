<%@include file="Header.jsp"%>
<%@page import="java.util.HashMap"%>
<%HashMap<String,String> list =(HashMap)request.getAttribute("hashMap");%>
		
					<div class="add-box2">
			<h1>Get the data</h1>
			<form action="coronaController" method="post">
				<div class="add-textbox">
						<input type="text" placeholder="Enter the link" name="link" value="">
								
				</div>
				<div class="add-textbox">
			<input type="text" placeholder="Name" name="country" value="">
				</div>
				<button class="add-btn" type="submit" value="Add">Search</button>
			</form>
		
		<% if(list!= null) {%>
		<div class="listWrapper">
			<table>
				<tr>
					<th>Cases</th>
					<th>number</th>
				</tr>
			<% for( String a : list.keySet()){ %>
					 <tbody>
					<tr>
						<td><%= a %></td>
						<td><%= list.get(a) %></td>
					</tr>
					</tbody>
				<%} }%>
			</table>
			
				</div>
			
			</div>

			
	<script type="text/javascript">
		
		function slideshow(){
			 var x = document.getElementById('check-class');
			 if(x.style.display === "none"){
			 	x.style.display="block";
			 }
			 else{
			 	x.style.display="none";
			 }
		}	

	</script>

</body>
</html>