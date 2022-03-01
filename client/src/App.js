import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Views/Home";
import CreateBook from "./Views/CreateBook";
import Header from "./Components/Header";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Header />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/create-book" element={<CreateBook />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
