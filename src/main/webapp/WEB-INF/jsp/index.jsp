<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>Pokedex</h1>
    <h2>Hello ${name}!</h2>
    <c:forEach var="product" items="${productList}" varStatus="status">
      <tr>
        <td><b>${status.index + 1}</b></td>
        <td>123123 ${product}</td>
        <td>${product.price}</td>
      </tr>
    </c:forEach>
  </body>
</html>
