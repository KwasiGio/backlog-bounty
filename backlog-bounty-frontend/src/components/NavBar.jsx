import { Link } from 'react-router-dom';
import './NavBar.css';

const NavBar = () => {
    return (
    <div className="navbar">
        <div className="navbar-logo">Backlog Bounty</div>
        <div className="navbar-links">
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