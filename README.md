# PJA Project - Premier League
It is a `Enterprise web application` witch provides basic data about one season of the highest English football league, `Premier League`. Data is from season 2018/2019. Project contains two modules. For simplicity project doesn't include any tests.

You need install appliaction Server for run this project. I'm using `Glassfish application server version 6.2.2`. `Apache Netbeans` was used as IDE.

## Premier League - EJB packeges
- This modul is focused on working with the database.

### models
- `Player`, `Team` and `PremierLeagueInfo`
- Here are java classes representing `entity` class for a saving data into the databse
- Alse these are classes representing real object as football player, football team atd.
- Also in these classes are defined a SQL Querries relating to specific class

### api
- `IPlayerApi`, `ITeamApi` and `IPremierLeagueInfo` 
- In this package are defined interfaces which serve the user to work with application database
- This interfeces ale local, but also they can be remote too
- List of methods you can see in javadoc

### beans
- `PlayerBean`, `TeamBean` and `PremierLeeagueInfoBean`
- Here are defined "Beans". It is something like components which create whole application
- These components implementing all methods defined in interfaces mentioned above
- In these implementation is hide a real work with the database - executing database queries
- All these beans are used later in second modul of the project for access the database

## Premier League - war
- This is a second module of the project
- Here are defined website appearance, managers for managing data in the database, web templates, web resources and also RESTful API providing football data.

### Web Pages
- This is a parrent folder for `resources`, `templates` and all `JSF pages`
- It is also contains configurations files, specifically in folder `WEB-INF`

### resources
- Here we can find `JS` scripts for funcionality of navigation between tabs
- There are also `CSS` files in the `defaultTheme/css` folder and some placeholders

### templates
- Here are defined web templates, which I used for website layout(header, footer, navigation menu)

### managers
- `PlayersManager`, `TeamsManager` and `PremierLeagueInfoManager`
- These are classes used for menaging objects like `Player` and another like that
- These classes are connect with `bean` from EJB modul


### REST api
- This package contains definition of RESTfull API
- It is created by files: \
`ApplicationConfig` - Configuration (path, registration of classes) \
`RestPlayer` - class providing interface to get a data about football players \
`RestTeam` - class providing interface to get a data about football teams  
`RestPremierLeagueInfo` - class providing interface to get a general data about Premir League
- Classes used `managers` to get data from the database
- Whole data are provided in JSON format

## Used technology
- Application server from `Glasfish` - version 6.2.2
- `JavaServer Faces` - server version 3.0 and their Templates
- Local database from `PostgreSQL` + data in CSV format
- `EJB` (Enterprise java beans)
- `Java beans`
- `RESTful API` without a client
- `W3.css` from w3school
- `Ant` building tool
- `JS` for navigation menu
