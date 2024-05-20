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

--Create many-to-many relationship table between phones and sellers
-- CREATE TABLE IF NOT EXISTS phones_sellers (
--     phone_id BIGINT REFERENCES phones(id),
--     sellers_id BIGINT REFERENCES sellers(id),
--     PRIMARY KEY (phone_id, sellers_id)
--     );
-- Insert sample phone data
INSERT INTO phones (name, color, price, available, stock_quantity, description, weight, screen_size, resolution, processor, ram_sizegb, storage_sizegb, touchscreen, wifi_enabled, bluetooth_enabled, nfc_enabled, operating_system, battery)
VALUES
    ('OnePlus 10', 'Blue', 899, true, 120, 'OnePlus flagship', 0.185, '6.7 inches', '3200x1440 pixels', 'Snapdragon 8 Gen 2', 12, 256, true, true, true, false, 'OxygenOS 13', 4500),
    ('Xiaomi Redmi Note 11', 'Green', 299, true, 500, 'Budget-friendly Xiaomi phone', 0.205, '6.4 inches', '2400x1080 pixels', 'Snapdragon 680', 6, 64, true, true, true, false, 'MIUI 14', 5000),
    ('Sony Xperia 5 III', 'Black', 1099, true, 80, 'Sony Xperia flagship', 0.169, '6.1 inches', '2520x1080 pixels', 'Snapdragon 888', 12, 256, true, true, true, true, 'Android 12', 4500),
    ('Motorola Edge 30 Pro', 'Silver', 899, true, 100, 'Motorola flagship', 0.195, '6.9 inches', '2340x1080 pixels', 'Snapdragon 8 Gen 2', 8, 256, true, true, true, true, 'Android 12', 5000),
    ('Nokia X20', 'Copper', 499, true, 150, 'Nokia mid-range phone', 0.190, '6.5 inches', '2400x1080 pixels', 'Snapdragon 480', 6, 128, true, true, true, false, 'Android 12', 4000),
    ('HTC Desire 21 Pro 5G', 'Blue', 699, true, 90, 'HTC mid-range 5G phone', 0.185, '6.7 inches', '2400x1080 pixels', 'Snapdragon 690', 6, 128, true, true, true, false, 'Android 11', 4000),
    ('ASUS ROG Phone 5', 'Black', 1199, true, 70, 'Gaming smartphone from ASUS', 0.238, '6.78 inches', '2448x1080 pixels', 'Snapdragon 888', 16, 512, true, true, true, true, 'Android 11', 6000),
    ('LG Velvet 2 Pro', 'Gray', 799, true, 110, 'LG''s premium phone', 0.188, '6.8 inches', '2460x1080 pixels', 'Snapdragon 888', 8, 256, true, true, true, true, 'Android 11', 4200),
    ('Realme GT 2 Pro', 'Yellow', 699, true, 180, 'Realme flagship killer', 0.186, '6.7 inches', '2400x1080 pixels', 'Snapdragon 8 Gen 2', 12, 256, true, true, true, true, 'Realme UI 3.0', 5000),
    ('Oppo Find X5 Pro', 'White', 1099, true, 100, 'Premium flagship from Oppo', 0.196, '6.78 inches', '3216x1440 pixels', 'Snapdragon 8 Gen 2', 12, 256, true, true, true, true, 'ColorOS 13', 5000),
    ('BlackBerry Key3', 'Silver', 899, true, 120, 'Modern BlackBerry with physical keyboard', 0.195, '5.5 inches', '1920x1080 pixels', 'Snapdragon 8 Gen 1', 8, 128, true, true, true, false, 'Android 11', 4000),
    ('Microsoft Surface Duo 3', 'Blue', 1399, true, 60, 'Dual-screen productivity phone', 0.282, '8.3 inches', '2700x1800 pixels', 'Snapdragon 8cx Gen 3', 16, 512, true, true, true, true, 'Android 12', 4500),
    ('Vivo X80 Pro+', 'Gold', 1199, true, 80, 'Vivo flagship with advanced camera features', 0.195, '6.78 inches', '3200x1440 pixels', 'Snapdragon 8 Gen 2', 12, 256, true, true, true, true, 'Funtouch OS 13', 5000),
    ('Huawei P50 Pro', 'Silver', 1299, true, 50, 'Huawei premium flagship', 0.195, '6.6 inches', '2700x1228 pixels', 'Kirin 9000', 12, 512, true, true, true, true, 'HarmonyOS 3', 4500),
    ('Lenovo Legion Duel 3', 'Red', 999,  true, 70, 'Gaming smartphone from Lenovo', 0.238, '6.92 inches', '2460x1080 pixels', 'Snapdragon 8 Gen 2', 16, 512, true, true, true, true, 'ZUI 13', 5500),
    ('Black Shark 5', 'Black', 899,  true, 80, 'Gaming phone from Black Shark', 0.218, '6.78 inches', '2400x1080 pixels', 'Snapdragon 888', 16, 512, true, true, true, true, 'JoyUI 14', 4700),
    ('ZTE Axon 40 Pro', 'Blue', 799, true, 100, 'ZTE flagship', 0.183, '6.9 inches', '2400x1080 pixels', 'Snapdragon 888', 8, 256, true, true, true, true, 'MiFavor 14', 4600),
    ('Meizu 19 Pro', 'White', 899, true, 90, 'Meizu premium phone', 0.195, '6.7 inches', '2400x1080 pixels', 'Snapdragon 8 Gen 2', 12, 256, true, true, true, true, 'Flyme 9', 4800),
    ('Motorola Edge 40', 'Gray', 699, true, 120, 'Mid-range phone from Motorola', 0.185, '6.5 inches', '2400x1080 pixels', 'Snapdragon 778G', 8, 128, true, true, true, true, 'Android 12', 4500),
    ('Sony Xperia 1 IV', 'Black', 1299, true, 70, 'Sony flagship with advanced camera features', 0.181, '6.5 inches', '3840x1644 pixels', 'Snapdragon 8 Gen 2', 12, 512, true, true, true, true, 'Android 12', 4500),
    ('Google Pixel 7a', 'White', 499, true, 200, 'Affordable Google Pixel', 0.151, '6.1 inches', '2340x1080 pixels', 'Snapdragon 780G', 6, 128, true, true, true, false, 'Android 12', 3700),
    ('Xiaomi Redmi 12', 'Blue', 199, true, 500, 'Budget-friendly Xiaomi phone', 0.194, '6.6 inches', '1600x720 pixels', 'MediaTek Helio G35', 4, 64, true, true, true, false, 'MIUI 14', 5000),
    ('Realme GT Neo 3', 'Yellow', 399, true, 300, 'Realme budget performer', 0.188, '6.4 inches', '2400x1080 pixels', 'MediaTek Dimensity 900', 8, 128, true, true, true, true, 'Realme UI 3.0', 5000),
    ('Oppo Reno 7 Pro', 'Purple', 699, true, 150, 'Oppo mid-range performer', 0.175, '6.5 inches', '2400x1080 pixels', 'MediaTek Dimensity 1200', 8, 256, true, true, true, true, 'ColorOS 12', 4500),
    ('BlackBerry Passport 2', 'Black', 799, true, 80, 'Modern BlackBerry with physical keyboard', 0.196, '4.5 inches', '1440x1440 pixels', 'Snapdragon 808', 3, 32, true, true, true, false, 'BlackBerry OS 10', 3450),
    ('Microsoft Lumia 950 XL', 'White', 499, true, 100, 'Microsoft flagship', 0.165, '5.7 inches', '2560x1440 pixels', 'Snapdragon 810', 3, 32, true, true, true, true, 'Windows 10 Mobile', 3340),
    ('Vivo V23 Pro', 'Blue', 699, true, 120, 'Vivo mid-range performer', 0.185, '6.5 inches', '2400x1080 pixels', 'Snapdragon 870', 8, 256, true, true, true, true, 'Funtouch OS 13', 4400),
    ('HTC U12 Plus', 'Black', 599, true, 90, 'HTC flagship', 0.188, '6.0 inches', '2880x1440 pixels', 'Snapdragon 845', 6, 128, true, true, true, false, 'Android 9 Pie', 3500),
    ('ASUS Zenfone 8', 'Silver', 699, true, 100, 'Compact powerhouse from ASUS', 0.169, '5.9 inches', '2400x1080 pixels', 'Snapdragon 888', 8, 256, true, true, true, true, 'Android 11', 4000),
    ('LG G8 ThinQ', 'Gray', 499, true, 80, 'LG flagship from previous generation', 0.167, '6.1 inches', '3120x1440 pixels', 'Snapdragon 855', 6, 128, true, true, true, true, 'Android 10', 3550),
    ('Realme Narzo 50', 'Green', 299, true, 200, 'Budget-friendly Realme phone', 0.190, '6.6 inches', '1600x720 pixels', 'MediaTek Helio G96', 4, 64, true, true, true, true, 'Realme UI 3.0', 5000),
    ('Xiaomi Redmi K40', 'Pink', 399, true, 150, 'Xiaomi mid-range performer', 0.196, '6.67 inches', '2400x1080 pixels', 'Snapdragon 870', 8, 128, true, true, true, false, 'MIUI 14', 4500),
    ('Samsung Galaxy A52', 'White', 499, true, 250, 'Samsung mid-range performer', 0.189, '6.5 inches', '2400x1080 pixels', 'Snapdragon 720G', 6, 128, true, true, true, true, 'Android 11', 4500),
    ('OnePlus 9R', 'Black', 699, true, 100, 'OnePlus mid-range performer', 0.189, '6.55 inches', '2400x1080 pixels', 'Snapdragon 870', 8, 128, true, true, true, false, 'OxygenOS 11', 4500),
    ('Google Pixel 6a', 'Gray', 499, true, 120, 'Affordable Google Pixel', 0.151, '6.1 inches', '2340x1080 pixels', 'Snapdragon 778G', 6, 128, true, true, true, false, 'Android 12', 3700),
    ('Sony Xperia 10 IV', 'Blue', 799, true, 80, 'Mid-range Sony performer', 0.178, '6.0 inches', '2520x1080 pixels', 'Snapdragon 775G', 6, 128, true, true, true, false, 'Android 12', 4000),
    ('Motorola Moto G Power 2022', 'Red', 299, true, 150, 'Budget-friendly Motorola phone', 0.204, '6.5 inches', '1600x720 pixels', 'Snapdragon 680', 4, 64, true, true, true, false, 'Android 11', 5000),
    ('Nokia G50', 'Green', 249, true, 180, 'Nokia budget performer', 0.183, '6.8 inches', '1600x720 pixels', 'Snapdragon 480', 4, 64, true, true, true, false, 'Android 11', 4500),
    ('HTC Wildfire E2', 'Blue', 199, true, 250, 'HTC budget phone', 0.186, '6.5 inches', '1600x720 pixels', 'MediaTek Helio G35', 3, 32, true, true, true, false, 'Android 11', 4000),
    ('ASUS Zenfone Max M3', 'Black', 149, true, 300, 'ASUS budget phone', 0.180, '6.5 inches', '1600x720 pixels', 'Snapdragon 460', 3, 32, true, true, true, false, 'Android 11', 5000),
    ('LG K92', 'Silver', 179,true, 400, 'LG budget phone', 0.193, '6.7 inches', '1600x720 pixels', 'Snapdragon 690', 4, 64, true, true, true, false, 'Android 10', 4500),
    ('Realme C25', 'Blue', 149, true, 350, 'Realme budget phone', 0.190, '6.5 inches', '1600x720 pixels', 'Helio G70', 4, 64, true, true, true, false, 'Realme UI 2.0', 6000),
    ('Xiaomi Redmi 10', 'Gray', 179, true, 300, 'Xiaomi budget phone', 0.192, '6.5 inches', '1600x720 pixels', 'Helio G88', 4, 64, true, true, true, false, 'MIUI 13', 5000),
    ('Samsung Galaxy M32', 'Black', 249, true, 250, 'Samsung budget phone', 0.181, '6.4 inches', '1600x720 pixels', 'Helio G80', 4, 64, true, true, true, false, 'Android 11', 5000),
    ('OnePlus Nord N200', 'Blue', 199,  true, 400, 'OnePlus budget phone', 0.190, '6.5 inches', '1600x720 pixels', 'Snapdragon 480', 4, 64, true, true, true, false, 'OxygenOS 11', 5000),
    ('Google Pixel 4a', 'Black', 349,  true, 200, 'Google budget performer', 0.143, '5.81 inches', '2340x1080 pixels', 'Snapdragon 730G', 6, 128, true, true, true, false, 'Android 11', 3140),
    ('Sony Xperia L4', 'Gold', 249,  true, 300, 'Sony budget phone', 0.178, '6.2 inches', '1680x720 pixels', 'Helio P22', 3, 64, true, true, true, false, 'Android 10', 3580),
    ('Motorola Moto E7', 'Blue', 149, true, 400, 'Motorola budget phone', 0.180, '6.5 inches', '1600x720 pixels', 'Helio G25', 2, 32, true, true, true, false, 'Android 10', 4000)
