import express from 'express';

// specify the port will run on
const port = 8012;
const app = express();

/**
 * Loggin middleware
 * This callback will be invoked anytime a request is made 
 * regardless of url or http method
 *  */ 
app.use((req, res, next) => {
    console.log(`request made with url: ${req.url} and method ${req.method}`)
    next(); // pass request on to search for the next piece of middleware
});

app.get('/test', (req, res) => {
    res.send('this is a test endpoint');
});

app.get('/data', (req, res) => {
    res.json({
        name: 'Island',
        quality: 'new',
        price: '0.15',
        game: 'MTG'
    });
});


app.listen(port, () => {
    console.log('app started on port: ' + port)
});