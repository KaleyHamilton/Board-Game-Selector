package com.techelevator.model;

public class BoardGames {
    private int gameId;
    private String gameName;
    private int minPlayers;
    private int maxPlayers;
    private String intensity;
    private String playType;
    private int maxTime;
    private boolean party;
    private boolean deckBuilder;
    private boolean towerDefense;
    private boolean engineBuilder;
    private boolean workerPlacement;
    private boolean orderFulfillment;
    private boolean campaign;
    private boolean hiddenRole;
    private boolean areaControl;
    private boolean tilePlacement;
    private boolean cityBuilder;
    private boolean mystery;
    private boolean strategy;
    private boolean wordGame;
    private boolean dungeonCrawler;
    private boolean pressYourLuck;

    public BoardGames() {
    }

    public BoardGames(int gameId, String gameName, int minPlayers, int maxPlayers, String intensity, String playType,
                      int maxTime, boolean party, boolean deckBuilder, boolean towerDefense, boolean engineBuilder,
                      boolean workerPlacement, boolean orderFulfillment, boolean campaign, boolean hiddenRole,
                      boolean areaControl, boolean tilePlacement, boolean cityBuilder, boolean mystery, boolean strategy,
                      boolean wordGame, boolean dungeonCrawler, boolean pressYourLuck) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.intensity = intensity;
        this.playType = playType;
        this.maxTime = maxTime;
        this.party = party;
        this.deckBuilder = deckBuilder;
        this.towerDefense = towerDefense;
        this.engineBuilder = engineBuilder;
        this.workerPlacement = workerPlacement;
        this.orderFulfillment = orderFulfillment;
        this.campaign = campaign;
        this.hiddenRole = hiddenRole;
        this.areaControl = areaControl;
        this.tilePlacement = tilePlacement;
        this.cityBuilder = cityBuilder;
        this.mystery = mystery;
        this.strategy = strategy;
        this.wordGame = wordGame;
        this.dungeonCrawler = dungeonCrawler;
        this.pressYourLuck = pressYourLuck;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean isParty() {
        return party;
    }

    public void setParty(boolean party) {
        this.party = party;
    }

    public boolean isDeckBuilder() {
        return deckBuilder;
    }

    public void setDeckBuilder(boolean deckBuilder) {
        this.deckBuilder = deckBuilder;
    }

    public boolean isTowerDefense() {
        return towerDefense;
    }

    public void setTowerDefense(boolean towerDefense) {
        this.towerDefense = towerDefense;
    }

    public boolean isEngineBuilder() {
        return engineBuilder;
    }

    public void setEngineBuilder(boolean engineBuilder) {
        this.engineBuilder = engineBuilder;
    }

    public boolean isWorkerPlacement() {
        return workerPlacement;
    }

    public void setWorkerPlacement(boolean workerPlacement) {
        this.workerPlacement = workerPlacement;
    }

    public boolean isOrderFulfillment() {
        return orderFulfillment;
    }

    public void setOrderFulfillment(boolean orderFulfillment) {
        this.orderFulfillment = orderFulfillment;
    }

    public boolean isCampaign() {
        return campaign;
    }

    public void setCampaign(boolean campaign) {
        this.campaign = campaign;
    }

    public boolean isHiddenRole() {
        return hiddenRole;
    }

    public void setHiddenRole(boolean hiddenRole) {
        this.hiddenRole = hiddenRole;
    }

    public boolean isAreaControl() {
        return areaControl;
    }

    public void setAreaControl(boolean areaControl) {
        this.areaControl = areaControl;
    }

    public boolean isTilePlacement() {
        return tilePlacement;
    }

    public void setTilePlacement(boolean tilePlacement) {
        this.tilePlacement = tilePlacement;
    }

    public boolean isCityBuilder() {
        return cityBuilder;
    }

    public void setCityBuilder(boolean cityBuilder) {
        this.cityBuilder = cityBuilder;
    }

    public boolean isMystery() {
        return mystery;
    }

    public void setMystery(boolean mystery) {
        this.mystery = mystery;
    }

    public boolean isStrategy() {
        return strategy;
    }

    public void setStrategy(boolean strategy) {
        this.strategy = strategy;
    }

    public boolean isWordGame() {
        return wordGame;
    }

    public void setWordGame(boolean wordGame) {
        this.wordGame = wordGame;
    }

    public boolean isDungeonCrawler() {
        return dungeonCrawler;
    }

    public void setDungeonCrawler(boolean dungeonCrawler) {
        this.dungeonCrawler = dungeonCrawler;
    }

    public boolean isPressYourLuck() {
        return pressYourLuck;
    }

    public void setPressYourLuck(boolean pressYourLuck) {
        this.pressYourLuck = pressYourLuck;
    }
}
