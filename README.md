# SpringBoot Sqlite Demo
The Springboot Project written under Sqlite

# Installation & Runing

```bash
mvn package
java -jar target/sqlitedb-1.0-SNAPSHOT.jar
```

# DB

***user.db***
```
CREATE TABLE `usermapping` (
  `TrelloName` varchar(45) NOT NULL,
  `RtcName` varchar(45) NOT NULL,
  PRIMARY KEY (`TrelloName`)
);
```