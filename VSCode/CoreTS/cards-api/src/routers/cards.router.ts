import express from 'express';

export const cardsRouter = express.Router();

/**
 * /cards
 * Find all cards
 */
cardsRouter.get('', (req, res) => {
    res.send('finding all cards');
});

/**
 * /cards/:id
 * find cards by some id
 */
cardsRouter.get('/:id', (req, res) => {
    console.log(`finding card with id: ${req.params.id}`);
    res.send(`finding card with id: ${req.params.id}`);
});

/**
 * /cards/game/:game
 * find cards by game
 */
cardsRouter.get('/game/:game', (req, res) => {
    res.send(`finding cards by game: ${req.params.game}`);
});


/**
 * /cards/owner/:ownerId
 * find card by owner's id
 */
cardsRouter.get('/owner/:ownerId', (req, res) => {
    console.log(`finding card with an owner id: ${req.params.ownerId}`);
    res.send(`finding card with an owner id: ${req.params.ownerId}`);
});

/**
 * /cards
 * add a card 
 */
cardsRouter.post('', (req, res) => {
    console.log("added card with information", req.body);
    res.send(`added card with information ${req.body.firstName}`);
});

/**
 * /users/:id
 * update a users information based on their id
 */
cardsRouter.patch('/:id', (req, res) => {
    console.log(`updated cards information with id ${req.params.id}`);
    res.send(`updated cards information with id: ${req.params.id}`);
})

/**
 * /users/:id
 * delete a user based on their id
 */
cardsRouter.delete('/:id', (req, res) => {
    console.log(`deleted card with id: ${req.params.id}`);
    res.send(`deleted card with id: ${req.params.id}`);
})