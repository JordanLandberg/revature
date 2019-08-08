import express from 'express';
import * as cardDao from '../daos/sql-card.dao';

export const cardsRouter = express.Router();

/**
 * /cards
 * Find all cards
 */
cardsRouter.get('', async (req, res) => {
    const cards = await cardDao.findAll();
    res.json(cards);
});

/**
 * /cards/game/:game
 * find cards by game
 */
cardsRouter.get('/game/:game', async (req, res) => {
    const game = req.params.game;
    const cards = await cardDao.findByGame(game);
    res.json(cards);
});


/**
 * /cards/:id
 * find cards by id
 */
cardsRouter.get('/:id', async (req, res) => {
    const id = req.params.id;
    const card = await cardDao.findById(id);
    res.json(card);
});

/**
 * /cards/owner/:ownerId
 * find cards by owner's id
 */
cardsRouter.get('/owner/:ownerId', async (req, res) => {
    const ownerId = req.params.ownerId;
    const cards = await cardDao.findByOwnerId(ownerId);
    res.json(cards);
});


/**
 * /cards
 * create new card resource
 */
cardsRouter.post('', async (req, res) => {
    const card = req.body;
    if (!card) {
        res.sendStatus(400);
    } else {
        const id = await cardDao.save(card);
        if (!id) {
            res.sendStatus(400);
        } else {
            card.id = id;
            res.status(201); // created status code
            res.json(card);
        }
    }
});

/**
 * /cards
 * partially update card resource
 */
cardsRouter.patch('', (req, res) => {
    res.send(`updating card: ${JSON.stringify(req.body)}`);
});

/**
 * /cards
 * delete card by id
 */
cardsRouter.delete('/:id', (req, res) => {
    console.log(`deleting card with id: ${req.params.id}`);
    res.send(`deleting card with id: ${req.params.id}`);
});