import express from 'express';

const port = 8012;
const app = express();

let userInfo = {
    name: 'Jordan',
    age: 22,
    favoriteFood: 'ice cream cake'
};

let cards = [
    {
        name: 'Island',
        game: 'MTG',
        quality: 'fair',
        price: .15
    }
];

app.post('/login', (req, res) => {
    res.json(userInfo);
});

app.delete('/logout', (req, res) => {
    console.log('Successful logout!')
    res.end();
})

app.get('/cards', (req, res) => {
    res.send(cards);
})

// app.use((req, res, next) => {
//     console.log(`request made with url: ${req.url} and method ${req.method}`)
//     next(); // pass request on to search for the next piece of middleware
// });

// app.get('/test', (req, res) => {
//     res.send('this is a test endpoint');
// });

// app.get('/data', (req, res) => {
//     res.json({
//         name: 'Island',
//         quality: 'new',
//         price: '0.15',
//         game: 'MTG'
//     });
// });


app.listen(port, () => {
    console.log('app started on port: ' + port)
});