
const MainHeader = () => {
    return (
        <header style={StyleSheet.header}>
            <h1 style={StyleSheet.title}>Backlog Bounty</h1>
            <p style={StyleSheet.subtitle}>Track, review and conquer your gaming backlog.</p>
            <button style={StyleSheet.cta}>Start Logging Games</button>
        </header>
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