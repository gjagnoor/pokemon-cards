import React, {useState, useEffect} from "react";
import Logout from "./Logout.js";
import axios from "axios";
import {Button} from "@blueprintjs/core";

const Home = ({user}) => {
	const [pokemonsData, setPokemonsData] = useState([]);
	const [game, setGame] = useState(null);
	useEffect(() => {
		getData();
	}, []);

	const getData = async () => {
		const response = await axios.get("/api/pokemons");
		setPokemonsData(response.data);
		return true;
	}
	const handleCreateGame = async () => {
		const game = await axios.get(`/api/game/create`).then((res) => res.data).catch((err) => console.error(err));
		setGame(game);
		return game;
	}
	console.log("POKEMONS DATA FROM MY API: ", pokemonsData);

	return (
		<div id="home-btns">
			<Button intent="success" large={true} onClick={handleCreateGame}>Create Game</Button>
			<Logout />
		</div>
	)
}

export default Home;
