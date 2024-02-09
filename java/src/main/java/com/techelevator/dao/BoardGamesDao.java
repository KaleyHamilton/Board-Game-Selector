package com.techelevator.dao;

import com.techelevator.model.BoardGames;

import java.util.List;

public interface BoardGamesDao {
    List<BoardGames> getBoardGamesByName(String gameName);
    BoardGames getBoardGameById(int gameId);
    List<BoardGames> getAllBoardGames();
    List<BoardGames> getByPlayerCount(int minPlayers, int maxPlayers);
    List<BoardGames> getByIntensityAndPlayerCount(String intensity, int minPlayers, int maxPlayers);
    List<BoardGames> getByPlayTypeAndPlayerCount(String playType, int minPlayers, int maxPlayers);
    List<BoardGames> getByMaxPlayTimeAndPlayerCount(int maxTime, int minPlayers, int maxPlayers);
    List<BoardGames> getPartyBoardGamesAndPlayerCount(boolean party, int minPlayers, int maxPlayers);
    List<BoardGames> getDeckBuilderBoardGamesAndPlayerCount(boolean deckBuilder, int minPlayers, int maxPlayers);
    List<BoardGames> getTowerDefenseBoardGamesAndPlayerCount(boolean towerDefense, int minPlayers, int maxPlayers);
    List<BoardGames> getEngineBuilderBoardGamesAndPlayerCount(boolean engineBuilder, int minPlayers, int maxPlayers);
    List<BoardGames> getWorkerPlacementBoardGamesAndPlayerCount(boolean workerPlacement, int minPlayers, int maxPlayers);
    List<BoardGames> getOrderFulfillmentBoardGamesAndPlayerCount(boolean orderFulfillment, int minPlayers, int maxPlayers);
    List<BoardGames> getCampaignBoardGamesAndPlayerCount(boolean campaign, int minPlayers, int maxPlayers);
    List<BoardGames> getHiddenRoleBoardGamesAndPlayerCount(boolean hiddenRole, int minPlayers, int maxPlayers);
    List<BoardGames> getAreaControlBoardGamesAndPlayerCount(boolean areaControl, int minPlayers, int maxPlayers);
    List<BoardGames> getTilePlacementBoardGamesAndPlayerCount(boolean tilePlacement, int minPlayers, int maxPlayers);
    List<BoardGames> getCityBuilderBoardGamesAndPlayerCount(boolean cityBuilder, int minPlayers, int maxPlayers);
    List<BoardGames> getMysteryBoardGamesAndPlayerCount(boolean mystery, int minPlayers, int maxPlayers);
    List<BoardGames> getStrategyBoardGamesAndPlayerCount(boolean strategy, int minPlayers, int maxPlayers);
    List<BoardGames> getWordGameBoardGamesAndPlayerCount(boolean wordGame, int minPlayers, int maxPlayers);
    List<BoardGames> getDungeonCrawlerBoardGamesAndPlayerCount(boolean dungeonCrawler, int minPlayers, int maxPlayers);
    List<BoardGames> getPressYourLuckBoardGamesAndPlayerCount(boolean pressYourLuck, int minPlayers, int maxPlayers);

    List<BoardGames> getAllOptionsParty(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean party);
    List<BoardGames> getAllOptionsDeckBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean deckBuilder);
    List<BoardGames> getAllOptionsTowerDefense(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean towerDefense);
    List<BoardGames> getAllOptionsEngineBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean engineBuilder);
    List<BoardGames> getAllOptionsWorkerPlacement(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean workerPlacement);
    List<BoardGames> getAllOptionsOrderFulfillment(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean orderFulfillment);
    List<BoardGames> getAllOptionsCampaign(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean campaign);
    List<BoardGames> getAllOptionsHiddenRole(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean hiddenRole);
    List<BoardGames> getAllOptionsAreaControl(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean areaControl);
    List<BoardGames> getAllOptionsTilePlacement(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean tilePlacement);
    List<BoardGames> getAllOptionsCityBuilder(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean cityBuilder);
    List<BoardGames> getAllOptionsMystery(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean mystery);
    List<BoardGames> getAllOptionsStrategy(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean strategy);
    List<BoardGames> getAllOptionsWordGame(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean wordGame);
    List<BoardGames> getAllOptionsDungeonCrawler(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean dungeonCrawler);
    List<BoardGames> getAllOptionsPressYourLuck(int minPlayers, int maxPlayers, String intensity, String playType, String maxTime, boolean pressYourLuck);

    BoardGames addBoardGame(BoardGames boardGames);
    BoardGames updateBoardGame(int gameId, BoardGames updatedBoardGame);
    int deleteBoardGame(int gameId);
}
