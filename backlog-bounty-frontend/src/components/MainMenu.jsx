import React from 'react';
import { Link } from 'react-router-dom';

const MainMenu = () => {
    return (
        <div>
            <h1>Backlog Bounty</h1>
            <nav>
                <ul>
                    <li><Link to = "/games">View Game List</Link></li>
                </ul>
            </nav>
        </div>
    );
}

export default MainMenu;