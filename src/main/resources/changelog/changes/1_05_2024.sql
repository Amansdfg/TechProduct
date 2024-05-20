-- Create phones table
-- CREATE TABLE IF NOT EXISTS phones (
--                                       id SERIAL PRIMARY KEY,
--                                       name VARCHAR(255) NOT NULL,
--     color VARCHAR(50),
--     price BIGINT,
--     available BOOLEAN,
--     stock_quantity INTEGER,
--     description TEXT,
--     weight DOUBLE PRECISION,
--     screen_size VARCHAR(20),
--     resolution VARCHAR(20),
--     processor VARCHAR(50),
--     ram_sizegb INTEGER,
--     storage_sizegb INTEGER,
--     touchscreen BOOLEAN,
--     wifi_enabled BOOLEAN,
--     bluetooth_enabled BOOLEAN,
--     nfc_enabled BOOLEAN,
--     operating_system VARCHAR(50),
--     battery DOUBLE PRECISION
--     );

-- Create many-to-many relationship table between phones and sellers
-- CREATE TABLE IF NOT EXISTS phones_sellers (
--                                             phone_id BIGINT REFERENCES phones(id),
--     seller_id BIGINT REFERENCES sellers(id),
--     PRIMARY KEY (phone_id, seller_id)
--     );
--
-- Add unique constraint to prevent duplicate entries in phone_seller table
-- ALTER TABLE phones_sellers ADD CONSTRAINT unique_phone_seller UNIQUE (phone_id, sellers_id);
--
-- -- Insert sample phone data
INSERT INTO phones (name, color, price, available, stock_quantity, description, weight, screen_size, resolution, processor, ram_sizegb, storage_sizegb, touchscreen, wifi_enabled, bluetooth_enabled, nfc_enabled, operating_system, battery)
VALUES
    ('iPhone 13', 'Black', 999, true, 100, 'Latest iPhone model', 0.174, '6.1 inches', '2532x1170 pixels', 'A15 Bionic', 6, 128, true, true, true, false, 'iOS 15', 3210),
    ('Samsung Galaxy S22', 'White', 899, true, 150, 'Flagship Samsung phone', 0.169, '6.5 inches', '2400x1080 pixels', 'Exynos 2200', 8, 256, true, true, true, true, 'Android 12', 4000),
    ('Google Pixel 7', 'Gray', 799, true, 200, 'Google s latest Pixel phone', 0.155, '6.2 inches', '2340x1080 pixels', 'Snapdragon 8 Gen 2', 8, 128, true, true, true, false, 'Android 12', 3700);
