import React from "react";
import { Link } from "react-router-dom";

function Header() {
  return (
    <nav>
      <Link to="/">Home</Link>
      <br />
      <Link to="create-book">Create Book</Link>
    </nav>
  );
}

export default Header;
