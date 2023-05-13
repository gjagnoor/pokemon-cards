import React, {useState, useEffect} from "react";
import Logout from "./Logout.js";
import axios from "axios";

const Home = ({user}) => {
	const [pokemonsData, setPokemonsData] = useState([]);
	useEffect(() => {
		getData();
	}, []);
	const getData = async () => {
		const response = await axios.get("/api/pokemons");
		setPokemonsData(response.data);
		return true;
	}
	console.log("POKEMONS DATA FROM MY API: ", pokemonsData);

	return (
		<>
			<Logout />
		</>
	)
}

export default Home;
