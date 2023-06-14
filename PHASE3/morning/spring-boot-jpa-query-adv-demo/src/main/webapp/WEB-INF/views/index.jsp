<h3><b>JPA Query Demo (Advanced)</b></h3>

<h2>List Products where Name Like and Price Greater than </h2>
<form action="list-products-by-name-like-and-price-gt" method="GET">
NAME: <input name="name" > &nbsp;&nbsp;&nbsp;&nbsp;
PRICE(greater than): <input name="price" >
<input type=submit>
</form>

<h2>List Products where Name Like</h2>
<form action="list-products-by-name-like" method="GET">
NAME: <input name="name" >
<input type=submit>
</form>

<h2>List Products</h2>
<a href="list-products">List Products</a>
<hr>
<h3>List Products By Name</h3>
<form action="list-products-by-name" method="GET">
NAME: <input name="name" >
<input type=submit>
</form>

<h3>List Products By Price Greater than</h3>
<form action="list-products-by-price-gt" method="GET">
PRICE: <input name="price" >
<input type=submit>
</form>

</hr>

<h3>Add New Product</h3>
<a href="add-product">Add New Product</a>
<hr>
<br><br>
Edit this Product<br>
<form action="edit-product" method="GET">
ID: <input name=id >
<input type=submit>
</form>

<br><br>
Delete this Product<br>
<form action="delete-product" method="GET">
ID: <input name=id >
<input type=submit>
</form>