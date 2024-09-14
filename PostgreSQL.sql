-- Table for Admins
CREATE TABLE Admin (
    id SERIAL PRIMARY KEY,
    phone_number VARCHAR(15) UNIQUE NOT NULL,
    pin VARCHAR(10) NOT NULL,
    name VARCHAR(100) NOT NULL
);

-- Table for Customers
CREATE TABLE Customer (
    phone_number VARCHAR(15) PRIMARY KEY,
    pin VARCHAR(10) NOT NULL,
    name VARCHAR(100) NOT NULL,
    balance NUMERIC(15, 2) NOT NULL DEFAULT 10000000.00  -- Initial balance of 10,000,000 RWF
);

-- Table for Money Transfers
CREATE TABLE MoneyTransfer (
    id SERIAL PRIMARY KEY,
    from_phone_number VARCHAR(15) REFERENCES Customer(phone_number),
    to_phone_number VARCHAR(15) REFERENCES Customer(phone_number),
    amount NUMERIC(15, 2) NOT NULL,
    transfer_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Indexes to optimize searches by phone number
CREATE INDEX idx_customer_phone ON Customer(phone_number);
CREATE INDEX idx_transfer_from_phone ON MoneyTransfer(from_phone_number);
CREATE INDEX idx_transfer_to_phone ON MoneyTransfer(to_phone_number);
