import express from 'express';

// the user router represents a subset of the application
// for all enpoints starting with /users
export const usersRouter = express.Router();

/**
 * /users
 * find all users
 */
usersRouter.get('', (req, res) => {
    res.send('found all users');
})


/**
 * /users/:id
 * find user by some id
 */
usersRouter.get('/:id', (req, res) => {
    console.log(`finding user with id: ${req.params.id}`);
    res.send(`finding user with id: ${req.params.id}`);
});

/**
 * /users/firstName/:firstName
 * find user by first name
 */
usersRouter.get('/firstName/:firstName', (req, res) => {
    console.log(`finding user with first name: ${req.params.firstName}`);
    res.send(`finding user with first name: ${req.params.firstName}`);
});

/**
 * /users
 * add a user 
 */
usersRouter.post('', (req, res) => {
    console.log("added user with information", req.body);
    res.send(`added user with information ${req.body.firstName}`);
});

/**
 * /users/:id
 * update a users information based on their id
 */
usersRouter.patch('/:id', (req, res) => {
    console.log(`updated users information with id ${req.params.id}`);
    res.send(`updated users information with id: ${req.params.id}`);
})

/**
 * /users/:id
 * delete a user based on their id
 */
usersRouter.delete('/:id', (req, res) => {
    console.log(`deleted user with id: ${req.params.id}`);
    res.send(`deleted user with id: ${req.params.id}`);
})