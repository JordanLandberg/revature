async function searchPokemon(event) {
    event.preventDefault();
    const input = document.getElementById('pokemon-id').value;
    const url = ('https://pokeapi.co/api/v2/pokemon/' + input)
    const resp = await fetch(`${url}`);
    const body = await resp.json();
    const name = body.name;

    document.getElementById('pokemon-name').innerText = name;

    const values = Object.values(body.sprites);
    const img = document.getElementById('pokemon-img');
    img.innerHTML = '';
    for (let i = 0; i < values.length; i++) {
        if (values[i]) {
            img.innerHTML += (`
                <img src='${values[i]}' alt=${i}>
            `);
        }
    }
}