<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="icon" href="https://i.ibb.co/6DtvfVQ/pokedex.png" />
    <title>Document</title>
  </head>
  <style>
    html {
      box-sizing: border-box;
      font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen,
        Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    }
    *,
    *::before,
    *::after {
      box-sizing: inherit;
    }
    body {
      background-color: #263238;
      overscroll-behavior: none;
      width: 100%;
      margin: 0;
      color: white;
    }
    a {
      text-decoration: none;
    }
    button {
      border: 0;
      background-color: transparent;
      cursor: pointer;
      padding: 0;
    }
    ul {
      padding: 0;
    }
    li {
      list-style: none;
    }
    a {
      text-decoration: none;
      color: black;
    }
    body {
      overflow-x: hidden;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      width: 100%;
    }
    main {
      display: flex;
      width: 80%;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      margin: 0;
    }
    /* Main */
    h1 {
      -webkit-text-stroke: 2px #3761a8;
      color: #feca1b;
      font-size: 4em;
      text-align: center;
    }
    h2 {
      -webkit-text-stroke: 2px #3761a8;
      color: #feca1b;
      font-size: 3em;
      margin-top: 0;
    }
    #tagList {
      display: flex;
      width: 80%;
      margin-top: 0;
      margin-bottom: 1em;
      padding: 0;
      height: 40px;
      justify-content: space-evenly;
    }
    #tag {
      border: 2px solid #feca1b;
      color: white;
      padding: 0.5em 1em;
      width: 100px;
      text-align: center;
      border-radius: 1em;
    }
    a {
      border: 2px solid #feca1b;
      color: white;
      padding: 0.5em 1em;
      width: 100px;
      text-align: center;
      border-radius: 1em;
    }
  </style>
  <body>
    <h1>${pokemon.name}</h1>
    <h2>Groups</h2>
    <ul id="tagList">
      <c:forEach var="group" items="${pokemon.egg_groups}">
        <li id="tag">
          ${group.name}
        </li>
      </c:forEach>
    </ul>
    <a href="${pageContext.request.contextPath}/0">See All</a>
  </body>
</html>
