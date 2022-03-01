import React from "react";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
      <h1>Home Page</h1>
      <Link to="create-book">
        <button>Criar livro</button>
      </Link>
    </div>
  );
}

export default Home;
