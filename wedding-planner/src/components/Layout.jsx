import { Outlet } from "react-router-dom";
import SearchCity from "./SearchCity";
import ProfileBar from "./ProfileBar";
import Navbar from "./NavBar";

const Layout = () => {
  return (
    <div>
      {/* Top bar with search + profile */}
<<<<<<< HEAD
<<<<<<< HEAD
      <div style={{ display: "flex", justifyContent: "space-between", padding: "10px", background: "#f1f1f1" }}>
=======
      <div style={{ display: "flex", justifyContent: "space-between", padding: "10px", background: "#7e0eb1ff" }}>
>>>>>>> Dev
=======
      <div style={{ display: "flex", justifyContent: "space-between", padding: "10px", background: "#7e0eb1ff" }}>
>>>>>>> b749f28c952988fef862dacbc0ea3d940db12652
        <SearchCity />
        <ProfileBar />
      </div>

      {/* Navbar below */}
      <Navbar />

      {/* Page content */}
      <div style={{ padding: "20px" }}>
        <Outlet />
      </div>
    </div>
  );
};

export default Layout;
