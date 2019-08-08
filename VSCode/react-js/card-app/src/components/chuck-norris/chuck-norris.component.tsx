import React, { Component } from 'react';
import { Button } from 'reactstrap';

interface IState {
    joke: any
}

export default class ChuckNorrisComponent extends Component<{},IState> {

    constructor(props: any) {
        super(props);
        this.state = {
            joke: null
        }
    }

    getJoke = async () => {
        const res = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]');
        const jokeObject = await res.json();
        const joke = jokeObject.value.joke;
        this.setState({
            joke
        })
    }

    render() {
        return (
            <div>
                <h3>Chuck Norris Jokes</h3>
                <br/>
                <Button color="success" onClick={this.getJoke}>Next Joke</Button>
                <p>{this.state.joke}</p>
            </div>
        )
    }
}
