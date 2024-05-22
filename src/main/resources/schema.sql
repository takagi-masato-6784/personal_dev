-- 各種テーブル削除
DROP TABLE IF EXISTS brands;
DROP TABLE IF EXISTS audio_codec;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS review;
DROP TABLE IF EXISTS type;

--タイプテーブル
CREATE TABLE type
(
id SERIAL PRIMARY KEY,
type Integer
);
--ブランドテーブル
CREATE TABLE brands
(
id SERIAL PRIMARY KEY,
brand TEXT
);
--コーデックテーブル
CREATE TABLE audio_codec
(
id SERIAL PRIMARY KEY,
codec TEXT
);
-- 商品テーブル
CREATE TABLE items
(
id SERIAL PRIMARY KEY,
brand_id INTEGER,
codec_id INTEGER,
name TEXT,
price INTEGER,
describe TEXT,
type INTEGER
);
-- 顧客テーブル
CREATE TABLE customers
(
id SERIAL PRIMARY KEY,
name TEXT,
address TEXT,
tel TEXT,
email TEXT,
pw TEXT
);
-- 注文テーブル
CREATE TABLE orders
(
id SERIAL PRIMARY KEY,
customer_id INTEGER,
ordered_on DATE,
total_price INTEGER

);
-- 注文明細テーブル
CREATE TABLE order_details
(
id SERIAL PRIMARY KEY,
order_id INTEGER,
item_id INTEGER,
quantity INTEGER
);
--レビューテーブル
CREATE TABLE review
(
id SERIAL PRIMARY KEY,
title TEXT,
report TEXT,
score INTEGER,
customer_id INTEGER,
item_id INTEGER,
review_day DATE
);
