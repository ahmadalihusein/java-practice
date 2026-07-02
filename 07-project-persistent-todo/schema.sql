-- The table that stores your tasks permanently.
-- Run once (in MySQL prompt or phpMyAdmin) to create it:
--   USE practice1;
--   (then paste the CREATE TABLE below)

CREATE TABLE IF NOT EXISTS tasks (
    id   INT PRIMARY KEY AUTO_INCREMENT,  -- unique id per task, auto-numbered
    name VARCHAR(200),                    -- the task text
    done BOOLEAN DEFAULT FALSE            -- FALSE = not done, TRUE = done
);
