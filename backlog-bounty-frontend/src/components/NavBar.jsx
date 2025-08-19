import { NavLink } from 'react-router-dom';
import './NavBar.css';
import logo from './Backlog.png';

const NavBar = () => {
    return (
    <div className="navbar">
        <div className="navbar-logo">
            <img src ={logo} alt="Backlog Bounty Logo" className="logo-image" />
            </div>
            <div className ="navbar-links">
            <NavLink to="/" end>HOME</NavLink>
            <NavLink to="/games">GAMES</NavLink>
            <NavLink to="/reviews">REVIEWS</NavLink>
            <NavLink to="/progress">PROGRESS</NavLink>
            <NavLink to="/stats">STATS</NavLink> 
        </div>
    </div>
    );
};













export default NavBar;