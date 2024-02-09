package com.techelevator.dao;

import com.techelevator.exception.DaoException;
import com.techelevator.model.BoardGames;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.*;
import java.util.stream.Collectors;

public class JdbcBoardGamesDao implements BoardGamesDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcBoardGamesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BoardGames> getBoardGamesByName(String gameName) {

        return null;
    }

    @Override
    public BoardGames getBoardGameById(int gameId) {
        String sql = "SELECT game_id, game_name, min_players, max_players, intensity, play_type, " +
                "max_time, party, deck_builder, tower_defense, engine_builder, worker_placement, " +
                "order_fulfillment, campaign, hidden_role, area_control, tile_placement, city_builder, " +
                "mystery, strategy, word_game, dungeon_crawler, press_your_luck" +
                "FROM board_games WHERE game_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, gameId);

        if (result.next()) {
            return mapRowToBoardGames(result);
        }

        return null;
    }

    @Override
    public List<BoardGames> getAllBoardGames() {
       List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games;";

        try {
            //List<BoardGames> boardGames = new ArrayList<>();
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
                //Collections.sort(boardGames);
            }
            System.out.println(boardGames);
            List<BoardGames> sortedList = boardGames.stream().sorted().collect(Collectors.toList());
            //Collections.sort(boardGames);
            return sortedList;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getByPlayerCount(int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getByIntensityAndPlayerCount(String intensity, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE intensity = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, intensity, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getByPlayTypeAndPlayerCount(String playType, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE play_type = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, playType, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getByMaxPlayTimeAndPlayerCount(int maxTime, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE max_time = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, maxTime, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getPartyBoardGamesAndPlayerCount(boolean party, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE party = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, party, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getDeckBuilderBoardGamesAndPlayerCount(boolean deckBuilder, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE deck_builder = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, deckBuilder, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getTowerDefenseBoardGamesAndPlayerCount(boolean towerDefense, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE tower_defense = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, towerDefense, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getEngineBuilderBoardGamesAndPlayerCount(boolean engineBuilder, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE engine_builder = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, engineBuilder, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getWorkerPlacementBoardGamesAndPlayerCount(boolean workerPlacement, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE worker_placement = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, workerPlacement, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getOrderFulfillmentBoardGamesAndPlayerCount(boolean orderFulfillment, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE order_fulfillment = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, orderFulfillment, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getCampaignBoardGamesAndPlayerCount(boolean campaign, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE campaign = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, campaign, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getHiddenRoleBoardGamesAndPlayerCount(boolean hiddenRole, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE hidden_role = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hiddenRole, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getAreaControlBoardGamesAndPlayerCount(boolean areaControl, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE area_control = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, areaControl, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getTilePlacementBoardGamesAndPlayerCount(boolean tilePlacement, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE time_placement = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, tilePlacement, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getCityBuilderBoardGamesAndPlayerCount(boolean cityBuilder, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE city_builder = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cityBuilder, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getMysteryBoardGamesAndPlayerCount(boolean mystery, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE mystery = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, mystery, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getStrategyBoardGamesAndPlayerCount(boolean strategy, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE strategy = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, strategy, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getWordGameBoardGamesAndPlayerCount(boolean wordGame, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE word_game = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, wordGame, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getDungeonCrawlerBoardGamesAndPlayerCount(boolean dungeonCrawler, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE dungeon_crawler = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, dungeonCrawler, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getPressYourLuckBoardGamesAndPlayerCount(boolean pressYourLuck, int minPlayers, int maxPlayers) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games WHERE press_your_luck = ? && min_players <= ? && max_players >= ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, pressYourLuck, minPlayers, maxPlayers);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getAllOptionsParty(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean party) {
        List<BoardGames> boardGames = new ArrayList<>();
        String sql = "SELECT game_name FROM board_games min_players <= ? && max_players >= ? && intensity = ? && play_type = ? && max_time = ? && party = 'true;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, minPlayers, maxPlayers, intensity, playType, maxTime, party);
            while (results.next()) {
                BoardGames boardGame = mapRowToBoardGames(results);
                boardGames.add(boardGame);
            }
            System.out.println(boardGames);
            return boardGames;
        } catch (CannotGetJdbcConnectionException e) {
            System.err.println("Error getting JDBC connection");
            e.printStackTrace();
            throw new DaoException("Unable to connect to the database", e);
        } catch (Exception e) {
            System.err.println("Unexpected error while fetching board games");
            e.printStackTrace();
            throw new DaoException("Unexpected error while fetching board games", e);
        }
    }

    @Override
    public List<BoardGames> getAllOptionsDeckBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean deckBuilder) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsTowerDefense(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean towerDefense) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsEngineBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean engineBuilder) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsWorkerPlacement(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean workerPlacement) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsOrderFulfillment(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean orderFulfillment) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsCampaign(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean campaign) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsHiddenRole(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean hiddenRole) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsAreaControl(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean areaControl) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsTilePlacement(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean tilePlacement) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsCityBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean cityBuilder) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsMystery(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean mystery) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsStrategy(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean strategy) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsWordGame(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean wordGame) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsDungeonCrawler(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean dungeonCrawler) {
        return null;
    }

    @Override
    public List<BoardGames> getAllOptionsPressYourLuck(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean pressYourLuck) {
        return null;
    }

    @Override
    public BoardGames addBoardGame(BoardGames boardGames) {
        try {
            String boardGameSql = "INSERT INTO board_games " +
                    "(game_name, min_players, max_players, intensity, play_type, max_time, " +
                    "party, deck_builder, tower_defense, engine_builder, worker_placement, order_fulfillment, " +
                    "campaign, hidden_role, area_control, tile_placement, city_builder, mystery, strategy, " +
                    "word_game, dungeon_crawler, press_your_luck" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                    "RETURNING game_id;";

            int newGameId = jdbcTemplate.queryForObject(
                    boardGameSql,
                    int.class,
                    boardGames.getGameName(),
                    boardGames.getMinPlayers(),
                    boardGames.getMaxPlayers(),
                    boardGames.getIntensity(),
                    boardGames.getPlayType(),
                    boardGames.getMaxTime(),
                    boardGames.isParty(),
                    boardGames.isDeckBuilder(),
                    boardGames.isTowerDefense(),
                    boardGames.isEngineBuilder(),
                    boardGames.isWorkerPlacement(),
                    boardGames.isOrderFulfillment(),
                    boardGames.isCampaign(),
                    boardGames.isHiddenRole(),
                    boardGames.isAreaControl(),
                    boardGames.isTilePlacement(),
                    boardGames.isCityBuilder(),
                    boardGames.isMystery(),
                    boardGames.isStrategy(),
                    boardGames.isWordGame(),
                    boardGames.isDungeonCrawler(),
                    boardGames.isPressYourLuck()
            );
            return getBoardGameById(newGameId);
        }catch (DataAccessException e) {
            throw new RuntimeException("Error Adding Board Game", e);
        }
    }

    @Override
    public BoardGames updateBoardGame(int gameId, BoardGames updatedBoardGame) {
        try {
            String sql = "UPDATE board_games" +
                    "SET game_name=?, min_players=?, max_players=?, intensity=?, " +
                    "play_type=?, max_time=?, party=?, deck_builder=?, tower_defense=?, engine_builder=?, " +
                    "worker_placement=?, order_fulfillment=?, campaign=?, hidden_role=?, area_control=?, " +
                    "tile_placement=?, city_builder=?, mystery=?, strategy=?, word_game=?, dungeon_crawler=?, " +
                    "press_your_luck=? " +
                    "WHERE game_id=?;";

            int rowsUpdated = jdbcTemplate.update(
                    sql,
                    updatedBoardGame.getGameName(),
                    updatedBoardGame.getMinPlayers(),
                    updatedBoardGame.getMaxPlayers(),
                    updatedBoardGame.getIntensity(),
                    updatedBoardGame.getPlayType(),
                    updatedBoardGame.getMaxTime(),
                    updatedBoardGame.isParty(),
                    updatedBoardGame.isDeckBuilder(),
                    updatedBoardGame.isTowerDefense(),
                    updatedBoardGame.isEngineBuilder(),
                    updatedBoardGame.isWorkerPlacement(),
                    updatedBoardGame.isOrderFulfillment(),
                    updatedBoardGame.isCampaign(),
                    updatedBoardGame.isHiddenRole(),
                    updatedBoardGame.isAreaControl(),
                    updatedBoardGame.isTilePlacement(),
                    updatedBoardGame.isCityBuilder(),
                    updatedBoardGame.isMystery(),
                    updatedBoardGame.isStrategy(),
                    updatedBoardGame.isWordGame(),
                    updatedBoardGame.isDungeonCrawler(),
                    updatedBoardGame.isPressYourLuck(),
                    gameId
            );

            if (rowsUpdated > 0) {
                return updatedBoardGame;
            } else {
                throw new RuntimeException("Board Game Not Updated");
            }
        } catch (DataAccessException e){
            e.printStackTrace();
            throw new RuntimeException("Error Updating Board Game", e);
        }
    }

    @Override
    public int deleteBoardGame(int gameId) {
        String sql = "DELETE FROM board_games WHERE game_id = ?;";
        jdbcTemplate.update(sql, gameId);
        return gameId;
    }

    private BoardGames mapRowToBoardGames(SqlRowSet rs) {
        BoardGames boardGames = new BoardGames();
        boardGames.setGameId(rs.getInt("game_id"));
        boardGames.setGameName(rs.getString("game_name"));
        boardGames.setMinPlayers(rs.getInt("min_players"));
        boardGames.setMaxPlayers(rs.getInt("max_players"));
        boardGames.setIntensity(rs.getString("intensity"));
        boardGames.setPlayType(rs.getString("play_type"));
        boardGames.setMaxTime(rs.getInt("max_time"));
        boardGames.setParty(rs.getBoolean("party"));
        boardGames.setDeckBuilder(rs.getBoolean("deck_builder"));
        boardGames.setTowerDefense(rs.getBoolean("tower_defense"));
        boardGames.setEngineBuilder(rs.getBoolean("engine_builder"));
        boardGames.setWorkerPlacement(rs.getBoolean("worker_placement"));
        boardGames.setOrderFulfillment(rs.getBoolean("order_fulfillment"));
        boardGames.setCampaign(rs.getBoolean("campaign"));
        boardGames.setHiddenRole(rs.getBoolean("hidden_role"));
        boardGames.setAreaControl(rs.getBoolean("area_control"));
        boardGames.setTilePlacement(rs.getBoolean("tile_placement"));
        boardGames.setCityBuilder(rs.getBoolean("city_builder"));
        boardGames.setMystery(rs.getBoolean("mystery"));
        boardGames.setStrategy(rs.getBoolean("strategy"));
        boardGames.setWordGame(rs.getBoolean("word_game"));
        boardGames.setDungeonCrawler(rs.getBoolean("dungeon_crawler"));
        boardGames.setPressYourLuck(rs.getBoolean("press_your_luck"));
        return boardGames;
    }
}
