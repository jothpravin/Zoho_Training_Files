CREATE TYPE gender_enum AS ENUM ('Male', 'Female');

CREATE TYPE status_enum AS ENUM ('Buy', 'Sell');

CREATE TABLE Users (
    userId SERIAL PRIMARY KEY,
    fName VARCHAR(50),
    lName VARCHAR(50),
    email VARCHAR(150),
    password VARCHAR(50),
    mobile_no BIGINT,
    dob DATE,
    gender gender_enum,
    aadhar_no BIGINT,
    pan_no VARCHAR(20),
    demat_acc_no BIGINT,
    kyc BOOLEAN,
    amount DECIMAL (10, 2) NOT NULL
);

CREATE TABLE Stocks (
   stockId SERIAL PRIMARY KEY,
   stockName VARCHAR(20),
   stockPrice DECIMAL (10, 2) NOT NULL
);

CREATE TABLE Holdings (
   holdingsId SERIAL PRIMARY KEY,
   userId INTEGER REFERENCES Users(userId), 
   stockId INTEGER REFERENCES Stocks(stockId), 
   amount DECIMAL (10, 2) NOT NULL,
   price DECIMAL (10, 2) NOT NULL,
   quality INTEGER NOT NULL
);

CREATE TABLE Transactions (
  id SERIAL PRIMARY KEY,
  userId INTEGER REFERENCES Users(userId), 
  stockId INTEGER REFERENCES Stocks(stockId), 
  action status_enum,
  amount DECIMAL (10, 2) NOT NULL,
  price DECIMAL (10, 2) NOT NULL, 
  quality INTEGER NOT NULL, 
  transaction_date DATE
);
