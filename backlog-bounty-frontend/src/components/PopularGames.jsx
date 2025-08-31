const PopularGames = () => {
    const GamesData = [
        {
            id: 1,
            title: "Ghost of Tsushima",
            image: "https://via.placeholder.com/150"
        },
        {
            id: 2,
            title: "God of War",
            image: "https://via.placeholder.com/150"
        }
    ]
    return (
        <div className="popular-games-container">
            <h2>Trending Now</h2>
            <div className= "games-grid">
                {GamesData.map((game) => (
                    <div key={game.id} className="game-card">
                        <img src={game.image} alt={game.title} />
                    <p>{game.title}</p>
                    <span>{game.status}</span>
                    </div>
                    ))}
            </div>
        </div>
    )
};













export default PopularGames;