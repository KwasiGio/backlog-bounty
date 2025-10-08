import './PopularGames.css';
import {Link} from 'react-router-dom';
const PopularGames = ({handleHover, handleLeave}) => {
    const GamesData = [
        {
            id: 1,
            title: "Ghost of Tsushima",
            image: "https://upload.wikimedia.org/wikipedia/en/thumb/b/b6/Ghost_of_Tsushima.jpg/250px-Ghost_of_Tsushima.jpg"
        },
        {
            id: 2,
            title: "God of War",
            image: "https://upload.wikimedia.org/wikipedia/en/thumb/a/a7/God_of_War_4_cover.jpg/250px-God_of_War_4_cover.jpg"
        },
        {   id:3,
            title: "Rise of the Ronin",
            image: "https://upload.wikimedia.org/wikipedia/en/b/bf/Rise_of_the_Ronin_Key_Art.jpg"
        
        }
    ]
    return (
        <div className="popular-games-container">
            <h2 className ="trending-title">Trending Now</h2>
            <div className= "games-grid">
                {GamesData.map((game) => (
                    <Link to={'/games'} key={game.id} className = "game-link">
                        <div className="game-card">
                            <img src={game.image} alt={game.title} />
                            <span>{game.status}</span>
                            <div className="overlay">
                                <p>{game.title}</p>
                            </div>
                        </div>
                    </Link>
                ))}
            </div>
        </div>
    )
};













export default PopularGames;