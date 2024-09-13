CREATE TABLE Customer (
    phoneNumber VARCHAR(15) PRIMARY KEY,
    name VARCHAR(100),
    pin VARCHAR(4) NOT NULL,
    balance DECIMAL(15, 2) DEFAULT 10000000
);

CREATE TABLE MoneyTransfer (
    id SERIAL PRIMARY KEY,
    fromPhoneNumber VARCHAR(15),
    toPhoneNumber VARCHAR(15),
    amount DECIMAL(15, 2),
    transferDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Indexes for performance
CREATE INDEX idx_phoneNumber ON Customer(phoneNumber);
