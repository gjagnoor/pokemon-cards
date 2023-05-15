import React from "react";
import {auth} from "../auth/index.js";
import {Button} from "@blueprintjs/core";

const Logout = () => {
	const handleClick = (event) => {
		auth.signOut();
		return;
	}
	return (
		<>
			<Button id="loginSignup-btn" type="button" onClick={handleClick} large={true} intent="danger">Sign Out</Button>
		</>
	)
}

export default Logout;
