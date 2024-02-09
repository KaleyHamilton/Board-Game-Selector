START TRANSACTION;

DROP TABLE IF EXISTS board_games;

CREATE TABLE board_games(
	game_id serial,
	game_name varchar(50) NOT NULL,
	min_players int NOT NULL,
	max_players int NOT NULL,
	intensity varchar(10) NOT NULL,
	play_type varchar(15) NOT NULL,
	max_time int NOT NULL,
	party boolean NOT NULL,
	deck_builder boolean NOT NULL,
	tower_defense boolean NOT NULL,
	engine_builder boolean NOT NULL,
	worker_placement boolean NOT NULL,
	order_fulfillment boolean NOT NULL,
	campaign boolean NOT NULL,
	hidden_role boolean NOT NULL,
	area_control boolean NOT NULL,
	tile_placement boolean NOT NULL,
	city_builder boolean NOT NULL,
	mystery boolean NOT NULL,
	strategy boolean NOT NULL,
	word_game boolean NOT NULL,
	dungeon_crawler boolean NOT NULL,
	press_your_luck boolean NOT NULL,
	CONSTRAINT pk_board_game PRIMARY KEY (game_id)
);

COMMIT;