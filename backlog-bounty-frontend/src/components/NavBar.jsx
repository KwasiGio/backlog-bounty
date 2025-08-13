import { Link } from 'react-router-dom';
import './NavBar.css';
import logo from './Bounty.png';

const NavBar = () => {
    return (
    <div className="navbar">
        <div className="navbar-logo">
            <img src ={logo} alt="Backlog Bounty Logo" className="logo-image" />
            </div>
            <div className ="navbar-links">
            <Link to="/">Home</Link>
            <Link to="/games">Games</Link>
            <Link to="/reviews">Reviews</Link>
            <Link to="/progress">Progress</Link>
            <Link to="/stats">Stats</Link> 
        </div>
    </div>
    );
};













export default NavBar;