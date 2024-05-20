-- Create laptops table
-- CREATE TABLE IF NOT EXISTS laptops (
--                                        id SERIAL PRIMARY KEY,
--                                        name VARCHAR(255) NOT NULL,
--     color VARCHAR(50),
--     price BIGINT,
--     processor VARCHAR(50),
--     ram_sizegb INTEGER,
--     storage_sizegb INTEGER,
--     screen_size VARCHAR(20),
--     resolution VARCHAR(20),
--     touchscreen BOOLEAN,
--     operating_system VARCHAR(50),
--     weight DOUBLE PRECISION,
--     battery_capacity_wh INTEGER,
--     wifi_enabled BOOLEAN,
--     bluetooth_enabled BOOLEAN,
--     nfc_enabled BOOLEAN,
--     webcam BOOLEAN,
--     backlit_keyboard BOOLEAN,
--     usb_ports INTEGER,
--     hdmi_ports INTEGER,
--     ethernet_ports INTEGER,
--     sd_card_reader BOOLEAN,
--     headphone_jack BOOLEAN,
--     microphone BOOLEAN,
--     warranty_info VARCHAR(255)
--     );

-- Create many-to-many relationship table between laptops and sellers
-- CREATE TABLE IF NOT EXISTS laptops_sellers (
--                                                laptop_id BIGINT REFERENCES laptops(id),
--     seller_id BIGINT REFERENCES sellers(id),
--     PRIMARY KEY (laptop_id, seller_id)
--     );

-- Insert sample laptop data
INSERT INTO laptops (name, color, price, processor, ram_sizegb, storage_sizegb, screen_size, resolution, touchscreen, operating_system, weight, battery_capacity_wh, wifi_enabled, bluetooth_enabled, nfc_enabled, webcam, backlit_keyboard, usb_ports, hdmi_ports, ethernet_ports, sd_card_reader, headphone_jack, microphone, warranty_info)
VALUES
    ('Dell XPS 15', 'Silver', 1699, 'Intel Core i7', 16, 512, '15.6 inches', '3840x2160 pixels', true, 'Windows 11', 4.4, 86, true, true, false, true, true, 3, 1, 1, true, true, true, '2 years'),
    ('MacBook Pro 16-inch', 'Space Gray', 2399, 'Apple M1 Pro', 16, 1024, '16 inches', '3072x1920 pixels', true, 'macOS Monterey', 4.7, 100, true, true, true, true, true, 4, 3, 1, true, true, true, '1 year'),
    ('HP Spectre x360', 'Dark Ash Silver', 1499, 'Intel Core i7', 16, 512, '13.3 inches', '3840x2160 pixels', true, 'Windows 10', 2.87, 60, true, true, false, true, true, 2, 1, 1, true, true, true, '3 years'),
    ('Lenovo ThinkPad X1 Carbon', 'Black', 1349, 'Intel Core i5', 8, 256, '14 inches', '1920x1080 pixels', false, 'Windows 10 Pro', 2.49, 57, true, true, true, true, true, 2, 2, 1, true, true, true, '3 years'),
    ('ASUS ZenBook Pro Duo', 'Celestial Blue', 2499, 'Intel Core i9', 32, 1024, '15.6 inches', '3840x2160 pixels', true, 'Windows 11 Pro', 5.5, 92, true, true, true, true, true, 3, 2, 1, true, true, true, '2 years'),
    ('Microsoft Surface Laptop Studio', 'Platinum', 1699, 'Intel Core i5', 16, 512, '14.4 inches', '2400x1600 pixels', true, 'Windows 11', 3.48, 56, true, true, true, true, true, 2, 1, 1, true, true, true, '1 year'),
    ('Acer Swift 5', 'Mist Green', 999, 'Intel Core i7', 16, 512, '14 inches', '1920x1080 pixels', false, 'Windows 11', 2.31, 56, true, true, false, true, true, 2, 1, 1, true, true, true, '2 years'),
    ('Razer Blade 15', 'Mercury White', 2499, 'Intel Core i7', 32, 1024, '15.6 inches', '3840x2160 pixels', true, 'Windows 11', 4.73, 80, true, true, true, true, true, 3, 1, 1, true, true, true, '1 year'),
    ('Alienware x17', 'Lunar Light', 2899, 'Intel Core i9', 64, 2048, '17.3 inches', '3840x2160 pixels', true, 'Windows 11', 6.65, 97, true, true, true, true, true, 4, 3, 1, true, true, true, '3 years'),
    ('MSI GS66 Stealth', 'Core Black', 1999, 'Intel Core i7', 32, 1024, '15.6 inches', '1920x1080 pixels', true, 'Windows 11 Pro', 4.63, 99, true, true, true, true, true, 3, 2, 1, true, true, true, '2 years');
