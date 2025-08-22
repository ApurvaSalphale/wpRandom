import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav
      style={{
<<<<<<< HEAD
<<<<<<< HEAD
        background: "#f8f8f8",
=======
        background: "#ca76fbff",
>>>>>>> Dev
=======
        background: "#ca76fbff",
>>>>>>> b749f28c952988fef862dacbc0ea3d940db12652
        color: "black",
        padding: "10px 20px",
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
        borderBottom: "1px solid #ccc",
      }}
    >
      
      <div>
<<<<<<< HEAD
<<<<<<< HEAD
        <Link to="/venue" style={{ color: "black", marginRight: "20px" }}>Venue</Link>
        <Link to="/vendors" style={{ color: "black", marginRight: "20px" }}>Vendors</Link>
        <Link to="/photo" style={{ color: "black", marginRight: "20px" }}>Photo</Link>
        <Link to="/realWedding" style={{ color: "black", marginRight: "20px" }}>Real Wedding</Link>
        <Link to="/e_invites" style={{ color: "black", marginRight: "20px" }}>E-Invites</Link>
=======
=======
>>>>>>> b749f28c952988fef862dacbc0ea3d940db12652
        <Link to="/venue" style={{ color: "white", marginRight: "20px" }}>Venue</Link>
        <Link to="/vendors" style={{ color: "white", marginRight: "20px" }}>Vendors</Link>
        <Link to="/photo" style={{ color: "white", marginRight: "20px" }}>Photo</Link>
        <Link to="/realWedding" style={{ color: "white", marginRight: "20px" }}>Real Wedding</Link>
        <Link to="/e_invites" style={{ color: "white", marginRight: "20px" }}>E-Invites</Link>
<<<<<<< HEAD
>>>>>>> Dev
=======
>>>>>>> b749f28c952988fef862dacbc0ea3d940db12652
      </div>

     
      <div>
<<<<<<< HEAD
<<<<<<< HEAD
        <Link to="/register" style={{ color: "black", marginRight: "20px" }}>Register</Link>
        <Link to="/login" style={{ color: "black" }}>Login</Link>
      </div>
    </nav>
=======
        <Link to="/register" style={{ color: "white", marginRight: "20px" }}>Register</Link>
        <Link to="/login" style={{ color: "white" }}>Login</Link>
      </div>
    </nav>

    
>>>>>>> Dev
=======
        <Link to="/register" style={{ color: "white", marginRight: "20px" }}>Register</Link>
        <Link to="/login" style={{ color: "white" }}>Login</Link>
      </div>
    </nav>

    
>>>>>>> b749f28c952988fef862dacbc0ea3d940db12652
  );
};

export default Navbar;
