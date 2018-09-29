CREATE DATABASE tasks;
USE tasks;

CREATE TABLE users (
	UserID int NOT NULL,
    UserName varchar(255),
    Password varchar(255),
    PRIMARY KEY (UserID)
);

CREATE TABLE tasks (
	TaskID int NOT NULL,
    TaskDetalis text,
    DateOfCreation date,
    DueDate date,
    OwnerID int,
    Completion boolean,
    PRIMARY KEY (TaskID),
    FOREIGN KEY (OwnerID) REFERENCES users(UserID)
);