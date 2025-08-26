import './MainHeader.css';
const MainHeader = ({ handleHover, handleLeave }) => {
    return (
        <div className ="header">
            <h1>CONQUER YOUR BACKLOG.<br /> ONE GAME AT A TIME.</h1>
            <p>C</p>
        <div className="featured-buttons">
            <button
                onMouseEnter={() => handleHover('image.jpg')}
                onMouseLeave={handleLeave}
            >
                Try placeholder value
                </button>
            <button
                onMouseEnter={() => handleHover('image.jpg')}
                onMouseLeave={handleLeave}
            >
                Discover placeholder
            </button>
            <button
                onMouseEnter={() => handleHover('image.jpg')}
                onMouseLeave={handleLeave}
            >
                Play placeholder
            </button>
        </div>
    </div>
    );
};

const styles = {
    header: {
        padding: '4rem 2rem',
        textAlign: 'center',
        background: '#1e1e1e',
        color: 'white',
    },

    title: {
        fontSize: '3rem',
        marginBottom: '1rem',
    },
    subtitle: {
        fontSize: '1.25rem',
        marginBottom: '2rem',
    },
    cta: {
        padding: '1rem 2rem',
        fontSize: '1rem',
        background: '#00bfff',
        color: 'white',
        border: 'none',
        borderRadius: '0.5rem',
        cursor: 'pointer',
    },
};

export default MainHeader;