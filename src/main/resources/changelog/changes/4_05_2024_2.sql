-- CREATE TABLE IF NOT EXISTS laptops_sellers (
--     laptop_id BIGINT REFERENCES laptops(id),
--     sellers_id BIGINT REFERENCES sellers(id),
--     PRIMARY KEY (laptop_id, sellers_id)
--     );
INSERT INTO laptops_sellers (laptop_id, sellers_id)
VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (1, 3),
    (1, 6),
    (1, 5),
    (1, 3),
    (1, 5),
    (1, 2),
    (10, 1),
    (10, 2),
    (10, 3),
    (4, 1),
    (7, 1);