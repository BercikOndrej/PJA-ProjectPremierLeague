
function showScoreboard(event, scoreboardName) {
    var index;
    var allScoreboards = document.getElementsByClassName("scoreboard");

    for (index = 0; index < allScoreboards.length; index++) {
        allScoreboards[index].style.display = "none";
    }
    
    var tabButtons = document.getElementsByClassName("tab-btn");
    
    for (index = 0; index < tabButtons.length; index++) {
        tabButtons[index].className = tabButtons[index].className.replace("w3-blue", "");
    }
    document.getElementById(scoreboardName).style.display = "block";
    event.currentTarget.className += " w3-blue";
}
function showPlayers(event, tableName) {
    var index;
    var allTables = document.getElementsByClassName("playersBoards");

    for (index = 0; index < allTables.length; index++) {
        allTables[index].style.display = "none";
    }

    var tabButtons = document.getElementsByClassName("tab-btn-players");

    for (index = 0; index < tabButtons.length; index++) {
        tabButtons[index].className = tabButtons[index].className.replace("w3-blue", "");
    }
    document.getElementById(tableName).style.display = "block";
    event.currentTarget.className += " w3-blue";
}