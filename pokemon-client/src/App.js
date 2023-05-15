import React, {useState, useEffect} from "react";
import './App.css';
import firebase from 'firebase/compat/app';
import {signInWithPopup} from 'firebase/auth';
import {auth, provider} from "./auth/index.js";
import SignUpOrLogin from "./components/SignUpOrLogin.js";
import {onAuthStateChanged} from "firebase/auth";
import Home from "./components/Home.js";


function App() {
	const [user, setUser] = useState(null);

	useEffect(() => {
		onAuthStateChanged(auth, (user) => {
			if (user) {
				const uid = user.uid;
				setUser(user);
			} else {
				setUser(null);
			}
		});
	}, []);
	const handleClick = () => {
		signInWithPopup(auth, provider).then((data) => {
			setUser(data.user);
		})
	}
	return (
		<div className="App">
			<div id="landing-page">
				<h1 id="app-heading">memory</h1>
				{
					!user ? <SignUpOrLogin authenticate={handleClick}/> : <Home user={user}/>
				}
			</div>
		</div>
	);
}

export default App;
