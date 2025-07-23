import React from 'react';
import { Link } from 'react-router-dom';
import NavBar from './NavBar';
import MainHeader from './MainHeader';
import PopularGames from './PopularGames';
import NewGames from './NewGames';
import Footer from './Footer';

const MainMenu = () => {
    return (
        <div>
            <NavBar />
            <MainHeader />
            <PopularGames />
            <NewGames />
            <Footer />
        </div>
    );
}

export default MainMenu;