import logo from './logo.svg';
import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import MainMenu from './components/MainMenu';
import GameList from './components/GameList';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<MainMenu />} />
        <Route path="/games" element={<GameList />} />

      </Routes>
    </Router>
  );
}

export default App;
