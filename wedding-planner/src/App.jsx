import { Routes, Route } from "react-router-dom";
import Layout from "./components/Layout";
import Home from "./pages/Home";
import Vendors from "./pages/Vendors";
import Photo from './pages/Photo';
import Venue from "./pages/Venue";
import Real_Wedding from "./pages/Real_Wedding";
import E_Invites from "./pages/E_Invites";
import Login from "./auth/Login";
import Register from "./auth/Register";

function App() {
  return (
    <Routes>
      <Route element={<Layout />}>
        <Route path="/" element={<Home />} />
         <Route path="/venue" element={<Venue/>} />
        <Route path="/vendors" element={<Vendors />} />
        <Route path="/photo" element={<Photo />} />
         <Route path="/realWedding" element={<Real_Wedding />} />
          <Route path="/e_invites" element={<E_Invites/>} />
          <Route path="/login" element={<Login/>} />
          <Route path="/register" element={<Register/>} />
      </Route>
    </Routes>
  );
}

export default App;
