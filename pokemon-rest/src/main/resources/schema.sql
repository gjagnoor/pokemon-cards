CREATE TABLE pokemon (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) UNIQUE NOT NULL,
    url VARCHAR(255) UNIQUE NOT NULL
);

-- CREATE TABLE user (
--     id INT PRIMARY KEY UNIQUE NOT NULL,
--     username VARCHAR(255) NOT NULL,
--     email VARCHAR(255) UNIQUE NOT NULL,
--     logged_in BOOL NOT NULL
-- );
--
-- CREATE TABLE score (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     game_id INT PRIMARY KEY UNIQUE NOT NULL,
--     user1_id INT,
--     FOREIGN KEY (user1_id) REFERENCES user(id),
--     user2_id INT,
--     FOREIGN KEY (user2_id) REFERENCES user(id),
--     user1_score INT NOT NULL,
--     user2_score INT NOT NULL,
--     completed BOOL DEFAULT false,
--     winner_id INT DEFAULT (-1),
--     FOREIGN KEY (winner_id) REFERENCES user(id),
-- );
--
-- CREATE TABLE game_state
-- (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     game_id INT UNIQUE NOT NULL,
--     tiles ARRAY NOT NULL,
-- );

