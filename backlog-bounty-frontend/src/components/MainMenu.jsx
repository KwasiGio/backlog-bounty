import React, { useState } from 'react';
import './MainMenu.css';
import { NavLink } from 'react-router-dom';
import NavBar from './NavBar';
import MainHeader from './MainHeader';
import PopularGames from './PopularGames';
import NewGames from './NewGames';
import Footer from './Footer';

const MainMenu = () => {
    const [bgImage, setBgImage] = useState('');

    const handleHover = (image) => {
        setBgImage(image);
    };
    const handleLeave = () => {
        setBgImage('');
    };
    return (
        <div
            className="main-menu-container"
            style={{
                backgroundImage: bgImage ? `url(${bgImage})` : 'none',
                backgroundSize: 'cover',
                backgroundPosition: 'center',
                transition: 'background-image 0.5s ease-in-out',
                minHeight: '100vh'
            }}
            >
            <NavBar />
            <MainHeader handleHover={handleHover} handleLeave={handleLeave}  />
            <PopularGames handleHover={handleHover} handleLeave={handleLeave} />
            <NewGames />
            <Footer />
        </div>
    );
}

export default MainMenu;