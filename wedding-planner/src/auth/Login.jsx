import React, { useState } from 'react';
import './Login.css'; 

function Login() {
  const [isLogin, setIsLogin] = useState(true);

  return (
    <div className="container">
      <div className="form-container">
        <div className="form-toggle">
          <button
            className={isLogin ? 'active' : ''}
            onClick={() => setIsLogin(true)}
          >
            Login
          </button>
          <button
            className={!isLogin ? 'active' : ''}
            onClick={() => setIsLogin(false)}
          >
            Sign Up
          </button>
        </div>

        {isLogin ? (
          <div className="form">
            <h2>Login Form</h2>
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" />
            <a href="#">Forgot Password?</a>
            <button>Login</button>
            <p>
              Not a Member?{' '}
              <a href="#" onDoubleClick={() => setIsLogin(false)}>
                Signup now
              </a>
            </p>
          </div>
        ) : (
          <div className="form">
            <h2>Sign Up</h2>
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" />
            <input type="password" placeholder="Confirm Password" />
            <button>Register</button>
          </div>
        )}
      </div>
    </div>
  );
}

export default Login;
