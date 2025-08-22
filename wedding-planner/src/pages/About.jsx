import React from "react";

export default function About() {
  return (
    <div style={{ maxWidth: 800, margin: "0 auto", padding: "2rem" }}>
      <h1 style={{ color: "#a569bd", textAlign: "center", marginBottom: "1.5rem" }}>About Wedding Bliss</h1>
      <p style={{ fontSize: "1.15rem", lineHeight: 1.7, color: "#444" }}>
        Welcome to <b>Wedding Bliss</b> – your one-stop destination for planning the perfect wedding!<br/><br/>
        Our platform brings together the best vendors, stunning venues, creative ideas, and essential tools to make your big day truly memorable. Whether you dream of a grand celebration or an intimate gathering, we help you discover inspiration, connect with trusted professionals, and manage every detail with ease.<br/><br/>
        <b>What we offer:</b>
        <ul style={{ margin: "1rem 0 1.5rem 2rem", color: "#6c3483" }}>
          <li>Curated list of top wedding vendors</li>
          <li>Venue search and booking</li>
          <li>Photo galleries and real wedding stories</li>
          <li>Personalized e-invites and gift ideas</li>
          <li>Expert tips, trends, and planning tools</li>
        </ul>
        <b>Our Mission:</b> To make wedding planning joyful, stress-free, and truly special for every couple.<br/><br/>
        Thank you for choosing Wedding Bliss. Let’s create unforgettable memories together!
      </p>
    </div>
  );
}
