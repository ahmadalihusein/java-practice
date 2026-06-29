-- Exercise 01 — Creating a table and adding rows
-- RUN IT:  sqlite3 shop.db ".read 05-sql-basics/01_create_and_insert.sql"
--
-- SQL is the language for talking to a database. Comments start with --
-- Every SQL command ends with a semicolon ;

-- STEP 1: create a table (the blueprint/grid). This says what columns exist.
-- "IF NOT EXISTS" means: don't error if we already made it before.
CREATE TABLE IF NOT EXISTS products (
    id    INTEGER PRIMARY KEY,   -- a unique number for each row (auto-managed)
    name  TEXT,                  -- a text column
    price INTEGER                -- a number column
);

-- STEP 2: add rows with INSERT. This is like list.add(new Product(...)).
INSERT INTO products (name, price) VALUES ('Nasi Lemak', 5);
INSERT INTO products (name, price) VALUES ('Teh Tarik', 3);
INSERT INTO products (name, price) VALUES ('Roti Canai', 2);

-- STEP 3: read everything back with SELECT.
-- "SELECT *" means "select ALL columns". FROM products = from that table.
SELECT * FROM products;

-- ============================================================
-- YOUR TURN (write your SQL below this line):
--
-- TODO 1: INSERT one more product of your choice (a name and a price).
--
insert into products (name, price) values ('Nasi Kandar', 3);
-- TODO 2: SELECT everything again to see your new row appear.
--         (just write: SELECT * FROM products; )
--
select * from products;
-- ============================================================
