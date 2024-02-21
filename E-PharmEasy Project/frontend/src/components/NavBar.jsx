import { Link, useLocation } from "react-router-dom";
import NavDropdown from 'react-bootstrap/NavDropdown';
import { useEffect, useState } from "react";
import axios from "axios";
import { toast } from "react-toastify";
import RoleNavbar from "./RoleNavbar"
import { useSelector } from "react-redux";
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import {
    MDBContainer,
    MDBNavbar,
    MDBNavbarBrand
  } from 'mdb-react-ui-kit';
  import slide from "../images/logo.png"
function NavBar() {
    const state = useSelector((state) => state);
    console.log("LoggedIn ", state.loggedin)
    console.log("Cart ", state.cart)
    const location = useLocation()

    const [category, setCategory] = useState([]);

    useEffect(() => {
        console.log("Welcome to NavBar bro");

        axios.get("http://localhost:8080/api/category/getallcategory")
            .then(resp => {
                console.log(resp);
                setCategory(resp.data);
                console.log("GetAllCategory");
            }).catch(error => {
                toast.error("Category unable to fetch")
            }, [])

    }, [location]);

 
    return (

        <Navbar  expand="lg" className="bg-info position-sticky" style={{ top: 0, zIndex: "1000" }}>
            
            <MDBNavbarBrand href='#'>
            <img
              src={"data:image/png;base64,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"}
              height='50'
              width='70'
              alt=''
              loading='lazy'
            />
          </MDBNavbarBrand>
          <Link  className="navbar-brand  text-black" to="/"><b>PharmEasy</b>
          </Link>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="me-auto">
                    <Link className="nav-link text-black" to="/">HOME</Link>
                    <NavDropdown title={<span className="text-black">CATEGORY</span>} id="basic-nav-dropdown" className="text-light" >
                        <NavDropdown.Item href="#action/3.1">{category.map(cat => (
                            <Link key={cat.categoryId} className="dropdown-item" to={`/cats?cat=${cat.categoryName}`}>{cat.categoryName}</Link>
                        ))}</NavDropdown.Item>
                    </NavDropdown>
                    <Link className="nav-link text-black" to="/aboutUs">ABOUT US</Link>
                    <Link className="nav-link text-black" to="/contactUs">CONTACT US</Link>
                </Nav>
                
                {state.loggedin.IsLoggedIn ?
            <>
                <label className="float-right">Welcome ! {state.loggedin.Username}</label> </> :
            ''} 
               
                
                <RoleNavbar isLoggedIn={state.loggedin.IsLoggedIn} />
            </Navbar.Collapse>
        </Navbar>
    )
}

export default NavBar;


