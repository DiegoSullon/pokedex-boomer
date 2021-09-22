<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="icon" href="https://i.ibb.co/6DtvfVQ/pokedex.png" />
    <title>Pokedex</title>
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
    p {
      margin-top: 0;
    }
    #card {
      box-shadow: 0 0 3px #3761a8;
      display: flex;
      justify-content: center;
      padding: 1em;
      font-weight: bold;
      font-size: 1.2em;
      color: white;
    }
    #resultSection {
      width: 80%;
      display: grid;
      grid-template-columns: 1fr;
      grid-gap: 1em;
      @media (min-width: 700px) {
        grid-template-columns: 1fr 1fr;
      }
    }
    #pagination {
      display: flex;
      width: 80%;
      margin-top: 0;
      margin-bottom: 1em;
      padding: 0;
      height: 40px;
      justify-content: space-evenly;
    }
    #pagination-item > a{
      border: 2px solid #feca1b;
      color: white;
      padding: 0.5em 1em;
      width: 100px;
      text-align: center;
      border-radius: 1em;
    }
  </style>
  <body>
    <main>
      <h1>Pokedex</h1>
      <ul id="pagination">
        <li id="pagination-item">
          <a href="${pageContext.request.contextPath}/${page-1}">Anterior</a>
        </li>
        <li id="pagination-item">
          <a href="${pageContext.request.contextPath}/${page+1}">Siguiente</a>
        </li>
      </ul>
      <section id="resultSection">
        <c:forEach var="pokemon" items="${pokemonList}">
          <a
            id="cardLink"
            href="${pageContext.request.contextPath}/pokemon/?url=${pokemon.url}"
          >
            <div id="card">
              ${pokemon.name}
            </div>
          </a>
        </c:forEach>
      </section>
    </main>
  </body>
</html>
