import { connectionPool } from "./connection.util";
import { PoolClient } from "pg";


export function findAll() {
    console.log('retreiving all users');
    connectionPool.connect().then(client => { // get a connection
        client.query('SELECT * FROM app_user').then(result => { // send the query
            console.log(result)
        })
            .catch(err => {
                console.log(err);
            }).finally(() => {
                client.release(); // release the connection back to the pool
            })
    })
        .catch(err => {
            console.log(err);
        })
    console.log('found all')
}

export async function findAllES8() {
    console.log('finding all users');
    let client: PoolClient;
    try {
        client = await connectionPool.connect(); // basically .then is everything after this
        const result = await client.query('SELECT * FROM app_user');
        console.log(result.rows);
    } catch (err) {
        console.log(err)
    } finally {
        client && client.release();
    }
    console.log('found all');
}

export async function findByUsernameAndPassword(username: string, password: string) {
    let client: PoolClient;
    try {
        client = await connectionPool.connect();

        // it is bad to use interpolation here because it allows sql injection
        // const queryString = `
        //     SELECT * FROM app_user 
        //         WHERE username = '${username}' AND pass = '${password}'
        // `;
        // instead there is a built in way of handling this to prevent sql injection
        const queryString = `
            SELECT * FROM app_user
                WHERE username = $1 AND pass = $2
        `
        const result = await client.query(queryString, [username, password]);
        console.log(result.rows[0]); // there should really only be 1 row at best
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }
}

export async function findById(id: number) {
    let client: PoolClient;
    try {
        client = await connectionPool.connect();

        const queryString = `
            SELECT * FROM app_user
                WHERE user_id = $1
        `
        const result = await client.query(queryString, [id]);
        console.log(result.rows[0]);
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }
}

export async function save(id: number, username: string, pass: string, firstName: string, lastName: string, phone: string, email: string) {
    let client: PoolClient;
    try {
        client = await connectionPool.connect();

        const queryString = `
            INSERT INTO app_user (username, pass, first_name, last_name, phone, email) VALUES
                ($1, $2, $3, $4, $5, $6, $7)
        `
        const result = await client.query(queryString, [id, username, pass, firstName, lastName, phone, email]);
        console.log(result.rows);
    } catch (err) {
        console.log(err)
    } finally {
        client && client.release();
    }
}